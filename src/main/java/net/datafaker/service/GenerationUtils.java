package net.datafaker.service;

public class GenerationUtils {

    private static final char[] DIGITS = "0123456789".toCharArray();

    // Based on Integer.MAX_VALUE the max value is 1_000_000_000
    // assuming that every digit should have equal chance.
    private static final int INT_LIMIT_DIGITS = 9;

    private static final int[] TENS = initTens();

    private static int generateNumber(RandomService randomService, int amountOfDigits) {
        if (amountOfDigits > INT_LIMIT_DIGITS || amountOfDigits < 1) {
            // should never happen
            // in case it happened most probably there is a bug in a method invoking this
            throw new IllegalArgumentException("Invalid amount of digits: " + amountOfDigits);
        }
        return randomService.nextInt(TENS[amountOfDigits + 1]);
    }

    static int generateAndSetNumber(int position, char[] target, char symbol, RandomService randomService) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int[] initTens() {
        int[] tens = new int[INT_LIMIT_DIGITS + 2];
        tens[0] = 1;
        for (int i = 1; i < tens.length; i++) {
            tens[i] = tens[i - 1] * 10;
        }
        return tens;
    }

    private static void insertNumber(int number, int amountOfDigits, char[] target, int offset) {
        for (int k = 0; k < amountOfDigits; k++) {
            target[offset + k] = DIGITS[(number / TENS[k] % 10)];
        }
    }
}
