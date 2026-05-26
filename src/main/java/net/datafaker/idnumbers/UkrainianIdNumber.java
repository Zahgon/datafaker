package net.datafaker.idnumbers;

import net.datafaker.providers.base.BaseProviders;
import net.datafaker.providers.base.IdNumber;
import net.datafaker.providers.base.PersonIdNumber;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static net.datafaker.idnumbers.Utils.gender;
import static net.datafaker.idnumbers.Utils.multiply;

/**
 * The Ukrainian Identity Number (UNZR)
 * is a unique registration record number of 13 digits in a form "YYYYMMDD-XXXXC"
 * where C is a control digit calculated from all the other 12 digits in the UNZR
 * <a href="https://blog.uaid.net.ua/ua-id-passport-outside/">algorithm to validate UNZR code</a>
 */
public class UkrainianIdNumber implements IdNumberGenerator {

    private static final int[] CHECKSUM_WEIGHTS = { 7, 3, 1, 7, 3, 1, 7, 3, 1, 7, 3, 1 };

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
}
