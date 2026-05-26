package net.datafaker.providers.base;

/**
 * @since 0.9.0
 */
public class Mood extends AbstractProvider<BaseProviders> {

    protected Mood(BaseProviders faker) {
        super(faker);
    }

    public String feeling() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String emotion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String tone() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
