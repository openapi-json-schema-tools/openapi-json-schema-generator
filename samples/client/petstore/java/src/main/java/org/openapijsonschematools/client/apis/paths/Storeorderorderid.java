package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.storeorderorderid.StoreorderorderidDelete;
import org.openapijsonschematools.client.paths.storeorderorderid.StoreorderorderidGet;

public class Storeorderorderid extends ApiClient implements
    StoreorderorderidDelete.DeleteOperation,
    StoreorderorderidGet.GetOperation
{
    public Storeorderorderid(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}