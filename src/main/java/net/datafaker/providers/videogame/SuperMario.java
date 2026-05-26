package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Super Mario is a platform game series created by Nintendo starring their mascot, Mario.
 *
 * @since 1.3.0
 */
public class SuperMario extends AbstractProvider<VideoGameProviders> {

    protected SuperMario(VideoGameProviders faker) {
        super(faker);
    }

    public String characters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String games() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String locations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
