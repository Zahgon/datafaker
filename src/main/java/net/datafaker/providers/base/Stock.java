package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Stock extends AbstractProvider<BaseProviders> {

    protected Stock(BaseProviders faker) {
        super(faker);
    }

    public String nsdqSymbol() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String nyseSymbol() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String nseSymbol() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String lseSymbol() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String exchanges() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
