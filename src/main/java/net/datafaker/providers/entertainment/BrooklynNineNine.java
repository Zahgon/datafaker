package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Brooklyn Nine-Nine is an American police procedural comedy television series.
 *
 * @since 1.3.0
 */
public class BrooklynNineNine extends AbstractProvider<EntertainmentProviders> {

    protected BrooklynNineNine(EntertainmentProviders faker) {
        super(faker);
    }

    public String characters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quotes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
