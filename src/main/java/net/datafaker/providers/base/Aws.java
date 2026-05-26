package net.datafaker.providers.base;

import static net.datafaker.providers.base.Text.EN_UPPERCASE;

/**
 * @since 1.3.0
 */
public class Aws extends AbstractProvider<BaseProviders> {

    private final Text.TextRuleConfig configForRoute53ZoneId;

    protected Aws(BaseProviders faker) {
        super(faker);
        configForRoute53ZoneId = Text.TextSymbolsBuilder.builder().with(EN_UPPERCASE).len(21).build();
    }

    public String region() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String service() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String accountId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String acmARN() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String albARN() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String albTargetGroupARN() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String route53ZoneId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String securityGroupId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String subnetId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String vpcId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String appName() {
        return faker.app().name().toLowerCase().replaceAll("\\W+", "");
    }

    private String randHex(int length) {
        return faker.random().hex(length, false);
    }

    private String randHex() {
        return randHex(16);
    }
}
