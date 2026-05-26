package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class University extends AbstractProvider<BaseProviders> {

    protected University(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String degree() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String prefix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String suffix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String place() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
