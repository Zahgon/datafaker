package net.datafaker.providers.entertainment;

import net.datafaker.providers.base.AbstractProvider;

/**
 * The Kingkiller Chronicle is a fantasy trilogy by the American writer Patrick Rothfuss.
 *
 * @since 1.8.0
 */
public class TheKingkillerChronicle extends AbstractProvider<EntertainmentProviders> {

    protected TheKingkillerChronicle(EntertainmentProviders faker) {
        super(faker);
    }

    public String book() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String creature() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String location() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
