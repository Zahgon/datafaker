package net.datafaker.providers.sport;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Generate random components of basketball game, e.g. teams, coaches, positions and players.
 *
 * @author unknown and irakatz
 * @since 0.8.0
 */
public class Basketball extends AbstractProvider<SportProviders> {

    /**
     * Create a constructor for Basketball.
     *
     * @param faker The Faker instance for generating random, different kinds of disease, e.g. the internal disease.
     */
    protected Basketball(SportProviders faker) {
        super(faker);
    }

    /**
     * Generate random basketball teams
     *
     * @return Basketball teams
     */
    public String teams() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate random coaches in basketball game
     *
     * @return Basketball coaches
     */
    public String coaches() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate random positions in basketball game
     *
     * @return Basketball positions
     */
    public String positions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate random basketball players
     *
     * @return Basketball players
     */
    public String players() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
