package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * The Room is a 2003 American drama film written, produced, executive produced and directed by Tommy Wiseau.
 *
 * @since 1.8.0
 */
public class TheRoom extends AbstractProvider<EntertainmentProviders> {

    protected TheRoom(EntertainmentProviders faker) {
        super(faker);
    }

    public String actors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String locations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quotes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
