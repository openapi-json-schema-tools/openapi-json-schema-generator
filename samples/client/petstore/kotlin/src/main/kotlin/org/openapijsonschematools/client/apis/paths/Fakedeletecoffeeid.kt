package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakedeletecoffeeid.FakedeletecoffeeidDelete;

public class Fakedeletecoffeeid extends ApiClient implements
    FakedeletecoffeeidDelete.DeleteOperation
{
    public Fakedeletecoffeeid(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}