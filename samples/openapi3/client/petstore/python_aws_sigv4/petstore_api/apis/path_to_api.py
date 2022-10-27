import typing_extensions

from petstore_api.paths import PathValues
from petstore_api.apis.paths.foo import Foo
from petstore_api.apis.paths.pet import Pet
from petstore_api.apis.paths.pet_pet_id import PetPetId

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.FOO: Foo,
        PathValues.PET: Pet,
        PathValues.PET_PET_ID: PetPetId,
    }
)

path_to_api = PathToApi(
    {
        PathValues.FOO: Foo,
        PathValues.PET: Pet,
        PathValues.PET_PET_ID: PetPetId,
    }
)
