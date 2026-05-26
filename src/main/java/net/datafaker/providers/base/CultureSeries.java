package net.datafaker.providers.base;

/**
 * The Culture series is a science fiction series written by Scottish author Iain M. Banks and released from 1987 through to 2012.
 *
 * @since 1.7.0
 */
public class CultureSeries extends AbstractProvider<BaseProviders> {

    protected CultureSeries(BaseProviders faker) {
        super(faker);
    }

    public String books() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String cultureShips() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String cultureShipClasses() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String cultureShipClassAbvs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String civs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String planets() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
