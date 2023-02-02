from petstore_api.paths.user_username.get import ApiForGet
from petstore_api.paths.user_username.put import ApiForPut
from petstore_api.paths.user_username.delete import ApiForDelete


class UserUsername(
    ApiForGet,
    ApiForPut,
    ApiForDelete,
):
    pass
