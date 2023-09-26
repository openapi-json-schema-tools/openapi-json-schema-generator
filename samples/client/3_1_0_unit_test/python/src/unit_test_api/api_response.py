# coding: utf-8
"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import dataclasses
import typing

import urllib3

from unit_test_api import schemas


@dataclasses.dataclass
class ApiResponse:
    response: urllib3.HTTPResponse
    body: typing.Union[schemas.Unset, schemas.OUTPUT_BASE_TYPES] = schemas.unset
    headers: typing.Union[schemas.Unset, typing.Mapping[str, schemas.OUTPUT_BASE_TYPES]] = schemas.unset


@dataclasses.dataclass
class ApiResponseWithoutDeserialization(ApiResponse):
    response: urllib3.HTTPResponse
    body: schemas.Unset = schemas.unset
    headers: schemas.Unset = schemas.unset