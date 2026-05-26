package net.datafaker.providers.base;

/**
 * @since 1.3.0
 */
public class Subscription extends AbstractProvider<BaseProviders> {

    protected Subscription(BaseProviders faker) {
        super(faker);
    }

    public String plans() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String statuses() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String paymentMethods() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String subscriptionTerms() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String paymentTerms() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
