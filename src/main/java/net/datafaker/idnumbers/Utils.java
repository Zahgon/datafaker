package net.datafaker.idnumbers;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.concat;
import static net.datafaker.providers.base.PersonIdNumber.Gender.FEMALE;
import static net.datafaker.providers.base.PersonIdNumber.Gender.MALE;
import java.time.LocalDate;
import java.util.stream.IntStream;
import net.datafaker.providers.base.BaseProviders;
import net.datafaker.providers.base.IdNumber;
import net.datafaker.providers.base.IdNumber.IdNumberRequest;
import net.datafaker.providers.base.PersonIdNumber.Gender;

public class Utils {

    static LocalDate birthday(BaseProviders faker, IdNumberRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static Gender gender(BaseProviders faker, IdNumberRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static Gender randomGender(BaseProviders faker) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static int digitAt(String text, int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static int digit(char c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static int multiply(String text, int[] weights) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static String join(IntStream chars1, IntStream chars2, IntStream chars3, int maxLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
