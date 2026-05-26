package net.datafaker.providers.base;

/**
 * Generates emergency-related fake data: the nature of an emergency
 * (fire, flood, tornado, ...), a plausible emergency location, an
 * instruction someone might be asked to follow in response, and a
 * dry-run flag distinguishing training alerts from real emergencies.
 *
 * @since 2.6.0
 */
public class Emergency extends AbstractProvider<BaseProviders> {

    protected Emergency(BaseProviders faker) {
        super(faker);
    }

    /**
     * @return a type of emergency, e.g. "Fire", "Flood", "Tornado".
     */
    public String nature() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a plausible location where an emergency might occur,
     * e.g. "Highway", "Downtown office building".
     */
    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return an instruction to follow during an emergency, e.g.
     * "Evacuate the building", "Shelter in place".
     */
    public String instruction() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return {@code true} for a dry-run (training) alert, {@code false}
     * for a real emergency.
     */
    public boolean dryRun() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a complete emergency case bundling {@link #nature()},
     * {@link #location()}, {@link #instruction()}, and {@link #dryRun()}.
     */
    public EmergencyCase emergencyCase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public record EmergencyCase(String nature, String location, String instruction, boolean dryRun) {
    }
}
