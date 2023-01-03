# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
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

from unit_test_api import schemas  # noqa: F401


class NestedItems(
    schemas.ListSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {tuple}
        
        
        class Items(
            schemas.ListSchema
        ):
        
        
            class Schema_:
                types = {tuple}
                
                
                class Items(
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
                                arg_: typing.Union[typing.Tuple[typing.Union[Schema_.Items, decimal.Decimal, int, float, ]], typing.List[typing.Union[Schema_.Items, decimal.Decimal, int, float, ]]],
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
                        arg_: typing.Union[typing.Tuple[typing.Union[Schema_.Items, list, tuple, ]], typing.List[typing.Union[Schema_.Items, list, tuple, ]]],
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
                arg_: typing.Union[typing.Tuple[typing.Union[Schema_.Items, list, tuple, ]], typing.List[typing.Union[Schema_.Items, list, tuple, ]]],
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
        arg_: typing.Union[typing.Tuple[typing.Union[Schema_.Items, list, tuple, ]], typing.List[typing.Union[Schema_.Items, list, tuple, ]]],
        configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
    ) -> 'NestedItems':
        return super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )

    def __getitem__(self, i: int) -> Schema_.Items:
        return super().__getitem__(i)