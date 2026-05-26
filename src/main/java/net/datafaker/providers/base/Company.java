package net.datafaker.providers.base;

import net.datafaker.internal.helper.FakerIDN;
import net.datafaker.internal.helper.LazyEvaluated;
import java.util.Collection;
import java.util.List;
import static java.util.stream.Collectors.joining;

/**
 * @since 0.8.0
 */
public class Company extends AbstractProvider<BaseProviders> {

    private final LazyEvaluated<List<String>> allBuzzwords = new LazyEvaluated<>(() -> loadBuzzwords());

    protected Company(BaseProviders faker) {
        super(faker);
    }

    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String suffix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String industry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String profession() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String buzzword() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private List<String> loadBuzzwords() {
        List<List<String>> buzzwordLists = faker.fakeValuesService().fetchObject("company.buzzwords", faker.getContext());
        return buzzwordLists.stream().flatMap(Collection::stream).toList();
    }

    /**
     * Generate a buzzword-laden catch phrase.
     */
    public String catchPhrase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * When a straight answer won't do, BS to the rescue!
     */
    public String bs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generate a random company logo url in PNG format.
     */
    public String logo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String url() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String domainName() {
        final char[] res = name().toLowerCase(faker.getContext().getLocale()).toCharArray();
        int offset = 0;
        for (int i = 0; i < res.length; i++) {
            final char c = res[i];
            switch(c) {
                case '.', ',', '\'', ' ', ']', '&' ->
                    offset++;
                default ->
                    res[i - offset] = res[i];
            }
        }
        return String.valueOf(res, 0, res.length - offset);
    }

    private String domainSuffix() {
        return resolve("internet.domain_suffix");
    }

    private String joinSampleOfEachList(List<List<String>> listOfLists) {
        return listOfLists.stream().map(list -> faker.options().nextElement(list)).collect(joining(" "));
    }
}
