# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

AdditionalProperties: typing_extensions.TypeAlias = schemas.StrSchema[U]
DictInput = typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            AdditionalProperties[str],
            str
        ],
        typing.Union[
            AdditionalProperties[str],
            str
        ],
        AdditionalProperties[str],
        str
    ]
]


class ReqPropsFromExplicitAddProps(
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
            "invalid-name",
            "validName",
        })
        additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    
    @property
    def validName(self) -> AdditionalProperties[str]:
        return self.__getitem__("validName")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["invalid-name"]) -> AdditionalProperties[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["validName"]) -> AdditionalProperties[str]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> AdditionalProperties[str]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["invalid-name"],
            typing_extensions.Literal["validName"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg_: typing.Union[
            DictInput,
            ReqPropsFromExplicitAddProps[frozendict.frozendict],
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> ReqPropsFromExplicitAddProps[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            ReqPropsFromExplicitAddProps[frozendict.frozendict],
            inst
        )
        return inst

