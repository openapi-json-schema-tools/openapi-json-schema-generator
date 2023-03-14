from petstore_api.paths.fake.get.operation import ApiForGet
from petstore_api.paths.fake.post.operation import ApiForPost
from petstore_api.paths.fake.delete.operation import ApiForDelete
from petstore_api.paths.fake.patch.operation import ApiForPatch


class Fake(
    ApiForGet,
    ApiForPost,
    ApiForDelete,
    ApiForPatch,
):
    pass
