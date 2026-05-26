package net.datafaker.idnumbers;

import net.datafaker.providers.base.BaseProviders;
import net.datafaker.providers.base.IdNumber.IdNumberRequest;
import net.datafaker.providers.base.PersonIdNumber;
import net.datafaker.providers.base.PersonIdNumber.Gender;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static net.datafaker.idnumbers.Utils.birthday;
import static net.datafaker.idnumbers.Utils.gender;
import static net.datafaker.idnumbers.Utils.multiply;
import static net.datafaker.idnumbers.Utils.randomGender;

/**
 * The Romanian Cod Numeric Personal (CNP), or Personal Numeric Code
 * is a unique identifying number consisting of 13 digits.
 *
 * <a href="https://en.wikipedia.org/wiki/Romanian_identity_card#CNP">Description</a>
 */
public class RomanianIdNumber implements IdNumberGenerator {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyMMdd");

    private static final int[] CHECKSUM_WEIGHTS = { 2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9 };

    @Override
    public String countryCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public PersonIdNumber generateValid(BaseProviders faker, IdNumberRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String generateInvalid(BaseProviders faker) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String basePart(BaseProviders faker, LocalDate birthday, Gender gender) {
        return firstCharacter(birthday, gender) + dateOfBirth(birthday) + countyCode(faker) + sequenceNumber(faker);
    }

    /**
     * Represents the gender and century in which the person was born and can be:
     * – 1 for male persons born between 1900-1999;
     * – 2 for female persons born between 1900-1999;
     * – 3 for male persons born between 1800-1899;
     * – 4 for female persons born between 1800-1899;
     * – 5 for male persons born between 2000-2099;
     * – 6 for female persons born between the years 2000-2099;
     */
    int firstCharacter(LocalDate birthday, Gender gender) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String dateOfBirth(LocalDate birthday) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Character 8–9: 01–46 or 51 or 52
     */
    String countyCode(BaseProviders faker) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * next 3 digits is a number between 001 and 999.
     * Each number is allocated only once per person per day.
     */
    String sequenceNumber(BaseProviders faker) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * last digit is a control digit calculated from all the other 12 digits in the code as follows:
     * (n1*2+n2*7+n3*9+n4*1+n5*4+n6*6+n7*3+n8*5+n9*8+n10*2+n11*7+n12*9)%11
     *
     * if the result is 10 then the digit is 1, otherwise is the result.
     */
    int checksum(String basePart) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
