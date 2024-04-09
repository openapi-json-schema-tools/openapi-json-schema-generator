package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakeinlineadditionalproperties.FakeinlineadditionalpropertiesPost;

public class Fakeinlineadditionalproperties extends ApiClient implements
    FakeinlineadditionalpropertiesPost.FakeinlineadditionalpropertiesPostOperation
{
    public Fakeinlineadditionalproperties(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}