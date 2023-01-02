import typing_extensions

from petstore_api.apis.tags.pet_api import PetApi
from petstore_api.apis.tags.store_api import StoreApi
from petstore_api.apis.tags.user_api import UserApi
from petstore_api.apis.tags.another_fake_api import AnotherFakeApi
from petstore_api.apis.tags.default_api import DefaultApi
from petstore_api.apis.tags.fake_api import FakeApi
from petstore_api.apis.tags.fake_classname_tags123_api import FakeClassnameTags123Api

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        "pet": PetApi,
        "store": StoreApi,
        "user": UserApi,
        "$another-fake?": AnotherFakeApi,
        "default": DefaultApi,
        "fake": FakeApi,
        "fake_classname_tags 123#$%^": FakeClassnameTags123Api,
    }
)

tag_to_api = TagToApi(
    {
        "pet": PetApi,
        "store": StoreApi,
        "user": UserApi,
        "$another-fake?": AnotherFakeApi,
        "default": DefaultApi,
        "fake": FakeApi,
        "fake_classname_tags 123#$%^": FakeClassnameTags123Api,
    }
)
