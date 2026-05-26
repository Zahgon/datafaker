package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.8.0
 */
public class Pokemon extends AbstractProvider<EntertainmentProviders> {

    protected Pokemon(EntertainmentProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String move() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String type() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
