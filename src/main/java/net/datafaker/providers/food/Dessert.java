package net.datafaker.providers.food;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.9.0
 */
public class Dessert extends AbstractProvider<FoodProviders> {

    protected Dessert(FoodProviders faker) {
        super(faker);
    }

    /**
     * @return dessert variety e.g. "Cake".
     */
    public String variety() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return dessert topping e.g. "Rainbow Sprinkles".
     */
    public String topping() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return dessert flavor e.g. "Vanilla".
     */
    public String flavor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
