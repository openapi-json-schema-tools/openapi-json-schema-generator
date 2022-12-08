# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
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

from petstore_api import schemas  # noqa: F401


class AdditionalPropertiesWithArrayOfEnums(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        
        class additional_properties(
            schemas.ListSchema
        ):
        
        
            class MetaOapg:
                types = {tuple}
                
                @staticmethod
                def items() -> typing.Type['enum_class.EnumClass']:
                    return enum_class.EnumClass
        
            def __new__(
                cls,
                _arg: typing.Union[typing.Tuple['enum_class.EnumClass'], typing.List['enum_class.EnumClass']],
                _configuration: typing.Optional[schemas.Configuration] = None,
            ) -> 'additional_properties':
                return super().__new__(
                    cls,
                    _arg,
                    _configuration=_configuration,
                )
        
            def __getitem__(self, i: int) -> 'enum_class.EnumClass':
                return super().__getitem__(i)
    # no properties or required properties but still have addProps
    # type hints for addProp __getitem__
    def __getitem__(self, name: str) -> MetaOapg.additional_properties
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    def get_item_oapg(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, list, tuple, ],
    ) -> 'AdditionalPropertiesWithArrayOfEnums':
        return super().__new__(
            cls,
            *_args,
            _configuration=_configuration,
            **kwargs,
        )

from petstore_api.components.schema import enum_class
