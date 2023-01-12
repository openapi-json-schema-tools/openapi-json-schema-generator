# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import typing
import typing_extensions

from unit_test_api import api_client, exceptions

from unit_test_api.components.schema import minitems_validation

class RequestBody(api_client.RequestBody):


    class __ApplicationJsonMediaType(api_client.MediaType):
        schema: typing.Type[minitems_validation.MinitemsValidation] = minitems_validation.MinitemsValidation
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
