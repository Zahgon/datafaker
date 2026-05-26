package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Marvel Snap is a digital collectible card game developed by Second Dinner and published by Nuverse for Microsoft Windows, Android and iOS.
 *
 * @since 1.8.0
 */
public class MarvelSnap extends AbstractProvider<VideoGameProviders> {

    protected MarvelSnap(final VideoGameProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String zone() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String event() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String rank() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
