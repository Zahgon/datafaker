package net.datafaker.providers.base;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @since 0.8.0
 */
public class Hashing extends AbstractProvider<BaseProviders> {

    protected Hashing(BaseProviders faker) {
        super(faker);
    }

    public String md2() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String md5() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sha1() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sha384() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sha256() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sha512() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String generateString(String algorithm, String format) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            String characters = faker.lorem().characters();
            messageDigest.update(characters.getBytes(StandardCharsets.UTF_8), 0, characters.length());
            return format.formatted(new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException("Failed to generate string using algorithm \"%s\" and format \"%s\"".formatted(algorithm, format), noSuchAlgorithmException);
        }
    }
}
