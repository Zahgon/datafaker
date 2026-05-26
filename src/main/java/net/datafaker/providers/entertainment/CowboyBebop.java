package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Cowboy Bebop is a Japanese neo-noir science fiction anime television series, which originally ran from 1998 to 1999.
 * @since 1.8.0
 */
public class CowboyBebop extends AbstractProvider<EntertainmentProviders> {

    protected CowboyBebop(EntertainmentProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String episode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String song() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
