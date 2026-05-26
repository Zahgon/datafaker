package net.datafaker.transformations;

import net.datafaker.sequence.FakeSequence;
import java.util.Iterator;

public class CsvTransformer<IN> implements Transformer<IN, CharSequence> {

    public static final String DEFAULT_SEPARATOR = ";";

    public static final char DEFAULT_QUOTE = '"';

    private final String separator;

    private final char quote;

    private final boolean withHeader;

    private CsvTransformer(String separator, char quote, boolean withHeader) {
        this.separator = separator;
        this.quote = quote;
        this.withHeader = withHeader;
    }

    public static <IN> CsvTransformerBuilder<IN> builder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public CharSequence apply(IN input, Schema<IN, ?> schema) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String generate(Iterable<IN> input, Schema<IN, ?> schema) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void addLine(StringBuilder sb, Object transform) {
        if (transform instanceof CharSequence) {
            addCharSequence(sb, (CharSequence) transform);
        } else {
            sb.append(transform);
        }
    }

    private void addCharSequence(StringBuilder sb, CharSequence charSequence) {
        sb.append(quote);
        int i = 0;
        final int length = charSequence.length();
        for (int j = 0; j < length; j++) {
            final char c = charSequence.charAt(j);
            if (c == quote) {
                sb.append(charSequence, i, j + 1).append(quote);
                i = j + 1;
            }
        }
        sb.append(charSequence, i, length);
        sb.append(quote);
    }

    private void generateHeader(Schema<?, ?> schema, StringBuilder sb, boolean insertSeparator) {
        if (withHeader) {
            for (int i = 0; i < schema.getFields().length; i++) {
                addLine(sb, schema.getFields()[i].getName());
                if (i < schema.getFields().length - 1) {
                    sb.append(separator);
                }
            }
            if (insertSeparator) {
                sb.append(LINE_SEPARATOR);
            }
        }
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

    public static class CsvTransformerBuilder<IN> {

        private String separator = DEFAULT_SEPARATOR;

        private char quote = DEFAULT_QUOTE;

        private boolean withHeader = true;

        public CsvTransformerBuilder<IN> quote(char quote) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public CsvTransformerBuilder<IN> separator(String separator) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public CsvTransformerBuilder<IN> header(boolean header) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public CsvTransformer<IN> build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
