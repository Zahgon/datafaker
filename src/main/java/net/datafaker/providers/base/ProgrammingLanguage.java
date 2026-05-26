package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class ProgrammingLanguage extends AbstractProvider<BaseProviders> {

    public ProgrammingLanguage(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String creator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
