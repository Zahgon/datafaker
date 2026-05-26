package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Warhammer Fantasy is a tabletop miniature wargame with a medieval fantasy theme.
 *
 * @since 1.8.0
 */
public class WarhammerFantasy extends AbstractProvider<VideoGameProviders> {

    protected WarhammerFantasy(VideoGameProviders faker) {
        super(faker);
    }

    public String heros() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quotes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String locations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String factions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String creatures() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
