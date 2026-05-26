package net.datafaker.providers.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * @since 0.8.0
 */
public class Vehicle extends AbstractProvider<BaseProviders> {

    static final String VIN_REGEX = "([A-HJ-NPR-Z0-9]){3}[A-HJ-NPR-Z0-9]{5}[A-HJ-NPR-Z0-9]{1}[A-HJ-NPR-Z0-9]{1}[A-HJ-NPR-Z0-0]{1}[A-HJ-NPR-Z0-9]{1}\\d{5}";

    public Vehicle(BaseProviders faker) {
        super(faker);
    }

    public String vin() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String manufacturer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String make() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String model() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String model(String make) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String makeAndModel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String style() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String color() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String upholsteryColor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String upholsteryFabric() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String upholstery() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String transmission() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String driveType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String fuelType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String carType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String engine() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> carOptions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> carOptions(int min, int max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> standardSpecs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> standardSpecs(int min, int max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String doors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String licensePlate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String licensePlate(String stateAbbreviation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
