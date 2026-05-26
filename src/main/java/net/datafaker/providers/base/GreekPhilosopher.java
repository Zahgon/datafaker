package net.datafaker.providers.base;

/**
 * @since 1.5.0
 */
public class GreekPhilosopher extends AbstractProvider<BaseProviders> {

    protected GreekPhilosopher(BaseProviders faker) {
        super(faker);
    }

    /**
     * This method generates a random greek philosopher's name.
     *
     * @return a string of greek philosopher's name.
     */
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random greek philosopher's quote.
     *
     * @return a string of greek philosopher's quote.
     */
    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
