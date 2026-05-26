package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.5.0
 */
public class Departed extends AbstractProvider<EntertainmentProviders> {

    protected Departed(EntertainmentProviders faker) {
        super(faker);
    }

    /**
     * This method generates a random actor's name from The Departed.
     *
     * @return a string of actor's name from The Departed.
     */
    public String actor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random character's name from The Departed.
     *
     * @return a string of character's name from The Departed.
     */
    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random quote from The Departed.
     *
     * @return a string of quote from The Departed.
     */
    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
