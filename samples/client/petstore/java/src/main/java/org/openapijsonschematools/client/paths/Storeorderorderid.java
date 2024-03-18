package org.openapijsonschematools.client.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

public class Storeorderorderid extends ApiClient {
    protected static final String path = "/store/order/{order_id}";

    public Storeorderorderid(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}
