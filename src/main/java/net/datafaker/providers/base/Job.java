package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Job extends AbstractProvider<BaseProviders> {

    public Job(final BaseProviders faker) {
        super(faker);
    }

    public String field() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String seniority() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String position() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String keySkills() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String title() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
