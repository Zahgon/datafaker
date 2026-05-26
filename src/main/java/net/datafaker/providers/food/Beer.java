package net.datafaker.providers.food;

import net.datafaker.providers.base.AbstractProvider;

/**
 * @since 0.8.0
 */
public class Beer extends AbstractProvider<FoodProviders> {

    protected Beer(FoodProviders faker) {
        super(faker);
    }

    public String brand() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String style() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String hop() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String yeast() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String malt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
