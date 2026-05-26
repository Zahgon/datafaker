package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.8.0
 */
public class GameOfThrones extends AbstractProvider<EntertainmentProviders> {

    protected GameOfThrones(EntertainmentProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String house() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String city() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String dragon() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
