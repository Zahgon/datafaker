package net.datafaker.transformations;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class SimpleField<MyObject, MyType> implements Field<MyObject, MyType> {

    private final String name;

    private final Function<MyObject, MyType> transform;

    private final Supplier<MyType> supplier;

    protected SimpleField(String name, Function<MyObject, MyType> transform) {
        this(name, transform, null);
    }

    protected SimpleField(String name, Supplier<MyType> supplier) {
        this(name, null, supplier);
    }

    private SimpleField(String name, Function<MyObject, MyType> transform, Supplier<MyType> supplier) {
        this.name = name;
        this.transform = transform;
        this.supplier = supplier;
        if (this.transform == null && this.supplier == null) {
            throw new IllegalArgumentException("Either transform or supplier should be non-null");
        }
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public MyType transform(MyObject input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Function<MyObject, MyType> getTransform() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Supplier<MyType> getSupplier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
