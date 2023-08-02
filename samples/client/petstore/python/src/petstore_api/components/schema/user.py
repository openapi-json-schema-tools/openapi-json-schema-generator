# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

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
        type(None),
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
        arg: typing.Mapping[str, schemas.INPUT_TYPES_ALL],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]: ...
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

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "id",
        "username",
        "firstName",
        "lastName",
        "email",
        "password",
        "phone",
        "userStatus",
        "objectWithNoDeclaredProps",
        "objectWithNoDeclaredPropsNullable",
        "anyTypeProp",
        "anyTypeExceptNullProp",
        "anyTypePropNullable",
    })
    
    @property
    def id(self) -> typing.Union[int, schemas.Unset]:
        val = self.get("id", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            int,
            val
        )
    
    @property
    def username(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("username", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def firstName(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("firstName", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def lastName(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("lastName", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def email(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("email", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def password(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("password", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def phone(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("phone", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def userStatus(self) -> typing.Union[int, schemas.Unset]:
        val = self.get("userStatus", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            int,
            val
        )
    
    @property
    def objectWithNoDeclaredProps(self) -> typing.Union[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], schemas.Unset]:
        val = self.get("objectWithNoDeclaredProps", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
            val
        )
    
    @property
    def objectWithNoDeclaredPropsNullable(self) -> typing.Union[
        typing.Union[None, schemas.Unset],
        typing.Union[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], schemas.Unset],
    ]:
        val = self.get("objectWithNoDeclaredPropsNullable", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            typing.Union[
                None,
                schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
            ],
            val
        )
    
    @property
    def anyTypeProp(self) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        val = self.get("anyTypeProp", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )
    
    @property
    def anyTypeExceptNullProp(self) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        val = self.get("anyTypeExceptNullProp", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )
    
    @property
    def anyTypePropNullable(self) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        val = self.get("anyTypePropNullable", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)

    @staticmethod
    def from_dict_(
        arg: UserDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> UserDict:
        return User.validate(arg, configuration=configuration)
    
    def __new__(
        cls,
        id: typing.Union[
            int,
            schemas.Unset
        ] = schemas.unset,
        username: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        firstName: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        lastName: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        email: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        password: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        phone: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        userStatus: typing.Union[
            int,
            schemas.Unset
        ] = schemas.unset,
        objectWithNoDeclaredProps: typing.Union[
            schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
            schemas.Unset
        ] = schemas.unset,
        objectWithNoDeclaredPropsNullable: typing.Union[
            None,
            schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
            schemas.Unset
        ] = schemas.unset,
        anyTypeProp: typing.Union[
            schemas.OUTPUT_BASE_TYPES,
            schemas.Unset
        ] = schemas.unset,
        anyTypeExceptNullProp: typing.Union[
            schemas.OUTPUT_BASE_TYPES,
            schemas.Unset
        ] = schemas.unset,
        anyTypePropNullable: typing.Union[
            schemas.OUTPUT_BASE_TYPES,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_ = {}
        for key, val in (
            ("id", id),
            ("username", username),
            ("firstName", firstName),
            ("lastName", lastName),
            ("email", email),
            ("password", password),
            ("phone", phone),
            ("userStatus", userStatus),
            ("objectWithNoDeclaredProps", objectWithNoDeclaredProps),
            ("objectWithNoDeclaredPropsNullable", objectWithNoDeclaredPropsNullable),
            ("anyTypeProp", anyTypeProp),
            ("anyTypeExceptNullProp", anyTypeExceptNullProp),
            ("anyTypePropNullable", anyTypePropNullable),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key] = val
        arg_.update(kwargs)
        return User.validate(arg_, configuration=configuration_)
UserDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


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

