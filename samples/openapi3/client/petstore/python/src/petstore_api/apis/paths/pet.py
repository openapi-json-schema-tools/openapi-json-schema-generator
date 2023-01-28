from petstore_api.paths.pet.put import ApiForPut
from petstore_api.paths.pet.post import ApiForPost


class Pet(
    ApiForPut,
    ApiForPost,
):
    pass
