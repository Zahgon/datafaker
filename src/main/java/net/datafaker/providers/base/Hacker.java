package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Hacker extends AbstractProvider<BaseProviders> {

    protected Hacker(BaseProviders faker) {
        super(faker);
    }

    public String abbreviation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String adjective() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String noun() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String verb() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String ingverb() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
