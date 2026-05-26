package net.datafaker.providers.videogame;

import net.datafaker.providers.base.AbstractProvider;

/**
 * Dota 2 is a multiplayer online battle arena (MOBA) game developed and published by Valve Corporation.
 *
 * @author panic08
 * @since 2.4.0
 */
public class Dota2 extends AbstractProvider<VideoGameProviders> {

    protected Dota2(VideoGameProviders faker) {
        super(faker);
    }

    public String faction() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String rank() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String attribute() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String building() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String hero() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String heroQuote(String heroName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String item() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String neutralItem() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String neutralEnchantment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String team() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String tier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String player() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
