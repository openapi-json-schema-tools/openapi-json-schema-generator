import typing
import typing_extensions

from petstore_api.apis.tags.user_api import UserApi
from petstore_api.apis.tags.fake_classname_tags123_api import FakeClassnameTags123Api
from petstore_api.apis.tags.store_api import StoreApi
from petstore_api.apis.tags.pet_api import PetApi
from petstore_api.apis.tags.another_fake_api import AnotherFakeApi
from petstore_api.apis.tags.default_api import DefaultApi
from petstore_api.apis.tags.fake_api import FakeApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        "user": typing.Type[UserApi],
        "fake_classname_tags 123#$%^": typing.Type[FakeClassnameTags123Api],
        "store": typing.Type[StoreApi],
        "pet": typing.Type[PetApi],
        "$another-fake?": typing.Type[AnotherFakeApi],
        "default": typing.Type[DefaultApi],
        "fake": typing.Type[FakeApi],
    }
)

tag_to_api = TagToApi(
    {
        "user": UserApi,
        "fake_classname_tags 123#$%^": FakeClassnameTags123Api,
        "store": StoreApi,
        "pet": PetApi,
        "$another-fake?": AnotherFakeApi,
        "default": DefaultApi,
        "fake": FakeApi,
    }
)
