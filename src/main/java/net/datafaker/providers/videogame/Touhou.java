package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * The Touhou Project, also known simply as Touhou, is a bullet hell shoot 'em up video game series created by one-man independent Japanese doujin soft developer Team Shanghai Alice.
 *
 * @since 0.9.0
 */
public class Touhou extends AbstractProvider<VideoGameProviders> {

    protected Touhou(VideoGameProviders faker) {
        super(faker);
    }

    public String characterName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characterFirstName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characterLastName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String trackName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String gameName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
