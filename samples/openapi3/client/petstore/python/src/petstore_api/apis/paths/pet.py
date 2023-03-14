from petstore_api.paths.pet.put.operation import ApiForPut
from petstore_api.paths.pet.post.operation import ApiForPost


class Pet(
    ApiForPut,
    ApiForPost,
):
    pass
