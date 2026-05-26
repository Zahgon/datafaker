package net.datafaker.providers.base;

/**
 * Provides financial terms.
 *
 * @since 2.4.0
 */
public class FinancialTerms extends AbstractProvider<BaseProviders> {

    public FinancialTerms(BaseProviders faker) {
        super(faker);
    }

    public String noun() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String noun(Category category) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String verb() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String verb(Category category) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String adjective() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String adjective(Category category) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public enum Category {

        ACCOUNT_MANAGEMENT("account_management"),
        TRANSACTIONS("transactions"),
        PAYMENTS("payments"),
        TRANSFERS("transfers"),
        INVESTMENTS("investments"),
        LOANS("loans"),
        ALERTS_AND_NOTIFICATIONS("alerts_and_notifications"),
        CUSTOMER_SUPPORT("customer_support"),
        SECURITY("security"),
        REGULATORY_COMPLIANCE("regulatory_compliance"),
        MARKET_DATA("market_data"),
        USER_ACTIVITY("user_activity"),
        BANKING("banking"),
        CARDS("cards"),
        CRYPTOCURRENCY("cryptocurrency"),
        INSURANCE("insurance"),
        REWARDS_AND_LOYALTY("rewards_and_loyalty"),
        MISCELLANEOUS("miscellaneous");

        private final String name;

        Category(String name) {
            this.name = name;
        }

        public String getName() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
