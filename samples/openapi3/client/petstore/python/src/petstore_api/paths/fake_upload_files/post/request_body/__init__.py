# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import typing
import typing_extensions

from petstore_api import api_client, exceptions
from .content.multipart_form_data import schema as multipart_form_data_schema

class RequestBody(api_client.RequestBody):


    class __MultipartFormDataMediaType(api_client.MediaType):
        schema: typing.Type[multipart_form_data_schema.Schema] = multipart_form_data_schema.Schema
    __Content = typing_extensions.TypedDict(
        '__Content',
        {
            'multipart/form-data': typing.Type[__MultipartFormDataMediaType],
        }
    )
    content: __Content = {
        'multipart/form-data': __MultipartFormDataMediaType,
    }
