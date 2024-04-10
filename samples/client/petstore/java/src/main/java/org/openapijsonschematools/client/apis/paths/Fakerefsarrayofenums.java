package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakerefsarrayofenums.FakerefsarrayofenumsPost;

public class Fakerefsarrayofenums extends ApiClient implements
    FakerefsarrayofenumsPost.PostOperation
{
    public Fakerefsarrayofenums(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}