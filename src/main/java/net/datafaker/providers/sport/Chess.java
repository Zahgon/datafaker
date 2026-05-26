package net.datafaker.providers.sport;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.8.0
 */
public class Chess extends AbstractProvider<SportProviders> {

    protected Chess(SportProviders faker) {
        super(faker);
    }

    public String player() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String tournament() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String opening() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String title() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
