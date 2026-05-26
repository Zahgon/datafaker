package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.8.0
 */
public class StarTrek extends AbstractProvider<EntertainmentProviders> {

    protected StarTrek(EntertainmentProviders faker) {
        super(faker);
    }

    /**
     * @return a random Star Trek character
     */
    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random Star Trek location (planet, starbase, area of space)
     */
    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random alien species
     */
    public String species() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random Star Trek villain
     */
    public String villain() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random Klingon phrase
     */
    public String klingon() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a random Federation starship
     */
    public String starship() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
