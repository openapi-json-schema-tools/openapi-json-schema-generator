# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class ArrayOfEnums(
    schemas.ListSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({tuple})
        
        @staticmethod
        def items():
            return string_enum.StringEnum

    def __new__(
        cls,
        arg_: typing.Sequence[
            typing.Union[
                string_enum.StringEnum[typing.Union[
                    schemas.NoneClass,
                    str
                ]],
                None,
                str
            ]
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> ArrayOfEnums[tuple]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            ArrayOfEnums[tuple],
            inst
        )
        return inst

    def __getitem__(self, name: int) -> string_enum.StringEnum[typing.Union[
        schemas.NoneClass,
        str
    ]]:
        return super().__getitem__(name)


from petstore_api.components.schema import string_enum
