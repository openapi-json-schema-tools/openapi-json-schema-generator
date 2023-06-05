# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class NullableMessage(
    schemas.NoneBase,
    schemas.StrBase,
    schemas.Schema[schemas.T],
    schemas.NoneStrMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            str,
        })


    def __new__(
        cls,
        arg_: typing.Union[
            None,
            str
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> NullableMessage[
        typing.Union[
            schemas.NoneClass,
            str
        ]
    ]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            NullableMessage[
                typing.Union[
                    schemas.NoneClass,
                    str
                ]
            ],
            inst
        )
        return inst



class HealthCheckResult(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["NullableMessage"]) -> NullableMessage[typing.Union[
        schemas.NoneClass,
        str
    ]]: ...
    
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
            typing_extensions.Literal["NullableMessage"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        NullableMessage: typing.Union[
            NullableMessage[typing.Union[
                schemas.NoneClass,
                str
            ]],
            schemas.Unset,
            None,
            str
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
    ) -> HealthCheckResult[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            NullableMessage=NullableMessage,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            HealthCheckResult[frozendict.frozendict],
            inst
        )
        return inst

Properties = typing_extensions.TypedDict(
    'HealthCheckResultProperties',
    {
        "NullableMessage": typing.Type[NullableMessage],
    }
)
