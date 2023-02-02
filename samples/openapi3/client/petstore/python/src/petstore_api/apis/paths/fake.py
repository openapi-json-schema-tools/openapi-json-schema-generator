from petstore_api.paths.fake.get import ApiForGet
from petstore_api.paths.fake.post import ApiForPost
from petstore_api.paths.fake.delete import ApiForDelete
from petstore_api.paths.fake.patch import ApiForPatch


class Fake(
    ApiForGet,
    ApiForPost,
    ApiForDelete,
    ApiForPatch,
):
    pass
