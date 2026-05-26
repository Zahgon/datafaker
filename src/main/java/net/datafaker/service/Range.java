package net.datafaker.service;

import java.util.function.Function;

public record Range<T extends Comparable<T>>(Bound<T> from, Bound<T> to) {

    public enum End {

        INCLUSIVE, EXCLUSIVE
    }

    public record Bound<T>(T value, End end) {
    }

    /**
     * A range that contains all values
     * 1. greater than or equal to {@code from}, and
     * 2. less than or equal to {@code to}.
     */
    public static <T extends Comparable<T>> Range<T> inclusive(T from, T to) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * A range that contains all values
     * 1. greater than or equal to {@code from}, and
     * 2. less than {@code to}.
     */
    public static <T extends Comparable<T>> Range<T> inclusiveExclusive(T from, T to) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * A range that contains all values
     * 1. strictly greater than {@code from}, and
     * 2. strictly less than {@code to}.
     */
    public static <T extends Number & Comparable<T>> Range<T> exclusive(T from, T to) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * A range that contains all values
     * 1. strictly greater than {@code from}, and
     * 2. less than or equal to {@code to}.
     */
    public static <T extends Comparable<T>> Range<T> exclusiveInclusive(T from, T to) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <V extends Comparable<V>> Range<V> cast(Function<T, V> caster) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
