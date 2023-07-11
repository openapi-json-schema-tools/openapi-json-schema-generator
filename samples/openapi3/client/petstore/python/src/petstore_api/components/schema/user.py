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
Username: typing_extensions.TypeAlias = schemas.StrSchema
FirstName: typing_extensions.TypeAlias = schemas.StrSchema
LastName: typing_extensions.TypeAlias = schemas.StrSchema
Email: typing_extensions.TypeAlias = schemas.StrSchema
Password: typing_extensions.TypeAlias = schemas.StrSchema
Phone: typing_extensions.TypeAlias = schemas.StrSchema
UserStatus: typing_extensions.TypeAlias = schemas.Int32Schema
ObjectWithNoDeclaredProps: typing_extensions.TypeAlias = schemas.DictSchema


@dataclasses.dataclass(frozen=True)
class ObjectWithNoDeclaredPropsNullable(
    schemas.Schema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        schemas.none_type_,
        schemas.immutabledict,
    })

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
        arg: typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> schemas.immutabledict[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ):
        return super().validate_base(
            arg,
            configuration=configuration,
        )
AnyTypeProp: typing_extensions.TypeAlias = schemas.AnyTypeSchema
_Not: typing_extensions.TypeAlias = schemas.NoneSchema


@dataclasses.dataclass(frozen=True)
class AnyTypeExceptNullProp(
    schemas.AnyTypeSchema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    # any type
    not_: typing.Type[_Not] = dataclasses.field(default_factory=lambda: _Not) # type: ignore

AnyTypePropNullable: typing_extensions.TypeAlias = schemas.AnyTypeSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "id": typing.Type[Id],
        "username": typing.Type[Username],
        "firstName": typing.Type[FirstName],
        "lastName": typing.Type[LastName],
        "email": typing.Type[Email],
        "password": typing.Type[Password],
        "phone": typing.Type[Phone],
        "userStatus": typing.Type[UserStatus],
        "objectWithNoDeclaredProps": typing.Type[ObjectWithNoDeclaredProps],
        "objectWithNoDeclaredPropsNullable": typing.Type[ObjectWithNoDeclaredPropsNullable],
        "anyTypeProp": typing.Type[AnyTypeProp],
        "anyTypeExceptNullProp": typing.Type[AnyTypeExceptNullProp],
        "anyTypePropNullable": typing.Type[AnyTypePropNullable],
    }
)


class UserDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["username"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["firstName"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lastName"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["email"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["password"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["phone"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["userStatus"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["objectWithNoDeclaredProps"]) -> schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["objectWithNoDeclaredPropsNullable"]) -> typing.Union[
        None,
        schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
    ]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypeProp"]) -> schemas.OUTPUT_BASE_TYPES:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypeExceptNullProp"]) -> schemas.OUTPUT_BASE_TYPES:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypePropNullable"]) -> schemas.OUTPUT_BASE_TYPES:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["id"],
            typing_extensions.Literal["username"],
            typing_extensions.Literal["firstName"],
            typing_extensions.Literal["lastName"],
            typing_extensions.Literal["email"],
            typing_extensions.Literal["password"],
            typing_extensions.Literal["phone"],
            typing_extensions.Literal["userStatus"],
            typing_extensions.Literal["objectWithNoDeclaredProps"],
            typing_extensions.Literal["objectWithNoDeclaredPropsNullable"],
            typing_extensions.Literal["anyTypeProp"],
            typing_extensions.Literal["anyTypeExceptNullProp"],
            typing_extensions.Literal["anyTypePropNullable"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: UserDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return User.validate(arg, configuration=configuration)
UserDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class User(
    schemas.Schema[UserDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: UserDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            UserDictInput,
            UserDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> UserDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

