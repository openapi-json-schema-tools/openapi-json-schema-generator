import typing_extensions

from this_package.apis.paths.operators import Operators

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        "/operators": Operators,
    }
)

path_to_api = PathToApi(
    {
        "/operators": Operators,
    }
)
