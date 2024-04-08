package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.commonparamsubdir.Delete;
import org.openapijsonschematools.client.paths.commonparamsubdir.Get;
import org.openapijsonschematools.client.paths.commonparamsubdir.Post;

public class Commonparamsubdir extends ApiClient implements
    Delete.DeleteOperation,
    Get.GetOperation,
    Post.PostOperation
{
    public Commonparamsubdir(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}