package net.datafaker.transformations;

import net.datafaker.providers.base.AbstractProvider;
import java.util.Objects;

public class CompositeField<MyObject extends AbstractProvider<?>, MyType> extends Schema<MyObject, MyType> implements Field<MyObject, MyType> {

    private final String name;

    public CompositeField(String name, Field<MyObject, MyType>[] fields) {
        super(fields);
        this.name = name;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public MyType transform(MyObject input) {
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
