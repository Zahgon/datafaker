package net.datafaker.internal.helper;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * This class allows to use {@link java.util.IdentityHashMap} for locales.
 * To do that it guarantees one instance of {@link SingletonLocale} per {@link Locale}.
 */
public class SingletonLocale {

    private static final Map<Locale, SingletonLocale> LOCALE2SINGLETON_LOCALE = new HashMap<>();

    private final Locale locale;

    // Hash code is required for FakerContext where SingletonLocale is a field
    private final int hashId = (int) System.nanoTime();

    private SingletonLocale(Locale locale) {
        this.locale = locale;
    }

    public static SingletonLocale get(Locale locale) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Locale getLocale() {
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
