package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.userusername.UserusernameDelete;
import org.openapijsonschematools.client.paths.userusername.UserusernameGet;
import org.openapijsonschematools.client.paths.userusername.UserusernamePut;

public class Userusername extends ApiClient implements
    UserusernameDelete.UserusernameDeleteOperation,
    UserusernameGet.UserusernameGetOperation,
    UserusernamePut.UserusernamePutOperation
{
    public Userusername(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}