# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

AdditionalProperties: typing_extensions.TypeAlias = schemas.AnyTypeSchema


class TypeEnums:

    @schemas.classproperty
    def PLAINS(cls) -> typing_extensions.Literal["plains"]:
        return Type.validate("plains")

    @schemas.classproperty
    def MOUNTAIN(cls) -> typing_extensions.Literal["mountain"]:
        return Type.validate("mountain")

    @schemas.classproperty
    def GREVYS(cls) -> typing_extensions.Literal["grevys"]:
        return Type.validate("grevys")


@dataclasses.dataclass(frozen=True)
class Type(
    schemas.Schema[schemas.immutabledict, str]
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "plains": "PLAINS",
            "mountain": "MOUNTAIN",
            "grevys": "GREVYS",
        }
    )
    enums = TypeEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["plains"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["plains"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["mountain"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["mountain"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["grevys"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["grevys"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["plains","mountain","grevys",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        "plains",
        "mountain",
        "grevys",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                "plains",
                "mountain",
                "grevys",
            ],
            validated_arg
        )


class ClassNameEnums:

    @schemas.classproperty
    def ZEBRA(cls) -> typing_extensions.Literal["zebra"]:
        return ClassName.validate("zebra")


@dataclasses.dataclass(frozen=True)
class ClassName(
    schemas.Schema[schemas.immutabledict, str]
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "zebra": "ZEBRA",
        }
    )
    enums = ClassNameEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["zebra"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["zebra"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["zebra",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        "zebra",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                "zebra",
            ],
            validated_arg
        )
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "type": typing.Type[Type],
        "className": typing.Type[ClassName],
    }
)


class ZebraDict(schemas.immutabledict[str, str]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
        "className",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "type",
    })
    
    @property
    def className(self) -> typing_extensions.Literal["zebra"]:
        return typing.cast(
            typing_extensions.Literal["zebra"],
            self.__getitem__("className")
        )
    
    @property
    def type(self) -> typing.Union[typing_extensions.Literal["plains", "mountain", "grevys"], schemas.Unset]:
        val = self.get("type", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            typing_extensions.Literal["plains", "mountain", "grevys"],
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )

    @staticmethod
    def from_dict_(
        arg: ZebraDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ZebraDict:
        return Zebra.validate(arg, configuration=configuration)
    
    def __new__(
        cls,
        className: typing.Union[
            typing_extensions.Literal["zebra"],
        ],
        type: typing.Union[
            typing_extensions.Literal["plains", "mountain", "grevys"],
            schemas.Unset,
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_ = {
            "className": className,
        }
        for key, val in (
            ("type", type),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key] = val
        arg_.update(kwargs)
        return Zebra.validate(arg_, configuration=configuration_)
ZebraDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class Zebra(
    schemas.Schema[ZebraDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "className",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: ZebraDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ZebraDictInput,
            ZebraDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ZebraDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

