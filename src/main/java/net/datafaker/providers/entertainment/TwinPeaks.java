package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Twin Peaks is an American mystery serial drama television series created by Mark Frost and David Lynch.
 *
 * @since 0.8.0
 */
public class TwinPeaks extends AbstractProvider<EntertainmentProviders> {

    protected TwinPeaks(final EntertainmentProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
