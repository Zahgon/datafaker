package net.datafaker.providers.sport;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.2.0
 */
public class Formula1 extends AbstractProvider<SportProviders> {

    protected Formula1(SportProviders faker) {
        super(faker);
    }

    public String driver() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String team() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String circuit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String grandPrix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
