package net.datafaker.providers.sport;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.7.0
 */
public class Cricket extends AbstractProvider<SportProviders> {

    protected Cricket(SportProviders faker) {
        super(faker);
    }

    public String teams() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String players() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String formats() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String tournaments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
