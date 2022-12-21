# coding: utf-8

"""


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
            
            
            class ObjectWithNoDeclaredPropsNullable(
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
            
            
            class AnyTypeExceptNullProp(
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
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.Properties.Id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["username"]) -> MetaOapg.Properties.Username: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["firstName"]) -> MetaOapg.Properties.FirstName: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lastName"]) -> MetaOapg.Properties.LastName: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["email"]) -> MetaOapg.Properties.Email: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["password"]) -> MetaOapg.Properties.Password: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["phone"]) -> MetaOapg.Properties.Phone: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["userStatus"]) -> MetaOapg.Properties.UserStatus: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["objectWithNoDeclaredProps"]) -> MetaOapg.Properties.ObjectWithNoDeclaredProps: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["objectWithNoDeclaredPropsNullable"]) -> MetaOapg.Properties.ObjectWithNoDeclaredPropsNullable: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypeProp"]) -> MetaOapg.Properties.AnyTypeProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypeExceptNullProp"]) -> MetaOapg.Properties.AnyTypeExceptNullProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anyTypePropNullable"]) -> MetaOapg.Properties.AnyTypePropNullable: ...
    
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
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.Properties.Id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["username"]) -> typing.Union[MetaOapg.Properties.Username, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["firstName"]) -> typing.Union[MetaOapg.Properties.FirstName, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["lastName"]) -> typing.Union[MetaOapg.Properties.LastName, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["email"]) -> typing.Union[MetaOapg.Properties.Email, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["password"]) -> typing.Union[MetaOapg.Properties.Password, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["phone"]) -> typing.Union[MetaOapg.Properties.Phone, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["userStatus"]) -> typing.Union[MetaOapg.Properties.UserStatus, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["objectWithNoDeclaredProps"]) -> typing.Union[MetaOapg.Properties.ObjectWithNoDeclaredProps, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["objectWithNoDeclaredPropsNullable"]) -> typing.Union[MetaOapg.Properties.ObjectWithNoDeclaredPropsNullable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["anyTypeProp"]) -> typing.Union[MetaOapg.Properties.AnyTypeProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["anyTypeExceptNullProp"]) -> typing.Union[MetaOapg.Properties.AnyTypeExceptNullProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["anyTypePropNullable"]) -> typing.Union[MetaOapg.Properties.AnyTypePropNullable, schemas.Unset]: ...
    
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
        id: typing.Union[MetaOapg.Properties.Id, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        username: typing.Union[MetaOapg.Properties.Username, str, schemas.Unset] = schemas.unset,
        firstName: typing.Union[MetaOapg.Properties.FirstName, str, schemas.Unset] = schemas.unset,
        lastName: typing.Union[MetaOapg.Properties.LastName, str, schemas.Unset] = schemas.unset,
        email: typing.Union[MetaOapg.Properties.Email, str, schemas.Unset] = schemas.unset,
        password: typing.Union[MetaOapg.Properties.Password, str, schemas.Unset] = schemas.unset,
        phone: typing.Union[MetaOapg.Properties.Phone, str, schemas.Unset] = schemas.unset,
        userStatus: typing.Union[MetaOapg.Properties.UserStatus, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        objectWithNoDeclaredProps: typing.Union[MetaOapg.Properties.ObjectWithNoDeclaredProps, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        objectWithNoDeclaredPropsNullable: typing.Union[MetaOapg.Properties.ObjectWithNoDeclaredPropsNullable, dict, frozendict.frozendict, None, schemas.Unset] = schemas.unset,
        anyTypeProp: typing.Union[MetaOapg.Properties.AnyTypeProp, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        anyTypeExceptNullProp: typing.Union[MetaOapg.Properties.AnyTypeExceptNullProp, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        anyTypePropNullable: typing.Union[MetaOapg.Properties.AnyTypePropNullable, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
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
