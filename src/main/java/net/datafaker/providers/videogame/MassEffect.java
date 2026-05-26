package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Mass Effect is a military science fiction media franchise.
 *
 * @since 1.6.0
 */
public class MassEffect extends AbstractProvider<VideoGameProviders> {

    protected MassEffect(final VideoGameProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String specie() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String cluster() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String planet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
