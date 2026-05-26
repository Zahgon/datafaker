package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Super Smash Bros. is a crossover fighting game series published by Nintendo.
 *
 * @since 1.8.0
 */
public class SuperSmashBros extends AbstractProvider<VideoGameProviders> {

    protected SuperSmashBros(VideoGameProviders faker) {
        super(faker);
    }

    public String fighter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String stage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
