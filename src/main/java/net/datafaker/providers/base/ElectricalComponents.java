package net.datafaker.providers.base;

/**
 * @since 1.4.0
 */
public class ElectricalComponents extends AbstractProvider<BaseProviders> {

    protected ElectricalComponents(BaseProviders faker) {
        super(faker);
    }

    public String active() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String passive() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String electromechanical() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
