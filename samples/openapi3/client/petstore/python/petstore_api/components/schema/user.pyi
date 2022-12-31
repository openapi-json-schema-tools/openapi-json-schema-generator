# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401


class User(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        
        class Properties:
            Id = schemas.Int64Schema
            Username = schemas.StrSchema
            FirstName = schemas.StrSchema
            LastName = schemas.StrSchema
            Email = schemas.StrSchema
            Password = schemas.StrSchema
            Phone = schemas.StrSchema
            UserStatus = schemas.Int32Schema
            ObjectWithNoDeclaredProps = schemas.DictSchema
            
            
            class ObjectWithNoDeclaredPropsNullable(
                schemas.DictBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneFrozenDictMixin
            ):
            
            
                class Schema_:
                    types = {
                        schemas.NoneClass,
                        frozendict.frozendict,
                    }
            
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, None, ],
                    configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> 'ObjectWithNoDeclaredPropsNullable':
                    return super().__new__(
                        cls,
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
            AnyTypeProp = schemas.AnyTypeSchema
            
            
            class AnyTypeExceptNullProp(
                schemas.AnyTypeSchema,
            ):
            
            
                class Schema_:
                    # any type
                    _Not = schemas.NoneSchema
            
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> 'AnyTypeExceptNullProp':
                    return super().__new__(
                        cls,
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
            AnyTypePropNullable = schemas.AnyTypeSchema
            __annotations__ = {
                "id": Id,
                "username": Username,
                "firstName": FirstName,
                "lastName": LastName,
                "email": Email,
                "password": Password,
                "phone": Phone,
                "userStatus": UserStatus,
                "objectWithNoDeclaredProps": ObjectWithNoDeclaredProps,
                "objectWithNoDeclaredPropsNullable": ObjectWithNoDeclaredPropsNullable,
                "anyTypeProp": AnyTypeProp,
                "anyTypeExceptNullProp": AnyTypeExceptNullProp,
                "anyTypePropNullable": AnyTypePropNullable,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> Schema_.Properties.Id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["username"]) -> Schema_.Properties.Username: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["firstName"]) -> Schema_.Properties.FirstName: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lastName"]) -> Schema_.Properties.LastName: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["email"]) -> Schema_.Properties.Email: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["password"]) -> Schema_.Properties.Password: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["phone"]) -> Schema_.Properties.Phone: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["userStatus"]) -> Schema_.Properties.UserStatus: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["objectWithNoDeclaredProps"]) -> Schema_.Properties.ObjectWithNoDeclaredProps: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["objectWithNoDeclaredPropsNullable"]) -> Schema_.Properties.ObjectWithNoDeclaredPropsNullable: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypeProp"]) -> Schema_.Properties.AnyTypeProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypeExceptNullProp"]) -> Schema_.Properties.AnyTypeExceptNullProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypePropNullable"]) -> Schema_.Properties.AnyTypePropNullable: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
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
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["id"]) -> typing.Union[Schema_.Properties.Id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["username"]) -> typing.Union[Schema_.Properties.Username, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["firstName"]) -> typing.Union[Schema_.Properties.FirstName, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["lastName"]) -> typing.Union[Schema_.Properties.LastName, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["email"]) -> typing.Union[Schema_.Properties.Email, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["password"]) -> typing.Union[Schema_.Properties.Password, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["phone"]) -> typing.Union[Schema_.Properties.Phone, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["userStatus"]) -> typing.Union[Schema_.Properties.UserStatus, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["objectWithNoDeclaredProps"]) -> typing.Union[Schema_.Properties.ObjectWithNoDeclaredProps, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["objectWithNoDeclaredPropsNullable"]) -> typing.Union[Schema_.Properties.ObjectWithNoDeclaredPropsNullable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["anyTypeProp"]) -> typing.Union[Schema_.Properties.AnyTypeProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["anyTypeExceptNullProp"]) -> typing.Union[Schema_.Properties.AnyTypeExceptNullProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["anyTypePropNullable"]) -> typing.Union[Schema_.Properties.AnyTypePropNullable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_(
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
        return super().get_item_(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict, ],
        id: typing.Union[Schema_.Properties.Id, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        username: typing.Union[Schema_.Properties.Username, str, schemas.Unset] = schemas.unset,
        firstName: typing.Union[Schema_.Properties.FirstName, str, schemas.Unset] = schemas.unset,
        lastName: typing.Union[Schema_.Properties.LastName, str, schemas.Unset] = schemas.unset,
        email: typing.Union[Schema_.Properties.Email, str, schemas.Unset] = schemas.unset,
        password: typing.Union[Schema_.Properties.Password, str, schemas.Unset] = schemas.unset,
        phone: typing.Union[Schema_.Properties.Phone, str, schemas.Unset] = schemas.unset,
        userStatus: typing.Union[Schema_.Properties.UserStatus, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        objectWithNoDeclaredProps: typing.Union[Schema_.Properties.ObjectWithNoDeclaredProps, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        objectWithNoDeclaredPropsNullable: typing.Union[Schema_.Properties.ObjectWithNoDeclaredPropsNullable, dict, frozendict.frozendict, None, schemas.Unset] = schemas.unset,
        anyTypeProp: typing.Union[Schema_.Properties.AnyTypeProp, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        anyTypeExceptNullProp: typing.Union[Schema_.Properties.AnyTypeExceptNullProp, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        anyTypePropNullable: typing.Union[Schema_.Properties.AnyTypePropNullable, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'User':
        return super().__new__(
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
