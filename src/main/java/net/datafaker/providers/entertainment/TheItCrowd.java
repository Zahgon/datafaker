package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.8.0
 */
public class TheItCrowd extends AbstractProvider<EntertainmentProviders> {

    protected TheItCrowd(EntertainmentProviders faker) {
        super(faker);
    }

    public String actors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String emails() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quotes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
