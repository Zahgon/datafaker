package net.datafaker.providers.food;

import net.datafaker.providers.base.AbstractProvider;
import java.util.Locale;

/**
 * @since 1.5.0
 */
public class Coffee extends AbstractProvider<FoodProviders> {

    protected Coffee(FoodProviders faker) {
        super(faker);
    }

    public String country() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String region() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String region(Coffee.Country country) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String variety() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String intensifier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String body() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String descriptor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String notes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String name1() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String name2() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String blendName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public enum Country {

        BRAZIL,
        COLOMBIA,
        SUMATRA,
        ETHIOPIA,
        HONDURAS,
        KENYA,
        UGANDA,
        MEXICO,
        GUATEMALA,
        NICARAGUA,
        COSTA_RICA,
        TANZANIA,
        EL_SALVADOR,
        RWANDA,
        BURUNDI,
        PANAMA,
        YEMEN,
        INDIA
    }
}
