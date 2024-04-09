package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakeuploaddownloadfile.FakeuploaddownloadfilePost;

public class Fakeuploaddownloadfile extends ApiClient implements
    FakeuploaddownloadfilePost.FakeuploaddownloadfilePostOperation
{
    public Fakeuploaddownloadfile(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}