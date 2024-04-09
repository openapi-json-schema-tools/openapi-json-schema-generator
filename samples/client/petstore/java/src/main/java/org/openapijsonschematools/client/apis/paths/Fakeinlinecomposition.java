package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.FakeinlinecompositionPost;

public class Fakeinlinecomposition extends ApiClient implements
    FakeinlinecompositionPost.FakeinlinecompositionPostOperation
{
    public Fakeinlinecomposition(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}