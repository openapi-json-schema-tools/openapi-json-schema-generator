# coding: utf-8
"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import dataclasses
import typing

import urllib3

from petstore_api import schemas


@dataclasses.dataclass(frozen=True)
class ApiResponse:
    response: urllib3.HTTPResponse
    body: typing.Union[schemas.Unset, schemas.OUTPUT_BASE_TYPES]
    headers: typing.Union[schemas.Unset, typing.Mapping[str, schemas.OUTPUT_BASE_TYPES]]


@dataclasses.dataclass(frozen=True)
class ApiResponseWithoutDeserialization(ApiResponse):
    response: urllib3.HTTPResponse
    body: schemas.Unset = schemas.unset
    headers: schemas.Unset = schemas.unset
