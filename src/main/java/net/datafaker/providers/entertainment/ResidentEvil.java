package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * A class for generating random value of ResidentEvil series.
 *
 * @since 0.9.0
 */
public class ResidentEvil extends AbstractProvider<EntertainmentProviders> {

    protected ResidentEvil(EntertainmentProviders faker) {
        super(faker);
    }

    /**
     * @return A random character string (like leon kennedy) of ResidentEvil series.
     */
    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return A random biologicalAgent string of ResidentEvil series. This string may contains special characters.
     */
    public String biologicalAgent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return A random equipment string of ResidentEvil series, which includes weapons and other items.
     */
    public String equipment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return A random location string of ResidentEvil series.
     */
    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return A random creature string of ResidentEvil series.
     */
    public String creature() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
