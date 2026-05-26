package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Bool extends AbstractProvider<BaseProviders> {

    protected Bool(BaseProviders faker) {
        super(faker);
    }

    public boolean bool() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
