package net.datafaker.providers.base;

/**
 * @since 1.4.0
 */
public class BloodType extends AbstractProvider<BaseProviders> {

    protected BloodType(BaseProviders faker) {
        super(faker);
    }

    /**
     * This method returns a ABO blood type
     *
     * @return a string of ABO blood type
     */
    public String aboTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method returns an Rh blood type
     *
     * @return a string of Rh blood type
     */
    public String rhTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method returns a P blood type
     *
     * @return a string of P blood type
     */
    public String pTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a blood group such as O−, O+, A-, A+, B-, B+, AB-, AB+
     *
     * @return a blood group such as O−, O+, A-, A+, B-, B+, AB-, AB+
     */
    public String bloodGroup() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
