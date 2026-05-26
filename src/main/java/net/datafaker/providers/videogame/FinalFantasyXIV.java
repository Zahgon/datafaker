package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Final Fantasy XIV is an MMORPG and features a persistent world in which players can interact with each other and the environment.
 * Players create and customize their characters for use in the game, including name, race, gender, facial features, and starting class.
 *
 * @since 2.0.0
 */
public class FinalFantasyXIV extends AbstractProvider<VideoGameProviders> {

    protected FinalFantasyXIV(VideoGameProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String job() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String race() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String dataCenter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String zone() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
