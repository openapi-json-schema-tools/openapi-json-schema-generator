# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Id: typing_extensions.TypeAlias = schemas.Int64Schema[U]
Username: typing_extensions.TypeAlias = schemas.StrSchema[U]
FirstName: typing_extensions.TypeAlias = schemas.StrSchema[U]
LastName: typing_extensions.TypeAlias = schemas.StrSchema[U]
Email: typing_extensions.TypeAlias = schemas.StrSchema[U]
Password: typing_extensions.TypeAlias = schemas.StrSchema[U]
Phone: typing_extensions.TypeAlias = schemas.StrSchema[U]
UserStatus: typing_extensions.TypeAlias = schemas.Int32Schema[U]
ObjectWithNoDeclaredProps: typing_extensions.TypeAlias = schemas.DictSchema[U]


class ObjectWithNoDeclaredPropsNullable(
    schemas.NoneBase,
    schemas.DictBase,
    schemas.Schema[schemas.T],
    schemas.NoneFrozenDictMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            frozendict.frozendict,
        })


    def __new__(
        cls,
        *args_: typing.Union[
            None,
            dict,
            frozendict.frozendict
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL_INCL_SCHEMA
    ) -> ObjectWithNoDeclaredPropsNullable[
        typing.Union[
            schemas.NoneClass,
            frozendict.frozendict
        ]
    ]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            ObjectWithNoDeclaredPropsNullable[
                typing.Union[
                    schemas.NoneClass,
                    frozendict.frozendict
                ]
            ],
            inst
        )
        return inst

AnyTypeProp: typing_extensions.TypeAlias = schemas.AnyTypeSchema[U]
_Not: typing_extensions.TypeAlias = schemas.NoneSchema[U]


class AnyTypeExceptNullProp(
    schemas.AnyTypeSchema[schemas.T],
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        # any type
        not_: typing.Type[_Not] = dataclasses.field(default_factory=lambda: _Not) # type: ignore


    def __new__(
        cls,
        *args_: typing.Union[
            dict,
            frozendict.frozendict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            decimal.Decimal,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL_INCL_SCHEMA
    ) -> AnyTypeExceptNullProp[
        typing.Union[
            frozendict.frozendict,
            str,
            decimal.Decimal,
            schemas.BoolClass,
            schemas.NoneClass,
            tuple,
            bytes,
            schemas.FileIO
        ]
    ]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            AnyTypeExceptNullProp[
                typing.Union[
                    frozendict.frozendict,
                    str,
                    decimal.Decimal,
                    schemas.BoolClass,
                    schemas.NoneClass,
                    tuple,
                    bytes,
                    schemas.FileIO
                ]
            ],
            inst
        )
        return inst

AnyTypePropNullable: typing_extensions.TypeAlias = schemas.AnyTypeSchema[U]
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

class User(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> Id[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["username"]) -> Username[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["firstName"]) -> FirstName[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lastName"]) -> LastName[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["email"]) -> Email[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["password"]) -> Password[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["phone"]) -> Phone[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["userStatus"]) -> UserStatus[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["objectWithNoDeclaredProps"]) -> ObjectWithNoDeclaredProps[frozendict.frozendict]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["objectWithNoDeclaredPropsNullable"]) -> ObjectWithNoDeclaredPropsNullable[typing.Union[
        schemas.NoneClass,
        frozendict.frozendict
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypeProp"]) -> AnyTypeProp[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypeExceptNullProp"]) -> AnyTypeExceptNullProp[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypePropNullable"]) -> AnyTypePropNullable[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
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

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        id: typing.Union[
            Id[decimal.Decimal],
            schemas.Unset,
            decimal.Decimal,
            int
        ] = schemas.unset,
        username: typing.Union[
            Username[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        firstName: typing.Union[
            FirstName[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        lastName: typing.Union[
            LastName[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        email: typing.Union[
            Email[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        password: typing.Union[
            Password[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        phone: typing.Union[
            Phone[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        userStatus: typing.Union[
            UserStatus[decimal.Decimal],
            schemas.Unset,
            decimal.Decimal,
            int
        ] = schemas.unset,
        objectWithNoDeclaredProps: typing.Union[
            ObjectWithNoDeclaredProps[frozendict.frozendict],
            schemas.Unset,
            dict,
            frozendict.frozendict
        ] = schemas.unset,
        objectWithNoDeclaredPropsNullable: typing.Union[
            ObjectWithNoDeclaredPropsNullable[typing.Union[
                schemas.NoneClass,
                frozendict.frozendict
            ]],
            schemas.Unset,
            None,
            dict,
            frozendict.frozendict
        ] = schemas.unset,
        anyTypeProp: typing.Union[
            AnyTypeProp[typing.Union[
                frozendict.frozendict,
                str,
                decimal.Decimal,
                schemas.BoolClass,
                schemas.NoneClass,
                tuple,
                bytes,
                schemas.FileIO
            ]],
            schemas.Unset,
            dict,
            frozendict.frozendict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            decimal.Decimal,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ] = schemas.unset,
        anyTypeExceptNullProp: typing.Union[
            AnyTypeExceptNullProp[typing.Union[
                frozendict.frozendict,
                str,
                decimal.Decimal,
                schemas.BoolClass,
                schemas.NoneClass,
                tuple,
                bytes,
                schemas.FileIO
            ]],
            schemas.Unset,
            dict,
            frozendict.frozendict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            decimal.Decimal,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ] = schemas.unset,
        anyTypePropNullable: typing.Union[
            AnyTypePropNullable[typing.Union[
                frozendict.frozendict,
                str,
                decimal.Decimal,
                schemas.BoolClass,
                schemas.NoneClass,
                tuple,
                bytes,
                schemas.FileIO
            ]],
            schemas.Unset,
            dict,
            frozendict.frozendict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            decimal.Decimal,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL_INCL_SCHEMA
    ) -> User[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            id=id,
            username=username,
            firstName=firstName,
            lastName=lastName,
            email=email,
            password=password,
            phone=phone,
            userStatus=userStatus,
            objectWithNoDeclaredProps=objectWithNoDeclaredProps,
            objectWithNoDeclaredPropsNullable=objectWithNoDeclaredPropsNullable,
            anyTypeProp=anyTypeProp,
            anyTypeExceptNullProp=anyTypeExceptNullProp,
            anyTypePropNullable=anyTypePropNullable,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            User[frozendict.frozendict],
            inst
        )
        return inst

