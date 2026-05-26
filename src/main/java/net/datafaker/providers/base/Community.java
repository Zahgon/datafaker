package net.datafaker.providers.base;

/**
 * Community is an American television sitcom created by Dan Harmon.
 *
 * @since 1.6.0
 */
public class Community extends AbstractProvider<BaseProviders> {

    protected Community(BaseProviders faker) {
        super(faker);
    }

    public String character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
