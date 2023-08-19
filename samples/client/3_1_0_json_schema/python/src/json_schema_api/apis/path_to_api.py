import typing
import typing_extensions

from json_schema_api.apis.paths.some_path import SomePath

PathToApi = typing.TypedDict(
    'PathToApi',
    {
    "/somePath": typing.Type[SomePath],
    }
)

path_to_api = PathToApi(
    {
    "/somePath": SomePath,
    }
)
