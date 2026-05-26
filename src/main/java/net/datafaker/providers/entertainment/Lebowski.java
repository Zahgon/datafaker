package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.8.0
 */
public class Lebowski extends AbstractProvider<EntertainmentProviders> {

    public Lebowski(final EntertainmentProviders faker) {
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
