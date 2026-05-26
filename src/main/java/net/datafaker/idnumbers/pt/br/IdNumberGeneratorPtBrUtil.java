package net.datafaker.idnumbers.pt.br;

import net.datafaker.providers.base.BaseProviders;

public final class IdNumberGeneratorPtBrUtil {

    private IdNumberGeneratorPtBrUtil() {
    }

    /**
     * <a href="https://en.wikipedia.org/wiki/CNPJ">https://en.wikipedia.org/wiki/CNPJ</a>
     *
     * @param formatted a cnpj (un)formatted
     * @param valid     a cnpj (in)valid
     */
    public static String cnpj(BaseProviders faker, boolean formatted, boolean valid, boolean multiBranch) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <a href="https://en.wikipedia.org/wiki/CPF_number">https://en.wikipedia.org/wiki/CPF_number</a>
     *
     * @param formatted a CPF (un)formatted
     * @param valid     a CPF (in)valid
     */
    public static String cpf(BaseProviders faker, boolean formatted, boolean valid) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return true if the CNPJ is valid
     * A valid CNPJ is unique and have an algorithm to validate it
     * <p>
     * CNPJ generator could generate a valid or invalid because, sometimes, we need to test a
     * registration with invalid number
     */
    public static boolean isCNPJValid(final String cnpj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return true if the CPF is valid
     * A valid CPF is unique and have a algorithm to validate it
     * <p>
     * CPF generator could generate a valid or invalid because, sometimes, we need to test a
     * registration with invalid number
     */
    public static Boolean isCPFValid(final String cpf) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int calculateWeight(final String num, final int weight, int start, int end) {
        int sum = 0;
        int weightAux = weight;
        for (int index = start; index < end; index++) {
            sum += (num.charAt(index) - '0') * weightAux--;
        }
        return sum;
    }

    private static int digit(int verifyingDigit) {
        int remainder = verifyingDigit % 11;
        if (remainder == 0 || remainder == 1)
            return 0;
        else
            return 11 - remainder;
    }
}
