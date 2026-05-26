package net.datafaker.idnumbers;

import net.datafaker.providers.base.BaseProviders;
import net.datafaker.providers.base.IdNumber.IdNumberRequest;
import net.datafaker.providers.base.Options;
import net.datafaker.providers.base.PersonIdNumber;
import net.datafaker.providers.base.PersonIdNumber.Gender;
import java.time.LocalDate;
import static net.datafaker.idnumbers.Utils.gender;
import static net.datafaker.idnumbers.Utils.birthday;

/**
 * Implementation based on the definition at
 * <a href="https://en.wikipedia.org/wiki/Unique_Population_Registry_Code">https://en.wikipedia.org/wiki/Unique_Population_Registry_Code</a>
 */
public class MexicanIdNumber implements IdNumberGenerator {

    @Override
    public String countryCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static final String[] CHA = { "HEFA560427MVZRRL04", "DKEM193827HDQWEF05", "KAKS142444HNSSFAW6", "KSDF414424HNSDFAW6", "AKDF414424MSDSFAW6", "ADKF144424MNSDFCD6", "MYDF144424MDNFAW37", "AKKS414424MDAFDFW6", "WKDF144244HSDCNFA2", "AKSK414244HSDATT56", "QWDF414424HNSDVAW4", "AKDF144424MDEFVFA1" };

    private static final char[] CONSONANT = { 'B', 'C', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'L', 'M', 'N', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z' };

    private static final char[] VOWEL = { 'A', 'E', 'I', 'O', 'U' };

    private static final String[] STATES = { "AG", "BC", "BS", "CM", "CS", "CH", "CO", "CL", "DF", "DG", "GT", "GR", "HG", "JA", "EM", "MI", "MO", "NA", "NL", "OA", "PU", "QT", "QR", "SL", "SI", "SO", "TB", "TM", "TL", "VE", "YU", "ZA", "NE" };

    @Deprecated
    public String get(BaseProviders faker) {
        return generateValid(faker);
    }

    /**
     * Get A valid MEX CURP.
     *
     * @param faker faker
     * @return A valid MEX CURP.
     */
    @Override
    public PersonIdNumber generateValid(BaseProviders faker, IdNumberRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private char genderCharacter(Gender gender) {
        return switch(gender) {
            case FEMALE ->
                'M';
            case MALE ->
                'H';
        };
    }

    @Deprecated
    public String getWrong(BaseProviders faker) {
        return generateInvalid(faker);
    }

    /**
     * Get A invalid MEX CURP.
     *
     * @param faker faker
     * @return A invalid MEX CURP.
     */
    @Override
    public String generateInvalid(BaseProviders faker) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Formats given birthday to fit into ID Number
     */
    private String formatBirthday(LocalDate birthday) {
        return String.valueOf(birthday.getYear() * 10000 + birthday.getMonthValue() * 100 + birthday.getDayOfMonth());
    }

    /**
     * Gets the Checksum.
     *
     * @param str input string
     * @return Checksum.
     */
    private int getChecksum(char[] str) {
        int sum = 0;
        int v = str.length;
        for (int i = 0; i < str.length - 1; i++) {
            int number;
            if (str[i] < '9')
                number = str[i] - '0';
            else
                number = str[i] - 'A' + 10;
            sum += number * v--;
        }
        sum = Math.abs((sum % 10) - 10);
        return (sum == 10) ? 0 : sum;
    }
}
