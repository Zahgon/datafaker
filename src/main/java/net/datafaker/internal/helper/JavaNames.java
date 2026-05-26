package net.datafaker.internal.helper;

import static java.lang.Character.isLetter;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
import static net.datafaker.internal.helper.JavaNames.Transform.SAME;
import static net.datafaker.internal.helper.JavaNames.Transform.TO_LOWER;
import static net.datafaker.internal.helper.JavaNames.Transform.TO_UPPER;

public class JavaNames {

    public static String toJavaNames(String string, boolean isMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    enum Transform {

        SAME, TO_LOWER, TO_UPPER;

        public char transform(char c) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
