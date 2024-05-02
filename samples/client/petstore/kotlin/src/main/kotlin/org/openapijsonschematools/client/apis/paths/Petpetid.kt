package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.petpetid.PetpetidDelete;
import org.openapijsonschematools.client.paths.petpetid.PetpetidGet;
import org.openapijsonschematools.client.paths.petpetid.PetpetidPost;

public class Petpetid extends ApiClient implements
    PetpetidDelete.DeleteOperation,
    PetpetidGet.GetOperation,
    PetpetidPost.PostOperation
{
    public Petpetid(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}