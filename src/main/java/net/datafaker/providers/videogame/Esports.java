package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Esports, short for electronic sports, is a form of competition using video games.
 *
 * @since 0.8.0
 */
public class Esports extends AbstractProvider<VideoGameProviders> {

    protected Esports(final VideoGameProviders faker) {
        super(faker);
    }

    public String player() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String team() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String event() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String league() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String game() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
