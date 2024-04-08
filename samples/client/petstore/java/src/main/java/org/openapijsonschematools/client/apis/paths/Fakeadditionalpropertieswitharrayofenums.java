package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakeadditionalpropertieswitharrayofenums.Get;

public class Fakeadditionalpropertieswitharrayofenums extends ApiClient implements
    Get.GetOperation
{
    public Fakeadditionalpropertieswitharrayofenums(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}