# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema[U]
Cultivar: typing_extensions.TypeAlias = schemas.StrSchema[U]
Mealy: typing_extensions.TypeAlias = schemas.BoolSchema[U]
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "cultivar": typing.Type[Cultivar],
        "mealy": typing.Type[Mealy],
    }
)


class AppleReq(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        required: typing.FrozenSet[str] = frozenset({
            "cultivar",
        })
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
        additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    
    @property
    def cultivar(self) -> Cultivar[str]:
        return self.__getitem__("cultivar")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cultivar"]) -> Cultivar[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["mealy"]) -> Mealy[schemas.BoolClass]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["cultivar"],
            typing_extensions.Literal["mealy"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        cultivar: typing.Union[
            Cultivar[str],
            str
        ],
        mealy: typing.Union[
            Mealy[schemas.BoolClass],
            schemas.Unset,
            bool
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> AppleReq[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            cultivar=cultivar,
            mealy=mealy,
            configuration_=configuration_,
        )
        inst = typing.cast(
            AppleReq[frozendict.frozendict],
            inst
        )
        return inst

