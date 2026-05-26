package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.5.0
 */
public class Ghostbusters extends AbstractProvider<EntertainmentProviders> {

    protected Ghostbusters(EntertainmentProviders faker) {
        super(faker);
    }

    public String actor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
