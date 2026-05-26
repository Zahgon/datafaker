package net.datafaker.transformations;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public interface Transformer<IN, OUT> {

    String LINE_SEPARATOR = System.lineSeparator();

    OUT apply(IN input, Schema<IN, ?> schema);

    default OUT apply(IN input, Schema<IN, ?> schema, long rowId) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    OUT generate(Iterable<IN> input, final Schema<IN, ?> schema);

    OUT generate(final Schema<IN, ?> schema, int limit);

    String getStartStream(final Schema<IN, ?> schema);

    String getEndStream();

    default String getLineSeparator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default String getElementSeparator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Stream<OUT> generateStream(final Schema<IN, ?> schema, long limit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default void writeToOutputStream(OutputStream outputStream, final Schema<IN, ?> schema, long limit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    class Item {

        private long current;

        public Item(long current) {
            this.current = current;
        }
    }
}
