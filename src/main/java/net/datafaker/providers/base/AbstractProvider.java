package net.datafaker.providers.base;

import java.util.List;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.function.Supplier;

public class AbstractProvider<T extends ProviderRegistration> {

    protected final T faker;

    protected AbstractProvider(T faker) {
        this.faker = faker;
    }

    public final ProviderRegistration getFaker() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected String resolve(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected String resolve(String key, Supplier<String> message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final <G> List<G> loadGenerators(Class<G> generatorClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
