package net.datafaker.idnumbers;

import net.datafaker.providers.base.BaseProviders;
import net.datafaker.providers.base.IdNumber;
import net.datafaker.providers.base.PersonIdNumber;
import static net.datafaker.idnumbers.Utils.birthday;
import static net.datafaker.idnumbers.Utils.gender;

/**
 * Generates ID numbers for Georgian citizens and Residents
 */
public class GeorgianIdNumber implements IdNumberGenerator {

    @Override
    public String countryCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String generateValid(BaseProviders faker) {
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
