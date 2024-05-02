package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fake.FakeDelete;
import org.openapijsonschematools.client.paths.fake.FakeGet;
import org.openapijsonschematools.client.paths.fake.FakePatch;
import org.openapijsonschematools.client.paths.fake.FakePost;

public class Fake extends ApiClient implements
    FakeDelete.DeleteOperation,
    FakeGet.GetOperation,
    FakePatch.PatchOperation,
    FakePost.PostOperation
{
    public Fake(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}