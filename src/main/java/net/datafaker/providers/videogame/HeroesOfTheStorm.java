package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Heroes of the Storm is a crossover multiplayer online battle arena video game developed and published by Blizzard Entertainment.
 *
 * @since 1.7.0
 */
public class HeroesOfTheStorm extends AbstractProvider<VideoGameProviders> {

    protected HeroesOfTheStorm(VideoGameProviders faker) {
        super(faker);
    }

    public String battleground() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String heroClass() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String hero() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
