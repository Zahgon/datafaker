package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Country extends AbstractProvider<BaseProviders> {

    private final String flagUrl;

    protected Country(BaseProviders faker) {
        super(faker);
        this.flagUrl = "https://flags.fmcdn.net/data/flags/w580/";
    }

    public String flag() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String countryCode2() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String countryCode3() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String capital() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @see Money#currency()
     * @return a random detailed ISO 4217 currency display name
     */
    public String currency() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @see Money#currencyCode()
     * @return an ISO 4217 currency code
     */
    public String currencyCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
