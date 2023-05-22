# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *


class RefInAdditionalproperties(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {frozendict.frozendict}
        
        @staticmethod
        def additional_properties() -> typing.Type[property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference]:
            return property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference
    
    def __getitem__(self, name: str) -> property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union['property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference', dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader],
    ) -> RefInAdditionalproperties[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            RefInAdditionalproperties[frozendict.frozendict],
            inst
        )
        return inst

from unit_test_api.components.schema import property_named_ref_that_is_not_a_reference
