package org.openapijsonschematools.client.apis.tags;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.Post;
import org.openapijsonschematools.client.paths.pet.Post;
import org.openapijsonschematools.client.paths.pet.Put;
import org.openapijsonschematools.client.paths.petfindbytags.Get;
import org.openapijsonschematools.client.paths.petfindbystatus.Get;
import org.openapijsonschematools.client.paths.petpetiduploadimage.Post;
import org.openapijsonschematools.client.paths.petpetid.Delete;
import org.openapijsonschematools.client.paths.petpetid.Get;
import org.openapijsonschematools.client.paths.petpetid.Post;

public class PetApi extends ApiClient implements
    Post.UploadFileWithRequiredFileOperation
    Post.AddPetOperation,
    Put.UpdatePetOperation
    Get.FindPetsByTagsOperation
    Get.FindPetsByStatusOperation
    Post.UploadImageOperation
    Delete.DeletePetOperation,
    Get.GetPetByIdOperation,
    Post.UpdatePetWithFormOperation
{
    public PetApi(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}