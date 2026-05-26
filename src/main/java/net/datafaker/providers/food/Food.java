package net.datafaker.providers.food;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.8.0
 */
public class Food extends AbstractProvider<FoodProviders> {

    protected Food(FoodProviders faker) {
        super(faker);
    }

    public String ingredient() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String allergen() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String spice() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String dish() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String fruit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String vegetable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sushi() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String measurement() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
