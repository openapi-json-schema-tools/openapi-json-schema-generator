# coding: utf-8
"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import abc
import dataclasses
import typing_extensions

from petstore_api import schemas


@dataclasses.dataclass
class Server(abc.ABC):
    _url: str
    variables: typing.Optional[typing_extensions.TypedDict[str, str]] = None
    variable_schemas: typing.Optional[typing_extensions.TypedDict[str, typing.Type[schemas.Schema]]] = None
    url: str = dataclasses.field(init=False)

    def __post_init__(self):
        if not self.variable_schemas:
            self.url = self._url
            return
        url = self._url
        for (key, schema) in self.variable_schemas.items():
            if key in self.variables:
                value = self.variables[key]
                cast_value = schema(value)
            else:
                cast_value = schema(schema.Schema_.default)
            url = url.replace("{" + key + "}", cast_value)
        self.url = url
