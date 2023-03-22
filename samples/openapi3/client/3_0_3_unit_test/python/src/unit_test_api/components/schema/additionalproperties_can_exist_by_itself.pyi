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


class AdditionalpropertiesCanExistByItself(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        AdditionalProperties = schemas.BoolSchema
    
    def __getitem__(self, name: str) -> Schema_.AdditionalProperties:
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    def get_item_(self, name: str) -> Schema_.AdditionalProperties:
        return super().get_item_(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict, ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[Schema_.AdditionalProperties, bool, ],
    ) -> 'AdditionalpropertiesCanExistByItself':
        return super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
