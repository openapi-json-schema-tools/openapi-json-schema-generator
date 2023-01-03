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


class RefInAdditionalproperties(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        
        @staticmethod
        def additional_properties() -> typing.Type['property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference']:
            return property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference
    
    def __getitem__(self, name: str) -> 'property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference':
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    def get_item_(self, name: str) -> 'property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference':
        return super().get_item_(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict, ],
        configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
        **kwargs: 'property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference',
    ) -> 'RefInAdditionalproperties':
        return super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )

from unit_test_api.components.schema import property_named_ref_that_is_not_a_reference