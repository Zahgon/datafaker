package net.datafaker.providers.base;

import net.datafaker.internal.helper.FakerIDN;
import net.datafaker.service.RandomService;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * @since 0.8.0
 */
public class Internet extends AbstractProvider<BaseProviders> {

    private static final Pattern COLON = Pattern.compile(":");

    private static final List<String> HTTP_SCHEMES = List.of("http://", "https://");

    private static final int MIN_PORT_NUMBER = 0;

    private static final int MAX_PORT_NUMBER = 65535;

    protected Internet(BaseProviders faker) {
        super(faker);
    }

    /**
     * A lowercase username composed of the first_name and last_name joined with a '.'. Some examples are:
     * <ul>
     *     <li>(template) {@link Name#firstName()}.{@link Name#lastName()}</li>
     *     <li>jim.jones</li>
     *     <li>jason.leigh</li>
     *     <li>tracy.jordan</li>
     * </ul>
     *
     * @return a random two part username.
     * @see Name#firstName()
     * @see Name#lastName()
     * @deprecated Since 2.5.0. Use {@link net.datafaker.providers.base.Credentials#username()} instead.
     */
    @Deprecated(since = "2.5.0", forRemoval = true)
    public String username() {
        return faker.credentials().username();
    }

    public String emailAddress() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an email address based on the provided name and a random domain (from "internet.free_email").
     * <p>
     * Example usage:
     * </p>
     * <pre>
     * {@code
     * faker.internet().emailAddress("Hal")); // hal@gmail.com
     * faker.internet().emailAddress("John McClane")); // john.mcclane@yahoo.com
     * faker.internet().emailAddress("Stephen Vincent Strange")); // stephen.strange@hotmail.com
     * faker.internet().emailAddress("Dr. Henry Indiana Jones Jr.")); // henry.jones@gmail.com
     * faker.internet().emailAddress("Jeanne d'Arc")); // jeanne.darc@yahoo.com
     * }
     * </pre>
     *
     * @param name The name to be used for generating the local part of the email address.
     * @return A String representing an email address.
     * @see Name#name()
     * @see Name#nameWithMiddle()
     */
    public String emailAddress(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String safeEmailAddress() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an email address based on the provided name and a safe domain (from "internet.safe_email").
     * <pre>
     * {@code
     * faker.internet().safeEmailAddress("John McClane")); // john.mcclane@example.com
     * }
     * </pre>
     * @param name The name to be used for generating the local part of the email address.
     * @return A String representing an email address.
     * @see Name#name()
     * @see Name#nameWithMiddle()
     * @see #emailAddress(String)
     */
    public String safeEmailAddress(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String emailAddress(String localPart, String domain) {
        return String.join("", stripAccents(localPart), "@", domain);
    }

    public String emailSubject() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static final Pattern DIACRITICS_AND_FRIENDS = Pattern.compile("[\\p{InCombiningDiacriticalMarks}\\p{IsLm}\\p{IsSk}]+");

    private String stripAccents(String input) {
        // strip accents from input
        String str = Normalizer.normalize(input, Normalizer.Form.NFD);
        str = DIACRITICS_AND_FRIENDS.matcher(str).replaceAll("");
        return str;
    }

    private static final Pattern LOCALPART = Pattern.compile("[^a-z0-9\\.]");

    /**
     * Converts a name to a local part (the part before the '@') of an email
     * address.
     *
     * Will use the first and last names of the provided name, ignoring middle
     * names, and will remove any prefixes or suffixes that are defined in the
     * faker's configuration.
     *
     * @param name The name ({@link Name}) to be converted to a local part.
     * @return A String representing the local part of an email address.
     * @since 2.5.0
     */
    private String toLocalPart(String name) {
        String[] parts = stripAccents(name).split(" ");
        Object prefixObj = faker.fakeValuesService().fetchObject("name.prefix", faker.getContext());
        final List<String> prefixList = (prefixObj instanceof List<?> list && list.stream().allMatch(String.class::isInstance)) ? list.stream().map(String.class::cast).toList() : Collections.emptyList();
        if (prefixList.contains(parts[0])) {
            parts = Arrays.copyOfRange(parts, 1, parts.length);
        }
        Object suffixObj = faker.fakeValuesService().fetchObject("name.suffix", faker.getContext());
        final List<String> suffixList = (suffixObj instanceof List<?> list && list.stream().allMatch(String.class::isInstance)) ? list.stream().map(String.class::cast).toList() : Collections.emptyList();
        if (suffixList.contains(parts[parts.length - 1])) {
            parts = Arrays.copyOfRange(parts, 0, parts.length - 1);
        }
        if (parts.length == 0) {
            return LOCALPART.matcher(name.toLowerCase(faker.getContext().getLocale())).replaceAll("");
        }
        if (parts.length == 1) {
            return LOCALPART.matcher(parts[0].toLowerCase(faker.getContext().getLocale())).replaceAll("");
        }
        return String.join(".", LOCALPART.matcher(parts[0].toLowerCase(faker.getContext().getLocale())).replaceAll(""), LOCALPART.matcher(parts[parts.length - 1].toLowerCase(faker.getContext().getLocale())).replaceAll(""));
    }

    public String domainName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String domainWord() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String domainSuffix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string representing a web URL, randomly including: http/https scheme, port, path
     * elements (2 or none), file element (1 or none), params (2 or none), anchor (1 or none).
     *
     * @return a web URL
     * @since 2.0.0
     */
    public String url() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string representing a web URL, with various elements controlled by the caller.
     *
     * @param schemeChoice if true will be random http or https, if false will be https
     * @param portChoice   if true a random port will be included, if false no port will be included
     * @param pathChoice   if true two random path elements will be included, if false no path elements will be included
     * @param fileChoice   if true the path will end with a random word element instead of a slash, if false it will end with a slash
     * @param paramsChoice if true two random name value pairs will be included, if false no params will be included
     * @param anchorChoice if true a random anchor will be included, if false no anchor will be included
     * @return a web URL
     * @since 2.0.0
     */
    public String url(boolean schemeChoice, boolean portChoice, boolean pathChoice, boolean fileChoice, boolean paramsChoice, boolean anchorChoice) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a web domain.
     *
     * @return a web domain in the form "www.example.com"
     * @since 2.0.0
     */
    public String webdomain() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String image() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String image(int width, int height) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String image(int width, int height, String seed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String httpMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @deprecated since 2.5.0. Use {@link net.datafaker.providers.base.Credentials#password()} instead.
     */
    @Deprecated(since = "2.5.0", forRemoval = true)
    public String password() {
        return password(8, 16);
    }

    /**
     * @deprecated since 2.5.0. Use {@link net.datafaker.providers.base.Credentials#password(boolean)} instead.
     */
    @Deprecated(since = "2.5.0", forRemoval = true)
    public String password(boolean includeDigit) {
        return password(8, 16, false, false, includeDigit);
    }

    /**
     * @deprecated since 2.5.0. Use {@link net.datafaker.providers.base.Credentials#password(int, int)} instead.
     */
    @Deprecated(since = "2.5.0", forRemoval = true)
    public String password(int minimumLength, int maximumLength) {
        return password(minimumLength, maximumLength, false);
    }

    /**
     * @deprecated since 2.5.0. Use {@link net.datafaker.providers.base.Credentials#password(int, int, boolean)} instead.
     */
    @Deprecated(since = "2.5.0", forRemoval = true)
    public String password(int minimumLength, int maximumLength, boolean includeUppercase) {
        return password(minimumLength, maximumLength, includeUppercase, false);
    }

    /**
     * @deprecated since 2.5.0. Use {@link net.datafaker.providers.base.Credentials#password(int, int, boolean, boolean)} instead.
     */
    @Deprecated(since = "2.5.0", forRemoval = true)
    public String password(int minimumLength, int maximumLength, boolean includeUppercase, boolean includeSpecial) {
        return password(minimumLength, maximumLength, includeUppercase, includeSpecial, true);
    }

    /**
     * @deprecated since 2.5.0. Use {@link net.datafaker.providers.base.Credentials#password(int, int, boolean, boolean, boolean)} instead.
     */
    @Deprecated(since = "2.5.0", forRemoval = true)
    public String password(int minimumLength, int maximumLength, boolean includeUppercase, boolean includeSpecial, boolean includeDigit) {
        return faker.text().text(minimumLength, maximumLength, includeUppercase, includeSpecial, includeDigit);
    }

    /**
     * Returns a port number between 0 and 65535
     *
     * @return a port number
     */
    public int port() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a port number within given range
     *
     * @param range either Well-Known Ports (0-1023), Registered Ports (1024-49151) or Dynamic/Private Ports (49152-65535)
     * @return a port number
     */
    public int port(PortRange range) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a port number between {@code from} and {@code to} (inclusive)
     *
     * @param from minimum port number (must not be less than 0)
     * @param to maximum port number (must not be greater than 65535)
     * @return a port number within given range
     */
    public int port(int from, int to) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>Returns a MAC address in the following format: 6-bytes in MM:MM:MM:SS:SS:SS format.</p>
     *
     * @param prefix a prefix to put on the front of the address
     * @return a correctly formatted MAC address
     */
    public String macAddress(String prefix) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @see Internet#macAddress(String)
     */
    public String macAddress() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * returns an IPv4 address in dot separated octets.
     *
     * @return a correctly formatted IPv4 address.
     */
    public String ipV4Address() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * returns an IPv4 address.
     *
     * @return an IPv4 address.
     */
    public InetAddress getIpV4Address() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a valid private IPV4 address in dot notation
     */
    public String privateIpV4Address() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a private IPV4 address
     */
    public InetAddress getPrivateIpV4Address() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a valid public IPV4 address in dot notation
     */
    public String publicIpV4Address() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a valid public IPV4 address
     */
    public InetAddress getPublicIpV4Address() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a valid IPV4 CIDR
     */
    public String ipV4Cidr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>Returns an IPv6 address in hh:hh:hh:hh:hh:hh:hh:hh format.</p>
     *
     * @return a correctly formatted IPv6 address.
     */
    public String ipV6Address() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>Returns an IPv6 address in hh:hh:hh:hh:hh:hh:hh:hh format.</p>
     *
     * @return a IPV6 address.
     */
    public InetAddress getIpV6Address() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a valid IPV6 CIDR
     */
    public String ipV6Cidr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a slug using '_' as the word separator and two {@link Lorem} words as the values
     */
    public String slug() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param wordsOrNull if null, then 2 {@link Lorem} words
     * @param glueOrNull  if null, "_"
     * @return a slug string combining wordsOrNull with glueOrNull (ex. x_y)
     */
    public String slug(List<String> wordsOrNull, String glueOrNull) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a UUID (type 3) as String.
     * Use this method (instead of {@link #uuid() uuid}) if you are
     * using a constant random seed and require the same output for different faker instances.     *
     *
     * @return a uuid as string.
     */
    public String uuidv3() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String uuidv4() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String uuidv7() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a UUID (type 4) as String.
     * <p>
     * This returns a repeatable version of a version 4 UUID, which is a bit against the idea of a version 4 UUID,
     * but this is a faker library, not a UUID library.
     *
     * @return a v4 uuid as string.
     */
    public String uuid() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private <T> T random(T[] src) {
        return src[faker.random().nextInt(src.length)];
    }

    public String userAgent(UserAgent userAgent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String userAgent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public enum UserAgent {

        AOL("aol"),
        CHROME("chrome"),
        FIREFOX("firefox"),
        INTERNET_EXPLORER("internet_explorer"),
        NETSCAPE("netscape"),
        OPERA("opera"),
        SAFARI("safari");

        //Browser's name in corresponding yaml (internet.yml) file.
        private final String browserName;

        UserAgent(String browserName) {
            this.browserName = browserName;
        }

        private static UserAgent any(BaseProviders faker) {
            UserAgent[] agents = UserAgent.values();
            int randomIndex = (int) (faker.random().nextDouble() * agents.length);
            return agents[randomIndex];
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public String botUserAgent(BotUserAgent vendor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String botUserAgentAny() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public enum BotUserAgent {

        GOOGLEBOT("googlebot"), BINGBOT("bingbot"), DUCKDUCKBOT("duckduckbot"), BAIDUSPIDER("baiduspider"), YANDEXBOT("yandexbot");

        //Browser's name in corresponding yaml (internet.yml) file.
        private final String browserName;

        BotUserAgent(String browserName) {
            this.browserName = browserName;
        }

        private static BotUserAgent any(BaseProviders faker) {
            BotUserAgent[] agents = BotUserAgent.values();
            int randomIndex = (int) (faker.random().nextDouble() * agents.length);
            return agents[randomIndex];
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    private static InetAddress inet4Address(byte first, byte second, byte third, byte fourth) {
        try {
            return Inet4Address.getByAddress(new byte[] { first, second, third, fourth });
        } catch (UnknownHostException e) {
            throw new RuntimeException("Failed to create Inet4Address from %s %s %s %s".formatted(first, second, third, fourth), e);
        }
    }

    private static InetAddress inet6Address(String host) {
        try {
            return Inet6Address.getByName(host);
        } catch (UnknownHostException e) {
            throw new RuntimeException("Failed to create Inet6Address from host '%s'".formatted(host), e);
        }
    }

    public enum PortRange {

        WellKnownPorts(0, 1023), RegisteredPorts(1024, 49151), DynamicPrivatePorts(49152, 65535);

        private final int from;

        private final int to;

        PortRange(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }
}
