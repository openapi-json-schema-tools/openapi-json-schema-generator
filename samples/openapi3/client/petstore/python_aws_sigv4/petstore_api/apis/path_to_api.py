import typing_extensions

from petstore_api.paths import PathValues
from petstore_api.apis.paths.pet_pet_id import PetPetId

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.PET_PET_ID: PetPetId,
    }
)

path_to_api = PathToApi(
    {
        PathValues.PET_PET_ID: PetPetId,
    }
)
