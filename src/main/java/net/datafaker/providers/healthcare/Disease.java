package net.datafaker.providers.healthcare;

import net.datafaker.providers.base.AbstractProvider;
import static net.datafaker.providers.healthcare.Disease.DiseaseType.DERMATOLOGY_DISEASE_KEY;
import static net.datafaker.providers.healthcare.Disease.DiseaseType.GYNECOLOGY_AND_OBSTETRICS_DISEASE_KEY;
import static net.datafaker.providers.healthcare.Disease.DiseaseType.INTERNAL_DISEASE_KEY;
import static net.datafaker.providers.healthcare.Disease.DiseaseType.NEUROLOGICAL_DISEASE_KEY;
import static net.datafaker.providers.healthcare.Disease.DiseaseType.OPHTHALMOLOGY_AND_OTORHINOLARYNGOLOGY_DISEASE_KEY;
import static net.datafaker.providers.healthcare.Disease.DiseaseType.PAEDIATRIC_DISEASE_KEY;
import static net.datafaker.providers.healthcare.Disease.DiseaseType.SURGICAL_DISEASE_KEY;

/**
 * Generate random, different kinds of disease.
 *
 * @since 0.8.0
 */
public class Disease extends AbstractProvider<HealthcareProviders> {

    public enum DiseaseType {

        INTERNAL_DISEASE_KEY("healthcare.disease.internal_disease"),
        NEUROLOGICAL_DISEASE_KEY("healthcare.disease.neurology"),
        SURGICAL_DISEASE_KEY("healthcare.disease.surgery"),
        PAEDIATRIC_DISEASE_KEY("healthcare.disease.paediatrics"),
        GYNECOLOGY_AND_OBSTETRICS_DISEASE_KEY("healthcare.disease.gynecology_and_obstetrics"),
        OPHTHALMOLOGY_AND_OTORHINOLARYNGOLOGY_DISEASE_KEY("healthcare.disease.ophthalmology_and_otorhinolaryngology"),
        DERMATOLOGY_DISEASE_KEY("healthcare.disease.dermatology");

        final String yamlKey;

        DiseaseType(String yamlKey) {
            this.yamlKey = yamlKey;
        }
    }

    /**
     * Create a constructor for Disease
     *
     * @param faker The Faker instance for generating random, different kinds of disease, e.g. the internal disease.
     */
    protected Disease(HealthcareProviders faker) {
        super(faker);
    }

    public String icd10() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String anyDisease() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate random internal disease
     *
     * @return An internal disease
     */
    public String internalDisease() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate random neurology disease
     *
     * @return A neurology disease
     */
    public String neurology() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate random surgery disease
     *
     * @return A surgery disease
     */
    public String surgery() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate random paediatrics disease
     *
     * @return A paediatrics disease
     */
    public String paediatrics() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate random gynecology and obstetrics disease
     *
     * @return A gynecology and obstetrics disease
     */
    public String gynecologyAndObstetrics() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate random ophthalmology and otorhinolaryngology disease
     *
     * @return A ophthalmology and otorhinolaryngology disease
     */
    public String ophthalmologyAndOtorhinolaryngology() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate random dermatology disease
     *
     * @return A dermatology disease
     * @since 1.8.0
     */
    public String dermatology() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String resolve(DiseaseType diseaseType) {
        return resolve(diseaseType.yamlKey);
    }
}
