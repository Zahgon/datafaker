package net.datafaker.providers.food;

import net.datafaker.providers.base.ProviderRegistration;

public interface FoodProviders extends ProviderRegistration {

    default Apple apple() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Beer beer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Cheese cheese() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Coffee coffee() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Dessert dessert() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Food food() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default IceCream iceCream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Tea tea() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
