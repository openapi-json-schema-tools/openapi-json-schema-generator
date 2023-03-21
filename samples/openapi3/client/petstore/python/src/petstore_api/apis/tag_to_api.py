import typing
import typing_extensions

from petstore_api.apis.tags.pet_api import PetApi
from petstore_api.apis.tags.store_api import StoreApi
from petstore_api.apis.tags.default_api import DefaultApi
from petstore_api.apis.tags.fake_api import FakeApi
from petstore_api.apis.tags.user_api import UserApi
from petstore_api.apis.tags.fake_classname_tags123_api import FakeClassnameTags123Api
from petstore_api.apis.tags.another_fake_api import AnotherFakeApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        "pet": typing.Type[PetApi],
        "store": typing.Type[StoreApi],
        "default": typing.Type[DefaultApi],
        "fake": typing.Type[FakeApi],
        "user": typing.Type[UserApi],
        "fake_classname_tags 123#$%^": typing.Type[FakeClassnameTags123Api],
        "$another-fake?": typing.Type[AnotherFakeApi],
    }
)

tag_to_api = TagToApi(
    {
        "pet": PetApi,
        "store": StoreApi,
        "default": DefaultApi,
        "fake": FakeApi,
        "user": UserApi,
        "fake_classname_tags 123#$%^": FakeClassnameTags123Api,
        "$another-fake?": AnotherFakeApi,
    }
)
