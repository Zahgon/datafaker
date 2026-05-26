package net.datafaker.providers.base;

import net.datafaker.internal.helper.WordUtils;
import java.util.ArrayList;
import java.util.List;

/**
 * @since 0.8.0
 */
public class Lorem extends AbstractProvider<BaseProviders> {

    protected Lorem(BaseProviders faker) {
        super(faker);
    }

    public char character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public char character(boolean includeUppercase) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characters(boolean includeUppercase) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characters(int minimumLength, int maximumLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characters(int minimumLength, int maximumLength, boolean includeUppercase) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characters(int minimumLength, int maximumLength, boolean includeUppercase, boolean includeDigit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characters(int fixedNumberOfCharacters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characters(int fixedNumberOfCharacters, boolean includeUppercase) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characters(int minimumLength, int maximumLength, boolean includeUppercase, boolean includeSpecial, boolean includeDigit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characters(int fixedNumberOfCharacters, boolean includeUppercase, boolean includeDigit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characters(int fixedNumberOfCharacters, boolean includeUppercase, boolean includeSpecial, boolean includeDigit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> words(int num) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> words() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String word() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String supplemental() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create a sentence with a random number of words within the range 4..10.
     *
     * @return a random sentence
     */
    public String sentence() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create a sentence with a random number of words within the range (wordCount+1)..(wordCount+6).
     *
     * @return a random sentence
     */
    public String sentence(int wordCount) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create a sentence with a random number of words within the range (wordCount+1)..(wordCount+randomWordsToAdd).
     * <p>
     * Set {@code randomWordsToAdd} to 0 to generate sentences with a fixed number of words.
     *
     * @return a random sentence
     */
    public String sentence(int wordCount, int randomWordsToAdd) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> sentences(int sentenceCount) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a paragraph with a range (sentenceCount)...(&lt;sentenceCount+3)
     */
    public String paragraph(int sentenceCount) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String paragraph() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> paragraphs(int paragraphCount) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create a string with a fixed size. Can be useful for testing
     * validator based on length string for example
     *
     * @param numberOfLetters size of the expected String
     * @return a string with a fixed size
     */
    public String fixedString(int numberOfLetters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create a Lorem Ipsum sentence with fixed length.
     *
     * @param fixedLength size of the expected Lorem Ipsum sentence.
     * @return a string with a fixed size.
     * Return empty string if input size is 0 or negative.
     */
    public String maxLengthSentence(final int fixedLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
