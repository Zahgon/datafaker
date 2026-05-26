package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.8.0
 */
public class Buffy extends AbstractProvider<EntertainmentProviders> {

    protected Buffy(EntertainmentProviders faker) {
        super(faker);
    }

    public String characters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quotes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String celebrities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String bigBads() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String episodes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
