# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401


class JSONPatchRequest(
    schemas.ListSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {tuple}
        
        
        class Items(
            schemas.AnyTypeSchema,
        ):
        
        
            class Schema_:
                # any type
                
                class OneOf:
                
                    @staticmethod
                    def one_of0() -> typing.Type['json_patch_request_add_replace_test.JSONPatchRequestAddReplaceTest']:
                        return json_patch_request_add_replace_test.JSONPatchRequestAddReplaceTest
                
                    @staticmethod
                    def one_of1() -> typing.Type['json_patch_request_remove.JSONPatchRequestRemove']:
                        return json_patch_request_remove.JSONPatchRequestRemove
                
                    @staticmethod
                    def one_of2() -> typing.Type['json_patch_request_move_copy.JSONPatchRequestMoveCopy']:
                        return json_patch_request_move_copy.JSONPatchRequestMoveCopy
                    classes = [
                        one_of0,
                        one_of1,
                        one_of2,
                    ]
        
        
            def __new__(
                cls,
                *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
            ) -> 'Items':
                return super().__new__(
                    cls,
                    *args_,
                    configuration_=configuration_,
                    **kwargs,
                )

    def __new__(
        cls,
        arg_: typing.Union[typing.Tuple[typing.Union[Schema_.Items, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ]], typing.List[typing.Union[Schema_.Items, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ]]],
        configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
    ) -> 'JSONPatchRequest':
        return super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )

    def __getitem__(self, i: int) -> Schema_.Items:
        return super().__getitem__(i)
