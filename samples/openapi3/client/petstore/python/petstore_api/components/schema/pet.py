# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
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


class Pet(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Pet object that needs to be added to the store
    """


    class MetaOapg:
        types = {frozendict.frozendict}
        required = {
            "name",
            "photoUrls",
        }
        
        class Properties:
            Id = schemas.Int64Schema
        
            @staticmethod
            def category() -> typing.Type['category.Category']:
                return category.Category
            Name = schemas.StrSchema
            
            
            class PhotoUrls(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    types = {tuple}
                    Items = schemas.StrSchema
            
                def __new__(
                    cls,
                    _arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.Items, str, ]], typing.List[typing.Union[MetaOapg.Items, str, ]]],
                    _configuration: typing.Optional[schemas.configuration_module.Configuration] = None,
                ) -> 'PhotoUrls':
                    return super().__new__(
                        cls,
                        _arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.Items:
                    return super().__getitem__(i)
            
            
            class Tags(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    types = {tuple}
                    
                    @staticmethod
                    def items() -> typing.Type['tag.Tag']:
                        return tag.Tag
            
                def __new__(
                    cls,
                    _arg: typing.Union[typing.Tuple['tag.Tag'], typing.List['tag.Tag']],
                    _configuration: typing.Optional[schemas.configuration_module.Configuration] = None,
                ) -> 'Tags':
                    return super().__new__(
                        cls,
                        _arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'tag.Tag':
                    return super().__getitem__(i)
            
            
            class Status(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    types = {
                        str,
                    }
                    enum_value_to_name = {
                        "available": "AVAILABLE",
                        "pending": "PENDING",
                        "sold": "SOLD",
                    }
                
                @schemas.classproperty
                def AVAILABLE(cls):
                    return cls("available")
                
                @schemas.classproperty
                def PENDING(cls):
                    return cls("pending")
                
                @schemas.classproperty
                def SOLD(cls):
                    return cls("sold")
            __annotations__ = {
                "id": Id,
                "category": category,
                "name": Name,
                "photoUrls": PhotoUrls,
                "tags": Tags,
                "status": Status,
            }
    
    name: MetaOapg.Properties.Name
    photoUrls: MetaOapg.Properties.PhotoUrls
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> MetaOapg.Properties.Name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["photoUrls"]) -> MetaOapg.Properties.PhotoUrls: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.Properties.Id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["category"]) -> 'category.Category': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tags"]) -> MetaOapg.Properties.Tags: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> MetaOapg.Properties.Status: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["name"],
            typing_extensions.Literal["photoUrls"],
            typing_extensions.Literal["id"],
            typing_extensions.Literal["category"],
            typing_extensions.Literal["tags"],
            typing_extensions.Literal["status"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["name"]) -> MetaOapg.Properties.Name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["photoUrls"]) -> MetaOapg.Properties.PhotoUrls: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.Properties.Id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["category"]) -> typing.Union['category.Category', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["tags"]) -> typing.Union[MetaOapg.Properties.Tags, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> typing.Union[MetaOapg.Properties.Status, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["name"],
            typing_extensions.Literal["photoUrls"],
            typing_extensions.Literal["id"],
            typing_extensions.Literal["category"],
            typing_extensions.Literal["tags"],
            typing_extensions.Literal["status"],
            str
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        name: typing.Union[MetaOapg.Properties.Name, str, ],
        photoUrls: typing.Union[MetaOapg.Properties.PhotoUrls, list, tuple, ],
        id: typing.Union[MetaOapg.Properties.Id, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        category: typing.Union['category.Category', schemas.Unset] = schemas.unset,
        tags: typing.Union[MetaOapg.Properties.Tags, list, tuple, schemas.Unset] = schemas.unset,
        status: typing.Union[MetaOapg.Properties.Status, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.configuration_module.Configuration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'Pet':
        return super().__new__(
            cls,
            *_args,
            name=name,
            photoUrls=photoUrls,
            id=id,
            category=category,
            tags=tags,
            status=status,
            _configuration=_configuration,
            **kwargs,
        )

from petstore_api.components.schema import category
from petstore_api.components.schema import tag
