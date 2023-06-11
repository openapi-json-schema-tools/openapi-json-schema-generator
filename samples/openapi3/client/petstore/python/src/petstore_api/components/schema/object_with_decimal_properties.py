# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Width: typing_extensions.TypeAlias = schemas.DecimalSchema[U]


class ObjectWithDecimalProperties(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["length"]) -> decimal_payload.DecimalPayload[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["width"]) -> Width[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cost"]) -> money.Money[frozendict.frozendict]: ...
    
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
            typing_extensions.Literal["length"],
            typing_extensions.Literal["width"],
            typing_extensions.Literal["cost"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg_: typing.Union[
            DictInput,
            ObjectWithDecimalProperties[frozendict.frozendict],
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> ObjectWithDecimalProperties[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            ObjectWithDecimalProperties[frozendict.frozendict],
            inst
        )
        return inst


from petstore_api.components.schema import decimal_payload
from petstore_api.components.schema import money
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "length": typing.Type[decimal_payload.DecimalPayload],
        "width": typing.Type[Width],
        "cost": typing.Type[money.Money],
    }
)
# todo optional properties mapping w/ addProps unset
