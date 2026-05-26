package net.datafaker.providers.base;

/**
 * @since 1.4.0
 */
public class Device extends AbstractProvider<BaseProviders> {

    protected Device(BaseProviders faker) {
        super(faker);
    }

    public String modelName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String platform() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String manufacturer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String serial() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
