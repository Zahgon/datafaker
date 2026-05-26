package net.datafaker.sequence;

import net.datafaker.service.RandomService;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FakeStream<T> extends FakeSequence<T> {

    private FakeStream(List<Supplier<T>> suppliers, int minLength, int maxLength, RandomService randomService, double nullRate) {
        super(suppliers, minLength, maxLength, randomService, nullRate);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Stream<T> get() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isInfinite() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Builder<T> extends FakeSequence.Builder<T> {

        public Builder() {
            super();
        }

        public Builder(List<Supplier<T>> list) {
            super(list);
        }

        @SafeVarargs
        public Builder(Supplier<T>... elems) {
            super(elems);
        }

        @Override
        public FakeStream<T> build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
