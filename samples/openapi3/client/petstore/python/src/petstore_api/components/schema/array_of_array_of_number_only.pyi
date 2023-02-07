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


class ArrayOfArrayOfNumberOnly(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        
        class Properties:
            
            
            class ArrayArrayNumber(
                schemas.ListSchema
            ):
            
            
                class Schema_:
                    types = {tuple}
                    
                    
                    class Items(
                        schemas.ListSchema
                    ):
                    
                    
                        class Schema_:
                            types = {tuple}
                            Items = schemas.NumberSchema
                    
                        def __new__(
                            cls,
                            arg_: typing.Union[
                                typing.Tuple[
                                    typing.Union[Schema_.Items, decimal.Decimal, int, float, ], ...
                                ],
                                typing.List[
                                    typing.Union[Schema_.Items, decimal.Decimal, int, float, ]
                                ],
                            ],
                            configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                        ) -> 'Items':
                            return super().__new__(
                                cls,
                                arg_,
                                configuration_=configuration_,
                            )
                    
                        def __getitem__(self, i: int) -> Schema_.Items:
                            return super().__getitem__(i)
            
                def __new__(
                    cls,
                    arg_: typing.Union[
                        typing.Tuple[
                            typing.Union[Schema_.Items, list, tuple, ], ...
                        ],
                        typing.List[
                            typing.Union[Schema_.Items, list, tuple, ]
                        ],
                    ],
                    configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                ) -> 'ArrayArrayNumber':
                    return super().__new__(
                        cls,
                        arg_,
                        configuration_=configuration_,
                    )
            
                def __getitem__(self, i: int) -> Schema_.Items:
                    return super().__getitem__(i)
            __annotations__ = {
                "ArrayArrayNumber": ArrayArrayNumber,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ArrayArrayNumber"]) -> Schema_.Properties.ArrayArrayNumber: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["ArrayArrayNumber"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["ArrayArrayNumber"]) -> typing.Union[Schema_.Properties.ArrayArrayNumber, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_(
        self,
        name: typing.Union[
            typing_extensions.Literal["ArrayArrayNumber"],
            str
        ]
    ):
        return super().get_item_(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict, ],
        ArrayArrayNumber: typing.Union[Schema_.Properties.ArrayArrayNumber, list, tuple, schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'ArrayOfArrayOfNumberOnly':
        return super().__new__(
            cls,
            *args_,
            ArrayArrayNumber=ArrayArrayNumber,
            configuration_=configuration_,
            **kwargs,
        )
