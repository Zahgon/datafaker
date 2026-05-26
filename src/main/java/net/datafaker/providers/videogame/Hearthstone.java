package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Hearthstone is a free-to-play online digital collectible card game developed and published by Blizzard Entertainment.
 *
 * @since 0.9.0
 */
public class Hearthstone extends AbstractProvider<VideoGameProviders> {

    protected Hearthstone(final VideoGameProviders faker) {
        super(faker);
    }

    public String mainProfession() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String mainCharacter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String mainPattern() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int battlegroundsScore() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String standardRank() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String wildRank() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
