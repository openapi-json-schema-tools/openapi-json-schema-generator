package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakejsonpatch.FakejsonpatchPatch;

public class Fakejsonpatch extends ApiClient implements
    FakejsonpatchPatch.FakejsonpatchPatchOperation
{
    public Fakejsonpatch(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}