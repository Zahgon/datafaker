package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Tormenta is a famous Brazilian RPG created in 1999 by Marcelo Cassaro,
 * Rogério Saladino, and JM Trevisan.
 *
 * @since 2.6.0
 */
public class Tormenta extends AbstractProvider<VideoGameProviders> {

    protected Tormenta(VideoGameProviders faker) {
        super(faker);
    }

    public String bestiary() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String names() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String cities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
