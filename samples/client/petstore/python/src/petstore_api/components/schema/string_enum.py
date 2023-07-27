# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



class StringEnumEnums:

    @schemas.classproperty
    def PLACED(cls) -> typing_extensions.Literal["placed"]:
        return StringEnum.validate("placed")

    @schemas.classproperty
    def APPROVED(cls) -> typing_extensions.Literal["approved"]:
        return StringEnum.validate("approved")

    @schemas.classproperty
    def DELIVERED(cls) -> typing_extensions.Literal["delivered"]:
        return StringEnum.validate("delivered")

    @schemas.classproperty
    def SINGLE_QUOTED(cls) -> typing_extensions.Literal["single quoted"]:
        return StringEnum.validate("single quoted")

    @schemas.classproperty
    def MULTIPLE_LINE_FEED_LF_LINES(cls) -> typing_extensions.Literal["multiple\nlines"]:
        return StringEnum.validate("multiple\nlines")

    @schemas.classproperty
    def DOUBLE_QUOTE_LINE_FEED_LF_WITH_NEWLINE(cls) -> typing_extensions.Literal["double quote \n with newline"]:
        return StringEnum.validate("double quote \n with newline")

    @schemas.classproperty
    def NONE(cls) -> typing_extensions.Literal[None]:
        return StringEnum.validate(None)


@dataclasses.dataclass(frozen=True)
class StringEnum(
    schemas.Schema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({
        type(None),
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "placed": "PLACED",
            "approved": "APPROVED",
            "delivered": "DELIVERED",
            "single quoted": "SINGLE_QUOTED",
            "multiple\nlines": "MULTIPLE_LINE_FEED_LF_LINES",
            "double quote \n with newline": "DOUBLE_QUOTE_LINE_FEED_LF_WITH_NEWLINE",
            None: "NONE",
        }
    )
    enums = StringEnumEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: None,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> None: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["placed"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["placed"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["approved"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["approved"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["delivered"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["delivered"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["single quoted"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["single quoted"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["multiple\nlines"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["multiple\nlines"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["double quote \n with newline"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["double quote \n with newline"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["placed","approved","delivered","single quoted","multiple\nlines","double quote \n with newline",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ):
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return validated_arg
