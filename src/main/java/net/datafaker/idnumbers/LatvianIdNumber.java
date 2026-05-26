package net.datafaker.idnumbers;

import net.datafaker.providers.base.BaseProviders;
import net.datafaker.providers.base.IdNumber.IdNumberRequest;
import net.datafaker.providers.base.PersonIdNumber;
import net.datafaker.providers.base.PersonIdNumber.Gender;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static net.datafaker.idnumbers.Utils.*;

/**
 * Latvian personal identification number
 * See <a href="https://en.wikipedia.org/wiki/National_identification_number#Latvia">Latvian identification number</a>
 */
public class LatvianIdNumber implements IdNumberGenerator {

    private static final DateTimeFormatter BIRTHDAY_FORMAT = DateTimeFormatter.ofPattern("ddMMyy");

    private static final int[] CHECKSUM_COEFFICIENTS = { 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };

    private static final LocalDate CHANGE_TO_NEW_FORMAT_DATE = LocalDate.of(2017, 7, 1);

    @Override
    public String countryCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public PersonIdNumber generateValid(BaseProviders faker, IdNumberRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String generateInvalid(final BaseProviders faker) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String basePart(BaseProviders faker, LocalDate birthday) {
        return BIRTHDAY_FORMAT.format(birthday) + "-" + centuryDigit(birthday.getYear()) + faker.number().digits(3);
    }

    static int centuryDigit(int birthYear) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static int checksum(String numbers) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
