from petstore_api.paths.pet_pet_id.get import ApiForGet
from petstore_api.paths.pet_pet_id.post import ApiForPost
from petstore_api.paths.pet_pet_id.delete import ApiForDelete


class PetPetId(
    ApiForGet,
    ApiForPost,
    ApiForDelete,
):
    pass
