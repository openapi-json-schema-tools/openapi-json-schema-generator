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


class Pet(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    Pet object that needs to be added to the store
    """


    class Schema_:
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
            
            
                class Schema_:
                    types = {tuple}
                    Items = schemas.StrSchema
            
                def __new__(
                    cls,
                    arg_: typing.Union[
                        typing.Tuple[
                            typing.Union[Schema_.Items, str], ...
                        ],
                        typing.List[
                            typing.Union[Schema_.Items, str]
                        ],
                    ],
                    configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
                ) -> 'Pet.Schema_.Properties.PhotoUrls':
                    return super().__new__(
                        cls,
                        arg_,
                        configuration_=configuration_,
                    )
            
                def __getitem__(self, i: int) -> Schema_.Items:
                    return super().__getitem__(i)
            
            
            class Tags(
                schemas.ListSchema
            ):
            
            
                class Schema_:
                    types = {tuple}
                    
                    @staticmethod
                    def items() -> typing.Type['tag.Tag']:
                        return tag.Tag
            
                def __new__(
                    cls,
                    arg_: typing.Union[
                        typing.Tuple[
                            typing.Union['tag.Tag', dict, frozendict.frozendict], ...
                        ],
                        typing.List[
                            typing.Union['tag.Tag', dict, frozendict.frozendict]
                        ],
                    ],
                    configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
                ) -> 'Pet.Schema_.Properties.Tags':
                    return super().__new__(
                        cls,
                        arg_,
                        configuration_=configuration_,
                    )
            
                def __getitem__(self, i: int) -> 'tag.Tag':
                    return super().__getitem__(i)
            
            
            class Status(
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
    
    name: Schema_.Properties.Name
    photoUrls: Schema_.Properties.PhotoUrls
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> Schema_.Properties.Name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["photoUrls"]) -> Schema_.Properties.PhotoUrls: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> Schema_.Properties.Id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["category"]) -> 'category.Category': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tags"]) -> Schema_.Properties.Tags: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> Schema_.Properties.Status: ...
    
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
    def get_item_(self, name: typing_extensions.Literal["name"]) -> Schema_.Properties.Name: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["photoUrls"]) -> Schema_.Properties.PhotoUrls: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["id"]) -> typing.Union[Schema_.Properties.Id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["category"]) -> typing.Union['category.Category', schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["tags"]) -> typing.Union[Schema_.Properties.Tags, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["status"]) -> typing.Union[Schema_.Properties.Status, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_(
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
        return super().get_item_(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        name: typing.Union[Schema_.Properties.Name, str],
        photoUrls: typing.Union[Schema_.Properties.PhotoUrls, list, tuple],
        id: typing.Union[Schema_.Properties.Id, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        category: typing.Union['category.Category', dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        tags: typing.Union[Schema_.Properties.Tags, list, tuple, schemas.Unset] = schemas.unset,
        status: typing.Union[Schema_.Properties.Status, str, schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'Pet':
        return super().__new__(
            cls,
            *args_,
            name=name,
            photoUrls=photoUrls,
            id=id,
            category=category,
            tags=tags,
            status=status,
            configuration_=configuration_,
            **kwargs,
        )

from petstore_api.components.schema import category
from petstore_api.components.schema import tag
