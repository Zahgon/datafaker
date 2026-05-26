package net.datafaker.providers.base;

/**
 * Military ranks.
 *
 * @since 1.2.0
 */
public class Military extends AbstractProvider<BaseProviders> {

    protected Military(BaseProviders faker) {
        super(faker);
    }

    public String armyRank() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String marinesRank() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String navyRank() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String airForceRank() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String dodPaygrade() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
