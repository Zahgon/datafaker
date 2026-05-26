package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * The Elder Scrolls is a series of action role-playing video games primarily developed by Bethesda Game Studios and published by Bethesda Softworks.
 *
 * @since 0.8.0
 */
public class ElderScrolls extends AbstractProvider<VideoGameProviders> {

    protected ElderScrolls(VideoGameProviders faker) {
        super(faker);
    }

    public String race() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String creature() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String region() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String dragon() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String city() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String firstName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String lastName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
