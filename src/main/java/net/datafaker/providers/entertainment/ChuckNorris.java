package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.8.0
 */
public class ChuckNorris extends AbstractProvider<EntertainmentProviders> {

    protected ChuckNorris(EntertainmentProviders faker) {
        super(faker);
    }

    public String fact() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
