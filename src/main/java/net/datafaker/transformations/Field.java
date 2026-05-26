package net.datafaker.transformations;

import net.datafaker.providers.base.AbstractProvider;
import java.util.function.Function;
import java.util.function.Supplier;

public interface Field<IN, OUT> {

    String getName();

    OUT transform(IN input);

    static <MyObject, MyType> SimpleField<MyObject, MyType> field(String name, Function<MyObject, MyType> transform) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <MyObject, MyType> SimpleField<MyObject, MyType> field(String name, Supplier<MyType> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <MyObject extends AbstractProvider<?>, MyType> CompositeField<MyObject, MyType> compositeField(String name, Field<MyObject, MyType>[] fields) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
