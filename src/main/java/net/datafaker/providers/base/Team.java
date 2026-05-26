package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Team extends AbstractProvider<BaseProviders> {

    protected Team(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String creature() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String state() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sport() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
