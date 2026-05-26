package net.datafaker.providers.base;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * @since 0.8.0
 */
public class Business extends AbstractProvider<BaseProviders> {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    protected Business(BaseProviders faker) {
        super(faker);
    }

    public String creditCardNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String creditCardType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String creditCardExpiry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String securityCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
