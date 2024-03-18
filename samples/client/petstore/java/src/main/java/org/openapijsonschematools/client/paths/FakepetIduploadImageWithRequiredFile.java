package org.openapijsonschematools.client.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

public class FakepetIduploadImageWithRequiredFile extends ApiClient {
    protected static final String path = "/fake/{petId}/uploadImageWithRequiredFile";

    public FakepetIduploadImageWithRequiredFile(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}
