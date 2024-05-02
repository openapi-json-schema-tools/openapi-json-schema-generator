package org.openapijsonschematools.client.apis.tags;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.anotherfakedummy.AnotherfakedummyPatch;

public class Anotherfake extends ApiClient implements
    AnotherfakedummyPatch.Model123TestSpecialTagsOperation
{
    public Anotherfake(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}