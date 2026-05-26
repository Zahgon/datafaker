package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * South Park is an American animated television series created by Trey Parker and Matt Stone.
 *
 * @since 1.8.0
 */
public class SouthPark extends AbstractProvider<EntertainmentProviders> {

    protected SouthPark(EntertainmentProviders faker) {
        super(faker);
    }

    public String characters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quotes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
