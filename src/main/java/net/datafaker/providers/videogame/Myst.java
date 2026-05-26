package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Myst is a graphic adventure/puzzle video game designed by the Miller brothers, Robyn and Rand.
 *
 * @since 1.8.0
 */
public class Myst extends AbstractProvider<VideoGameProviders> {

    protected Myst(VideoGameProviders faker) {
        super(faker);
    }

    public String games() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String creatures() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String ages() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quotes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
