package net.datafaker.sequence;

import net.datafaker.providers.base.BaseProviders;
import net.datafaker.service.RandomService;
import java.util.*;
import java.util.function.Supplier;

public abstract class FakeSequence<T> implements Iterable<T> {

    protected final RandomService randomService;

    protected final List<Supplier<T>> suppliers;

    protected final double nullRate;

    protected final int minLength;

    protected final int maxLength;

    protected FakeSequence(List<Supplier<T>> suppliers, int minLength, int maxLength, RandomService randomService, double nullRate) {
        this.suppliers = suppliers;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.randomService = randomService;
        this.nullRate = nullRate;
    }

    public abstract <Sequence> Sequence get();

    public boolean isInfinite() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public T singleton() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static abstract class Builder<T> {

        protected final List<Supplier<T>> suppliers;

        protected int minLength = -1;

        protected int maxLength = -1;

        protected double nullRate = 0d;

        protected BaseProviders faker;

        protected Builder() {
            suppliers = new ArrayList<>();
        }

        protected Builder(List<Supplier<T>> list) {
            suppliers = new ArrayList<>(list);
        }

        @SafeVarargs
        protected Builder(Supplier<T>... elems) {
            suppliers = new ArrayList<>(Arrays.asList(elems));
        }

        public FakeSequence.Builder<T> faker(BaseProviders faker) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public FakeSequence.Builder<T> minLen(int minLength) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public FakeSequence.Builder<T> maxLen(int maxLength) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public FakeSequence.Builder<T> len(int length) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public FakeSequence.Builder<T> len(int minLength, int maxLength) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public FakeSequence.Builder<T> nullRate(double nullRate) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @SafeVarargs
        public final FakeSequence.Builder<T> suppliers(Supplier<T>... suppliers) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public abstract FakeSequence<T> build();

        /**
         * @param <S> might be Stream or List.
         * @return List or Stream with generated random values.
         */
        public <S> S generate() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
