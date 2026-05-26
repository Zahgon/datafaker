package net.datafaker.transformations;

import net.datafaker.sequence.FakeSequence;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.RecordComponent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Collections.synchronizedMap;

public class JavaObjectTransformer implements Transformer<Object, Object> {

    private static final Map<Schema<Object, ?>, Consumer<Object>> SCHEMA2CONSUMER = synchronizedMap(new IdentityHashMap<>());

    private static final Map<Class<?>, Constructor<?>> CLASS2CONSTRUCTOR = synchronizedMap(new IdentityHashMap<>());

    private Optional<Object> sourceClazz = Optional.empty();

    @Override
    public Object apply(Object input, Schema<Object, ?> schema) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Collection<Object> generate(Iterable<Object> input, Schema<Object, ?> schema) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public JavaObjectTransformer from(Class input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * The output is tied to provided Class source.
     * An empty source will output an empty stream.
     *
     * Configure available input with {@link #from(Class source)}.
     */
    @Override
    public Stream<Object> generateStream(final Schema<Object, ?> schema, long limit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void writeToOutputStream(OutputStream outputStream, Schema<Object, ?> schema, long limit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Collection<Object> generate(Schema<Object, ?> schema, int limit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getStartStream(Schema<Object, ?> schema) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getEndStream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Object getObject(Schema<Object, ?> schema, Object result, Constructor<?> recordConstructor) {
        final Field<Object, ?>[] fields = schema.getFields();
        final Object[] values = new Object[fields.length];
        for (int i = 0; i < fields.length; i++) {
            values[i] = fields[i].transform(result);
        }
        try {
            return recordConstructor.newInstance(values);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Failed to instantiate " + recordConstructor.getDeclaringClass().getName(), e);
        }
    }

    private boolean hasParameterlessPublicConstructor(Class<?> clazz) {
        return getParameterlessPublicConstructor(clazz).isPresent();
    }

    private Optional<Constructor<?>> getParameterlessPublicConstructor(Class<?> clazz) {
        return Arrays.stream(clazz.getConstructors()).filter(constructor -> constructor.getParameterCount() == 0).filter(constructor -> Modifier.isPublic(constructor.getModifiers())).findFirst();
    }

    private Optional<Constructor<?>> getAnyPublicConstructor(Class<?> clazz) {
        return Arrays.stream(clazz.getConstructors()).filter(constructor -> Modifier.isPublic(constructor.getModifiers())).findFirst();
    }
}
