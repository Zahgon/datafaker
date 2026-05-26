package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * The Expanse is an American science fiction television series developed by Mark Fergus and Hawk Ostby for the Syfy network.
 *
 * @since 1.8.0
 */
public class TheExpanse extends AbstractProvider<EntertainmentProviders> {

    protected TheExpanse(EntertainmentProviders faker) {
        super(faker);
    }

    public String characters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String locations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String ships() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quotes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
