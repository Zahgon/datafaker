package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Video games are electronic games that involve interaction with a user interface or input device.
 *
 * @since 1.8.0
 */
public class VideoGame extends AbstractProvider<VideoGameProviders> {

    protected VideoGame(VideoGameProviders faker) {
        super(faker);
    }

    public String title() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String genre() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String platform() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
