package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakepemcontenttype.FakepemcontenttypeGet;

public class Fakepemcontenttype extends ApiClient implements
    FakepemcontenttypeGet.FakepemcontenttypeGetOperation
{
    public Fakepemcontenttype(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}