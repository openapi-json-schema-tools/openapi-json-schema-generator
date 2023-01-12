# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import typing
import typing_extensions

from petstore_api import api_client, exceptions

from petstore_api.components.schema import client

class Client(api_client.RequestBody):


    class __ApplicationJsonMediaType(api_client.MediaType):
        schema: typing.Type[client.Client] = client.Client
    __Content = typing_extensions.TypedDict(
        '__Content',
        {
            'application/json': __ApplicationJsonMediaType,
        }
    )
    content: __Content = {
        'application/json': __ApplicationJsonMediaType,
    }
    required = True
