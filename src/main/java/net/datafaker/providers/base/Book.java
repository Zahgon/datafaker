package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Book extends AbstractProvider<BaseProviders> {

    protected Book(BaseProviders faker) {
        super(faker);
    }

    public String author() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String title() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String publisher() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String genre() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
