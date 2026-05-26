package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Minecraft is a sandbox game developed by Mojang Studios.
 *
 * @since 0.9.0
 */
public class Minecraft extends AbstractProvider<VideoGameProviders> {

    public Minecraft(VideoGameProviders faker) {
        super(faker);
    }

    public String itemName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String tileName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String entityName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String monsterName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String animalName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String tileItemName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
