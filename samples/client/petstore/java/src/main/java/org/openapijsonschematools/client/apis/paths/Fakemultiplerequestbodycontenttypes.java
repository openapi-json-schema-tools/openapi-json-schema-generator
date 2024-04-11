package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakemultiplerequestbodycontenttypes.FakemultiplerequestbodycontenttypesPost;

public class Fakemultiplerequestbodycontenttypes extends ApiClient implements
    FakemultiplerequestbodycontenttypesPost.PostOperation
{
    public Fakemultiplerequestbodycontenttypes(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}