# coding: utf-8
"""
    security-test
    No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)  # noqa: E501
    The version of the OpenAPI document: 1.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import abc
import dataclasses
import typing


@dataclasses.dataclass
class Server(abc.ABC):
    _url: str
    variables: typing.Optional[typing.Dict[str, str]] = None
    variable_schemas: typing.Optional[typing.Dict[str, typing.Type['schemas.Schema']]] = None
    url: str = dataclasses.field(init=False)

    def __post_init__(self):
        if not self.variable_schemas:
            self.url = self._url
            return
        url = self._url
        for (key, schema) in self.variable_schemas.items():
            if self.variables and key in self.variables:
                value = self.variables[key]
                cast_value = schema(value)
            else:
                cast_value = schema.Schema_.default
            url = url.replace("{" + key + "}", cast_value)
        self.url = url

from this_package import schemas
