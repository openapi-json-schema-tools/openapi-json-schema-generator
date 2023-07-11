# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Discriminator: typing_extensions.TypeAlias = schemas.StrSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "discriminator": typing.Type[Discriminator],
    }
)


class AbstractStepMessageDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def description(self) -> schemas.OUTPUT_BASE_TYPES:
        return self.__getitem__("description")
    
    @property
    def discriminator(self) -> str:
        return self.__getitem__("discriminator")
    
    @property
    def sequenceNumber(self) -> schemas.OUTPUT_BASE_TYPES:
        return self.__getitem__("sequenceNumber")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["description"]) -> schemas.OUTPUT_BASE_TYPES:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["discriminator"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sequenceNumber"]) -> schemas.OUTPUT_BASE_TYPES:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["description"],
            typing_extensions.Literal["discriminator"],
            typing_extensions.Literal["sequenceNumber"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: AbstractStepMessageDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return AbstractStepMessage.validate(arg, configuration=configuration)
AbstractStepMessageDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class AbstractStepMessage(
    schemas.DictSchema[AbstractStepMessageDict]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    Abstract Step
    """
    types: typing.FrozenSet[typing.Type] = frozenset({
        schemas.immutabledict,
    })
    required: typing.FrozenSet[str] = frozenset({
        "description",
        "discriminator",
        "sequenceNumber",
    })
    discriminator: typing.Mapping[str, typing.Mapping[str, typing.Type[schemas.Schema]]] = dataclasses.field(
        default_factory=lambda: {
            'discriminator': {
                'AbstractStepMessage': AbstractStepMessage,
            }
        }
    )
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    any_of: AnyOf = dataclasses.field(default_factory=lambda: schemas.tuple_to_instance(AnyOf)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: AbstractStepMessageDict,
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            AbstractStepMessageDictInput,
            AbstractStepMessageDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> AbstractStepMessageDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
AnyOf = typing.Tuple[
    typing.Type[AbstractStepMessage],
]
