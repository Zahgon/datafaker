package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Ancient extends AbstractProvider<BaseProviders> {

    protected Ancient(BaseProviders faker) {
        super(faker);
    }

    public String god() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String primordial() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String titan() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String hero() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
