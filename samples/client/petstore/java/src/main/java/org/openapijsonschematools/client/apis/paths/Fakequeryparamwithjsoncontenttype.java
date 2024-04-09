package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.FakequeryparamwithjsoncontenttypeGet;

public class Fakequeryparamwithjsoncontenttype extends ApiClient implements
    FakequeryparamwithjsoncontenttypeGet.FakequeryparamwithjsoncontenttypeGetOperation
{
    public Fakequeryparamwithjsoncontenttype(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}