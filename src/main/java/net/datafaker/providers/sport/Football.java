package net.datafaker.providers.sport;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.5.0
 */
public class Football extends AbstractProvider<SportProviders> {

    protected Football(SportProviders faker) {
        super(faker);
    }

    public String teams() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String players() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String coaches() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String competitions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String positions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
