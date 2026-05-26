package net.datafaker.sequence;

import net.datafaker.service.RandomService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class FakeCollection<T> extends FakeSequence<T> {

    private static final int FAKE_COLLECTION_DEFAULT_SIZE = 10;

    private FakeCollection(List<Supplier<T>> suppliers, int minLength, int maxLength, RandomService randomService, double nullRate) {
        super(suppliers, minLength, maxLength, randomService, nullRate);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> get() {
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
        public FakeCollection<T> build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
