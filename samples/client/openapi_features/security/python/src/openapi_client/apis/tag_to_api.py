import typing
import typing_extensions

from openapi_client.apis.tags.default_api import DefaultApi

TagToApi = typing.TypedDict(
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
