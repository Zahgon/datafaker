package net.datafaker.providers.base;

/**
 * @since 1.5.0
 */
public class House extends AbstractProvider<BaseProviders> {

    protected House(BaseProviders faker) {
        super(faker);
    }

    /**
     * This method generates a random name of furniture.
     *
     * @return a string of furniture.
     */
    public String furniture() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method generates a random name of a room in a house.
     *
     * @return a string of room.
     */
    public String room() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
