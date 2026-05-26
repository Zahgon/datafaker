package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 1.5.0
 */
public class BigBangTheory extends AbstractProvider<EntertainmentProviders> {

    protected BigBangTheory(EntertainmentProviders faker) {
        super(faker);
    }

    /**
     * This method generates a random Big Bang Theory's character's name.
     *
     * @return a string of Big Bang Theory's character's name.
     */
    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random Big Bang Theory's character's quote.
     *
     * @return a string of Big Bang Theory's character's quote.
     */
    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
