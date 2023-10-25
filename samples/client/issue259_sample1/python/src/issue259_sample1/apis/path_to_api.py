import typing
import typing_extensions

from issue259_sample1.apis.paths.users_user_id import UsersUserID

PathToApi = typing.TypedDict(
    'PathToApi',
    {
    "/users/{UserID}": typing.Type[UsersUserID],
    }
)

path_to_api = PathToApi(
    {
    "/users/{UserID}": UsersUserID,
    }
)
