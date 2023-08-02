# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

HasBaleen: typing_extensions.TypeAlias = schemas.BoolSchema
HasTeeth: typing_extensions.TypeAlias = schemas.BoolSchema


class ClassNameEnums:

    @schemas.classproperty
    def WHALE(cls) -> typing_extensions.Literal["whale"]:
        return ClassName.validate("whale")


@dataclasses.dataclass(frozen=True)
class ClassName(
    schemas.Schema[schemas.immutabledict, str]
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "whale": "WHALE",
        }
    )
    enums = ClassNameEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["whale"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["whale"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["whale",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        "whale",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                "whale",
            ],
            validated_arg
        )
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "hasBaleen": typing.Type[HasBaleen],
        "hasTeeth": typing.Type[HasTeeth],
        "className": typing.Type[ClassName],
    }
)


class WhaleDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
        "className",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "hasBaleen",
        "hasTeeth",
    })
    
    @property
    def className(self) -> typing_extensions.Literal["whale"]:
        return typing.cast(
            typing_extensions.Literal["whale"],
            self.__getitem__("className")
        )
    
    @property
    def hasBaleen(self) -> typing.Union[bool, schemas.Unset]:
        val = self.get("hasBaleen", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            bool,
            val
        )
    
    @property
    def hasTeeth(self) -> typing.Union[bool, schemas.Unset]:
        val = self.get("hasTeeth", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            bool,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)

    @staticmethod
    def from_dict_(
        arg: WhaleDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> WhaleDict:
        return Whale.validate(arg, configuration=configuration)
    
    def __new__(
        cls,
        className: typing.Union[
            typing_extensions.Literal["whale"],
        ],
        hasBaleen: typing.Union[
            bool,
            schemas.Unset,
        ] = schemas.unset,
        hasTeeth: typing.Union[
            bool,
            schemas.Unset,
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_ = {
            "className": className,
        }
        for key, val in (
            ("hasBaleen", hasBaleen),
            ("hasTeeth", hasTeeth),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key] = val
        arg_.update(kwargs)
        return Whale.validate(arg_, configuration=configuration_)
WhaleDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class Whale(
    schemas.Schema[WhaleDict, tuple]
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
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: WhaleDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            WhaleDictInput,
            WhaleDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> WhaleDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

