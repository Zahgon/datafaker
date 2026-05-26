package net.datafaker.providers.sport;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.3.0
 */
public class Volleyball extends AbstractProvider<SportProviders> {

    protected Volleyball(SportProviders faker) {
        super(faker);
    }

    public String team() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String player() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String coach() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String position() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String formation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
