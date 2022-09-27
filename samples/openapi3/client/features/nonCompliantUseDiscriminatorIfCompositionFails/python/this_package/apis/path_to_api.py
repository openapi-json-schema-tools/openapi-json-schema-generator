import typing_extensions

from this_package.paths import PathValues
from this_package.apis.paths.operators import Operators

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.OPERATORS: Operators,
    }
)

path_to_api = PathToApi(
    {
        PathValues.OPERATORS: Operators,
    }
)
