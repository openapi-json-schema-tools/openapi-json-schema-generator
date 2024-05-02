package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.commonparamsubdir.CommonparamsubdirDelete;
import org.openapijsonschematools.client.paths.commonparamsubdir.CommonparamsubdirGet;
import org.openapijsonschematools.client.paths.commonparamsubdir.CommonparamsubdirPost;

public class Commonparamsubdir extends ApiClient implements
    CommonparamsubdirDelete.DeleteOperation,
    CommonparamsubdirGet.GetOperation,
    CommonparamsubdirPost.PostOperation
{
    public Commonparamsubdir(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}