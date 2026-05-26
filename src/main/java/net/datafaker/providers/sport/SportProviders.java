package net.datafaker.providers.sport;

import net.datafaker.providers.base.ProviderRegistration;

public interface SportProviders extends ProviderRegistration {

    default Baseball baseball() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Basketball basketball() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Chess chess() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Cricket cricket() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default EnglandFootBall englandfootball() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Football football() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Formula1 formula1() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default MartialArt martialArt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Volleyball volleyball() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
