package net.datafaker.providers.base;

import java.util.function.Supplier;

/**
 * Myers-Briggs Type Indicator
 *
 * @since 1.5.0
 */
public class Mbti extends AbstractProvider<BaseProviders> {

    private final Supplier<String> choice;

    public Mbti(final BaseProviders faker) {
        super(faker);
        this.choice = () -> this.faker.resolve("mbti.choice");
    }

    public String type() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String characteristic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String personage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String merit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String weakness() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
