# coding: utf-8
"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
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

from petstore_api import schemas