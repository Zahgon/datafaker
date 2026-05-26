package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Street Fighter is a Japanese media franchise centered on a series of fighting video and arcade games developed and published by Capcom.
 *
 * @since 1.8.0
 */
public class StreetFighter extends AbstractProvider<VideoGameProviders> {

    protected StreetFighter(VideoGameProviders faker) {
        super(faker);
    }

    public String characters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String stages() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quotes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String moves() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
