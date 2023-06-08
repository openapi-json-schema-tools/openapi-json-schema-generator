# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Amount: typing_extensions.TypeAlias = schemas.DecimalSchema[U]


class Money(
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
            "amount",
            "currency",
        })
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @property
    def amount(self) -> Amount[str]:
        return self.__getitem__("amount")
    
    @property
    def currency(self) -> currency.Currency[str]:
        return self.__getitem__("currency")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["amount"]) -> Amount[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["currency"]) -> currency.Currency[str]: ...
    
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
            typing_extensions.Literal["amount"],
            typing_extensions.Literal["currency"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg_: typing.Union[
            DictInput,
            typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA],
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> Money[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            Money[frozendict.frozendict],
            inst
        )
        return inst


from petstore_api.components.schema import currency
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "amount": typing.Type[Amount],
        "currency": typing.Type[currency.Currency],
    }
)
DictInput = typing_extensions.TypedDict(
    'DictInput',
    {
        "amount": typing.Union[
            Amount[str],
            str
        ],
        "currency": typing.Union[
            currency.Currency[str],
            str
        ],
    }
)
