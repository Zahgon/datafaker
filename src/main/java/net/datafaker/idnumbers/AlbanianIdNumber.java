package net.datafaker.idnumbers;

import net.datafaker.providers.base.BaseProviders;
import net.datafaker.providers.base.IdNumber.IdNumberRequest;
import net.datafaker.providers.base.PersonIdNumber;
import net.datafaker.providers.base.PersonIdNumber.Gender;
import java.time.LocalDate;
import static net.datafaker.idnumbers.Utils.birthday;
import static net.datafaker.idnumbers.Utils.digit;
import static net.datafaker.idnumbers.Utils.digitAt;
import static net.datafaker.idnumbers.Utils.gender;
import static net.datafaker.providers.base.PersonIdNumber.Gender.FEMALE;

/**
 * The Albanian Identity Number is a unique personal identification number of 10 characters in the format YYMMDDSSSC
 */
public class AlbanianIdNumber implements IdNumberGenerator {

    private static final String FIRST_CHAR = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final String CHECKSUM_CHAR = "WABCDEFGHIJKLMNOPQRSTUV";

    @Override
    public String countryCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String generateInvalid(BaseProviders faker) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public PersonIdNumber generateValid(BaseProviders faker, IdNumberRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String yy(int year) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String mm(int month, Gender gender) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String dd(int dayOfMonth) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String sss(BaseProviders faker) {
        return faker.number().digits(3);
    }

    char checksum(String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    int checksumOfFirstChar(char c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
