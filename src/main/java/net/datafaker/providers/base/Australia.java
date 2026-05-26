package net.datafaker.providers.base;

/**
 * @since 1.2.0
 */
public class Australia extends AbstractProvider<BaseProviders> {

    protected Australia(BaseProviders faker) {
        super(faker);
    }

    public String locations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String animals() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String states() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
