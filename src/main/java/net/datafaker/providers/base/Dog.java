package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Dog extends AbstractProvider<BaseProviders> {

    protected Dog(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String breed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sound() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String memePhrase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String age() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String coatLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String gender() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String size() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
