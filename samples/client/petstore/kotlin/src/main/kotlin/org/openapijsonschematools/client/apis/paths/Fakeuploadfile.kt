package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakeuploadfile.FakeuploadfilePost;

public class Fakeuploadfile extends ApiClient implements
    FakeuploadfilePost.PostOperation
{
    public Fakeuploadfile(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}