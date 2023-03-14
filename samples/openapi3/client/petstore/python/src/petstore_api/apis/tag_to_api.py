import typing
import typing_extensions

from petstore_api.apis.tags.user_api import UserApi
from petstore_api.apis.tags.store_api import StoreApi
from petstore_api.apis.tags.fake_classname_tags123_api import FakeClassnameTags123Api
from petstore_api.apis.tags.pet_api import PetApi
from petstore_api.apis.tags.default_api import DefaultApi
from petstore_api.apis.tags.another_fake_api import AnotherFakeApi
from petstore_api.apis.tags.fake_api import FakeApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        "user": typing.Type[UserApi],
        "store": typing.Type[StoreApi],
        "fake_classname_tags 123#$%^": typing.Type[FakeClassnameTags123Api],
        "pet": typing.Type[PetApi],
        "default": typing.Type[DefaultApi],
        "$another-fake?": typing.Type[AnotherFakeApi],
        "fake": typing.Type[FakeApi],
    }
)

tag_to_api = TagToApi(
    {
        "user": UserApi,
        "store": StoreApi,
        "fake_classname_tags 123#$%^": FakeClassnameTags123Api,
        "pet": PetApi,
        "default": DefaultApi,
        "$another-fake?": AnotherFakeApi,
        "fake": FakeApi,
    }
)
