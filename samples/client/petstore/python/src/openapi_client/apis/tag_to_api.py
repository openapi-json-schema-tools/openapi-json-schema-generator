import typing
import typing_extensions

from openapi_client.apis.tags.fake_api import FakeApi
from openapi_client.apis.tags.another_fake_api import AnotherFakeApi
from openapi_client.apis.tags.pet_api import PetApi
from openapi_client.apis.tags.fake_classname_tags123_api import FakeClassnameTags123Api
from openapi_client.apis.tags.default_api import DefaultApi
from openapi_client.apis.tags.store_api import StoreApi
from openapi_client.apis.tags.user_api import UserApi

TagToApi = typing.TypedDict(
    'TagToApi',
    {
        "fake": typing.Type[FakeApi],
        "$another-fake?": typing.Type[AnotherFakeApi],
        "pet": typing.Type[PetApi],
        "fake_classname_tags 123#$%^": typing.Type[FakeClassnameTags123Api],
        "default": typing.Type[DefaultApi],
        "store": typing.Type[StoreApi],
        "user": typing.Type[UserApi],
    }
)

tag_to_api = TagToApi(
    {
        "fake": FakeApi,
        "$another-fake?": AnotherFakeApi,
        "pet": PetApi,
        "fake_classname_tags 123#$%^": FakeClassnameTags123Api,
        "default": DefaultApi,
        "store": StoreApi,
        "user": UserApi,
    }
)
