package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Battlefield 1 is a first-person shooter game developed by DICE and published by Electronic Arts.
 *
 * @author coolestjj
 * @since 1.4.0
 */
public class Battlefield1 extends AbstractProvider<VideoGameProviders> {

    protected Battlefield1(final VideoGameProviders faker) {
        super(faker);
    }

    /**
     * @return a random unit class name as a string value
     */
    public String classes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random weapon name as a string value
     */
    public String weapon() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random vehicle name as a string value
     */
    public String vehicle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random map title as a string value
     */
    public String map() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random faction name as a string value
     */
    public String faction() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
