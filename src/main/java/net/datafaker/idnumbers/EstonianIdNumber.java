package net.datafaker.idnumbers;

import net.datafaker.providers.base.BaseProviders;
import net.datafaker.providers.base.IdNumber.IdNumberRequest;
import net.datafaker.providers.base.PersonIdNumber;
import net.datafaker.providers.base.PersonIdNumber.Gender;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static net.datafaker.idnumbers.Utils.gender;
import static net.datafaker.idnumbers.Utils.birthday;
import static net.datafaker.idnumbers.Utils.randomGender;

/**
 * Estonian personal identification number ("Isikukood" in estonian)
 * <p>
 * The number is 11 digits, with modulus 11 checksum digit.
 * There is fixed list of valid first digits to signify gender and birth century
 * <p>
 * and <a href="https://en.wikipedia.org/wiki/National_identification_number#Estonia">Estonian identification number</a>
 */
public class EstonianIdNumber implements IdNumberGenerator {

    private static final DateTimeFormatter BIRTHDAY_FORMAT = DateTimeFormatter.ofPattern("yyMMdd");

    private static final int[] CHECKSUM_COEFFICIENTS = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1 };

    private static final int[] CHECKSUM_COEFFICIENTS2 = { 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 };

    @Override
    public String countryCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String generateInvalid(final BaseProviders faker) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public PersonIdNumber generateValid(BaseProviders faker, IdNumberRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String basePart(BaseProviders faker, LocalDate birthday, Gender gender) {
        return firstDigit(birthday.getYear(), gender) + BIRTHDAY_FORMAT.format(birthday) + faker.number().digits(3);
    }

    static int firstDigit(int birthYear, Gender gender) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static int checksum(String numbers) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int checksum(String numbers, int[] checksumCoefficients) {
        int checkSum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            int digit = Character.getNumericValue(numbers.charAt(i));
            checkSum += checksumCoefficients[i] * digit;
        }
        return checkSum % 11;
    }
}
