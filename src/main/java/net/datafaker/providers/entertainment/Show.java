package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.8.0
 */
public class Show extends AbstractProvider<EntertainmentProviders> {

    protected Show(EntertainmentProviders faker) {
        super(faker);
    }

    public String adultMusical() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String play() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String kidsMusical() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
