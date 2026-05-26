package net.datafaker.providers.base;

/**
 * @since 1.2.0
 */
public class Restaurant extends AbstractProvider<BaseProviders> {

    protected Restaurant(BaseProviders faker) {
        super(faker);
    }

    public String namePrefix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String nameSuffix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String type() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String description() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String review() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
