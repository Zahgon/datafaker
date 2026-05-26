package net.datafaker.providers.base;

/**
 * @since 1.0.0
 */
public class Appliance extends AbstractProvider<BaseProviders> {

    protected Appliance(BaseProviders faker) {
        super(faker);
    }

    public String brand() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String equipment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
