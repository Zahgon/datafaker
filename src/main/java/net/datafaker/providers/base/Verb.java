package net.datafaker.providers.base;

/**
 * @since 1.5.0
 */
public class Verb extends AbstractProvider<BaseProviders> {

    protected Verb(BaseProviders faker) {
        super(faker);
    }

    /**
     * This method generates the base form of a random verb.
     *
     * @return a string of base form of a verb.
     */
    public String base() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random verb in past tense.
     *
     * @return a string of verb in past tense.
     */
    public String past() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random verb in past participle tense.
     *
     * @return a string of verb in past participle tense.
     */
    public String pastParticiple() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random verb in simple present tense.
     *
     * @return a string of verb in simple present tense.
     */
    public String simplePresent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random verb in -ing form.
     *
     * @return a string of verb in -ing form.
     */
    public String ingForm() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
