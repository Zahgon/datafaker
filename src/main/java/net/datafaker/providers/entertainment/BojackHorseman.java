package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Generate random parts in BojackHorseman.
 *
 * @author unknown and irakatz
 * @since 0.8.0
 */
public class BojackHorseman extends AbstractProvider<EntertainmentProviders> {

    /**
     * Create a constructor for BojackHorseman.
     *
     * @param faker The Faker instance for generating random parts in BojackHorseman.
     */
    protected BojackHorseman(EntertainmentProviders faker) {
        super(faker);
    }

    /**
     * Generate random character's name in BojackHorseman.
     *
     * @return Characters in BojackHorseman
     */
    public String characters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate random quotes in BojackHorseman.
     *
     * @return Quotes in BojackHorseman
     */
    public String quotes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate random tongue twisters in BojackHorseman.
     *
     * @return Tongue twisters in BojackHorseman
     */
    public String tongueTwisters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
