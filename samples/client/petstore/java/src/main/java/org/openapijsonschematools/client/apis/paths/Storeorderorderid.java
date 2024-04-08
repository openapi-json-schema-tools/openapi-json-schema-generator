package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.storeorderorderid.Delete;
import org.openapijsonschematools.client.paths.storeorderorderid.Get;

public class Storeorderorderid extends ApiClient implements
    Delete.DeleteOperation,
    Get.GetOperation
{
    public Storeorderorderid(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}