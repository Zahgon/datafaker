package net.datafaker.providers.base;

/**
 * This class generates gender neutral pronouns
 * @since 2.2.0
 */
public class Pronouns extends AbstractProvider<BaseProviders> {

    protected Pronouns(BaseProviders faker) {
        super(faker);
    }

    /**
     * Generates a gender neutral subjective pronoun
     * @return a gender neutral subjective pronoun
     */
    public String subjective() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a gender neutral objective pronoun
     * @return a gender neutral objective pronoun
     */
    public String objective() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a gender neutral possessive pronoun
     * @return a gender neutral possessive pronoun
     */
    public String possessive() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a gender neutral reflexive pronoun
     * @return a gender neutral reflexive pronoun
     */
    public String reflexive() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
