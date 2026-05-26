package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Color extends AbstractProvider<BaseProviders> {

    protected Color(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String hex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String hex(boolean includeHashSign) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
