package org.openapijsonschematools.client.apis.tags;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.FakepetiduploadimagewithrequiredfilePost;
import org.openapijsonschematools.client.paths.pet.PetPost;
import org.openapijsonschematools.client.paths.pet.PetPut;
import org.openapijsonschematools.client.paths.petfindbytags.PetfindbytagsGet;
import org.openapijsonschematools.client.paths.petfindbystatus.PetfindbystatusGet;
import org.openapijsonschematools.client.paths.petpetiduploadimage.PetpetiduploadimagePost;
import org.openapijsonschematools.client.paths.petpetid.PetpetidDelete;
import org.openapijsonschematools.client.paths.petpetid.PetpetidGet;
import org.openapijsonschematools.client.paths.petpetid.PetpetidPost;

public class Pet extends ApiClient implements
    FakepetiduploadimagewithrequiredfilePost.UploadFileWithRequiredFileOperation,
    PetPost.AddPetOperation,
    PetPut.UpdatePetOperation,
    PetfindbytagsGet.FindPetsByTagsOperation,
    PetfindbystatusGet.FindPetsByStatusOperation,
    PetpetiduploadimagePost.UploadImageOperation,
    PetpetidDelete.DeletePetOperation,
    PetpetidGet.GetPetByIdOperation,
    PetpetidPost.UpdatePetWithFormOperation
{
    public Pet(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}