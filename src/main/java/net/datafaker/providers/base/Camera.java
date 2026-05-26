package net.datafaker.providers.base;

/**
 * @since 1.4.0
 */
public class Camera extends AbstractProvider<BaseProviders> {

    protected Camera(BaseProviders faker) {
        super(faker);
    }

    /**
     * This method generates a random camera brand.
     *
     * @return a string of camera brand.
     */
    public String brand() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random camera model.
     *
     * @return a string of camera model.
     */
    public String model() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random camera brand with a model.
     *
     * @return a string of camera brand with a model.
     */
    public String brandWithModel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
