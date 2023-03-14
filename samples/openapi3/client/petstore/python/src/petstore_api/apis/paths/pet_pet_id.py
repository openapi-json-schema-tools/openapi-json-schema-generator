from petstore_api.paths.pet_pet_id.get.operation import ApiForGet
from petstore_api.paths.pet_pet_id.post.operation import ApiForPost
from petstore_api.paths.pet_pet_id.delete.operation import ApiForDelete


class PetPetId(
    ApiForGet,
    ApiForPost,
    ApiForDelete,
):
    pass
