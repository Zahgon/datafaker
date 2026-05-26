package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.8.0
 */
public class Avatar extends AbstractProvider<EntertainmentProviders> {

    private final String baseUrl;

    protected Avatar(EntertainmentProviders faker) {
        super(faker);
        this.baseUrl = "https://robohash.org/";
    }

    public String image() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
