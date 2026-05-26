package net.datafaker.providers.food;

import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

/**
 * @since 2.5.3
 */
public class Apple extends AbstractProvider<BaseProviders> {

    protected Apple(BaseProviders faker) {
        super(faker);
    }

    public String type() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String color() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
