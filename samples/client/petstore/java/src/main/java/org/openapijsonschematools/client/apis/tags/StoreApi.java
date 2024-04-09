package org.openapijsonschematools.client.apis.tags;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.storeinventory.Get;
import org.openapijsonschematools.client.paths.storeorderorderid.Delete;
import org.openapijsonschematools.client.paths.storeorderorderid.Get;
import org.openapijsonschematools.client.paths.storeorder.Post;

public class StoreApi extends ApiClient implements
    Get.GetInventoryOperation
    Delete.DeleteOrderOperation,
    Get.GetOrderByIdOperation
    Post.PlaceOrderOperation
{
    public StoreApi(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}