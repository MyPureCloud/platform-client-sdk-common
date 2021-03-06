package cloud.genesys.webmessaging.sdk.connector;

public class ApiClientConnectorProperty {
    private static final String PREFIX = ApiClientConnectorProperty.class.getName() + ".";
    public static final String CONNECTION_TIMEOUT = PREFIX + "CONNECTION_TIMEOUT";
    public static final String DETAIL_LEVEL = PREFIX + "DETAIL_LEVEL";
    public static final String PROXY = PREFIX + "PROXY";
    public static final String PROXY_USER = PREFIX + "PROXY_USER";
    public static final String PROXY_PASS = PREFIX + "PROXY_PASS";
    public static final String CONNECTOR_PROVIDER = PREFIX + "CONNECTOR_PROVIDER";

    private ApiClientConnectorProperty() { }
}
