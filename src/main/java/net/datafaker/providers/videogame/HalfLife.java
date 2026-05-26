package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Half-Life is a series of first-person shooter games developed and published by Valve.
 *
 * @since 1.8.0
 */
public class HalfLife extends AbstractProvider<VideoGameProviders> {

    protected HalfLife(VideoGameProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String enemy() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
