# coding: utf-8
"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
import abc
import dataclasses
import typing


@dataclasses.dataclass
class ServerWithoutVariables(abc.ABC):
    url: str


@dataclasses.dataclass
class ServerWithVariables(abc.ABC):
    _url: str
    variables: schemas.immutabledict[str, str]
    variables_schema: typing.Type[schemas.DictSchema]
    url: str = dataclasses.field(init=False)

    def __post_init__(self):
        url = self._url
        assert isinstance (self.variables, self.variables_schema().type_to_output_cls[schemas.immutabledict])
        for (key, value) in self.variables.items():
            url = url.replace("{" + key + "}", value)
        self.url = url

from petstore_api import schemas
