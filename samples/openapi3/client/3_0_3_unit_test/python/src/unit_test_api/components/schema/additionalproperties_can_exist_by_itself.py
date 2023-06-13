# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *

AdditionalProperties: typing_extensions.TypeAlias = schemas.BoolSchema[U]
DictInput = typing.Mapping[
    str,
    typing.Union[
        AdditionalProperties[schemas.BoolClass],
        bool
    ],
]


class AdditionalpropertiesCanExistByItself(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    
    def __getitem__(self, name: str) -> AdditionalProperties[schemas.BoolClass]:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg: typing.Union[
            DictInput,
            AdditionalpropertiesCanExistByItself[frozendict.frozendict],
        ],
        configuration: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> AdditionalpropertiesCanExistByItself[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg,
            configuration=configuration,
        )
        inst = typing.cast(
            AdditionalpropertiesCanExistByItself[frozendict.frozendict],
            inst
        )
        return inst

