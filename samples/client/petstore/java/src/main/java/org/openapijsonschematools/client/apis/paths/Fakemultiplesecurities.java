package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.FakemultiplesecuritiesGet;

public class Fakemultiplesecurities extends ApiClient implements
    FakemultiplesecuritiesGet.FakemultiplesecuritiesGetOperation
{
    public Fakemultiplesecurities(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}