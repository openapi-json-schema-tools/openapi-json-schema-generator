package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.petpetiduploadimage.PetpetiduploadimagePost;

public class Petpetiduploadimage extends ApiClient implements
    PetpetiduploadimagePost.PostOperation
{
    public Petpetiduploadimage(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}