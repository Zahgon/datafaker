package net.datafaker.idnumbers;

import net.datafaker.providers.base.BaseProviders;
import net.datafaker.providers.base.IdNumber.IdNumberRequest;
import net.datafaker.providers.base.PersonIdNumber;
import net.datafaker.providers.base.PersonIdNumber.Gender;
import java.time.LocalDate;
import static net.datafaker.idnumbers.Utils.birthday;
import static net.datafaker.idnumbers.Utils.gender;
import static net.datafaker.providers.base.PersonIdNumber.Gender.MALE;

/**
 * Generate number of Resident Registration Number for Republic of Korea.
 * <p>
 * Implementation based on the description at
 * <a href="https://en.wikipedia.org/wiki/Resident_registration_number">Wikipedia - Resident registration number</a>
 */
public class SouthKoreanIdNumber implements IdNumberGenerator {

    @Override
    public String countryCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Deprecated
    public String getValidRrn(BaseProviders f) {
        return generateValid(f);
    }

    @Override
    public PersonIdNumber generateValid(BaseProviders f, IdNumberRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private int get7thDigit(int year, Gender gender, String isoCountry) {
        // Local starts with 1, foreigner starts with 5
        int locality = isoCountry.equalsIgnoreCase("kr") ? 1 : 5;
        if (year < 1900) {
            // Male: 9 | Female: 0
            return gender == MALE ? 9 : 0;
        } else if (year < 2000) {
            // Male: 1, 5 | Female: 2, 6
            return locality + (gender == MALE ? 0 : 1);
        } else {
            // Male: 3, 7 | Female: 4, 8
            return locality + (gender == MALE ? 2 : 3);
        }
    }

    private String generateDay(LocalDate birthday) {
        final int year = birthday.getYear() % 100;
        final int month = birthday.getMonthValue();
        final int day = birthday.getDayOfMonth();
        final char[] res = new char[6];
        res[0] = (char) ('0' + (year / 10));
        res[1] = (char) ('0' + (year % 10));
        res[2] = (char) ('0' + (month / 10));
        res[3] = (char) ('0' + (month % 10));
        res[4] = (char) ('0' + (day / 10));
        res[5] = (char) ('0' + (day % 10));
        return String.valueOf(res);
    }

    @Override
    public String generateInvalid(BaseProviders faker) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
