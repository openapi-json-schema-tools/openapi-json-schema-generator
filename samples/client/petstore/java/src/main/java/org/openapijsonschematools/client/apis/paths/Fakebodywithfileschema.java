package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakebodywithfileschema.FakebodywithfileschemaPut;

public class Fakebodywithfileschema extends ApiClient implements
    FakebodywithfileschemaPut.FakebodywithfileschemaPutOperation
{
    public Fakebodywithfileschema(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}