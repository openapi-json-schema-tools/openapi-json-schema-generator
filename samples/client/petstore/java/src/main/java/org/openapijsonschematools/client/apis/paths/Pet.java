package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.pet.PetPost;
import org.openapijsonschematools.client.paths.pet.PetPut;

public class Pet extends ApiClient implements
    PetPost.PetPostOperation,
    PetPut.PetPutOperation
{
    public Pet(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}