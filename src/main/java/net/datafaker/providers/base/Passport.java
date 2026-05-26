package net.datafaker.providers.base;

/**
 * @since 0.9.0
 */
public class Passport extends AbstractProvider<BaseProviders> {

    protected Passport(BaseProviders faker) {
        super(faker);
    }

    public String valid() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
