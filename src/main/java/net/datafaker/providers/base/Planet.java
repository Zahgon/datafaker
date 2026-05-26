package net.datafaker.providers.base;

/**
 * Provides planet specific metadata like length of the day, radius, mass etc.
 *
 * @since 2.2.0
 */
public class Planet extends AbstractProvider<BaseProviders> {

    protected Planet(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String symbol() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String symbol(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String classification() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String classification(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String discoveryYear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String discoveryYear(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String meanDistanceFromTheSun() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String meanDistanceFromTheSun(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String lengthOfDay() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String lengthOfDay(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String equatorialRadius() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String equatorialRadius(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String surfaceArea() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String surfaceArea(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String volume() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String volume(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String mass() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String mass(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String gravitationParameters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String gravitationParameters(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String density() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String density(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String equatorialGravity() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String equatorialGravity(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String escapeVelocity() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String escapeVelocity(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String rotationPeriod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String rotationPeriod(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String orbitalPeriod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String orbitalPeriod(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String meanOrbitalSpeed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String meanOrbitalSpeed(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String eccentricity() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String eccentricity(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String inclination() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String inclination(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String axialTilt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String axialTilt(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String meanSurfaceTemperature() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String meanSurfaceTemperature(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String meanAirTemperature() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String meanAirTemperature(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String atmosphericComposition() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String atmosphericComposition(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String numberOfKnownMoons() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String numberOfKnownMoons(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String rings() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String rings(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String planetaryDiscriminant() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String planetaryDiscriminant(PlanetName planetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public enum PlanetName {

        JUPITER("jupiter"),
        MARS("mars"),
        VENUS("venus"),
        URANUS("uranus"),
        MERCURY("mercury"),
        NEPTUNE("neptune"),
        EARTH("earth"),
        SATURN("saturn"),
        PLUTO("pluto");

        private final String name;

        PlanetName(String name) {
            this.name = name;
        }

        public String getName() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
