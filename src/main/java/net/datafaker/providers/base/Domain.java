package net.datafaker.providers.base;

import net.datafaker.service.RandomService;

/**
 * A domain name generator.
 *
 * @since 0.9.0
 */
public class Domain extends AbstractProvider<BaseProviders> {

    /**
     * Instantiates a new Domain.
     *
     * @param faker the faker
     */
    protected Domain(BaseProviders faker) {
        super(faker);
    }

    /**
     * First level domain string. Such as example.com
     *
     * @param name the company name
     * @return the
     */
    public String firstLevelDomain(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Second level domain string. Such as example.com.uk
     *
     * @param name the company name
     * @return the second level domain with company name
     */
    public String secondLevelDomain(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Full domain string. Such as <a href="www.example.com.uk">www.example.com.uk</a>
     *
     * @param name the company name
     * @return the full domain name
     */
    public String fullDomain(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return a random valid domain.
     *
     * @param name the company name
     * @return A valid domain
     */
    public String validDomain(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
