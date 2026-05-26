package net.datafaker.providers.base;

/**
 * Nigeria, officially the Federal Republic of Nigeria, is a country in West Africa.
 *
 * @since 1.2.0
 */
public class Nigeria extends AbstractProvider<BaseProviders> {

    private static final String KEY = "nigeria";

    protected Nigeria(BaseProviders faker) {
        super(faker);
    }

    public String places() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String food() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String schools() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String celebrities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
