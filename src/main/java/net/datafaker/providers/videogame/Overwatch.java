package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Overwatch is a free-to-play, team-based action game set in the optimistic future.
 *
 * @since 0.8.0
 */
public class Overwatch extends AbstractProvider<VideoGameProviders> {

    protected Overwatch(final VideoGameProviders faker) {
        super(faker);
    }

    public String hero() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
