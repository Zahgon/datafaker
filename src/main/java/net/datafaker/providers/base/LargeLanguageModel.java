package net.datafaker.providers.base;

/**
 * Providers related to Large Language Models (LLMs)
 *
 * @since 2.3.0
 */
public class LargeLanguageModel extends AbstractProvider<BaseProviders> {

    protected LargeLanguageModel(BaseProviders faker) {
        super(faker);
    }

    public String textModel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String embeddingModel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String tokenizer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
