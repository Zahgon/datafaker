package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Dark Souls is a series of action role-playing games created by Hidetaka Miyazaki of FromSoftware and published by Bandai Namco Entertainment.
 *
 * @author SickDawn
 * @since 1.5.0
 */
public class DarkSouls extends AbstractProvider<VideoGameProviders> {

    public DarkSouls(final VideoGameProviders faker) {
        super(faker);
    }

    public String stats() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String covenants() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String classes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String shield() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
