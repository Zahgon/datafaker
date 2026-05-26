package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.6.0
 */
public class DumbAndDumber extends AbstractProvider<EntertainmentProviders> {

    protected DumbAndDumber(EntertainmentProviders faker) {
        super(faker);
    }

    public String actor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
