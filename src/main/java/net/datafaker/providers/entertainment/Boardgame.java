package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

/**
 * @since 2.3.0
 */
public class Boardgame extends AbstractProvider<BaseProviders> {

    protected Boardgame(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String category() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String mechanic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String subdomain() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String designer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String artist() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String publisher() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
