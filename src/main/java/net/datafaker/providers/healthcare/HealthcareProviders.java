package net.datafaker.providers.healthcare;

import net.datafaker.providers.base.ProviderRegistration;

/**
 * @since 2.3.0
 */
public interface HealthcareProviders extends ProviderRegistration {

    default CareProvider careProvider() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Disease disease() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Medication medication() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default MedicalProcedure medicalProcedure() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Observation observation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
