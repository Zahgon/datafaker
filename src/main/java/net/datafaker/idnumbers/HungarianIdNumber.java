package net.datafaker.idnumbers;

import net.datafaker.providers.base.BaseProviders;
import net.datafaker.providers.base.IdNumber;
import net.datafaker.providers.base.PersonIdNumber;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.lang.Character.getNumericValue;
import static net.datafaker.idnumbers.Utils.randomGender;

/**
 * Hungarian personal identification number
 * <p>
 * The structure of such number is GYYMMDDXXC, whereas
 * <ul>
 *  <li>G indicates century of birth and gender,</li>
 *  <li>YYMMDD indicates birth year, month and day,</li>
 *  <li>XX is the serial number, and</li>
 *  <li>C is a checksum digit.</li>
 * </ul>
 * <p>
 * See <a href="https://en.wikipedia.org/wiki/National_identification_number#Hungary">Hungarian identification number</a>
 */
public class HungarianIdNumber implements IdNumberGenerator {

    private static final DateTimeFormatter BIRTHDAY_FORMAT = DateTimeFormatter.ofPattern("yyMMdd");

    @Override
    public String countryCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String generateInvalid(BaseProviders faker) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public PersonIdNumber generateValid(BaseProviders faker, IdNumber.IdNumberRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String basePart(BaseProviders faker, LocalDate birthday, PersonIdNumber.Gender gender) {
        return firstDigit(birthday.getYear(), gender) + BIRTHDAY_FORMAT.format(birthday) + faker.number().digits(2);
    }

    static int getCheckDigit(String basePart) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static int firstDigit(int birthYear, PersonIdNumber.Gender gender) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static boolean isInRange(int birthYear) {
        return birthYear >= 1900 && birthYear <= 1999;
    }
}
