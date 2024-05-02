package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakerefsarraymodel.FakerefsarraymodelPost;

public class Fakerefsarraymodel extends ApiClient implements
    FakerefsarraymodelPost.PostOperation
{
    public Fakerefsarraymodel(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}