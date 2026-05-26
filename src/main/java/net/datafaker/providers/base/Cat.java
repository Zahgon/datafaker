package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Cat extends AbstractProvider<BaseProviders> {

    protected Cat(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String breed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String registry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
