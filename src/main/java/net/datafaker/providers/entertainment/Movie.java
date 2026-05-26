package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.5.0
 */
public class Movie extends AbstractProvider<EntertainmentProviders> {

    protected Movie(EntertainmentProviders faker) {
        super(faker);
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
