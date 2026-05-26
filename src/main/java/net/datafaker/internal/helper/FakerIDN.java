package net.datafaker.internal.helper;

import java.net.IDN;

/**
 * Created by tshick on 10/30/16.
 */
public class FakerIDN {

    /**
     * {@link IDN#toASCII(String)} is too picky for our needs. It was throwing exceptions for fa.yml and
     * he.yml as they are Bidi languages and something was causing them to die. This is kind of a brute force
     * fix, but it appears to fix the issue.
     */
    public static String toASCII(String in) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
