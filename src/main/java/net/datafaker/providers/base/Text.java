package net.datafaker.providers.base;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Generates random text in a flexible way.
 *
 * @since 1.7.0
 */
public class Text extends AbstractProvider<BaseProviders> {

    private final Map<TextConfigPojo, TextRuleConfig> configMap = new WeakHashMap<>();

    public Character character() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Character uppercaseCharacter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Character lowercaseCharacter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return A lowercase string of 20 to 80 characters long.
     */
    public String text() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param includeDigit if digits should be included
     * @return A lowercase string of 20 to 80 characters long.
     */
    public String text(boolean includeDigit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param length The length of the string to return
     * @return A lowercase string of exact length
     */
    public String text(int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param minimumLength The minimum length (inclusive)
     * @param maximumLength The maximum length (inclusive)
     * @return A lowercase string between minimum and maximum length (inclusive)
     */
    public String text(int minimumLength, int maximumLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String text(int minimumLength, int maximumLength, boolean includeUppercase) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String text(int minimumLength, int maximumLength, boolean includeUppercase, boolean includeSpecial) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * For example, expression {@code text(5, 15, true, false, true} generates a random string of length 5 to 15
     * containing at least one upper case letter and at least one digit.
     *
     * @param minimumLength The generated text will not be shorter than this length
     * @param maximumLength The generated text will not be longer than this length
     * @param includeUppercase is at least one uppercase letter required
     * @param includeSpecial  is at least one special symbol required
     * @param includeDigit  is at least one digit required
     * @return a random string withing given length interval
     * @see Text#DEFAULT_SPECIAL
     * @throws IllegalArgumentException if {@code minimumLength > maximumLength}
     * @throws IllegalArgumentException if {@code maximumLength} is not enough to include the required symbols (upper case letter, special char, digit)
     */
    public String text(int minimumLength, int maximumLength, boolean includeUppercase, boolean includeSpecial, boolean includeDigit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int min(boolean requireSomeKindOfSymbols) {
        return requireSomeKindOfSymbols ? 1 : 0;
    }

    public static final String EN_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";

    public static final String EN_UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final String DIGITS = "0123456789";

    public static final String DEFAULT_SPECIAL = "!@#$%^&*";

    public Text(BaseProviders faker) {
        super(faker);
    }

    public static class TextRuleConfig {

        private final char[][] textKeys;

        private final int[] required;

        private final int fixedNumberOfCharacters;

        private final int numberOfRequiredSymbols;

        private TextRuleConfig(int fixedNumberOfCharacters, Map<String, Integer> map, int numberOfRequiredSymbols) {
            assert numberOfRequiredSymbols >= 0;
            assert fixedNumberOfCharacters >= numberOfRequiredSymbols;
            this.fixedNumberOfCharacters = fixedNumberOfCharacters;
            this.numberOfRequiredSymbols = numberOfRequiredSymbols;
            this.textKeys = new char[map.size()][];
            this.required = new int[map.size()];
            int i = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                textKeys[i] = entry.getKey().toCharArray();
                required[i] = entry.getValue();
                i++;
            }
        }

        public int getFixedNumberOfCharacters() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getNumberOfRequiredSymbols() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static class TextSymbolsBuilder {

        private int length;

        private final Map<String, Integer> map = new HashMap<>();

        private boolean throwIfLengthSmall = false;

        private TextSymbolsBuilder() {
        }

        public static TextSymbolsBuilder builder() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public TextSymbolsBuilder with(String listOfSymbols, int times) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public TextSymbolsBuilder with(String listOfSymbols) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public TextSymbolsBuilder len(int len) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public TextSymbolsBuilder throwIfLengthSmall(boolean throwIfLengthSmall) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public TextRuleConfig build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Allows to configure custom expected rules. Example
     * <pre>
     * {@code
     *     faker.text().text(Text.TextSymbolsBuilder.builder()
     *                 .len(5)
     *                 .with(EN_LOWERCASE, 1)
     *                 .with(EN_UPPERCASE, 1)
     *                 .with(DIGITS, 1);
     * }
     * </pre>
     * This will generate a text with length 5 containing minimum 1 lower case and 1 upper case symbol
     * from en locale and minimum 1 digit.
     * Custom symbol sets are also possible
     * <pre>
     * {@code
     *     final String ruLowerCase = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
     *     final String customSpecialSymbols = "!@#$%^*;'][{}";
     *     final int ruCnt = 3;
     *     final int specSmbCnt = 5;
     *     final Text.TextRuleConfig config = Text.TextSymbolsBuilder.builder()
     *         .len(faker.number().numberBetween(ruCnt + specSmbCnt, Math.max(ruCnt + specSmbCnt, 10)))
     *         .with(ruLowerCase, ruCnt)
     *         .with(customSpecialSymbols, specSmbCnt).build();
     *     final String text = faker.text().text(config);
     * }
     * </pre>
     * This will generate a string with length between 8 and 10.
     * The string will contain min 3 lower case symbols
     * from ru locale and minimum 5 symbols from the defined string var
     * {@code final String customSpecialSymbols = "!@#$%^*;'][{}";}.
     */
    public String text(TextRuleConfig textRuleConfig) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String textWithNotMoreThan256DiffSymbols(TextRuleConfig textRuleConfig, byte[] bytes, int fixedNumberOfCharacters, int numberOfRequiredSymbols) {
        char[] buffer = new char[fixedNumberOfCharacters];
        int idx = 0;
        int bytesCounter = 0;
        int numberOfRequired = 0;
        int[] required = Arrays.copyOf(textRuleConfig.required, textRuleConfig.required.length);
        while (idx < buffer.length) {
            if (numberOfRequiredSymbols > numberOfRequired && numberOfRequiredSymbols - numberOfRequired == buffer.length - idx) {
                for (int j = 0; j < textRuleConfig.textKeys.length; j++) {
                    while (required[j] > 0) {
                        buffer[idx++] = textRuleConfig.textKeys[j][((char) (bytes[bytesCounter++])) % textRuleConfig.textKeys[j].length];
                        numberOfRequired++;
                        required[j]--;
                    }
                    if (idx == buffer.length)
                        break;
                }
            } else {
                int index = ((char) (bytes[bytesCounter++])) % textRuleConfig.textKeys.length;
                if (required[index] > 0) {
                    numberOfRequired++;
                    required[index]--;
                }
                buffer[idx++] = textRuleConfig.textKeys[index][((char) bytes[bytesCounter++]) % textRuleConfig.textKeys[index].length];
            }
        }
        return String.valueOf(buffer);
    }

    private record TextConfigPojo(int length, boolean includeUppercase, boolean includeSpecial, boolean includeDigit) {
    }
}
