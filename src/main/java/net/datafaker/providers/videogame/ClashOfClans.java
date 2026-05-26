package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Clash of Clans is a 2012 free-to-play mobile strategy video game developed and published by Finnish game developer Supercell.
 *
 * @since 1.6.0
 */
public class ClashOfClans extends AbstractProvider<VideoGameProviders> {

    protected ClashOfClans(VideoGameProviders faker) {
        super(faker);
    }

    public String troop() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String rank() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String defensiveBuilding() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
