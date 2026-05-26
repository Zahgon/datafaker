package net.datafaker.providers.food;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 2.5.3
 */
public class IceCream extends AbstractProvider<FoodProviders> {

    protected IceCream(FoodProviders faker) {
        super(faker);
    }

    public String flavor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String shape() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String color() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
