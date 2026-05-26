package net.datafaker.providers.healthcare;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 2.3.0
 */
public class MedicalProcedure extends AbstractProvider<HealthcareProviders> {

    protected MedicalProcedure(HealthcareProviders faker) {
        super(faker);
    }

    public String icd10() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
