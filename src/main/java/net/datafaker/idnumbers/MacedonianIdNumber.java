package net.datafaker.idnumbers;

import net.datafaker.providers.base.BaseProviders;
import net.datafaker.providers.base.IdNumber.IdNumberRequest;
import net.datafaker.providers.base.PersonIdNumber;
import net.datafaker.providers.base.PersonIdNumber.Gender;
import java.time.LocalDate;
import java.util.List;
import static net.datafaker.idnumbers.Utils.birthday;
import static net.datafaker.idnumbers.Utils.digitAt;
import static net.datafaker.idnumbers.Utils.gender;
import static net.datafaker.idnumbers.Utils.randomGender;

/**
 * The Macedonian Identity Number is a unique personal identification number of 13 digits in a form "DD MM YYY RR BBB K"
 *
 * <a href="https://en.wikipedia.org/wiki/National_identification_number#North_Macedonia">Intro</a>
 * <a href="https://en.wikipedia.org/wiki/Unique_Master_Citizen_Number">Specification</a>
 */
public class MacedonianIdNumber implements IdNumberGenerator {

    private static final List<String> REGIONS = List.of("41", "42", "43", "44", "45", "46", "47", "48", "49");

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

    private String basePart(BaseProviders faker, LocalDate bd, Gender gender) {
        return dd(bd) + mm(bd) + yyy(bd) + rr(faker) + sss(faker, gender);
    }

    private String dd(LocalDate bd) {
        return "%02d".formatted(bd.getDayOfMonth());
    }

    private String mm(LocalDate bd) {
        return "%02d".formatted(bd.getMonthValue());
    }

    /**
     * last three digits of the year of birth
     */
    private String yyy(LocalDate bd) {
        return "%03d".formatted(bd.getYear() % 1000);
    }

    /**
     * The two digit registry number depends on the citizens place of birth
     */
    private String rr(BaseProviders faker) {
        return REGIONS.get(faker.number().numberBetween(0, REGIONS.size()));
    }

    /**
     * The combination of the citizen's sex and ordinal number of birth is presented as a 3-digit number
     * - from 000 to 499 for the male, and
     * - from 500 to 999 for the female citizens.
     */
    private String sss(BaseProviders faker, Gender gender) {
        int ordinal = switch(gender) {
            case FEMALE ->
                faker.number().numberBetween(500, 1000);
            case MALE ->
                faker.number().numberBetween(0, 500);
        };
        return "%03d".formatted(ordinal);
    }

    int checksum(String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
