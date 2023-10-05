# coding: utf-8

"""
    NetHSM
    All endpoints expect exactly the specified JSON. Additional properties will cause a Bad Request Error (400). All HTTP errors contain a JSON structure with an explanation of type string. All [base64](https://tools.ietf.org/html/rfc4648#section-4) encoded values are Big Endian.   # noqa: E501
    The version of the OpenAPI document: v1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from some_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

RealName: typing_extensions.TypeAlias = schemas.StrSchema

from some_api.components.schema import user_role
Properties = typing.TypedDict(
    'Properties',
    {
        "realName": typing.Type[RealName],
        "role": typing.Type[user_role.UserRole],
    }
)


class UserDataDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__: typing.FrozenSet[str] = frozenset({
        "realName",
        "role",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    
    def __new__(
        cls,
        *,
        realName: str,
        role: typing.Literal[
            "Administrator",
            "Operator",
            "Metrics",
            "Backup"
        ],
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_: typing.Dict[str, typing.Any] = {
            "realName": realName,
            "role": role,
        }
        arg_.update(kwargs)
        used_arg_ = typing.cast(UserDataDictInput, arg_)
        return UserData.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            UserDataDictInput,
            UserDataDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> UserDataDict:
        return UserData.validate(arg, configuration=configuration)
    
    @property
    def realName(self) -> str:
        return typing.cast(
            str,
            self.__getitem__("realName")
        )
    
    @property
    def role(self) -> typing.Literal["Administrator", "Operator", "Metrics", "Backup"]:
        return typing.cast(
            typing.Literal["Administrator", "Operator", "Metrics", "Backup"],
            self.__getitem__("role")
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)
UserDataDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class UserData(
    schemas.Schema[UserDataDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "realName",
        "role",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: UserDataDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            UserDataDictInput,
            UserDataDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> UserDataDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

