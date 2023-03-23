import typing
import typing_extensions

from this_package.apis.paths.path_with_no_explicit_security import PathWithNoExplicitSecurity
from this_package.apis.paths.path_with_one_explicit_security import PathWithOneExplicitSecurity
from this_package.apis.paths.path_with_security_from_root import PathWithSecurityFromRoot
from this_package.apis.paths.path_with_two_explicit_security import PathWithTwoExplicitSecurity

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
    "/pathWithNoExplicitSecurity": typing.Type[PathWithNoExplicitSecurity],
    "/pathWithOneExplicitSecurity": typing.Type[PathWithOneExplicitSecurity],
    "/pathWithSecurityFromRoot": typing.Type[PathWithSecurityFromRoot],
    "/pathWithTwoExplicitSecurity": typing.Type[PathWithTwoExplicitSecurity],
    }
)

path_to_api = PathToApi(
    {
    "/pathWithNoExplicitSecurity": PathWithNoExplicitSecurity,
    "/pathWithOneExplicitSecurity": PathWithOneExplicitSecurity,
    "/pathWithSecurityFromRoot": PathWithSecurityFromRoot,
    "/pathWithTwoExplicitSecurity": PathWithTwoExplicitSecurity,
    }
)
