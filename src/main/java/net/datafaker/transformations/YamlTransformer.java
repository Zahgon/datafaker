package net.datafaker.transformations;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;
import net.datafaker.sequence.FakeSequence;

public class YamlTransformer<IN> implements Transformer<IN, CharSequence> {

    private static final String INDENTATION = "  ";

    @Override
    public CharSequence apply(IN input, Schema<IN, ?> schema) {
        throw new UnsupportedOperationException("STUB: not implemented");
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

    private String apply(final StringBuilder sb, final IN input, final Field<IN, ?>[] fields, final String offset) {
        Set<String> keys = new HashSet<>();
        for (Field<IN, ?> field : fields) {
            String key = field.getName().trim();
            if (!keys.add(key))
                continue;
            Object value = field.transform(input);
            sb.append(offset).append(key).append(":");
            if (value instanceof Schema) {
                sb.append(System.lineSeparator());
                value2String(value, sb, offset + INDENTATION);
            } else {
                value2String(value, sb, offset);
            }
            if (sb.lastIndexOf(System.lineSeparator()) != sb.length() - System.lineSeparator().length()) {
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    private void addCollection(StringBuilder sb, Collection<Object> collection, String offset) {
        for (Object value : collection) {
            value2String(value, sb, offset + "-");
            sb.append(System.lineSeparator());
        }
    }

    private void value2String(Object value, StringBuilder sb, String offset) {
        if (value instanceof Schema) {
            Field<IN, ?>[] fields = ((Schema<IN, ?>) value).getFields();
            apply(sb, null, fields, offset);
        } else if (value instanceof Collection) {
            sb.append(System.lineSeparator());
            offset += INDENTATION;
            addCollection(sb, (Collection) value, offset);
        } else if (value != null && value.getClass().isArray()) {
            sb.append(System.lineSeparator());
            offset += INDENTATION;
            addCollection(sb, Arrays.asList((Object[]) value), offset);
        } else {
            if (sb.charAt(sb.length() - 1) != ':') {
                sb.append(offset);
            }
            sb.append(" ").append(String.valueOf(value).trim());
        }
    }
}
