package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakeresponsewithoutschema.FakeresponsewithoutschemaGet;

public class Fakeresponsewithoutschema extends ApiClient implements
    FakeresponsewithoutschemaGet.GetOperation
{
    public Fakeresponsewithoutschema(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}