package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Demographic extends AbstractProvider<BaseProviders> {

    protected Demographic(BaseProviders faker) {
        super(faker);
    }

    public String race() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String educationalAttainment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String demonym() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String maritalStatus() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
