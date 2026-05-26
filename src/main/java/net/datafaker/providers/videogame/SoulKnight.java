package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Soul Knight is a game made by ChillyRoom Inc.
 *
 * @author zhou mintao
 * @since 1.4.0
 */
public class SoulKnight extends AbstractProvider<VideoGameProviders> {

    protected SoulKnight(final VideoGameProviders faker) {
        super(faker);
    }

    /**
     * @return a random value of characters
     */
    public String characters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random value of buffs
     */
    public String buffs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random value of statues
     */
    public String statues() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random value of weapons
     */
    public String weapons() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random value of bosses
     */
    public String bosses() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random value of enemies
     */
    public String enemies() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
