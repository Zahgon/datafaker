package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Sword Art Online is a Japanese light novel series written by Reki Kawahara and illustrated by abec.
 *
 * @since 1.8.0
 */
public class SwordArtOnline extends AbstractProvider<EntertainmentProviders> {

    protected SwordArtOnline(EntertainmentProviders faker) {
        super(faker);
    }

    public String realName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String gameName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String item() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
