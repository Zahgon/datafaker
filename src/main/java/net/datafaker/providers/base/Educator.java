package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Educator extends AbstractProvider<BaseProviders> {

    protected Educator(BaseProviders faker) {
        super(faker);
    }

    // TODO - move these all out to en.yml by default.
    public String university() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String course() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String subjectWithNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String secondarySchool() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String campus() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
