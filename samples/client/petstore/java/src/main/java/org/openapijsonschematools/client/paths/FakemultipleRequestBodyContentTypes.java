package org.openapijsonschematools.client.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

public class FakemultipleRequestBodyContentTypes extends ApiClient {
    protected static final String path = "/fake/multipleRequestBodyContentTypes/";

    public FakemultipleRequestBodyContentTypes(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}
