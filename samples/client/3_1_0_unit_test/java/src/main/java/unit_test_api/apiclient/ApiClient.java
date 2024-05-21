package unit_test_api.apiclient;

import org.checkerframework.checker.nullness.qual.Nullable;
import unit_test_api.configurations.ApiConfiguration;
import unit_test_api.configurations.SchemaConfiguration;

import java.net.http.HttpClient;
import java.time.Duration;

public class ApiClient {
    protected final ApiConfiguration apiConfiguration;
    protected final SchemaConfiguration schemaConfiguration;
    protected final HttpClient client;

    public ApiClient(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        this.apiConfiguration = apiConfiguration;
        this.schemaConfiguration = schemaConfiguration;
        @Nullable Duration timeout = apiConfiguration.getTimeout();
        if (timeout != null) {
            this.client = HttpClient.newBuilder()
                .connectTimeout(timeout)
                .build();
        } else {
            this.client = HttpClient.newHttpClient();
        }
    }

    public ApiConfiguration getApiConfiguration() {
        return apiConfiguration;
    }

    public SchemaConfiguration getSchemaConfiguration() {
        return schemaConfiguration;
    }

    public HttpClient getClient() {
        return client;
    }
}
