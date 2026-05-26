package net.datafaker.providers.base;

/**
 * A generator for Mountain names and ranges.
 *
 * @since 1.1.0
 */
public class Mountain extends AbstractProvider<BaseProviders> {

    protected Mountain(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String range() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
