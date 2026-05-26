package net.datafaker.providers.base;

import java.util.Locale;

/**
 * @since 1.5.0
 */
public class DrivingLicense extends AbstractProvider<BaseProviders> {

    protected DrivingLicense(BaseProviders faker) {
        super(faker);
    }

    public String drivingLicense(String stateAbbreviation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
