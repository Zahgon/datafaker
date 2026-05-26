package net.datafaker.transformations.sql;

import net.datafaker.sequence.FakeSequence;
import net.datafaker.sequence.FakeStream;
import net.datafaker.transformations.CompositeField;
import net.datafaker.transformations.Field;
import net.datafaker.transformations.Schema;
import net.datafaker.transformations.SimpleField;
import net.datafaker.transformations.Transformer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Stream;
import static java.util.Objects.requireNonNull;
import static net.datafaker.transformations.sql.SqlTransformer.SQLKeyWords.ARRAY;
import static net.datafaker.transformations.sql.SqlTransformer.SQLKeyWords.INSERT_INTO;
import static net.datafaker.transformations.sql.SqlTransformer.SQLKeyWords.MAP;
import static net.datafaker.transformations.sql.SqlTransformer.SQLKeyWords.MULTISET;
import static net.datafaker.transformations.sql.SqlTransformer.SQLKeyWords.NULL;
import static net.datafaker.transformations.sql.SqlTransformer.SQLKeyWords.VALUES;

public class SqlTransformer<IN> implements Transformer<IN, CharSequence> {

    private static final char DEFAULT_QUOTE = '\'';

    private static final char DEFAULT_CATALOG_SEPARATOR = '.';

    private static final String DEFAULT_SQL_IDENTIFIER = "\"\"";

    private static final String EMPTY_RESULT = "";

    private final Casing casing;

    private final char quote;

    private final char openSqlIdentifier;

    private final char closeSqlIdentifier;

    private final String tableName;

    private final String schemaName;

    private final boolean withBatchMode;

    private final int batchSize;

    private final Case keywordCase;

    private final boolean forceSqlQuoteIdentifierUsage;

    private final SqlDialect dialect;

    public static <IN> SqlTransformer.SqlTransformerBuilder<IN> builder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private SqlTransformer(String schemaName, String tableName, char quote, SqlDialect dialect, String sqlIdentifier, Casing casing, boolean withBatchMode, int batchSize, Case keywordCase, boolean forceSqlQuoteIdentifierUsage) {
        this.schemaName = schemaName;
        this.quote = quote;
        this.dialect = dialect;
        this.openSqlIdentifier = sqlIdentifier.charAt(0);
        this.closeSqlIdentifier = sqlIdentifier.length() == 1 ? sqlIdentifier.charAt(0) : sqlIdentifier.charAt(1);
        this.tableName = tableName;
        this.casing = casing;
        this.withBatchMode = withBatchMode;
        this.batchSize = batchSize;
        this.keywordCase = keywordCase;
        this.forceSqlQuoteIdentifierUsage = forceSqlQuoteIdentifierUsage;
    }

    private boolean isSqlQuoteIdentifierRequiredFor(String name) {
        if (forceSqlQuoteIdentifierUsage)
            return true;
        for (int i = 0; i < name.length(); i++) {
            if (casing == Casing.TO_UPPER && Character.isLowerCase(name.charAt(i)) || casing == Casing.TO_LOWER && Character.isUpperCase(name.charAt(i)) || name.charAt(i) == openSqlIdentifier || name.charAt(i) == closeSqlIdentifier || name.charAt(i) == DEFAULT_CATALOG_SEPARATOR) {
                return true;
            }
        }
        return false;
    }

    @Override
    public CharSequence apply(IN input, Schema<IN, ?> schema) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public CharSequence apply(IN input, Schema<IN, ?> schema, long rowId) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String addValues(IN input, Field<?, ?>[] fields, Boolean isRoot) {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < fields.length; i++) {
            if (dialect != null) {
                String fieldPrefix = dialect.getFieldPrefix(fields[i].getName());
                if (!fieldPrefix.isEmpty() && !isRoot) {
                    result.add(quote + dialect.getFieldPrefix(fields[i].getName()) + quote);
                }
            }
            if (fields[i] instanceof SimpleField) {
                //noinspection unchecked
                Object value = ((SimpleField<Object, ?>) fields[i]).transform(input);
                Class<?> clazz = value == null ? null : value.getClass();
                if (value == null || value instanceof Number || value instanceof Boolean || clazz.isPrimitive()) {
                    result.add(String.valueOf(value));
                } else if (clazz.isArray()) {
                    final Class<?> componentType = clazz.getComponentType();
                    SqlDialect sqlDialect = requireNonNull(dialect, "SQL dialect is unknown, cannot use ARRAY values in SQL");
                    result.add(ARRAY.getValue(keywordCase) + sqlDialect.getArrayStart() + (componentType.isPrimitive() ? handlePrimitivesInArray(componentType, value) : handleObjectInArray(value)) + sqlDialect.getArrayEnd());
                } else if (value instanceof Map<?, ?> map) {
                    result.add(MAP.getValue(keywordCase) + "(" + handleObjectInMap(map) + ")");
                } else if (value instanceof Collection<?> collection) {
                    result.add(MULTISET.getValue(keywordCase) + "[" + handleObjectInCollection(collection) + "]");
                } else {
                    result.add(handleObject(value));
                }
            } else if (fields[i] instanceof CompositeField<?, ?> compositeField) {
                SqlDialect sqlDialect = requireNonNull(dialect, "SQL dialect is unknown, cannot use composite prefix in SQL");
                result.add(sqlDialect.getCompositePrefix(keywordCase) + addValues(input, compositeField.getFields(), false));
            } else {
                throw new IllegalArgumentException(fields[i] + " not supported");
            }
        }
        String res = result.toString();
        return !res.isEmpty() ? "(" + res + ")" : res;
    }

    private String handleObjectInArray(Object value) {
        StringBuilder result = new StringBuilder();
        Object[] array = (Object[]) value;
        for (int j = 0; j < array.length; j++) {
            result.append(handleObject(array[j]));
            if (j < array.length - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }

    private String handleObjectInCollection(Collection<?> collection) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (Object elem : collection) {
            result.append(handleObject(elem));
            if (i < collection.size() - 1) {
                result.append(", ");
            }
            i++;
        }
        return result.toString();
    }

    private String handleObjectInMap(Map<?, ?> map) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            result.append(handleObject(entry.getKey()));
            result.append(", ");
            result.append(handleObject(entry.getValue()));
            if (i < map.size() - 1) {
                result.append(", ");
            }
            i++;
        }
        return result.toString();
    }

    private String handleObject(Object value) {
        if (value == null) {
            return NULL.getValue(keywordCase);
        } else {
            if (value.getClass().isArray()) {
                final Class<?> componentType = value.getClass().getComponentType();
                String array = componentType.isPrimitive() ? handlePrimitivesInArray(componentType, value) : handleObjectInArray(value);
                return ARRAY.getValue(keywordCase) + "[" + array + "]";
            } else if (value instanceof Map<?, ?> map) {
                return MAP.getValue(keywordCase) + "(" + handleObjectInMap(map) + ")";
            } else if (value instanceof Collection<?> collection) {
                return MULTISET.getValue(keywordCase) + "[" + handleObjectInCollection(collection) + "]";
            } else {
                String strValue = value.toString();
                final int length = strValue.length();
                final boolean quoteRequired = !(value instanceof Number) && !(value instanceof Boolean);
                String res = handledObjectToString(length, strValue);
                return quoteRequired ? quote + res + quote : res;
            }
        }
    }

    private String handledObjectToString(int length, String strValue) {
        StringBuilder builder = new StringBuilder(length);
        for (int k = 0; k < length; k++) {
            if (strValue.charAt(k) == quote) {
                builder.append('\\').append(quote);
            } else {
                builder.append(strValue.charAt(k));
            }
        }
        return builder.toString();
    }

    private String handlePrimitivesInArray(Class<?> componentType, Object value) {
        StringJoiner joiner = new StringJoiner(", ");
        if (componentType == byte.class) {
            byte[] array = (byte[]) value;
            for (byte b : array) {
                joiner.add(String.valueOf(b));
            }
        }
        if (componentType == short.class) {
            short[] array = (short[]) value;
            for (short i : array) {
                joiner.add(String.valueOf(i));
            }
        }
        if (componentType == boolean.class) {
            boolean[] array = (boolean[]) value;
            for (boolean b : array) {
                joiner.add(String.valueOf(b));
            }
        } else if (componentType == int.class) {
            int[] array = (int[]) value;
            for (int i : array) {
                joiner.add(String.valueOf(i));
            }
        } else if (componentType == long.class) {
            long[] array = (long[]) value;
            for (long l : array) {
                joiner.add(String.valueOf(l));
            }
        } else if (componentType == float.class) {
            float[] array = (float[]) value;
            for (float v : array) {
                joiner.add(String.valueOf(v));
            }
        } else if (componentType == double.class) {
            double[] array = (double[]) value;
            for (double v : array) {
                joiner.add(String.valueOf(v));
            }
        }
        return joiner.toString();
    }

    private String appendTableInfo(Field<?, ? extends CharSequence>[] fields) {
        StringBuilder result = new StringBuilder();
        appendNameToQuery(result, schemaName);
        if (schemaName != null && !schemaName.isEmpty()) {
            result.append(DEFAULT_CATALOG_SEPARATOR);
        }
        appendNameToQuery(result, tableName);
        result.append(" (");
        for (int i = 0; i < fields.length; i++) {
            final String fieldName = fields[i].getName();
            final boolean sqlIdentifierRequired = isSqlQuoteIdentifierRequiredFor(fieldName);
            if (sqlIdentifierRequired) {
                result.append(openSqlIdentifier);
            }
            for (int j = 0; j < fieldName.length(); j++) {
                if (openSqlIdentifier == fieldName.charAt(j) || closeSqlIdentifier == fieldName.charAt(j)) {
                    result.append(openSqlIdentifier);
                }
                result.append(fieldName.charAt(j));
            }
            if (sqlIdentifierRequired) {
                result.append(closeSqlIdentifier);
            }
            if (i < fields.length - 1) {
                result.append(", ");
            }
        }
        result.append(")");
        return result.toString();
    }

    private void appendNameToQuery(StringBuilder sb, String name) {
        if (name == null || name.isEmpty())
            return;
        boolean sqlIdentifierRequired = isSqlQuoteIdentifierRequiredFor(name);
        if (sqlIdentifierRequired) {
            sb.append(openSqlIdentifier);
        }
        sb.append(name);
        if (sqlIdentifierRequired) {
            sb.append(closeSqlIdentifier);
        }
    }

    @Override
    public String generate(Iterable<IN> input, Schema<IN, ?> schema) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String generate(Schema<IN, ?> schema, int limit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getStartStream(Schema<IN, ?> schema) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getEndStream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String generateBatchModeStatements(Schema<IN, ?> schema, List<IN> inputs, int limit) {
        StringBuilder sb = new StringBuilder();
        limit = inputs != null ? Math.min(limit, inputs.size()) : limit;
        for (int i = 0; i < limit; i++) {
            IN input = inputs != null ? inputs.get(i) : null;
            sb.append(apply(input, schema, i));
            if (i == limit - 1 && !sb.isEmpty() || batchSize > 0 && (i + 1) % batchSize == 0) {
                sb.append(SqlDialect.getLastRowSuffix(dialect, keywordCase));
                sb.append(";");
                if (i < limit - 1 && !sb.isEmpty()) {
                    sb.append(LINE_SEPARATOR);
                }
            }
        }
        return sb.toString();
    }

    /**
     * Represents an interval of integers.
     * Useful to capture range of rows corresponding to batch SQL statements.
     *
     * @see SqlTransformer#generateStream(Schema, long)
     */
    private record Interval(int start, int end) {

        private Interval add(int offset) {
            return new Interval(start + offset, end + offset);
        }
    }

    @Override
    public Stream<CharSequence> generateStream(final Schema<IN, ?> schema, long limit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String generateSeparatedStatements(Schema<IN, ?> schema, List<IN> inputs, int limit) {
        StringJoiner data = new StringJoiner(LINE_SEPARATOR);
        limit = inputs != null ? Math.min(limit, inputs.size()) : limit;
        for (int i = 0; i < limit; i++) {
            IN input = inputs != null ? inputs.get(i) : null;
            data.add(apply(input, schema) + ";");
        }
        return data.toString();
    }

    public static class SqlTransformerBuilder<IN> {

        private char quote = DEFAULT_QUOTE;

        private String sqlQuoteIdentifier = DEFAULT_SQL_IDENTIFIER;

        private String tableName = "MyTable";

        private String schemaName = "";

        private Casing casing = Casing.TO_UPPER;

        private boolean withBatchMode = false;

        // no limit
        private int batchSize = -1;

        private Case keywordCase = Case.UPPERCASE;

        private boolean forceSqlQuoteIdentifierUsage = false;

        private SqlDialect dialect;

        public SqlTransformerBuilder<IN> dialect(SqlDialect dialect) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public SqlTransformerBuilder<IN> casing(Casing casing) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public SqlTransformerBuilder<IN> quote(char quote) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public SqlTransformerBuilder<IN> sqlQuoteIdentifier(String sqlQuoteIdentifier) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public SqlTransformerBuilder<IN> tableName(String tableName) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public SqlTransformerBuilder<IN> schemaName(String schemaName) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public SqlTransformerBuilder<IN> batch() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public SqlTransformerBuilder<IN> batch(int batchSize) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public SqlTransformerBuilder<IN> keywordCase(Case caze) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public SqlTransformerBuilder<IN> forceUseSqlQuoteIdentifier() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public SqlTransformer<IN> build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public enum Case {

        CAPITAL, LOWERCASE, UPPERCASE
    }

    enum SQLKeyWords {

        ARRAY("ARRAY", "array", "Array"),
        MAP("MAP", "map", "Map"),
        NAMED_STRUCT("NAMED_STRUCT", "named_struct", "Named_Struct"),
        INSERT_ALL("INSERT ALL", "insert all", "Insert All"),
        INSERT_INTO("INSERT INTO", "insert into", "Insert Into"),
        INTO("INTO", "into", "Into"),
        MULTISET("MULTISET", "multiset", "Multiset"),
        NULL("NULL", "null", "Null"),
        ROW("ROW", "row", "Row"),
        SELECT_1_FROM_DUAL("SELECT 1 FROM dual", "select 1 from dual", "Select 1 From dual"),
        VALUES("VALUES", "values", "Values");

        private final String upperCaseValue;

        private final String lowerCaseValue;

        private final String capitalValue;

        SQLKeyWords(String upperCaseValue, String lowerCaseValue, String capitalValue) {
            this.upperCaseValue = upperCaseValue;
            this.lowerCaseValue = lowerCaseValue;
            this.capitalValue = capitalValue;
        }

        public String getValue(Case caze) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
