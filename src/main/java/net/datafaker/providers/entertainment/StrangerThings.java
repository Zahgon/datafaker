package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Stranger Things is an American sci-fi television series created by the Duffer Brothers.
 *
 * @since 1.8.0
 */
public class StrangerThings extends AbstractProvider<EntertainmentProviders> {

    protected StrangerThings(EntertainmentProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
