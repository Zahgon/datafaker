package net.datafaker.service;

import com.github.curiousoddman.rgxgen.RgxGen;
import net.datafaker.internal.helper.CopyOnWriteMap;
import net.datafaker.internal.helper.SingletonLocale;
import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.Address;
import net.datafaker.providers.base.BaseFaker;
import net.datafaker.providers.base.Name;
import net.datafaker.providers.base.ObjectMethods;
import net.datafaker.providers.base.ProviderRegistration;
import net.datafaker.transformations.CsvTransformer;
import net.datafaker.transformations.Field;
import net.datafaker.transformations.JsonTransformer;
import net.datafaker.transformations.Schema;
import net.datafaker.transformations.SimpleField;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static java.util.Locale.ROOT;
import static java.util.Objects.requireNonNull;
import static java.util.logging.Level.FINE;
import static java.util.logging.Level.SEVERE;
import static net.datafaker.transformations.Field.field;

public class FakeValuesService {

    private static final Class<?>[] PRIMITIVES = { Byte.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE };

    private static final char[] DIGITS = "0123456789".toCharArray();

    private static final String[] EMPTY_ARRAY = new String[0];

    private static final Logger LOG = Logger.getLogger(FakeValuesService.class.getName());

    public static final Supplier<Map<String, Object>> MAP_STRING_OBJECT_SUPPLIER = () -> new CopyOnWriteMap<>(() -> new WeakHashMap<>());

    public static final Supplier<Map<String, String>> MAP_STRING_STRING_SUPPLIER = () -> new CopyOnWriteMap<>(() -> new WeakHashMap<>());

    private final Map<SingletonLocale, FakeValuesInterface> fakeValuesInterfaceMap = new CopyOnWriteMap<>(IdentityHashMap::new);

    public static final SingletonLocale DEFAULT_LOCALE = SingletonLocale.get(Locale.ENGLISH);

    private static final Map<Class<?>, Map<String, Collection<Method>>> CLASS_2_METHODS_CACHE = new CopyOnWriteMap<>(IdentityHashMap::new);

    private static final Map<Class<?>, Constructor<?>> CLASS_2_CONSTRUCTOR_CACHE = new CopyOnWriteMap<>(IdentityHashMap::new);

    private static final JsonTransformer<Object> JSON_TRANSFORMER = JsonTransformer.builder().build();

    private final Map<String, RgxGen> expression2generex = new CopyOnWriteMap<>(WeakHashMap::new);

    private final CopyOnWriteMap<SingletonLocale, Map<String, String>> key2Expression = new CopyOnWriteMap<>(IdentityHashMap::new);

    private static final Map<String, String[]> ARGS_2_SPLITTED_ARGS = new CopyOnWriteMap<>(WeakHashMap::new);

    private static final Map<String, String[]> KEY_2_SPLITTED_KEY = new CopyOnWriteMap<>(WeakHashMap::new);

    private final CopyOnWriteMap<SingletonLocale, Map<String, Object>> key2fetchedObject = new CopyOnWriteMap<>(IdentityHashMap::new);

    private static final Map<String, String> NAME_2_YAML = new CopyOnWriteMap<>(WeakHashMap::new);

    private static final Map<String, String> REMOVED_UNDERSCORE = new CopyOnWriteMap<>(WeakHashMap::new);

    private static final Map<Class<?>, Map<String, Map<String[], MethodAndCoercedArgs>>> MAP_OF_METHOD_AND_COERCED_ARGS = new CopyOnWriteMap<>(IdentityHashMap::new);

    private static final Map<String, String[]> EXPRESSION_2_SPLITTED = new CopyOnWriteMap<>(WeakHashMap::new);

    private final Map<RegExpContext, ValueResolver> REGEXP2SUPPLIER_MAP = new CopyOnWriteMap<>(HashMap::new);

    public void updateFakeValuesInterfaceMap(List<SingletonLocale> locales) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private FakeValuesInterface getCachedFakeValue(SingletonLocale locale) {
        if (DEFAULT_LOCALE == locale) {
            return FakeValuesGrouping.getEnglishFakeValueGrouping();
        }
        return FakeValues.of(FakeValuesContext.of(locale.getLocale()));
    }

    /**
     * Allows adding paths to files with custom data. Data should be in YAML format.
     *
     * @param locale the locale for which a path is going to be added.
     * @param path   path to a file with YAML structure
     * @throws IllegalArgumentException in case of invalid path
     */
    public void addPath(Locale locale, Path path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Allows adding urls of files with custom data. Data should be in YAML format.
     *
     * @param locale  the locale for which an url is going to be added.
     * @param url     url of a file with YAML structure
     * @throws IllegalArgumentException in case of invalid url
     */
    public void addUrl(Locale locale, URL url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Fetch a random value from an array item specified by the key
     */
    public Object fetch(String key, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Same as {@link #fetch(String, FakerContext)} but casts the result to a String
     */
    public String fetchString(String key, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private class SafeFetchResolver implements ValueResolver {

        private final String simpleDirective;

        private final FakerContext context;

        private SafeFetchResolver(String simpleDirective, FakerContext context) {
            this.simpleDirective = simpleDirective;
            this.context = context;
        }

        @Override
        public Object resolve() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Safely fetches a key.
     * <p>
     * If the value is null, it will return an empty string.
     * <p>
     * If it is a list, it will assume it is a list of strings and select a random value from it.
     * <p>
     * If the retrieved value is a slash encoded regular expression such as {@code /[a-b]/} then
     * the regex will be converted to a regexify expression and returned (ex. {@code #regexify '[a-b]'})
     * <p>
     * Otherwise, it will just return the value as a string.
     *
     * @param key           the key to fetch from the YML structure.
     * @param defaultIfNull the value to return if the fetched value is null
     * @return see above
     */
    @SuppressWarnings("unchecked")
    public String safeFetch(String key, FakerContext context, String defaultIfNull) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return the object selected by the key from yaml file.
     *
     * @param key key contains path to an object. Path segment is separated by
     *            dot. E.g. name.first_name
     */
    @SuppressWarnings("unchecked")
    public <T> T fetchObject(String key, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String[] split(String string) {
        return KEY_2_SPLITTED_KEY.computeIfAbsent(string, (__) -> {
            int size = 0;
            final char splitChar = '.';
            final int length = string.length();
            for (int i = 0; i < length; i++) {
                if (string.charAt(i) == splitChar) {
                    size++;
                }
            }
            String[] result = new String[size + 1];
            final char[] chars = string.toCharArray();
            int start = 0;
            int j = 0;
            for (int i = 0; i < length; i++) {
                if (string.charAt(i) == splitChar) {
                    if (i - start > 0) {
                        result[j++] = String.valueOf(chars, start, i - start);
                    }
                    start = i + 1;
                }
            }
            result[j] = String.valueOf(chars, start, chars.length - start);
            return result;
        });
    }

    /**
     * Returns a string with the '#' characters in the parameter replaced with random digits between 0-9 inclusive or
     * random digits in the range from 1-9 when Ø (not zero) is used.
     * <p>
     * For example, the string "ABC##EFG" could be replaced with a string like "ABC99EFG".
     */
    public String numerify(String numberString, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Applies both a {@link #numerify(String, FakerContext)} and a {@link #letterify(String, FakerContext)}
     * over the incoming string.
     */
    public String bothify(String string, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Applies both a {@link #numerify(String, FakerContext)} and a {@link #letterify(String, FakerContext, boolean)}
     * over the incoming string.
     */
    public String bothify(String input, FakerContext context, boolean isUpper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String bothify(String input, FakerContext context, boolean isUpper, boolean numerify, boolean letterify) {
        final int baseChar = isUpper ? 'A' : 'a';
        boolean changed = false;
        final char[] res = input.toCharArray();
        RandomService randomService = context.getRandomService();
        for (int i = 0; i < res.length; i++) {
            switch(res[i]) {
                case '#' ->
                    {
                        if (numerify) {
                            changed = true;
                            i += GenerationUtils.generateAndSetNumber(i, res, res[i], randomService) - 1;
                        }
                    }
                case 'Ø' ->
                    {
                        if (numerify) {
                            changed = true;
                            res[i] = DIGITS[randomService.nextInt(1, 9)];
                        }
                    }
                case '?' ->
                    {
                        if (letterify) {
                            changed = true;
                            // a-z
                            res[i] = (char) (baseChar + randomService.nextInt(26));
                        }
                    }
                default ->
                    {
                    }
            }
        }
        return changed ? String.valueOf(res) : input;
    }

    /**
     * Generates a String that matches the given regular expression.
     */
    public String regexify(String regex, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a String by example. The output string will have the same pattern as the input string.
     */
    public String examplify(String example, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string with the '?' characters in the parameter replaced with random alphabetic
     * characters.
     * <p>
     * For example, the string "12??34" could be replaced with a string like "12AB34".
     */
    public String letterify(String letterString, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string with the '?' characters in the parameter replaced with random alphabetic
     * characters.
     * <p>
     * For example, the string "12??34" could be replaced with a string like "12AB34".
     */
    public String letterify(String letterString, FakerContext context, boolean isUpper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string with the char2replace characters in the parameter replaced with random alphabetic
     * characters from options
     */
    public String templatify(String letterString, char char2replace, FakerContext context, String... options) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a string with the optionsMap.getKeys() characters in the parameter replaced with random alphabetic
     * characters from corresponding optionsMap.values()
     */
    public String templatify(String letterString, Map<Character, String[]> optionsMap, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Resolves a key to a method on an object or throws an exception.
     * <p>
     * #{hello} with result in a method call to current.hello();
     * <p>
     * #{Person.hello_someone} will result in a method call to person.helloSomeone();
     */
    public String resolve(String key, Object current, BaseFaker root, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String resolve(String key, AbstractProvider<?> provider, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Resolves a key to a method on an object or throws an exception with specified message.
     * <p>
     * #{hello} with result in a method call to current.hello();
     * <p>
     * #{Person.hello_someone} will result in a method call to person.helloSomeone();
     */
    public String resolve(String key, Object current, final ProviderRegistration root, Supplier<String> exceptionMessage, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Resolves an expression using the current faker.
     */
    public String expression(String expression, BaseFaker faker, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Resolves an expression in file using the current faker.
     */
    public String fileExpression(Path path, BaseFaker faker, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates csv based on input column expressions and number of lines.
     * This method uses default separator, quote and always prints header.
     */
    public String csv(int limit, String... columnExpressions) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates csv based on input.
     */
    public String csv(String delimiter, char quote, boolean withHeader, int limit, String... columnExpressions) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates json based on input.
     */
    public String json(String... fieldExpressions) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates json based on input.
     */
    public String jsona(String... fieldExpressions) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * processes expression in the style #{X.y} using the current objects as the 'current' location
     * within the yml file (or the {@link BaseFaker} object hierarchy as it were).
     * <p>
     * #{Address.streetName} would get resolved to {@link BaseFaker#address()}'s {@link Address#streetName()}
     * #{address.street} would get resolved to the YAML like locale: faker: address: street:
     * Combinations are supported as well: "#{x} #{y}"
     * <p>
     * Recursive templates are supported.  if "#{x}" resolves to "#{Address.streetName}" then "#{x}" resolves to
     * {@link BaseFaker#address()}'s {@link Address#streetName()}.
     */
    protected String resolveExpression(String expression, Object current, ProviderRegistration root, FakerContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String[] splitArguments(String arguments) {
        final int length;
        if (arguments == null || (length = arguments.length()) == 0) {
            return EMPTY_ARRAY;
        }
        return ARGS_2_SPLITTED_ARGS.computeIfAbsent(arguments, (__) -> {
            List<String> result = new ArrayList<>();
            int start = 0;
            boolean argsStarted = false;
            for (int i = 0; i < length; i++) {
                if (argsStarted) {
                    int cnt = 0;
                    while (i < length && arguments.charAt(i) == '\'') {
                        cnt++;
                        i++;
                    }
                    if ((cnt & 1) == 1) {
                        result.add(arguments.substring(start, i - 1).replace("''", "'"));
                        argsStarted = false;
                    }
                } else if (arguments.charAt(i) == '\'') {
                    argsStarted = true;
                    start = i + 1;
                }
            }
            return result.toArray(EMPTY_ARRAY);
        });
    }

    private String[] splitExpressions(String expression, int length) {
        return EXPRESSION_2_SPLITTED.computeIfAbsent(expression, (__) -> {
            int cnt = 0;
            for (int i = 0; i < length; i++) {
                if (expression.charAt(i) == '}') {
                    cnt++;
                }
            }
            List<String> list = new ArrayList<>((cnt << 1) + 1);
            boolean isExpression = false;
            int start = 0;
            int quoteCnt = 0;
            for (int i = 0; i < length; i++) {
                final char c = expression.charAt(i);
                if (isExpression) {
                    if (c == '}' && (quoteCnt & 1) == 0) {
                        list.add(expression.substring(start, i));
                        start = i + 1;
                        isExpression = false;
                    } else if (c == '\'') {
                        quoteCnt++;
                    }
                } else if (i < length - 2 && c == '#' && expression.charAt(i + 1) == '{') {
                    list.add(expression.substring(start, i));
                    isExpression = true;
                    start = i + 2;
                    i++;
                }
            }
            if (start < length) {
                list.add(expression.substring(start));
            }
            return list.toArray(EMPTY_ARRAY);
        });
    }

    private Object resExp(String directive, String[] args, Object current, ProviderRegistration root, FakerContext context, RegExpContext regExpContext) {
        Object res = resolveExpression(directive, args, current, root, context);
        LOG.fine(() -> "resExp(%s [%s]) current: %s, root: %s, context: %s, regExpContext: %s -> res: %s".formatted(directive, Arrays.toString(args), current, root, context, regExpContext, res));
        if (res instanceof CharSequence) {
            if (((CharSequence) res).isEmpty()) {
                REGEXP2SUPPLIER_MAP.put(regExpContext, EMPTY_STRING);
            }
            return res;
        }
        if (res instanceof List) {
            Iterator<ValueResolver> it = ((List<ValueResolver>) res).iterator();
            while (it.hasNext()) {
                Object valueResolver = it.next();
                Object value;
                if (valueResolver instanceof ValueResolver resolver) {
                    value = resolver.resolve();
                    if (value == null) {
                        it.remove();
                    } else {
                        REGEXP2SUPPLIER_MAP.put(regExpContext, resolver);
                        return value;
                    }
                }
            }
            return null;
        }
        return res;
    }

    /**
     * Search Order
     * <ul>
     *  <li>Search for methods on the current object</li>
     *  <li>local keys in Yaml File</li>
     *  <li>Search for methods on faker child objects</li>
     *   <li>Search for keys in yaml file by transforming object reference to yaml reference</li>
     * </ul>
     */
    private Object resolveExpression(String directive, String[] args, Object current, ProviderRegistration root, FakerContext context) {
        if (directive.isEmpty()) {
            return directive;
        }
        final int dotIndex = getDotIndex(directive);
        List<ValueResolver> res = new ArrayList<>();
        if (args.length == 0) {
            // resolve method references on CURRENT object like #{number_between '1','10'} on Number or
            // #{ssn_valid} on IdNumber
            if (dotIndex == -1) {
                if (current instanceof AbstractProvider) {
                    final Method method = BaseFaker.getMethod((AbstractProvider<?>) current, directive);
                    if (method != null) {
                        res.add(new MethodResolver(method, current, args));
                        return res;
                    }
                }
                res.add(resolveFromMethodOn(current, directive, args));
            }
            if (dotIndex > 0) {
                String providerClassName = directive.substring(0, dotIndex);
                String methodName = directive.substring(dotIndex + 1);
                AbstractProvider<?> ap = root.getProvider(providerClassName);
                Method method = ap == null ? null : ObjectMethods.getMethodByName(ap, methodName);
                if (method != null) {
                    res.add(new MethodResolver(method, ap, args));
                    return res;
                }
            }
        }
        final String simpleDirective = (dotIndex >= 0 || current == null) ? directive : classNameToYamlName(current) + "." + directive;
        // simple fetch of a value from the yaml file. the directive may have been mutated
        // such that if the current yml object is car: and directive is #{wheel} then
        // car.wheel will be looked up in the YAML file.
        // It's only "simple" if there aren't args
        if (args.length == 0) {
            res.add(new SafeFetchResolver(simpleDirective, context));
        }
        // resolve method references on faker object like #{regexify '[a-z]'}
        if (dotIndex == -1 && root != null && (current == null || root.getClass() != current.getClass())) {
            res.add(resolveFromMethodOn(root, directive, args));
        }
        // Resolve Faker Object method references like #{ClassName.method_name}
        if (dotIndex >= 0) {
            res.add(resolveFakerObjectAndMethod(root, directive, dotIndex, args));
        }
        // last ditch effort.  Due to Ruby's dynamic nature, something like 'Address.street_title' will resolve
        // because 'street_title' is a dynamic method on the Address object.  We can't do this in Java so we go
        // through the normal resolution above, but if we will can't resolve it, we once again do a 'safeFetch' as we
        // did first, but FIRST we change the Object reference Class.method_name with a yml style internal reference ->
        // class.method_name (lowercase)
        if (dotIndex >= 0) {
            final String key = javaNameToYamlName(simpleDirective);
            res.add(new SafeFetchResolver(key, context));
        }
        return res;
    }

    /**
     * @param expression input expression
     * @return true if s is non-null and is a slash delimited regex (ex. {@code /[ab]/})
     */
    private boolean isSlashDelimitedRegex(String expression) {
        return expression != null && expression.startsWith("/") && expression.endsWith("/");
    }

    /**
     * Given a {@code slashDelimitedRegex} such as {@code /[ab]/}, removes the slashes and returns only {@code [ab]}
     *
     * @param slashDelimitedRegex a non null slash delimited regex (ex. {@code /[ab]/})
     * @return the regex without the slashes (ex. {@code [ab]})
     */
    private String trimRegexSlashes(String slashDelimitedRegex) {
        return slashDelimitedRegex.substring(1, slashDelimitedRegex.length() - 1);
    }

    private int getDotIndex(String directive) {
        // indexOf(<String>) is faster than indexOf(<char>) since it has jvm intrinsic
        return directive.indexOf(".");
    }

    /**
     * @return a yaml style name from the classname of the supplied object (PhoneNumber => phone_number)
     */
    private String classNameToYamlName(Object current) {
        return javaNameToYamlName(current.getClass().getSimpleName());
    }

    /**
     * @return a yaml style name like 'phone_number' from a java style name like 'PhoneNumber'
     */
    private String javaNameToYamlName(String expression) {
        return NAME_2_YAML.computeIfAbsent(expression, (__) -> {
            final int length = expression.length();
            final boolean firstLetterUpperCase = length > 0 && Character.isUpperCase(expression.charAt(0));
            int cnt = firstLetterUpperCase ? 1 : 0;
            for (int i = 1; i < length; i++) {
                if (Character.isUpperCase(expression.charAt(i))) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                return expression;
            }
            final char[] res = new char[length + (firstLetterUpperCase ? cnt - 1 : cnt)];
            int pos = 0;
            for (int i = 0; i < length; i++) {
                final char c = expression.charAt(i);
                if (cnt > 0) {
                    if (Character.isUpperCase(c)) {
                        if (pos > 0) {
                            res[pos++] = '_';
                        }
                        res[pos++] = Character.toLowerCase(c);
                        cnt--;
                    } else {
                        res[pos++] = c;
                    }
                } else {
                    res[pos++] = c;
                }
            }
            return new String(res);
        });
    }

    /**
     * Given a directive like 'firstName', attempts to resolve it to a method.  For example if obj is an instance of
     * {@link Name} then this method would return {@link Name#firstName()}.  Returns null if the directive is nested
     * (i.e. has a '.') or the method doesn't exist on the <em>obj</em> object.
     */
    private ValueResolver resolveFromMethodOn(Object obj, String directive, String[] args) {
        if (obj == null) {
            return null;
        }
        final MethodAndCoercedArgs accessor = retrieveMethodAccessor(obj, directive, args);
        return accessor == null ? NULL_VALUE : new MethodAndCoercedArgsResolver(accessor, obj);
    }

    /**
     * Accepts a {@link BaseFaker} instance and a name.firstName style 'key' which is resolved to the return value of:
     * {@link BaseFaker#name()}'s {@link Name#firstName()} method.
     *
     * @throws RuntimeException if there's a problem invoking the method, or it doesn't exist.
     */
    private ValueResolver resolveFakerObjectAndMethod(ProviderRegistration faker, String key, int dotIndex, String[] args) {
        final String[] classAndMethod;
        if (dotIndex == -1) {
            classAndMethod = new String[] { key };
        } else {
            classAndMethod = new String[] { key.substring(0, dotIndex), dotIndex == key.length() - 1 ? "" : key.substring(dotIndex + 1) };
        }
        try {
            String fakerMethodName = removeUnderscoreChars(classAndMethod[0]);
            final MethodAndCoercedArgs fakerAccessor = retrieveMethodAccessor(faker, fakerMethodName, EMPTY_ARRAY);
            if (fakerAccessor == null) {
                LOG.fine(() -> "Can't find top level faker object named " + fakerMethodName + ".");
                return null;
            }
            Object objectWithMethodToInvoke = fakerAccessor.invoke(faker);
            String nestedMethodName = removeUnderscoreChars(classAndMethod[1]);
            final MethodAndCoercedArgs accessor = retrieveMethodAccessor(objectWithMethodToInvoke, nestedMethodName, args);
            if (accessor == null) {
                return NULL_VALUE;
            }
            return new MethodAndCoercedArgsResolver(accessor, objectWithMethodToInvoke);
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException("Failed to resolve faker object and method for %s (dotIndex=%s, args=%s)".formatted(key, dotIndex, Arrays.toString(args)), e);
        }
    }

    private MethodAndCoercedArgs retrieveMethodAccessor(Object object, String methodName, String[] args) {
        Class<?> clazz = object.getClass();
        MethodAndCoercedArgs accessor = MAP_OF_METHOD_AND_COERCED_ARGS.computeIfAbsent(clazz, cl -> new CopyOnWriteMap<>(WeakHashMap::new)).computeIfAbsent(methodName, mn -> new CopyOnWriteMap<>(WeakHashMap::new)).computeIfAbsent(args, (__) -> accessor(clazz, methodName, args));
        if (accessor == null) {
            LOG.fine(() -> "Can't find method on %s called %s.".formatted(object.getClass().getSimpleName(), methodName));
        }
        return accessor;
    }

    /**
     * Find an accessor by name ignoring case.
     */
    private MethodAndCoercedArgs accessor(Class<?> clazz, final String accessorName, String[] args) {
        LOG.fine(() -> "Find accessor named %s on %s with args %s".formatted(accessorName, clazz.getSimpleName(), Arrays.toString(args)));
        String name = removeUnderscoreChars(accessorName);
        Map<String, Collection<Method>> classMethodsMap = CLASS_2_METHODS_CACHE.computeIfAbsent(clazz, (__) -> {
            Method[] classMethods = clazz.getMethods();
            Map<String, Collection<Method>> methodMap = classMethods.length == 0 ? emptyMap() : new HashMap<>(classMethods.length);
            for (Method m : classMethods) {
                String key = m.getName().toLowerCase(ROOT);
                methodMap.computeIfAbsent(key, k -> new ArrayList<>()).add(m);
            }
            LOG.fine(() -> "Detected accessor named %s on %s, stored to cache: %s".formatted(accessorName, clazz.getSimpleName(), methodMap));
            return methodMap;
        });
        Collection<Method> methods = classMethodsMap.getOrDefault(name, emptyList());
        if (methods.isEmpty()) {
            LOG.fine(() -> "Didn't find accessor named %s on %s with args %s".formatted(accessorName, clazz.getSimpleName(), Arrays.toString(args)));
            return null;
        }
        LOG.fine(() -> "Found accessor named %s on %s in cache: %s".formatted(accessorName, clazz.getSimpleName(), methods));
        Method mostRestrictive = null;
        Object[] coercedArgumentsForMostRestrictive = null;
        for (Method current : methods) {
            if (current.getParameterCount() == args.length || current.getParameterCount() < args.length && current.isVarArgs()) {
                final Object[] coercedArguments = args.length == 0 ? EMPTY_ARRAY : coerceArguments(current, args);
                if (coercedArguments != null && rightIsMostRestrictive(mostRestrictive, current)) {
                    mostRestrictive = current;
                    coercedArgumentsForMostRestrictive = coercedArguments;
                }
            }
        }
        if (mostRestrictive != null) {
            return new MethodAndCoercedArgs(mostRestrictive, coercedArgumentsForMostRestrictive);
        }
        LOG.fine(() -> "Didn't find accessor named %s on %s with args %s (methods=%s)".formatted(accessorName, clazz.getSimpleName(), Arrays.toString(args), methods));
        return null;
    }

    private static boolean rightIsMostRestrictive(Method method1, Method method2) {
        if (method1 == null && method2 == null) {
            throw new NullPointerException("Both methods are null");
        }
        if (method2 == null) {
            return false;
        }
        if (method1 == null) {
            return true;
        }
        Class<?>[] parameterTypes1 = method1.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        for (int j = 0; j < parameterTypes1.length; j++) {
            if (parameterTypes1[j] == parameterTypes2[j]) {
                continue;
            }
            if (parameterTypes1[j].isPrimitive() && !parameterTypes2[j].isPrimitive()) {
                return false;
            }
            if (!parameterTypes1[j].isPrimitive() && parameterTypes2[j].isPrimitive()) {
                return true;
            }
            if (parameterTypes1[j].isPrimitive()) {
                for (Class<?> primitive : PRIMITIVES) {
                    if (primitive == parameterTypes1[j]) {
                        return false;
                    } else if (primitive == parameterTypes2[j]) {
                        return true;
                    }
                }
            }
            if (parameterTypes1[j].isAssignableFrom(parameterTypes2[j])) {
                return true;
            }
        }
        return false;
    }

    private String removeUnderscoreChars(String string) {
        return REMOVED_UNDERSCORE.computeIfAbsent(string, (__) -> {
            // indexOf(<String>) is faster than indexOf(<char>) since it has jvm intrinsic
            if (!string.contains("_")) {
                return string.toLowerCase(ROOT);
            }
            final char[] res = string.toCharArray();
            int offset = 0;
            int length = 0;
            final int strLen = string.length();
            for (int i = strLen - 1; i >= offset; i--) {
                while (i > offset && string.charAt(i - offset) == '_') {
                    offset++;
                }
                res[i] = res[i - offset];
                if (res[i] != '_') {
                    length++;
                }
            }
            return String.valueOf(res, strLen - length, length).toLowerCase(ROOT);
        });
    }

    /**
     * Coerce arguments in <em>args</em> into the appropriate types (if possible) for the parameter arguments
     * to <em>accessor</em>.
     *
     * @return array of coerced values if successful, null otherwise
     */
    private Object[] coerceArguments(Method accessor, String[] args) {
        final Object[] coerced = new Object[accessor.getParameterCount()];
        final Class<?>[] parameterTypes = accessor.getParameterTypes();
        for (int i = 0; i < accessor.getParameterCount(); i++) {
            final boolean isVarArg = i == accessor.getParameterCount() - 1 && accessor.isVarArgs();
            final Class<?> toType0 = primitiveToWrapper(parameterTypes[i]);
            final Class<?> toType = isVarArg ? toType0.getComponentType() : toType0;
            try {
                final Object coercedArgument;
                if (toType.isEnum()) {
                    Method method = toType.getMethod("valueOf", String.class);
                    if (isVarArg) {
                        coercedArgument = Array.newInstance(toType, args.length - i);
                        for (int j = i; j < args.length; j++) {
                            String enumArg = args[j].substring(args[j].indexOf(".") + 1);
                            Array.set(coercedArgument, j - i, method.invoke(null, enumArg));
                        }
                    } else {
                        String enumArg = args[i].substring(args[i].indexOf(".") + 1);
                        coercedArgument = method.invoke(null, enumArg);
                    }
                } else {
                    if (isVarArg) {
                        Constructor<?> ctor = CLASS_2_CONSTRUCTOR_CACHE.computeIfAbsent(toType, (__) -> {
                            final Constructor<?>[] constructors = toType.getConstructors();
                            for (Constructor<?> c : constructors) {
                                if (c.getParameterCount() == 1 && c.getParameterTypes()[0] == String.class) {
                                    return getConstructorWithString(toType);
                                }
                            }
                            return null;
                        });
                        if (ctor == null) {
                            return null;
                        }
                        coercedArgument = Array.newInstance(toType, args.length - i);
                        for (int j = i; j < args.length; j++) {
                            Array.set(coercedArgument, j - i, ctor.newInstance(args[j]));
                        }
                    } else if (toType == Character.class) {
                        coercedArgument = args[i] == null ? null : args[i].charAt(0);
                    } else if (Boolean.class == toType) {
                        coercedArgument = Boolean.valueOf(args[i]);
                    } else if (Integer.class == toType) {
                        coercedArgument = Integer.valueOf(args[i]);
                    } else if (Long.class == toType) {
                        coercedArgument = Long.valueOf(args[i]);
                    } else if (Double.class == toType) {
                        coercedArgument = Double.valueOf(args[i]);
                    } else if (Float.class == toType) {
                        coercedArgument = Float.valueOf(args[i]);
                    } else if (Byte.class == toType) {
                        coercedArgument = Byte.valueOf(args[i]);
                    } else if (Short.class == toType) {
                        coercedArgument = Short.valueOf(args[i]);
                    } else if (CharSequence.class.isAssignableFrom(toType)) {
                        coercedArgument = args[i];
                    } else if (BigDecimal.class.isAssignableFrom(toType)) {
                        coercedArgument = new BigDecimal(args[i]);
                    } else if (BigInteger.class.isAssignableFrom(toType)) {
                        coercedArgument = new BigInteger(args[i]);
                    } else {
                        final Constructor<?> ctor = getConstructorWithString(toType);
                        coercedArgument = ctor.newInstance(args[i]);
                    }
                }
                coerced[i] = coercedArgument;
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | NoSuchMethodRuntimeException e) {
                Throwable cause = unwrap(e);
                Level level = cause instanceof IllegalArgumentException || cause instanceof NoSuchMethodException || cause instanceof NoSuchMethodRuntimeException ? FINE : SEVERE;
                LOG.log(level, "Unable to coerce " + args[i] + " to " + toType.getSimpleName() + " via " + toType.getSimpleName() + "(String) constructor", e);
                return null;
            }
        }
        return coerced;
    }

    private static final Map<Class<?>, Class<?>> PRIMITIVE_WRAPPER_MAP = new IdentityHashMap<>();

    static {
        PRIMITIVE_WRAPPER_MAP.put(Boolean.TYPE, Boolean.class);
        PRIMITIVE_WRAPPER_MAP.put(Byte.TYPE, Byte.class);
        PRIMITIVE_WRAPPER_MAP.put(Character.TYPE, Character.class);
        PRIMITIVE_WRAPPER_MAP.put(Short.TYPE, Short.class);
        PRIMITIVE_WRAPPER_MAP.put(Integer.TYPE, Integer.class);
        PRIMITIVE_WRAPPER_MAP.put(Long.TYPE, Long.class);
        PRIMITIVE_WRAPPER_MAP.put(Double.TYPE, Double.class);
        PRIMITIVE_WRAPPER_MAP.put(Float.TYPE, Float.class);
        PRIMITIVE_WRAPPER_MAP.put(Void.TYPE, Void.class);
    }

    public static Class<?> primitiveToWrapper(final Class<?> cls) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * simple wrapper class around an accessor and a list of coerced arguments.
     * this is useful as we get to find the method and coerce the arguments in one
     * shot, returning both when successful.  This saves us from doing it more than once (coercing args).
     */
    private record MethodAndCoercedArgs(Method method, Object[] coerced) {

        private MethodAndCoercedArgs {
            requireNonNull(method, "method cannot be null");
            requireNonNull(coerced, "coerced arguments cannot be null");
        }

        private Object invoke(Object on) throws InvocationTargetException, IllegalAccessException {
            return method.invoke(on, coerced);
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    private record RegExpContext(String exp, ProviderRegistration root, FakerContext context) {
    }

    private interface ValueResolver {

        Object resolve();
    }

    private record ConstantResolver(String value) implements ValueResolver {

        @Override
        public Object resolve() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    private static final ConstantResolver EMPTY_STRING = new ConstantResolver("");

    private static final ConstantResolver NULL_VALUE = new ConstantResolver(null);

    private record MethodResolver(Method method, Object current, Object[] args) implements ValueResolver {

        @Override
        public Object resolve() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    private record MethodAndCoercedArgsResolver(MethodAndCoercedArgs accessor, Object obj) implements ValueResolver {

        @Override
        public Object resolve() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        private static Object invokeAndToString(MethodAndCoercedArgs accessor, Object objectWithMethodToInvoke) {
            try {
                return accessor.invoke(objectWithMethodToInvoke);
            } catch (InvocationTargetException | IllegalAccessException e) {
                throw new RuntimeException("Failed to invoke %s on %s".formatted(accessor, objectWithMethodToInvoke), unwrap(e));
            }
        }
    }

    private static Throwable unwrap(Throwable e) {
        return e instanceof InvocationTargetException reflection ? unwrap(reflection.getTargetException()) : e;
    }

    private static Constructor<?> getConstructorWithString(Class<?> toType) {
        try {
            return toType.getConstructor(String.class);
        } catch (NoSuchMethodException e) {
            throw new NoSuchMethodRuntimeException(e);
        }
    }

    private static class NoSuchMethodRuntimeException extends RuntimeException {

        public NoSuchMethodRuntimeException(NoSuchMethodException cause) {
            super(cause);
        }
    }
}
