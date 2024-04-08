package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.petpetid.Delete;
import org.openapijsonschematools.client.paths.petpetid.Get;
import org.openapijsonschematools.client.paths.petpetid.Post;

public class Petpetid extends ApiClient implements
    Delete.DeleteOperation,
    Get.GetOperation,
    Post.PostOperation
{
    public Petpetid(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}