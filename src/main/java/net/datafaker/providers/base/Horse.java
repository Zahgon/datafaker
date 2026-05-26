package net.datafaker.providers.base;

/**
 * @since 1.3.0
 */
public class Horse extends AbstractProvider<BaseProviders> {

    protected Horse(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String breed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
