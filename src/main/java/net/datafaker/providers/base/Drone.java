package net.datafaker.providers.base;

import net.datafaker.annotations.Deterministic;

/**
 * An unmanned aerial vehicle (UAV), commonly known as a drone, is an aircraft without any human pilot, crew, or passengers on board.
 *
 * @since 1.7.0
 */
public class Drone extends AbstractProvider<BaseProviders> {

    protected Drone(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String weight() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String maxAscentSpeed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String maxDescentSpeed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String flightTime() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String maxAltitude() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String maxFlightDistance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String maxSpeed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String maxWindResistance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String maxAngularVelocity() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String maxTiltAngle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String operatingTemperature() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String batteryCapacity() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String batteryVoltage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String batteryType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String batteryWeight() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String chargingTemperature() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String maxChargingPower() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String iso() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String maxResolution() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String photoFormat() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String videoFormat() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String maxShutterSpeed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String minShutterSpeed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Deterministic
    public String shutterSpeedUnits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
