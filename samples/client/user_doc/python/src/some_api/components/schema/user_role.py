# coding: utf-8

"""
    NetHSM
    All endpoints expect exactly the specified JSON. Additional properties will cause a Bad Request Error (400). All HTTP errors contain a JSON structure with an explanation of type string. All [base64](https://tools.ietf.org/html/rfc4648#section-4) encoded values are Big Endian.   # noqa: E501
    The version of the OpenAPI document: v1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from some_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



class UserRoleEnums:

    @schemas.classproperty
    def ADMINISTRATOR(cls) -> typing.Literal["Administrator"]:
        return UserRole.validate("Administrator")

    @schemas.classproperty
    def OPERATOR(cls) -> typing.Literal["Operator"]:
        return UserRole.validate("Operator")

    @schemas.classproperty
    def METRICS(cls) -> typing.Literal["Metrics"]:
        return UserRole.validate("Metrics")

    @schemas.classproperty
    def BACKUP(cls) -> typing.Literal["Backup"]:
        return UserRole.validate("Backup")


@dataclasses.dataclass(frozen=True)
class UserRole(
    schemas.Schema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "Administrator": "ADMINISTRATOR",
            "Operator": "OPERATOR",
            "Metrics": "METRICS",
            "Backup": "BACKUP",
        }
    )
    enums = UserRoleEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal["Administrator"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["Administrator"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal["Operator"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["Operator"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal["Metrics"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["Metrics"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal["Backup"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["Backup"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["Administrator","Operator","Metrics","Backup",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[
        "Administrator",
        "Operator",
        "Metrics",
        "Backup",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing.Literal[
                "Administrator",
                "Operator",
                "Metrics",
                "Backup",
            ],
            validated_arg
        )
