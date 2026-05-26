package net.datafaker.providers.base;

/**
 * @since 2.3.0
 */
public class Location extends AbstractProvider<BaseProviders> {

    protected Location(BaseProviders faker) {
        super(faker);
    }

    public String building() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String work() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String nature() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String publicSpace() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String privateSpace() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String otherworldly() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
