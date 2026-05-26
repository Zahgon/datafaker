package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Elden Ring is a 2022 action role-playing game developed by FromSoftware and published by Bandai Namco Entertainment.
 *
 * @since 1.4.0
 */
public class EldenRing extends AbstractProvider<VideoGameProviders> {

    protected EldenRing(VideoGameProviders faker) {
        super(faker);
    }

    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String weapon() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String skill() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String spell() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String npc() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
