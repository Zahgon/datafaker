package net.datafaker.providers.base;

/**
 * Provides photography related strings.
 *
 * @since 0.8.0
 */
public class Photography extends AbstractProvider<BaseProviders> {

    protected Photography(BaseProviders faker) {
        super(faker);
    }

    /**
     * @return a photography term.
     */
    public String term() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a photography brand.
     */
    public String brand() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a name of camera model/make.
     */
    public String camera() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return some lens description like 500mm/8.
     */
    public String lens() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a photography genre.
     */
    public String genre() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return some string to tag an image.
     */
    public String imageTag() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return some aperture description like f/1.4 .
     */
    public String aperture() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return some shutter description like 1/25 .
     */
    public String shutter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return some ISO value like 3200.
     */
    public String iso() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
