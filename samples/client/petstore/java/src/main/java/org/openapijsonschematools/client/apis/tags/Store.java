package org.openapijsonschematools.client.apis.tags;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.storeinventory.StoreinventoryGet;
import org.openapijsonschematools.client.paths.storeorderorderid.StoreorderorderidDelete;
import org.openapijsonschematools.client.paths.storeorderorderid.StoreorderorderidGet;
import org.openapijsonschematools.client.paths.storeorder.StoreorderPost;

public class Store extends ApiClient implements
    StoreinventoryGet.GetInventoryOperation,
    StoreorderorderidDelete.DeleteOrderOperation,
    StoreorderorderidGet.GetOrderByIdOperation,
    StoreorderPost.PlaceOrderOperation
{
    public Store(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}