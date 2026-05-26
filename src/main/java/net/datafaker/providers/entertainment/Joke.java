package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 2.1.0
 */
public class Joke extends AbstractProvider<EntertainmentProviders> {

    protected Joke(final EntertainmentProviders faker) {
        super(faker);
    }

    public String pun() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String knockKnock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
