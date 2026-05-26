package net.datafaker.providers.base;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @since 0.8.0
 */
public class Options extends AbstractProvider<BaseProviders> {

    protected Options(BaseProviders faker) {
        super(faker);
    }

    /**
     * Returns a random element from an varargs.
     *
     * @param options The varargs to take a random element from.
     * @param <E>     The type of the elements in the varargs.
     * @return A randomly selected element from the varargs.
     */
    @SafeVarargs
    public final <E> E option(E... options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public final char option(char[] options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public final int option(int[] options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public final long option(long[] options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public final float option(float[] options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public final double option(double[] options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public final short option(short[] options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public final boolean option(boolean[] options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public final byte option(byte[] options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a random unique subset of elements from an varargs.
     *
     * @param size    The size of subset to return.
     * @param options The varargs to take a random element from.
     * @param <E>     The type of the elements in the varargs.
     * @return A randomly selected unique subset from the varargs.
     * If size is negative then {@code IllegalArgumentException} will be thrown.
     * If size is zero then an empty subset will be returned.
     * If size is larger than a unique set from options then all options will be returned.
     */
    public final <E> Set<E> subset(int size, E... options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a random String element from an varargs.
     *
     * @param options The varargs to take a random element from.
     * @return A randomly selected element from the varargs.
     */
    public String option(String... options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a random unique subset of elements from an varargs.
     *
     * @param size    The size of subset to return.
     * @param options The varargs to take a random element from.
     * @return A randomly selected unique subset from the varargs.
     * If size is negative then {@code IllegalArgumentException} will be thrown.
     * If size is zero then an empty subset will be returned.
     * If size is larger than a unique set from options then all options will be returned.
     */
    public final Set<String> subset(int size, String... options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a random element from Enum.
     *
     * @param enumeration The Enum to take a random element from.
     * @return A randomly selected element from the enum.
     */
    public <E extends Enum<E>> E option(Class<E> enumeration) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a random element from an array.
     *
     * @param array The array to take a random element from.
     * @param <E>   The type of the elements in the array.
     * @return A randomly selected element from the array.
     */
    public <E> E nextElement(E[] array) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a random element from a list.
     *
     * @param list The list to take a random element from.
     * @param <E>  The type of the elements in the list.
     * @return A randomly selected element from the list.
     */
    public <E> E nextElement(List<E> list) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
