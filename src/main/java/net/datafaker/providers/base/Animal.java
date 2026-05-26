package net.datafaker.providers.base;

import net.datafaker.internal.helper.WordUtils;

/**
 * @since 0.8.0
 */
public class Animal extends AbstractProvider<BaseProviders> {

    protected Animal(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String scientificName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String genus() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String species() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
