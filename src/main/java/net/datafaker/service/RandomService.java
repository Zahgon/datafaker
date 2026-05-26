package net.datafaker.service;

import java.util.Objects;
import java.util.Random;
import java.util.random.RandomGenerator;

public class RandomService {

    private static final char[] HEX_UP = "0123456789ABCDEF".toCharArray();

    private static final char[] HEX_LOWER = "0123456789abcdef".toCharArray();

    private static final Random SHARED_RANDOM = new Random();

    private final RandomGenerator random;

    /**
     * Uses a default shared random.
     */
    public RandomService() {
        this(SHARED_RANDOM);
    }

    /**
     * @param random If null is passed in, a default Random is assigned
     */
    public RandomService(RandomGenerator random) {
        this.random = random != null ? random : SHARED_RANDOM;
    }

    @SuppressWarnings("unused")
    public int nextInt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int nextInt(int maxExclusive) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Integer nextInt(int minInclusive, int maxInclusive) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int nextInt(Range<Integer> range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unused")
    public float nextFloat() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long nextLong() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long nextLong(long maxExclusive) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long nextLong(Range<Long> range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static long plusOne(long value) {
        return value == Long.MAX_VALUE ? value : value + 1;
    }

    /**
     * A random long value within given range.
     * If {@code min == max} then method always returns {@code min}.
     * Otherwise, {@code max} is exclusive.
     *
     * @param min lower bound (inclusive)
     * @param max upper bound (exclusive in most cases)
     * @return a random long value between {@code min} and {@code max}
     */
    public long nextLong(long min, long max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double nextDouble() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param min (inclusive)
     * @param max (inclusive)
     * @return a random double value between {@code min} and {@code max} (both inclusive)
     */
    public double nextDouble(double min, double max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean nextBoolean() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public byte[] nextRandomBytes(int numberOfBytes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T extends Enum<T>> T nextEnum(Class<T> klass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String hex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String hex(int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String hex(int length, boolean upper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public RandomGenerator getRandomInternal() {
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

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
