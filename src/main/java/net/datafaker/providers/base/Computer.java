package net.datafaker.providers.base;

/**
 * Generates different attributes related to computers, such as operating systems, types, platforms and brands.
 *
 * @since 1.5.0
 */
public class Computer extends AbstractProvider<BaseProviders> {

    protected Computer(BaseProviders faker) {
        super(faker);
    }

    public String type() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String platform() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String operatingSystem() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String linux() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String macos() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String windows() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String brand() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
