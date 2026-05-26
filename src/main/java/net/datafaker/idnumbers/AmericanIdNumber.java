package net.datafaker.idnumbers;

import net.datafaker.providers.base.BaseProviders;
import net.datafaker.providers.base.IdNumber;
import net.datafaker.providers.base.PersonIdNumber;
import java.util.List;
import java.util.regex.Pattern;
import static net.datafaker.idnumbers.Utils.gender;
import static net.datafaker.idnumbers.Utils.birthday;

public class AmericanIdNumber implements IdNumberGenerator {

    @Override
    public String countryCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static final List<String> INVALID_SSNS = List.of("0{3}-\\d{2}-\\d{4}", "\\d{3}-0{2}-\\d{4}", "\\d{3}-\\d{2}-0{4}", "666-\\d{2}-\\d{4}", "9\\d{2}-\\d{2}-\\d{4}");

    private static final List<Pattern> INVALID_SSN_PATTERNS = INVALID_SSNS.stream().map(Pattern::compile).toList();

    @Deprecated
    public String getValidSsn(BaseProviders f) {
        return generateValid(f);
    }

    @Override
    public String generateValid(BaseProviders f) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public PersonIdNumber generateValid(BaseProviders faker, IdNumber.IdNumberRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String generateInvalid(BaseProviders faker) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
