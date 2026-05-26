package net.datafaker.providers.base;

/**
 * Generates data for Azure services. This is based on the Azure best practices of naming conventions:
 * <a href="https://learn.microsoft.com/en-us/azure/cloud-adoption-framework/ready/azure-best-practices/resource-naming">Naming conventions</a>
 * <a href="https://learn.microsoft.com/en-us/azure/cloud-adoption-framework/ready/azure-best-practices/resource-abbreviations">Abbreviation examples</a>
 *
 * @since 1.7.0
 */
public class Azure extends AbstractProvider<BaseProviders> {

    protected Azure(BaseProviders faker) {
        super(faker);
    }

    public String region() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String subscriptionId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String tenantId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String resourceGroup() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String managementGroup() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String applicationGateway() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String bastionHost() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String firewall() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String loadBalancer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String networkSecurityGroup() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String virtualNetwork() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String virtualWan() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String appServiceEnvironment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String appServicePlan() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String loadTesting() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String staticWebApp() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String virtualMachine() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String storageAccount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String containerRegistry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String containerApps() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String containerAppsEnvironment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String containerInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String cosmosDBDatabase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String sqlDatabase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String mysqlDatabase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String postgreSQLDatabase() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String serviceBus() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String serviceBusQueue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String serviceBusTopic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String keyVault() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String logAnalytics() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String springApps() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String randHex() {
        return faker.random().hex(16, false);
    }
}
