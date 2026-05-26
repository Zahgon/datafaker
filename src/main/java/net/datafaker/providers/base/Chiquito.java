package net.datafaker.providers.base;

/**
 * @since 1.6.0
 */
public class Chiquito extends AbstractProvider<BaseProviders> {

    protected Chiquito(BaseProviders faker) {
        super(faker);
    }

    public String expressions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String terms() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sentences() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String jokes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
