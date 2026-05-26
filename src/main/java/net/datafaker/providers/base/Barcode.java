package net.datafaker.providers.base;

/**
 * @since 0.9.0
 */
public class Barcode extends AbstractProvider<BaseProviders> {

    public Barcode(BaseProviders faker) {
        super(faker);
    }

    public long ean13() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long ean8() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long gtin14() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long gtin12() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long gtin13() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long gtin8() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int roundToHighestMultiplyOfTen(int number) {
        if (number % 10 == 0) {
            return number;
        } else {
            int ones = number % 10;
            int add = 10 - ones;
            return number + add;
        }
    }

    private long ean(int length) {
        long firstPart = switch(length) {
            case 8, 12, 13, 14 ->
                this.faker.number().randomNumber(length - 1);
            default ->
                0;
        };
        int odd = 0;
        int even = 0;
        long number = firstPart;
        int i = 0;
        while (number > 0) {
            i++;
            if (i % 2 == 1) {
                odd += number % 10;
            } else {
                even += number % 10;
            }
            number /= 10;
        }
        if (i % 2 == 0) {
            int tmp = even;
            even = odd;
            odd = tmp;
        }
        final int var = calculateVar(length, odd, even);
        int rounded = roundToHighestMultiplyOfTen((var));
        int checkDigit = rounded - var;
        int product = 10;
        while (product <= checkDigit) {
            product *= 10;
        }
        return firstPart * product + checkDigit;
    }

    private int calculateVar(int length, int odd, int even) {
        return switch(length) {
            case 13 ->
                odd + even + (even << 1);
            case 8, 12, 14 ->
                odd + even + (odd << 1);
            default ->
                0;
        };
    }

    public String type() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
