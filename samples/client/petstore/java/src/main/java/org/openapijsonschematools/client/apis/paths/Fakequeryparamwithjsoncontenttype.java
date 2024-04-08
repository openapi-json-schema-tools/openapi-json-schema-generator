package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.Get;

public class Fakequeryparamwithjsoncontenttype extends ApiClient implements
    Get.GetOperation
{
    public Fakequeryparamwithjsoncontenttype(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}