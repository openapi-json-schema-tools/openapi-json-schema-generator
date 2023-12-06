import typing
import typing_extensions

from petstore_api.apis.tags.fake_api import FakeApi
from petstore_api.apis.tags.default_api import DefaultApi
from petstore_api.apis.tags.pet_api import PetApi
from petstore_api.apis.tags.fake_classname_tags123_api import FakeClassnameTags123Api
from petstore_api.apis.tags.store_api import StoreApi
from petstore_api.apis.tags.another_fake_api import AnotherFakeApi
from petstore_api.apis.tags.user_api import UserApi

TagToApi = typing.TypedDict(
    'TagToApi',
    {
        "fake": typing.Type[FakeApi],
        "default": typing.Type[DefaultApi],
        "pet": typing.Type[PetApi],
        "fake_classname_tags 123#$%^": typing.Type[FakeClassnameTags123Api],
        "store": typing.Type[StoreApi],
        "$another-fake?": typing.Type[AnotherFakeApi],
        "user": typing.Type[UserApi],
    }
)

tag_to_api = TagToApi(
    {
        "fake": FakeApi,
        "default": DefaultApi,
        "pet": PetApi,
        "fake_classname_tags 123#$%^": FakeClassnameTags123Api,
        "store": StoreApi,
        "$another-fake?": AnotherFakeApi,
        "user": UserApi,
    }
)
