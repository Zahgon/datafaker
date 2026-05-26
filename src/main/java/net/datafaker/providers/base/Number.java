package net.datafaker.providers.base;

import net.datafaker.service.Range;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @since 0.8.0
 */
public class Number extends AbstractProvider<BaseProviders> {

    private static final char[] DIGITS = "0123456789".toCharArray();

    protected Number(BaseProviders faker) {
        super(faker);
    }

    /**
     * Returns a random number from 0-9 (both inclusive)
     */
    public int randomDigit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an array of random numbers from 0 to 9 (both inclusive) of given length
     */
    public int[] randomDigits(int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a random number from 1-9 (both inclusive)
     */
    public int randomDigitNotZero() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a positive number
     */
    public int positive() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a negative number
     */
    public int negative() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param min the lower bound (include min)
     * @param max the upper bound (not include max)
     * @return a random number on faker.number() between min and max
     * if min = max, return min
     */
    public int numberBetween(int min, int max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param min the lower bound (inclusive)
     * @param max the upper bound (exclusive in most cases)
     * @return a random number on faker.number() between min and max
     * if min = max, return min
     */
    public double numberBetween(double min, double max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param min the lower bound (include min)
     * @param max the upper bound (not include max)
     * @return a random number on faker.number() between min and max
     * if min = max, return min
     */
    public long numberBetween(long min, long max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param numberOfDigits the number of digits the generated value should have
     * @param strict         NOT USED
     * @deprecated use {@link #randomNumber(int)} instead
     */
    @Deprecated
    public long randomNumber(int numberOfDigits, boolean strict) {
        return randomNumber(numberOfDigits);
    }

    /**
     * @param numberOfDigits the number of digits the generated value should have
     */
    public long randomNumber(int numberOfDigits) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private long pow(long value, int d) {
        if (d == 0)
            return 1;
        if (d == 1)
            return value;
        if ((d & 1) == 0) {
            long pow = pow(value, d >> 1);
            return pow * pow;
        } else {
            return value * pow(value, d - 1);
        }
    }

    /**
     * Returns a random number
     */
    public long randomNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double randomDouble(int maxNumberOfDecimals, int min, int max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a random double
     *
     * @param maxNumberOfDecimals maximum number of places
     * @param min                 minimum value
     * @param max                 maximum value
     */
    public double randomDouble(int maxNumberOfDecimals, long min, long max) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param min the lower bound (include min)
     * @param max the upper bound (not include max)
     * @return decimalBetween on faker.number() between min and max
     * if min = max, return min
     */
    private BigDecimal decimalBetween(long min, long max) {
        if (min == max) {
            return BigDecimal.valueOf(min);
        }
        final BigDecimal trueMin = BigDecimal.valueOf(min);
        final BigDecimal trueMax = BigDecimal.valueOf(max);
        final BigDecimal random = BigDecimal.valueOf(faker.random().nextDouble());
        return trueMin.add(trueMax.subtract(trueMin).multiply(random));
    }

    public String digits(int count) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String digit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
