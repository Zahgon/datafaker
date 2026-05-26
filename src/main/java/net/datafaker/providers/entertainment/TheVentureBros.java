package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * The Venture Bros. is an American adult animated action comedy TV series.
 *
 * @since 1.8.0
 */
public class TheVentureBros extends AbstractProvider<EntertainmentProviders> {

    protected TheVentureBros(EntertainmentProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String organization() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String vehicle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
