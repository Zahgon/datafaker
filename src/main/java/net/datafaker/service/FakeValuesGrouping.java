package net.datafaker.service;

import net.datafaker.service.files.EnFile;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

public final class FakeValuesGrouping implements FakeValuesInterface {

    private static final FakeValuesGrouping ENGLISH_FAKE_VALUE_GROUPING = new FakeValuesGrouping();

    private final Map<String, Collection<FakeValuesInterface>> fakeValues = new HashMap<>();

    static {
        EnFile.getFiles().forEach(file -> {
            ENGLISH_FAKE_VALUE_GROUPING.add(FakeValues.of(FakeValuesContext.of(Locale.ENGLISH, file.getFile(), file.getPath())));
        });
    }

    public FakeValuesGrouping() {
    }

    public FakeValuesGrouping(FakeValues values) {
        add(values);
    }

    public void add(FakeValuesInterface fakeValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Map get(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static FakeValuesGrouping getEnglishFakeValueGrouping() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
