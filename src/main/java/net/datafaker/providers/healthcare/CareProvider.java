package net.datafaker.providers.healthcare;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 2.3.0
 */
public class CareProvider extends AbstractProvider<HealthcareProviders> {

    protected CareProvider(HealthcareProviders faker) {
        super(faker);
    }

    public String hospitalName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String medicalProfession() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
