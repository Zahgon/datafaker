package net.datafaker.service;

import net.datafaker.internal.helper.SingletonLocale;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Locale;
import java.util.Objects;

class FakeValuesContext {

    private final SingletonLocale singletonLocale;

    private final String filename;

    private final int filenameHashCode;

    private final String path;

    private final URL url;

    private final int urlHashCode;

    private FakeValuesContext(Locale locale) {
        this(locale, getFilename(locale), getFilename(locale), null);
    }

    private FakeValuesContext(Locale locale, URL url) {
        this(locale, getFilename(locale), null, url);
    }

    private FakeValuesContext(Locale locale, String filename, String path) {
        this(locale, filename, path, null);
    }

    private FakeValuesContext(Locale locale, String filename, String path, URL url) {
        this.singletonLocale = SingletonLocale.get(locale);
        this.filename = filename;
        this.path = path;
        this.url = url;
        this.filenameHashCode = filename == null ? 0 : filename.hashCode();
        try {
            this.urlHashCode = url == null ? 0 : url.toURI().hashCode();
        } catch (URISyntaxException e) {
            throw new RuntimeException("Invalid url: \"%s\"".formatted(url), e);
        }
    }

    public static FakeValuesContext of(Locale locale) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static FakeValuesContext of(Locale locale, URL url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static FakeValuesContext of(Locale locale, String filename, String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static FakeValuesContext of(Locale locale, String filename, String path, URL url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String getFilename(Locale locale) {
        String lang = language(locale);
        if (locale.getCountry().isEmpty()) {
            return lang;
        } else if (locale.getLanguage().isEmpty()) {
            return "_" + locale.getCountry();
        } else {
            return lang + "-" + locale.getCountry();
        }
    }

    /**
     * If you create a locale with "he", it gets converted to "iw" which is old.
     * This addresses that unfortunate condition.
     */
    private static String language(Locale locale) {
        return switch(locale.getLanguage()) {
            case "iw" ->
                "he";
            case "in" ->
                "id";
            case "ji" ->
                "yi";
            default ->
                locale.getLanguage();
        };
    }

    public Locale getLocale() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFilename() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String getPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public URL getUrl() {
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
