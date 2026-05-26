package net.datafaker.providers.base;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Generates codes such as ISBN, gin, ean and others.
 * <p>
 * For ISBN Rules, see <a href="https://en.wikipedia.org/wiki/International_Standard_Book_Number">https://en.wikipedia.org/wiki/International_Standard_Book_Number</a>.
 *
 * @since 0.8.0
 */
public class Code extends AbstractProvider<BaseProviders> {

    private static final int[] GTIN_8_CHECK_DIGITS = { 3, 1, 3, 1, 3, 1, 3 };

    private static final int[] GTIN_13_CHECK_DIGITS = { 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3 };

    private static final String[] REPORTING_BODY_IDENTIFIERS = { "01", "10", "30", "33", "35", "44", "45", "49", "50", "51", "52", "53", "54", "86", "91", "98", "99" };

    protected Code(BaseProviders faker) {
        super(faker);
    }

    /**
     * This can be overridden by specifying
     * <code>
     * code:
     * isbn_gs1: "some expression"
     * </code>
     * in the appropriate yml file.
     *
     * @return a GS1 code for an ISBN13, currently is only 978 and 979
     */
    public String isbnGs1() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This can be overridden by specifying
     * <code>
     * code:
     * isbn_group: "some expression"
     * </code>
     * in the appropriate yml file.
     *
     * @return an ISBN group number
     */
    public String isbnGroup() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This can be overridden by specifying
     * <code>
     * code:
     * isbn_registrant: "some expression"
     * </code>
     * in the appropriate yml file.
     *
     * @return an ISBN registrant 'element' with separator
     */
    public String isbnRegistrant() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a valid ISBN10 number with no separators (ex. 9604250590)
     */
    public String isbn10() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param separator true if you want separators returned, false otherwise
     * @return a valid ISBN10 number with or without separators (ex. 9604250590, 960-425-059-0)
     */
    public String isbn10(boolean separator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a valid ISBN13 number with no separators (ex. 9789604250590)
     */
    public String isbn13() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param separator true if you want separators returned, false otherwise
     * @return a valid ISBN13 number with or without separators (ex. 9789604250590, 978-960-425-059-0)
     */
    public String isbn13(boolean separator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private int isbn10CheckDigit(CharSequence t) {
        String value = stripIsbnSeparator(t);
        int sum = 0;
        for (int i = 0; i < value.length(); i++) {
            sum += ((i + 1) * Integer.parseInt(value.substring(i, i + 1)));
        }
        return sum % 11;
    }

    private int isbn13CheckDigit(CharSequence t) {
        String value = stripIsbnSeparator(t);
        int sum = 0;
        int multiplier;
        for (int i = 0; i < value.length(); i++) {
            multiplier = i % 2 == 0 ? 1 : 3;
            sum += multiplier * Integer.parseInt(value.subSequence(i, i + 1).toString());
        }
        return (10 - sum % 10) % 10;
    }

    private String stripIsbnSeparator(CharSequence t) {
        return t.toString().replace("-", "");
    }

    public String asin() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String imei() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String ean8() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String gtin8() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String gtin13() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String ean13() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String gtin(String regex, int[] checkDigits) {
        List<Character> values = faker.regexify(regex).chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum += Character.getNumericValue(values.get(i)) * checkDigits[i];
        }
        int checkDigit = 10 - sum % 10;
        if (checkDigit == 10) {
            values.add(Character.forDigit(0, 10));
        } else {
            values.add(Character.forDigit(checkDigit, 10));
        }
        return values.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
