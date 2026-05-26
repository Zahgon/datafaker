package net.datafaker.providers.base;

/**
 * @since 0.8.0
 */
public class Relationship extends AbstractProvider<BaseProviders> {

    private enum Kind {

        direct("relationship.familial.direct"),
        extended("relationship.familial.extended"),
        inLaw("relationship.in_law"),
        spouse("relationship.spouse"),
        parent("relationship.parent"),
        sibling("relationship.sibling");

        private final String expression;

        Kind(String expression) {
            this.expression = expression;
        }
    }

    protected Relationship(final BaseProviders faker) {
        super(faker);
    }

    public String direct() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String extended() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String inLaw() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String spouse() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String parent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sibling() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String any() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
