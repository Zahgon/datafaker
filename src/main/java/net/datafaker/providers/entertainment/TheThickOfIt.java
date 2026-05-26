package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.8.0
 */
public class TheThickOfIt extends AbstractProvider<EntertainmentProviders> {

    protected TheThickOfIt(EntertainmentProviders faker) {
        super(faker);
    }

    public String characters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String positions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String departments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
