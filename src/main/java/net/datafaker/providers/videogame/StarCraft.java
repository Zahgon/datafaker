package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * StarCraft is a 1998 military science fiction real-time strategy game developed and published by Blizzard Entertainment.
 *
 * @since 0.8.0
 */
public class StarCraft extends AbstractProvider<VideoGameProviders> {

    protected StarCraft(final VideoGameProviders faker) {
        super(faker);
    }

    public String unit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String building() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String planet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
