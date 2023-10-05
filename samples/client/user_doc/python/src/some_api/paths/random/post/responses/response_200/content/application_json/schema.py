# coding: utf-8

"""
    NetHSM
    All endpoints expect exactly the specified JSON. Additional properties will cause a Bad Request Error (400). All HTTP errors contain a JSON structure with an explanation of type string. All [base64](https://tools.ietf.org/html/rfc4648#section-4) encoded values are Big Endian.   # noqa: E501
    The version of the OpenAPI document: v1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""


from some_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]
from some_api.components.schema import random_data
Schema: typing_extensions.TypeAlias = random_data.RandomData
