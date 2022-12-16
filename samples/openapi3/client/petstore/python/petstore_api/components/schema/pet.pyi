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


class Pet(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Pet object that needs to be added to the store
    """


    class MetaOapg:
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
                    _arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, str, ]], typing.List[typing.Union[MetaOapg.items, str, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'PhotoUrls':
                    return super().__new__(
                        cls,
                        _arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
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
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'Tags':
                    return super().__new__(
                        cls,
                        _arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'tag.Tag':
                    return super().__getitem__(i)
            
            
            class status(
                schemas.StrSchema
            ):
                
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
    
    name: MetaOapg.Properties.name
    photoUrls: MetaOapg.Properties.photoUrls
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> MetaOapg.Properties.name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["photoUrls"]) -> MetaOapg.Properties.photoUrls: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.Properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["category"]) -> 'category.Category': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tags"]) -> MetaOapg.Properties.tags: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> MetaOapg.Properties.status: ...
    
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
    def get_item_oapg(self, name: typing_extensions.Literal["name"]) -> MetaOapg.Properties.name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["photoUrls"]) -> MetaOapg.Properties.photoUrls: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.Properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["category"]) -> typing.Union['category.Category', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["tags"]) -> typing.Union[MetaOapg.Properties.tags, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> typing.Union[MetaOapg.Properties.status, schemas.Unset]: ...
    
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
        name: typing.Union[MetaOapg.Properties.name, str, ],
        photoUrls: typing.Union[MetaOapg.Properties.photoUrls, list, tuple, ],
        id: typing.Union[MetaOapg.Properties.id, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        category: typing.Union['category.Category', schemas.Unset] = schemas.unset,
        tags: typing.Union[MetaOapg.Properties.tags, list, tuple, schemas.Unset] = schemas.unset,
        status: typing.Union[MetaOapg.Properties.status, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
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
