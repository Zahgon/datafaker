package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Gravity Falls is an American animated television series created by Alex Hirsch,
 * and produced by Disney Television Animation for Disney Channel and Disney XD.
 *
 * @author vicky-iv
 * @since 2.5.3
 */
public class GravityFalls extends AbstractProvider<EntertainmentProviders> {

    protected GravityFalls(EntertainmentProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String creature() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String artifact() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String mabelSweater() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String mysteryShackItem() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
