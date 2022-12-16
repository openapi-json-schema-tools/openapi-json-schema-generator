# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

from datetime import date, datetime  # noqa: F401
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
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        types = {frozendict.frozendict}
        
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
            
            
            class objectWithNoDeclaredPropsNullable(
                schemas.DictBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneFrozenDictMixin
            ):
            
            
                class MetaOapg:
                    types = {
                        schemas.NoneClass,
                        frozendict.frozendict,
                    }
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'ObjectWithNoDeclaredPropsNullable':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            AnyTypeProp = schemas.AnyTypeSchema
            
            
            class anyTypeExceptNullProp(
                schemas.AnyTypeSchema,
            ):
            
            
                class MetaOapg:
                    # any type
                    ModelNot = schemas.NoneSchema
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'AnyTypeExceptNullProp':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
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
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.Properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["username"]) -> MetaOapg.Properties.username: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["firstName"]) -> MetaOapg.Properties.firstName: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lastName"]) -> MetaOapg.Properties.lastName: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["email"]) -> MetaOapg.Properties.email: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["password"]) -> MetaOapg.Properties.password: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["phone"]) -> MetaOapg.Properties.phone: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["userStatus"]) -> MetaOapg.Properties.userStatus: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["objectWithNoDeclaredProps"]) -> MetaOapg.Properties.objectWithNoDeclaredProps: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["objectWithNoDeclaredPropsNullable"]) -> MetaOapg.Properties.objectWithNoDeclaredPropsNullable: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypeProp"]) -> MetaOapg.Properties.anyTypeProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypeExceptNullProp"]) -> MetaOapg.Properties.anyTypeExceptNullProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypePropNullable"]) -> MetaOapg.Properties.anyTypePropNullable: ...
    
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
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.Properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["username"]) -> typing.Union[MetaOapg.Properties.username, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["firstName"]) -> typing.Union[MetaOapg.Properties.firstName, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["lastName"]) -> typing.Union[MetaOapg.Properties.lastName, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["email"]) -> typing.Union[MetaOapg.Properties.email, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["password"]) -> typing.Union[MetaOapg.Properties.password, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["phone"]) -> typing.Union[MetaOapg.Properties.phone, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["userStatus"]) -> typing.Union[MetaOapg.Properties.userStatus, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["objectWithNoDeclaredProps"]) -> typing.Union[MetaOapg.Properties.objectWithNoDeclaredProps, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["objectWithNoDeclaredPropsNullable"]) -> typing.Union[MetaOapg.Properties.objectWithNoDeclaredPropsNullable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["anyTypeProp"]) -> typing.Union[MetaOapg.Properties.anyTypeProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["anyTypeExceptNullProp"]) -> typing.Union[MetaOapg.Properties.anyTypeExceptNullProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["anyTypePropNullable"]) -> typing.Union[MetaOapg.Properties.anyTypePropNullable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(
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
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        id: typing.Union[MetaOapg.Properties.id, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        username: typing.Union[MetaOapg.Properties.username, str, schemas.Unset] = schemas.unset,
        firstName: typing.Union[MetaOapg.Properties.firstName, str, schemas.Unset] = schemas.unset,
        lastName: typing.Union[MetaOapg.Properties.lastName, str, schemas.Unset] = schemas.unset,
        email: typing.Union[MetaOapg.Properties.email, str, schemas.Unset] = schemas.unset,
        password: typing.Union[MetaOapg.Properties.password, str, schemas.Unset] = schemas.unset,
        phone: typing.Union[MetaOapg.Properties.phone, str, schemas.Unset] = schemas.unset,
        userStatus: typing.Union[MetaOapg.Properties.userStatus, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        objectWithNoDeclaredProps: typing.Union[MetaOapg.Properties.objectWithNoDeclaredProps, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        objectWithNoDeclaredPropsNullable: typing.Union[MetaOapg.Properties.objectWithNoDeclaredPropsNullable, dict, frozendict.frozendict, None, schemas.Unset] = schemas.unset,
        anyTypeProp: typing.Union[MetaOapg.Properties.anyTypeProp, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        anyTypeExceptNullProp: typing.Union[MetaOapg.Properties.anyTypeExceptNullProp, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        anyTypePropNullable: typing.Union[MetaOapg.Properties.anyTypePropNullable, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'User':
        return super().__new__(
            cls,
            *_args,
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
            _configuration=_configuration,
            **kwargs,
        )
