package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Futurama is an American animated science fiction sitcom created by Matt Groening for the Fox Broadcasting Company.
 *
 * @since 1.8.0
 */
public class Futurama extends AbstractProvider<EntertainmentProviders> {

    protected Futurama(EntertainmentProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String hermesCatchPhrase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
