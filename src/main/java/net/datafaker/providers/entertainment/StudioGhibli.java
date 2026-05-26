package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.7.0
 */
public class StudioGhibli extends AbstractProvider<EntertainmentProviders> {

    protected StudioGhibli(EntertainmentProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String movie() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
