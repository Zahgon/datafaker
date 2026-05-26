package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * World of Warcraft is a massively multiplayer online role-playing game released in 2004 by Blizzard Entertainment.
 *
 * @since 1.8.0
 */
public class WorldOfWarcraft extends AbstractProvider<VideoGameProviders> {

    protected WorldOfWarcraft(VideoGameProviders faker) {
        super(faker);
    }

    public String hero() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quotes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
