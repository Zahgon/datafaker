package net.datafaker.providers.base;

/**
 * Sources:
 * <a href="https://www.wheel-size.com/tire/">Wheel size</a>
 * <a href="https://en.wikipedia.org/wiki/Tire_code">Tire code</a>
 *
 * @since 2.0.2
 */
public class Tire extends AbstractProvider<BaseProviders> {

    protected Tire(BaseProviders faker) {
        super(faker);
    }

    /**
     * Returns a Tire Code, such as 205/60R16.
     * Which is width in mm / aspect ratio (height to width percentage) R (radial) Rim diameter.
     *
     * @return a Tire Code String.
     */
    public String code() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a Tire Code prefixed with the provided String.
     *
     * @return a Tire Code string prefixed with the provided String.
     */
    public String code(String prefix) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a Tire Code optionally prefixed with the default prefix (P for passenger vehicle).
     * @param defaultPrefix if true the default prefix "P" will be included, otherwise it will not.
     *
     * @return a Tire Code string, such as P205/60R16.
     */
    public String code(boolean defaultPrefix) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String vehicleType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String width() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String aspectRatio() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String construction() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String rimSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String loadIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String speedrating() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
