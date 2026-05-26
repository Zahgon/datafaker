package net.datafaker.providers.base;

import net.datafaker.annotations.Deterministic;

/**
 * @since 0.8.0
 */
public class Address extends AbstractProvider<BaseProviders> {

    protected Address(BaseProviders faker) {
        super(faker);
    }

    public String streetName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String streetAddressNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String streetAddress() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String streetAddress(boolean includeSecondary) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String secondaryAddress() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a String representing a standard 5-digit zip code.
     *
     * @return a String representing a standard zip code
     */
    public String zipCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String postcode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String eircode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a String representing a ZIP+4 code for greater geographic specificity.
     * This is a 9-digit zip code, but the String itself is 10 characters including the hyphen.
     *
     * @return a String representing a ZIP+4 code
     */
    public String zipCodePlus4() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String zipCodeByState(String stateAbbr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String countyByZipCode(String postCode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String streetSuffix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Deterministic
    public String streetPrefix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String citySuffix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String cityPrefix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String city() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String cityName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String state() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String stateAbbr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return Returns the latitude, a number between -90 to 90.
     */
    public String latitude() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return Returns the longitude, a number between -180 and 180
     */
    public String longitude() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return Returns the lat/lon coordinates formatted as lat,lon.
     */
    public String latLon() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return Returns the lat/lon coordinates formatted as lat delimiter lon.
     */
    public String latLon(String delimiter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return Returns the lat/lon coordinates formatted as lon,lat.
     */
    public String lonLat() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return Returns the lat/lon coordinates formatted as lon delimiter lat.
     */
    public String lonLat(String delimiter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String timeZone() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String country() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String countryCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String buildingNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String fullAddress() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String mailBox() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
