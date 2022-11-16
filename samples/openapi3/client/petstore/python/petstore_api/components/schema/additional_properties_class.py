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


class AdditionalPropertiesClass(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        types = {frozendict.frozendict}
        
        class properties:
            
            
            class map_property(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    types = {frozendict.frozendict}
                    additional_properties = schemas.StrSchema
                
                def __getitem__(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.additional_properties, str, ],
                ) -> 'map_property':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class map_of_map_property(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    types = {frozendict.frozendict}
                    
                    
                    class additional_properties(
                        schemas.DictSchema
                    ):
                    
                    
                        class MetaOapg:
                            types = {frozendict.frozendict}
                            additional_properties = schemas.StrSchema
                        
                        def __getitem__(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                            # dict_instance[name] accessor
                            return super().__getitem__(name)
                        
                        def get_item_oapg(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                            return super().get_item_oapg(name)
                    
                        def __new__(
                            cls,
                            *_args: typing.Union[dict, frozendict.frozendict, ],
                            _configuration: typing.Optional[schemas.Configuration] = None,
                            **kwargs: typing.Union[MetaOapg.additional_properties, str, ],
                        ) -> 'additional_properties':
                            return super().__new__(
                                cls,
                                *_args,
                                _configuration=_configuration,
                                **kwargs,
                            )
                
                def __getitem__(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, ],
                ) -> 'map_of_map_property':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            anytype_1 = schemas.AnyTypeSchema
            map_with_undeclared_properties_anytype_1 = schemas.DictSchema
            map_with_undeclared_properties_anytype_2 = schemas.DictSchema
            
            
            class map_with_undeclared_properties_anytype_3(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    types = {frozendict.frozendict}
                    additional_properties = schemas.AnyTypeSchema
                
                def __getitem__(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                ) -> 'map_with_undeclared_properties_anytype_3':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class empty_map(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    types = {frozendict.frozendict}
                    additional_properties = schemas.NotAnyTypeSchema
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'empty_map':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class map_with_undeclared_properties_string(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    types = {frozendict.frozendict}
                    additional_properties = schemas.StrSchema
                
                def __getitem__(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.additional_properties, str, ],
                ) -> 'map_with_undeclared_properties_string':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            __annotations__ = {
                "map_property": map_property,
                "map_of_map_property": map_of_map_property,
                "anytype_1": anytype_1,
                "map_with_undeclared_properties_anytype_1": map_with_undeclared_properties_anytype_1,
                "map_with_undeclared_properties_anytype_2": map_with_undeclared_properties_anytype_2,
                "map_with_undeclared_properties_anytype_3": map_with_undeclared_properties_anytype_3,
                "empty_map": empty_map,
                "map_with_undeclared_properties_string": map_with_undeclared_properties_string,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_property"]) -> MetaOapg.properties.map_property: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_of_map_property"]) -> MetaOapg.properties.map_of_map_property: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anytype_1"]) -> MetaOapg.properties.anytype_1: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_with_undeclared_properties_anytype_1"]) -> MetaOapg.properties.map_with_undeclared_properties_anytype_1: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_with_undeclared_properties_anytype_2"]) -> MetaOapg.properties.map_with_undeclared_properties_anytype_2: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_with_undeclared_properties_anytype_3"]) -> MetaOapg.properties.map_with_undeclared_properties_anytype_3: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["empty_map"]) -> MetaOapg.properties.empty_map: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_with_undeclared_properties_string"]) -> MetaOapg.properties.map_with_undeclared_properties_string: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["map_property", "map_of_map_property", "anytype_1", "map_with_undeclared_properties_anytype_1", "map_with_undeclared_properties_anytype_2", "map_with_undeclared_properties_anytype_3", "empty_map", "map_with_undeclared_properties_string", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["map_property"]) -> typing.Union[MetaOapg.properties.map_property, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["map_of_map_property"]) -> typing.Union[MetaOapg.properties.map_of_map_property, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["anytype_1"]) -> typing.Union[MetaOapg.properties.anytype_1, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["map_with_undeclared_properties_anytype_1"]) -> typing.Union[MetaOapg.properties.map_with_undeclared_properties_anytype_1, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["map_with_undeclared_properties_anytype_2"]) -> typing.Union[MetaOapg.properties.map_with_undeclared_properties_anytype_2, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["map_with_undeclared_properties_anytype_3"]) -> typing.Union[MetaOapg.properties.map_with_undeclared_properties_anytype_3, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["empty_map"]) -> typing.Union[MetaOapg.properties.empty_map, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["map_with_undeclared_properties_string"]) -> typing.Union[MetaOapg.properties.map_with_undeclared_properties_string, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["map_property", "map_of_map_property", "anytype_1", "map_with_undeclared_properties_anytype_1", "map_with_undeclared_properties_anytype_2", "map_with_undeclared_properties_anytype_3", "empty_map", "map_with_undeclared_properties_string", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        map_property: typing.Union[MetaOapg.properties.map_property, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        map_of_map_property: typing.Union[MetaOapg.properties.map_of_map_property, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        anytype_1: typing.Union[MetaOapg.properties.anytype_1, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        map_with_undeclared_properties_anytype_1: typing.Union[MetaOapg.properties.map_with_undeclared_properties_anytype_1, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        map_with_undeclared_properties_anytype_2: typing.Union[MetaOapg.properties.map_with_undeclared_properties_anytype_2, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        map_with_undeclared_properties_anytype_3: typing.Union[MetaOapg.properties.map_with_undeclared_properties_anytype_3, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        empty_map: typing.Union[MetaOapg.properties.empty_map, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        map_with_undeclared_properties_string: typing.Union[MetaOapg.properties.map_with_undeclared_properties_string, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'AdditionalPropertiesClass':
        return super().__new__(
            cls,
            *_args,
            map_property=map_property,
            map_of_map_property=map_of_map_property,
            anytype_1=anytype_1,
            map_with_undeclared_properties_anytype_1=map_with_undeclared_properties_anytype_1,
            map_with_undeclared_properties_anytype_2=map_with_undeclared_properties_anytype_2,
            map_with_undeclared_properties_anytype_3=map_with_undeclared_properties_anytype_3,
            empty_map=empty_map,
            map_with_undeclared_properties_string=map_with_undeclared_properties_string,
            _configuration=_configuration,
            **kwargs,
        )
