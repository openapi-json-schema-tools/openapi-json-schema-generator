# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Generated by: https://openapi-generator.tech
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from unit_test_api import schemas  # noqa: F401


class AnyofComplexTypes(
    schemas.AnyTypeSchema,
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        # any type
        
        class AnyOf:
            
            
            class AnyOf0(
                schemas.AnyTypeSchema,
            ):
            
            
                class MetaOapg:
                    # any type
                    required = {
                        "bar",
                    }
                    
                    class Properties:
                        Bar = schemas.IntSchema
                        __annotations__ = {
                            "bar": Bar,
                        }
            
                
                bar: MetaOapg.Properties.Bar
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["bar"]) -> MetaOapg.Properties.Bar: ...
                
                @typing.overload
                def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
                
                def __getitem__(
                    self,
                    name: typing.Union[
                        typing_extensions.Literal["bar"],
                        str
                    ]
                ):
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["bar"]) -> MetaOapg.Properties.Bar: ...
                
                @typing.overload
                def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
                
                def get_item_oapg(
                    self,
                    name: typing.Union[
                        typing_extensions.Literal["bar"],
                        str
                    ]
                ):
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    bar: typing.Union[MetaOapg.Properties.Bar, decimal.Decimal, int, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'AnyOf0':
                    return super().__new__(
                        cls,
                        *_args,
                        bar=bar,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class AnyOf1(
                schemas.AnyTypeSchema,
            ):
            
            
                class MetaOapg:
                    # any type
                    required = {
                        "foo",
                    }
                    
                    class Properties:
                        Foo = schemas.StrSchema
                        __annotations__ = {
                            "foo": Foo,
                        }
            
                
                foo: MetaOapg.Properties.Foo
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["foo"]) -> MetaOapg.Properties.Foo: ...
                
                @typing.overload
                def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
                
                def __getitem__(
                    self,
                    name: typing.Union[
                        typing_extensions.Literal["foo"],
                        str
                    ]
                ):
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["foo"]) -> MetaOapg.Properties.Foo: ...
                
                @typing.overload
                def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
                
                def get_item_oapg(
                    self,
                    name: typing.Union[
                        typing_extensions.Literal["foo"],
                        str
                    ]
                ):
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    foo: typing.Union[MetaOapg.Properties.Foo, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'AnyOf1':
                    return super().__new__(
                        cls,
                        *_args,
                        foo=foo,
                        _configuration=_configuration,
                        **kwargs,
                    )
            classes = [
                AnyOf0,
                AnyOf1,
            ]


    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'AnyofComplexTypes':
        return super().__new__(
            cls,
            *_args,
            _configuration=_configuration,
            **kwargs,
        )
