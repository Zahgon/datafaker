package net.datafaker.transformations;

import java.util.Arrays;

public class Schema<IN, OUT> {

    private final Field<IN, OUT>[] fields;

    protected Schema(Field<IN, OUT>[] fields) {
        this.fields = fields;
    }

    public Field<IN, OUT>[] getFields() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SafeVarargs
    public static <IN, OUT> Schema<IN, OUT> of(Field<IN, OUT>... fields) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
