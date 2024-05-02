package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.FakecasesensitiveparamsPut;

public class Fakecasesensitiveparams extends ApiClient implements
    FakecasesensitiveparamsPut.PutOperation
{
    public Fakecasesensitiveparams(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}