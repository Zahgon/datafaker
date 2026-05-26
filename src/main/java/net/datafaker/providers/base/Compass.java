package net.datafaker.providers.base;

/**
 * @since 1.7.0
 */
public class Compass extends AbstractProvider<BaseProviders> {

    public enum CompassPoint {

        CARDINAL("cardinal"), ORDINAL("ordinal"), HALF_WIND("half-wind"), QUARTER_WIND("quarter-wind");

        private final String yamlKey;

        CompassPoint(String yamlKey) {
            this.yamlKey = yamlKey;
        }
    }

    private CompassPoint compassPoint;

    protected Compass(BaseProviders faker) {
        super(faker);
    }

    /**
     * Specify point of direction. If not specified, point of direction will be randomly selected.
     *
     * @param compassPoint point of direction.
     * @return itself with specified point of direction.
     * @see CompassPoint
     */
    public Compass compassPoint(CompassPoint compassPoint) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns full-size name of direction according to the specified {@link CompassPoint} point of direction.
     * <p>
     * Specify point of direction using {@link Compass#compassPoint(CompassPoint)} method.
     * <p>
     * Typical call of this method: {@code compass().compassPoint(CompassPoint.CARDINAL).word();}
     *
     * @return the full-size direction word according to the specified {@link CompassPoint}. Otherwise, the point of direction will be selected randomly.
     */
    public String word() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns abbreviation of direction according to the specified {@link CompassPoint} point of direction.
     * <p>
     * Specify point of direction using {@link Compass#compassPoint(CompassPoint)} method.
     * <p>
     * Typical call of this method: {@code compass().compassPoint(CompassPoint.CARDINAL).abbreviation();}
     *
     * @return the abbreviation of direction according to the specified {@link CompassPoint}. Otherwise, the point of direction will be selected randomly.
     */
    public String abbreviation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns appropriate azimuth of direction according to the specified {@link CompassPoint} point of direction.
     * <p>
     * Specify point of direction using {@link Compass#compassPoint(CompassPoint)} method.
     * <p>
     * Typical call of this method: {@code compass().compassPoint(CompassPoint.CARDINAL).azimuth();}
     *
     * @return the appropriate azimuth of the direction according to the specified {@link CompassPoint}. Otherwise, the point of direction will be selected randomly.
     */
    public String azimuth() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
