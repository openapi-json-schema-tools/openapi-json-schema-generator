package org.openapijsonschematools.client.apis.tags;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakeclassnametest.FakeclassnametestPatch;

public class Fakeclassnametags123 extends ApiClient implements
    FakeclassnametestPatch.ClassnameOperation
{
    public Fakeclassnametags123(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}