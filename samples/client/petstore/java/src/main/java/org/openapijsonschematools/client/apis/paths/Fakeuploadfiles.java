package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakeuploadfiles.FakeuploadfilesPost;

public class Fakeuploadfiles extends ApiClient implements
    FakeuploadfilesPost.FakeuploadfilesPostOperation
{
    public Fakeuploadfiles(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}