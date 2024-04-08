package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.userusername.Delete;
import org.openapijsonschematools.client.paths.userusername.Get;
import org.openapijsonschematools.client.paths.userusername.Put;

public class Userusername extends ApiClient implements
    Delete.DeleteOperation,
    Get.GetOperation,
    Put.PutOperation
{
    public Userusername(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}