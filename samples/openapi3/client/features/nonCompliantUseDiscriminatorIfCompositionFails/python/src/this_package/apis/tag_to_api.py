import typing
import typing_extensions

from this_package.apis.tags.default_api import DefaultApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        "default": typing.Type[DefaultApi],
    }
)

tag_to_api = TagToApi(
    {
        "default": DefaultApi,
    }
)
