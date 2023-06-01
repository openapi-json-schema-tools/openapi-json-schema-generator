# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Items: typing_extensions.TypeAlias = schemas.NumberSchema[U]


class ArrayNumber(
    schemas.ListSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({tuple})
        
        @staticmethod
        def items():
            return Items

    def __new__(
        cls,
        arg_: typing.Sequence[
            typing.Union[
                Items[decimal.Decimal],
                decimal.Decimal,
                int,
                float
            ]
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> ArrayNumber[tuple]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            ArrayNumber[tuple],
            inst
        )
        return inst

    def __getitem__(self, name: int) -> Items[decimal.Decimal]:
        return super().__getitem__(name)



class ArrayOfNumberOnly(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        properties: ArrayOfNumberOnlyProperties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(ArrayOfNumberOnlyProperties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ArrayNumber"]) -> ArrayNumber[tuple]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["ArrayNumber"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        ArrayNumber: typing.Union[
            ArrayNumber[tuple],
            schemas.Unset,
            list,
            tuple
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            dict,
            frozendict.frozendict,
            list,
            tuple,
            decimal.Decimal,
            float,
            int,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            bool,
            None,
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.Schema
        ],
    ) -> ArrayOfNumberOnly[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            ArrayNumber=ArrayNumber,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            ArrayOfNumberOnly[frozendict.frozendict],
            inst
        )
        return inst

ArrayOfNumberOnlyProperties = typing_extensions.TypedDict(
    'ArrayOfNumberOnlyProperties',
    {
        "ArrayNumber": typing.Type[ArrayNumber],
    }
)
