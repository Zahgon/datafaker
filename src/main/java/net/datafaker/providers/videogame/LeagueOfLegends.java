package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * League of Legends is a 2009 multiplayer online battle arena video game developed and published by Riot Games.
 *
 * @since 0.8.0
 */
public class LeagueOfLegends extends AbstractProvider<VideoGameProviders> {

    protected LeagueOfLegends(VideoGameProviders faker) {
        super(faker);
    }

    public String champion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String summonerSpell() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String masteries() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String rank() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
