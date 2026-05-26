package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto, that tells the story of Naruto Uzumaki.
 *
 * @since 1.8.0
 */
public class Naruto extends AbstractProvider<EntertainmentProviders> {

    protected Naruto(EntertainmentProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String village() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String eye() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String demon() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
