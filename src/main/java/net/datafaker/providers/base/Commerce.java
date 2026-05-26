package net.datafaker.providers.base;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @since 0.8.0
 */
public class Commerce extends AbstractProvider<BaseProviders> {

    private final DecimalFormatSymbols decimalFormatSymbols;

    protected Commerce(BaseProviders faker) {
        super(faker);
        decimalFormatSymbols = new DecimalFormatSymbols(faker.getContext().getLocale());
    }

    public String department() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String productName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String material() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String brand() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String vendor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate a random price between 0.00 and 100.00
     */
    public String price() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String price(double min, double max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String promotionCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String promotionCode(int digits) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
