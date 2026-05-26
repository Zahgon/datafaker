package net.datafaker.providers.base;

/**
 * @since 1.5.0
 */
public class IndustrySegments extends AbstractProvider<BaseProviders> {

    protected IndustrySegments(BaseProviders faker) {
        super(faker);
    }

    public String industry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String superSector() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sector() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String subSector() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
