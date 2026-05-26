package net.datafaker.providers.food;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Generates cheese-related fake data: type, texture, milk, color, name etc.
 * <p>
 * Data source:
 * <a href="https://www.cheese.com">cheese.com</a>
 * <a href="https://en.wikipedia.org/wiki/Types_of_cheese">Types of cheese</a>
 * <a href="https://www.tasteatlas.com/cheese/products">Cheese producers</a>
 * <a href="https://www.wisconsincheese.com/the-cheese-life/article/31/cheese-rinds">Cheese rinds</a>
 * <a href="https://www.bluecart.com/blog/cheese-packaging-materials">Cheese packaging</a>
 * </p>
 * @since 2.6.0
 */
public class Cheese extends AbstractProvider<FoodProviders> {

    protected Cheese(FoodProviders faker) {
        super(faker);
    }

    public String type() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String texture() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String milk() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String color() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String producer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String rind() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String rindEdibility() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String packaging() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a complete wedge of cheese case bundling {@link #name()},
     * {@link #type()}, {@link #producer()}, {@link #texture()}, {@link #color()},
     * {@link #milk()}, {@link #rind()}, {@link #rindEdibility()}, and {@link #packaging()}.
     */
    public Wedge wedge() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public record Wedge(String name, String type, String producer, String texture, String color, String milk, String rind, String rindEdibility, String packaging) {
    }
}
