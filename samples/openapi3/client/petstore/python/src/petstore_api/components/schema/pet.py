# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Id: typing_extensions.TypeAlias = schemas.Int64Schema
Name: typing_extensions.TypeAlias = schemas.StrSchema
Items: typing_extensions.TypeAlias = schemas.StrSchema


class PhotoUrlsTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> str:
        return super().__getitem__(name)

    def __new__(cls, arg: PhotoUrlsTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return PhotoUrls.validate(arg, configuration=configuration)
PhotoUrlsTupleInput = typing.Sequence[
    str,
]


@dataclasses.dataclass(frozen=True)
class PhotoUrls(
    schemas.ListSchema[PhotoUrlsTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: PhotoUrlsTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            PhotoUrlsTupleInput,
            PhotoUrlsTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> PhotoUrlsTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


class StatusEnums:

    @schemas.classproperty
    def AVAILABLE(cls) -> str:
        return Status.validate("available")

    @schemas.classproperty
    def PENDING(cls) -> str:
        return Status.validate("pending")

    @schemas.classproperty
    def SOLD(cls) -> str:
        return Status.validate("sold")


@dataclasses.dataclass(frozen=True)
class Status(
    schemas.Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "available": "AVAILABLE",
            "pending": "PENDING",
            "sold": "SOLD",
        }
    )
    enums = StatusEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["available"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["available"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["pending"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["pending"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["sold"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["sold"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["available","pending","sold",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        "available",
        "pending",
        "sold",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                "available",
                "pending",
                "sold",
            ],
            validated_arg
        )

from petstore_api.components.schema import category
from petstore_api.components.schema import tag


class TagsTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> tag.TagDict:
        return super().__getitem__(name)

    def __new__(cls, arg: TagsTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Tags.validate(arg, configuration=configuration)
TagsTupleInput = typing.Sequence[
    typing.Union[
        tag.TagDict,
        dict,
        schemas.immutabledict
    ],
]


@dataclasses.dataclass(frozen=True)
class Tags(
    schemas.ListSchema[TagsTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[tag.Tag] = dataclasses.field(default_factory=lambda: tag.Tag) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: TagsTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            TagsTupleInput,
            TagsTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> TagsTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "id": typing.Type[Id],
        "category": typing.Type[category.Category],
        "name": typing.Type[Name],
        "photoUrls": typing.Type[PhotoUrls],
        "tags": typing.Type[Tags],
        "status": typing.Type[Status],
    }
)


class PetDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def name(self) -> str:
        return self.__getitem__("name")
    
    @property
    def photoUrls(self) -> PhotoUrlsTuple:
        return self.__getitem__("photoUrls")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["photoUrls"]) -> PhotoUrlsTuple:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["category"]) -> category.CategoryDict:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tags"]) -> TagsTuple:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> typing_extensions.Literal["available", "pending", "sold"]:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["name"],
            typing_extensions.Literal["photoUrls"],
            typing_extensions.Literal["id"],
            typing_extensions.Literal["category"],
            typing_extensions.Literal["tags"],
            typing_extensions.Literal["status"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: PetDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Pet.validate(arg, configuration=configuration)
PetDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class Pet(
    schemas.Schema[PetDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    Pet object that needs to be added to the store
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "name",
        "photoUrls",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: PetDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            PetDictInput,
            PetDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> PetDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

