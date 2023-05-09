# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.schema_imports import *


class _200Response(
    schemas.AnyTypeSchema,
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    model with an invalid class name for python, starts with a number
    """


    class Schema_:
        # any type
        
        class Properties:
            Name = schemas.Int32Schema
            _Class = schemas.StrSchema
            __annotations__ = {
                "name": Name,
                "class": _Class,
            }

    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> Schema_.Properties.Name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["class"]) -> Schema_.Properties._Class: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["name"],
            typing_extensions.Literal["class"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

