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
        
        class properties:
            id = schemas.Int64Schema
            username = schemas.StrSchema
            firstName = schemas.StrSchema
            lastName = schemas.StrSchema
            email = schemas.StrSchema
            password = schemas.StrSchema
            phone = schemas.StrSchema
            userStatus = schemas.Int32Schema
            objectWithNoDeclaredProps = schemas.DictSchema
            
            
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
                ) -> 'objectWithNoDeclaredPropsNullable':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            anyTypeProp = schemas.AnyTypeSchema
            
            
            class anyTypeExceptNullProp(
                schemas.ComposedSchema,
            ):
            
            
                class MetaOapg:
                    types = None
                    not_schema = schemas.NoneSchema
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'anyTypeExceptNullProp':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            anyTypePropNullable = schemas.AnyTypeSchema
            __annotations__ = {
                "id": id,
                "username": username,
                "firstName": firstName,
                "lastName": lastName,
                "email": email,
                "password": password,
                "phone": phone,
                "userStatus": userStatus,
                "objectWithNoDeclaredProps": objectWithNoDeclaredProps,
                "objectWithNoDeclaredPropsNullable": objectWithNoDeclaredPropsNullable,
                "anyTypeProp": anyTypeProp,
                "anyTypeExceptNullProp": anyTypeExceptNullProp,
                "anyTypePropNullable": anyTypePropNullable,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["username"]) -> MetaOapg.properties.username: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["firstName"]) -> MetaOapg.properties.firstName: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lastName"]) -> MetaOapg.properties.lastName: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["email"]) -> MetaOapg.properties.email: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["password"]) -> MetaOapg.properties.password: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["phone"]) -> MetaOapg.properties.phone: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["userStatus"]) -> MetaOapg.properties.userStatus: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["objectWithNoDeclaredProps"]) -> MetaOapg.properties.objectWithNoDeclaredProps: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["objectWithNoDeclaredPropsNullable"]) -> MetaOapg.properties.objectWithNoDeclaredPropsNullable: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypeProp"]) -> MetaOapg.properties.anyTypeProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypeExceptNullProp"]) -> MetaOapg.properties.anyTypeExceptNullProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypePropNullable"]) -> MetaOapg.properties.anyTypePropNullable: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id", "username", "firstName", "lastName", "email", "password", "phone", "userStatus", "objectWithNoDeclaredProps", "objectWithNoDeclaredPropsNullable", "anyTypeProp", "anyTypeExceptNullProp", "anyTypePropNullable", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["username"]) -> typing.Union[MetaOapg.properties.username, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["firstName"]) -> typing.Union[MetaOapg.properties.firstName, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["lastName"]) -> typing.Union[MetaOapg.properties.lastName, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["email"]) -> typing.Union[MetaOapg.properties.email, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["password"]) -> typing.Union[MetaOapg.properties.password, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["phone"]) -> typing.Union[MetaOapg.properties.phone, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["userStatus"]) -> typing.Union[MetaOapg.properties.userStatus, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["objectWithNoDeclaredProps"]) -> typing.Union[MetaOapg.properties.objectWithNoDeclaredProps, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["objectWithNoDeclaredPropsNullable"]) -> typing.Union[MetaOapg.properties.objectWithNoDeclaredPropsNullable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["anyTypeProp"]) -> typing.Union[MetaOapg.properties.anyTypeProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["anyTypeExceptNullProp"]) -> typing.Union[MetaOapg.properties.anyTypeExceptNullProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["anyTypePropNullable"]) -> typing.Union[MetaOapg.properties.anyTypePropNullable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id", "username", "firstName", "lastName", "email", "password", "phone", "userStatus", "objectWithNoDeclaredProps", "objectWithNoDeclaredPropsNullable", "anyTypeProp", "anyTypeExceptNullProp", "anyTypePropNullable", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        id: typing.Union[MetaOapg.properties.id, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        username: typing.Union[MetaOapg.properties.username, str, schemas.Unset] = schemas.unset,
        firstName: typing.Union[MetaOapg.properties.firstName, str, schemas.Unset] = schemas.unset,
        lastName: typing.Union[MetaOapg.properties.lastName, str, schemas.Unset] = schemas.unset,
        email: typing.Union[MetaOapg.properties.email, str, schemas.Unset] = schemas.unset,
        password: typing.Union[MetaOapg.properties.password, str, schemas.Unset] = schemas.unset,
        phone: typing.Union[MetaOapg.properties.phone, str, schemas.Unset] = schemas.unset,
        userStatus: typing.Union[MetaOapg.properties.userStatus, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        objectWithNoDeclaredProps: typing.Union[MetaOapg.properties.objectWithNoDeclaredProps, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        objectWithNoDeclaredPropsNullable: typing.Union[MetaOapg.properties.objectWithNoDeclaredPropsNullable, dict, frozendict.frozendict, None, schemas.Unset] = schemas.unset,
        anyTypeProp: typing.Union[MetaOapg.properties.anyTypeProp, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        anyTypeExceptNullProp: typing.Union[MetaOapg.properties.anyTypeExceptNullProp, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        anyTypePropNullable: typing.Union[MetaOapg.properties.anyTypePropNullable, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
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
