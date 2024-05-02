package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakejsonwithcharset.FakejsonwithcharsetPost;

public class Fakejsonwithcharset extends ApiClient implements
    FakejsonwithcharsetPost.PostOperation
{
    public Fakejsonwithcharset(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}