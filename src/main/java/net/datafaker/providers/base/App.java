package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class App extends AbstractProvider<BaseProviders> {

    protected App(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String version() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String author() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
