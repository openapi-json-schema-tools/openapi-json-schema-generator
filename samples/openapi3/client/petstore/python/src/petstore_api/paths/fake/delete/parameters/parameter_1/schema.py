# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.schema_imports import *


class Schema(
    schemas.StrSchema
):


    class Schema_:
        types = {
            str,
        }
        enum_value_to_name = {
            "true": "TRUE",
            "false": "FALSE",
        }
    
    @schemas.classproperty
    def TRUE(cls):
        return cls("true")
    
    @schemas.classproperty
    def FALSE(cls):
        return cls("false")
