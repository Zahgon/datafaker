package net.datafaker.providers.base;

import net.datafaker.annotations.FakeResolver;
import net.datafaker.sequence.FakeCollection;
import net.datafaker.sequence.FakeSequence;
import net.datafaker.sequence.FakeStream;
import net.datafaker.service.FakeValuesService;
import net.datafaker.service.FakerContext;
import net.datafaker.service.RandomService;
import net.datafaker.transformations.Schema;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.file.Path;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import static java.util.Collections.synchronizedMap;

/**
 * Provides utility methods for generating fake strings, such as names, phone
 * numbers, addresses. generate random strings with given patterns
 *
 * @author ren
 */
public class BaseFaker implements BaseProviders {

    private static final Predicate<Class<?>> EVERY_PROVIDER_ALLOWED = t -> true;

    private final FakerContext context;

    private final FakeValuesService fakeValuesService;

    private final Map<Class<?>, AbstractProvider<?>> providersCache = synchronizedMap(new IdentityHashMap<>());

    private final Predicate<Class<?>> whiteListPredicate;

    public BaseFaker() {
        this(Locale.ENGLISH);
    }

    public BaseFaker(Locale locale) {
        this(locale, (Random) null);
    }

    public BaseFaker(Random random) {
        this(Locale.ENGLISH, random);
    }

    public BaseFaker(Locale locale, Random random) {
        this(locale, new RandomService(random));
    }

    public BaseFaker(Locale locale, RandomService randomService) {
        this(new FakeValuesService(), new FakerContext(locale, randomService));
    }

    public BaseFaker(FakeValuesService fakeValuesService, FakerContext context) {
        this(fakeValuesService, context, EVERY_PROVIDER_ALLOWED);
    }

    public BaseFaker(FakeValuesService fakeValuesService, FakerContext context, Predicate<Class<?>> whiteListPredicate) {
        this.fakeValuesService = fakeValuesService;
        this.context = context;
        this.whiteListPredicate = whiteListPredicate == null ? EVERY_PROVIDER_ALLOWED : whiteListPredicate;
        fakeValuesService.updateFakeValuesInterfaceMap(context.getLocaleChain());
    }

    @Override
    public FakerContext getContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> T doWith(Callable<T> callable, Locale locale) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> T doWith(Callable<T> callable, long seed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> T doWith(Callable<T> callable, Locale locale, long seed) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string with the '#' characters in the parameter replaced with random digits between 0-9 inclusive or
     * random digits in the range from 1-9 when Ø (not zero) is used.
     * <p>
     * For example, the string "ABC##EFG" could be replaced with a string like "ABC99EFG" and the
     * string "Ø##" with a value like "149".
     *
     * @param numberString Template for string generation
     * @return Generated string
     */
    @Override
    public String numerify(String numberString) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string with the '?' characters in the parameter replaced with random alphabetic
     * characters.
     * <p>
     * For example, the string "12??34" could be replaced with a string like "12AB34".
     *
     * @param letterString Template for string generation
     * @return Generated string.
     */
    @Override
    public String letterify(String letterString) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string with the '?' characters in the parameter replaced with random alphabetic
     * characters.
     * <p>
     * For example, the string "12??34" could be replaced with a string like "12AB34".
     */
    @Override
    public String letterify(String letterString, boolean isUpper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Applies both a {@link #numerify(String)} and a {@link #letterify(String)}
     * over the incoming string.
     */
    @Override
    public String bothify(String string) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Applies both a {@link #numerify(String)} and a {@link #letterify(String)}
     * over the incoming string.
     */
    @Override
    public String bothify(String string, boolean isUpper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a String that matches the given regular expression.
     */
    @Override
    public String regexify(String regex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a String by example. The output string will have the same pattern as the input string.
     * <p>
     * For example:
     * "AAA" becomes "KRA"
     * "abc" becomes "uio"
     * "948" becomes "345"
     * "A19c" becomes "Z20d"
     *
     * @param example The input string
     * @return The output string based on the input pattern
     */
    @Override
    public String examplify(String example) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string with the char2replace characters in the parameter replaced with random option from available options.
     * <p>
     * For example, the string "ABC??EFG" could be replaced with a string like "ABCtestтестEFG"
     * if passed options are new String[]{"test", "тест"}.
     *
     * @param string       Template for string generation
     * @param char2replace Char to replace
     * @param options      Options to use while filling the template
     * @return Generated string
     */
    @Override
    public String templatify(String string, char char2replace, String... options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string with the characters in the keys of optionsMap parameter replaced with random option from values.
     *
     * <p>
     * For example, the string "ABC$$EFG" could be replaced with a string like "ABCtestтестEFG"
     * if passed for key '$' there is value new String[]{"test", "тест"} in optionsMap
     *
     * @param string     Template for string generation
     * @param optionsMap Map with replacement rules
     * @return Generated string
     */
    @Override
    public String templatify(String string, Map<Character, String[]> optionsMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string with generated csv based number of lines and column expressions.
     * This method will use comma as default delimiter, always prints header and double quote as default quote.
     *
     * <p>
     * For example, it could generate
     * "name_column","last_name_column"
     * "Sabrina","Kihn"
     * <p>
     * for expression {@code faker.expression("#{csv '1','name_column','#{Name.first_name}','last_name_column','#{Name.last_name}'}");}
     *
     * @param limit             Number of lines
     * @param columnExpressions Even number of expressions.
     *                          The odd numbers args are used for columns names, and even for column values.
     * @return Generated string
     */
    @Override
    public String csv(int limit, String... columnExpressions) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string with generated csv based number of lines and column expressions.
     *
     * <p>
     * For example, it could generate
     * "Thad" ### "Crist"
     * "Kathryne" ### "Wuckert"
     * "Sybil" ### "Connelly"
     * <p>
     * for expression {@code faker.expression("#{csv ' ### ','"','false','3','name_column','#{Name.first_name}','last_name_column','#{Name.last_name}'}");}
     *
     * @param separator         Delimiter to use
     * @param quote             Quote to use
     * @param withHeader        Print header or not
     * @param limit             Number of lines
     * @param columnExpressions Even number of expressions.
     *                          The odd numbers args are used for columns names, and even for column values.
     * @return Generated string
     */
    @Override
    public String csv(String separator, char quote, boolean withHeader, int limit, String... columnExpressions) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String json(String... fieldExpressions) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String jsona(String... fieldExpressions) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public RandomService random() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FakeValuesService fakeValuesService() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Allows to add paths to files with custom data. Data should be in YAML format.
     *
     * @param locale the locale for which a path is going to be added.
     * @param path   path to a file with YAML structure
     * @throws IllegalArgumentException in case of invalid path
     */
    @Override
    public void addPath(Locale locale, Path path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Allows to add urls of files with custom data. Data should be in YAML format.
     *
     * @param locale the locale for which an url is going to be added.
     * @param url   url of a file with YAML structure
     * @throws IllegalArgumentException in case of invalid url
     */
    @Override
    public void addUrl(Locale locale, URL url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T populate(Class<T> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T populate(Class<T> clazz, Schema<Object, ?> schema) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @SuppressWarnings("unchecked")
    public <PR extends ProviderRegistration, AP extends AbstractProvider<PR>> AP getProvider(Class<AP> clazz, Function<PR, AP> valueSupplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method is not needed anymore, don't use it.
     * @deprecated Use non-static method {@link BaseFaker#getProvider(Class, Function)} instead.
     */
    @Deprecated
    public static <PR extends ProviderRegistration, AP extends AbstractProvider<PR>> AP getProvider(Class<AP> clazz, Function<PR, AP> valueSupplier, PR faker) {
        return faker.getProvider(clazz, valueSupplier);
    }

    /**
     * @return builder to build {@code FakeCollection}
     */
    public <T> FakeSequence.Builder<T> collection() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SafeVarargs
    public final <T> FakeSequence.Builder<T> collection(Supplier<T>... suppliers) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public final <T> FakeSequence.Builder<T> collection(List<Supplier<T>> suppliers) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return builder to build {@code FakeStream}
     */
    public <T> FakeSequence.Builder<T> stream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SafeVarargs
    public final <T> FakeSequence.Builder<T> stream(Supplier<T>... suppliers) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public final <T> FakeSequence.Builder<T> stream(List<Supplier<T>> suppliers) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String resolve(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String resolve(String key, Supplier<String> message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Allows the evaluation of native YML expressions to allow you to build your
     * own.
     * <p>
     * The following are valid expressions:
     * <ul>
     * <li>#{regexify '(a|b){2,3}'}</li>
     * <li>#{regexify '\\.\\*\\?\\+'}</li>
     * <li>#{bothify '????','false'}</li>
     * <li>#{Name.first_name} #{Name.first_name} #{Name.last_name}</li>
     * <li>#{number.number_between '1','10'}</li>
     * </ul>
     *
     * @param expression (see examples above)
     * @return the evaluated string expression
     * @throws RuntimeException if unable to evaluate the expression
     */
    @Override
    public String expression(String expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @SuppressWarnings("unchecked")
    public final <B extends ProviderRegistration> B getFaker() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Method getMethod(AbstractProvider<?> ap, String methodName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
