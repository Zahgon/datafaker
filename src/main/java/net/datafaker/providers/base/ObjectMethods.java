package net.datafaker.providers.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import static java.util.Collections.synchronizedMap;
import static java.util.stream.Collectors.toMap;

public class ObjectMethods {

    private static final Map<Class<?>, Map<String, Method>> METHODS_BY_NAME = synchronizedMap(new IdentityHashMap<>());

    private static final Map<Class<?>, Map<String, Method>> METHODS_BY_RETURN_TYPE = synchronizedMap(new IdentityHashMap<>());

    private static final Set<String> IGNORED_METHODS = Set.of("equals", "hashCode", "toString", "Builder", "stream");

    private static synchronized Map<String, Method> scanMethodsByName(Class<?> clazz) {
        return Stream.of(clazz.getMethods()).filter(ObjectMethods::isUseful).collect(toMap(Method::getName, method -> method));
    }

    private static synchronized Map<String, Method> scanMethodsByReturnType(Class<?> clazz) {
        return Stream.of(clazz.getMethods()).filter(ObjectMethods::isUseful).collect(toMap(method -> method.getReturnType().getSimpleName(), method -> method, ObjectMethods::chooseFirstByAlphabet));
    }

    private static Method chooseFirstByAlphabet(Method m1, Method m2) {
        return m1.getName().compareTo(m2.getName()) < 0 ? m1 : m2;
    }

    /**
     * Later we could mark all provider methods with some annotation like "@Provider" instead of this shaky logic
     */
    private static boolean isUseful(Method method) {
        return method.getParameterCount() == 0 && method.getDeclaringClass() != Object.class && method.getReturnType() != void.class && !IGNORED_METHODS.contains(method.getName());
    }

    public static Method getMethodByName(Object object, String methodName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Method getMethodByReturnType(Object object, String returnTypeSimpleName) {
        return METHODS_BY_RETURN_TYPE.computeIfAbsent(object.getClass(), ObjectMethods::scanMethodsByReturnType).get(returnTypeSimpleName);
    }

    @SuppressWarnings("unchecked")
    public static <T> T executeMethodByReturnType(Object object, String returnTypeSimpleName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
