package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Superhero extends AbstractProvider<BaseProviders> {

    protected Superhero(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String prefix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String suffix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String power() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String descriptor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
