package net.datafaker.providers.base;

import java.util.Locale;

/**
 * @since 0.8.0
 */
public class Nation extends AbstractProvider<BaseProviders> {

    private static final String[] isoLanguages = Locale.getISOLanguages();

    private static final String[] isoCountries = Locale.getISOCountries();

    protected Nation(BaseProviders faker) {
        super(faker);
    }

    public String nationality() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String language() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String capitalCity() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String flag() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String isoLanguage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String isoCountry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
