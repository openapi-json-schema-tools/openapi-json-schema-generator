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


class NullableClass(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        types = {frozendict.frozendict}
        
        class Properties:
            
            
            class integer_prop(
                schemas.IntBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                class MetaOapg:
                    types = {
                        schemas.NoneClass,
                        decimal.Decimal,
                    }
                    format = 'int'
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, decimal.Decimal, int, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'IntegerProp':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class number_prop(
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                class MetaOapg:
                    types = {
                        schemas.NoneClass,
                        decimal.Decimal,
                    }
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'NumberProp':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class boolean_prop(
                schemas.BoolBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneBoolMixin
            ):
            
            
                class MetaOapg:
                    types = {
                        schemas.NoneClass,
                        schemas.BoolClass,
                    }
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, bool, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'BooleanProp':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class string_prop(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    types = {
                        schemas.NoneClass,
                        str,
                    }
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'StringProp':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class date_prop(
                schemas.DateBase,
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    types = {
                        schemas.NoneClass,
                        str,
                    }
                    format = 'date'
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, str, date, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'DateProp':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class datetime_prop(
                schemas.DateTimeBase,
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    types = {
                        schemas.NoneClass,
                        str,
                    }
                    format = 'date-time'
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, str, datetime, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'DatetimeProp':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class array_nullable_prop(
                schemas.ListBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneTupleMixin
            ):
            
            
                class MetaOapg:
                    types = {
                        schemas.NoneClass,
                        tuple,
                    }
                    Items = schemas.DictSchema
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[list, tuple, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'ArrayNullableProp':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class array_and_items_nullable_prop(
                schemas.ListBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneTupleMixin
            ):
            
            
                class MetaOapg:
                    types = {
                        schemas.NoneClass,
                        tuple,
                    }
                    
                    
                    class items(
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
                        ) -> 'Items':
                            return super().__new__(
                                cls,
                                *_args,
                                _configuration=_configuration,
                                **kwargs,
                            )
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[list, tuple, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'ArrayAndItemsNullableProp':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class ArrayItemsNullable(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    types = {tuple}
                    
                    
                    class items(
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
                        ) -> 'Items':
                            return super().__new__(
                                cls,
                                *_args,
                                _configuration=_configuration,
                                **kwargs,
                            )
            
                def __new__(
                    cls,
                    _arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, dict, frozendict.frozendict, None, ]], typing.List[typing.Union[MetaOapg.items, dict, frozendict.frozendict, None, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'ArrayItemsNullable':
                    return super().__new__(
                        cls,
                        _arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            
            
            class object_nullable_prop(
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
                    AdditionalProperties = schemas.DictSchema
            
                
                def __getitem__(self, name: str) -> MetaOapg.additionalProperties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: str) -> MetaOapg.additionalProperties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.additionalProperties, dict, frozendict.frozendict, ],
                ) -> 'ObjectNullableProp':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class object_and_items_nullable_prop(
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
                    
                    
                    class additionalProperties(
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
                        ) -> 'AdditionalProperties':
                            return super().__new__(
                                cls,
                                *_args,
                                _configuration=_configuration,
                                **kwargs,
                            )
            
                
                def __getitem__(self, name: str) -> MetaOapg.additionalProperties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: str) -> MetaOapg.additionalProperties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.additionalProperties, dict, frozendict.frozendict, None, ],
                ) -> 'ObjectAndItemsNullableProp':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class ObjectItemsNullable(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    types = {frozendict.frozendict}
                    
                    
                    class additionalProperties(
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
                        ) -> 'AdditionalProperties':
                            return super().__new__(
                                cls,
                                *_args,
                                _configuration=_configuration,
                                **kwargs,
                            )
                
                def __getitem__(self, name: str) -> MetaOapg.additionalProperties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: str) -> MetaOapg.additionalProperties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.additionalProperties, dict, frozendict.frozendict, None, ],
                ) -> 'ObjectItemsNullable':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            __annotations__ = {
                "integer_prop": IntegerProp,
                "number_prop": NumberProp,
                "boolean_prop": BooleanProp,
                "string_prop": StringProp,
                "date_prop": DateProp,
                "datetime_prop": DatetimeProp,
                "array_nullable_prop": ArrayNullableProp,
                "array_and_items_nullable_prop": ArrayAndItemsNullableProp,
                "array_items_nullable": ArrayItemsNullable,
                "object_nullable_prop": ObjectNullableProp,
                "object_and_items_nullable_prop": ObjectAndItemsNullableProp,
                "object_items_nullable": ObjectItemsNullable,
            }
        
        
        class additionalProperties(
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
            ) -> 'AdditionalProperties':
                return super().__new__(
                    cls,
                    *_args,
                    _configuration=_configuration,
                    **kwargs,
                )
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["integer_prop"]) -> MetaOapg.properties.integer_prop: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number_prop"]) -> MetaOapg.properties.number_prop: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["boolean_prop"]) -> MetaOapg.properties.boolean_prop: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["string_prop"]) -> MetaOapg.properties.string_prop: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date_prop"]) -> MetaOapg.properties.date_prop: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["datetime_prop"]) -> MetaOapg.properties.datetime_prop: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["array_nullable_prop"]) -> MetaOapg.properties.array_nullable_prop: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["array_and_items_nullable_prop"]) -> MetaOapg.properties.array_and_items_nullable_prop: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["array_items_nullable"]) -> MetaOapg.properties.array_items_nullable: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["object_nullable_prop"]) -> MetaOapg.properties.object_nullable_prop: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["object_and_items_nullable_prop"]) -> MetaOapg.properties.object_and_items_nullable_prop: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["object_items_nullable"]) -> MetaOapg.properties.object_items_nullable: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additionalProperties: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["integer_prop"],
            typing_extensions.Literal["number_prop"],
            typing_extensions.Literal["boolean_prop"],
            typing_extensions.Literal["string_prop"],
            typing_extensions.Literal["date_prop"],
            typing_extensions.Literal["datetime_prop"],
            typing_extensions.Literal["array_nullable_prop"],
            typing_extensions.Literal["array_and_items_nullable_prop"],
            typing_extensions.Literal["array_items_nullable"],
            typing_extensions.Literal["object_nullable_prop"],
            typing_extensions.Literal["object_and_items_nullable_prop"],
            typing_extensions.Literal["object_items_nullable"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["integer_prop"]) -> typing.Union[MetaOapg.properties.integer_prop, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["number_prop"]) -> typing.Union[MetaOapg.properties.number_prop, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["boolean_prop"]) -> typing.Union[MetaOapg.properties.boolean_prop, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["string_prop"]) -> typing.Union[MetaOapg.properties.string_prop, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date_prop"]) -> typing.Union[MetaOapg.properties.date_prop, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["datetime_prop"]) -> typing.Union[MetaOapg.properties.datetime_prop, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["array_nullable_prop"]) -> typing.Union[MetaOapg.properties.array_nullable_prop, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["array_and_items_nullable_prop"]) -> typing.Union[MetaOapg.properties.array_and_items_nullable_prop, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["array_items_nullable"]) -> typing.Union[MetaOapg.properties.array_items_nullable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["object_nullable_prop"]) -> typing.Union[MetaOapg.properties.object_nullable_prop, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["object_and_items_nullable_prop"]) -> typing.Union[MetaOapg.properties.object_and_items_nullable_prop, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["object_items_nullable"]) -> typing.Union[MetaOapg.properties.object_items_nullable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[MetaOapg.additionalProperties, schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["integer_prop"],
            typing_extensions.Literal["number_prop"],
            typing_extensions.Literal["boolean_prop"],
            typing_extensions.Literal["string_prop"],
            typing_extensions.Literal["date_prop"],
            typing_extensions.Literal["datetime_prop"],
            typing_extensions.Literal["array_nullable_prop"],
            typing_extensions.Literal["array_and_items_nullable_prop"],
            typing_extensions.Literal["array_items_nullable"],
            typing_extensions.Literal["object_nullable_prop"],
            typing_extensions.Literal["object_and_items_nullable_prop"],
            typing_extensions.Literal["object_items_nullable"],
            str
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        integer_prop: typing.Union[MetaOapg.properties.integer_prop, None, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        number_prop: typing.Union[MetaOapg.properties.number_prop, None, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        boolean_prop: typing.Union[MetaOapg.properties.boolean_prop, None, bool, schemas.Unset] = schemas.unset,
        string_prop: typing.Union[MetaOapg.properties.string_prop, None, str, schemas.Unset] = schemas.unset,
        date_prop: typing.Union[MetaOapg.properties.date_prop, None, str, date, schemas.Unset] = schemas.unset,
        datetime_prop: typing.Union[MetaOapg.properties.datetime_prop, None, str, datetime, schemas.Unset] = schemas.unset,
        array_nullable_prop: typing.Union[MetaOapg.properties.array_nullable_prop, list, tuple, None, schemas.Unset] = schemas.unset,
        array_and_items_nullable_prop: typing.Union[MetaOapg.properties.array_and_items_nullable_prop, list, tuple, None, schemas.Unset] = schemas.unset,
        array_items_nullable: typing.Union[MetaOapg.properties.array_items_nullable, list, tuple, schemas.Unset] = schemas.unset,
        object_nullable_prop: typing.Union[MetaOapg.properties.object_nullable_prop, dict, frozendict.frozendict, None, schemas.Unset] = schemas.unset,
        object_and_items_nullable_prop: typing.Union[MetaOapg.properties.object_and_items_nullable_prop, dict, frozendict.frozendict, None, schemas.Unset] = schemas.unset,
        object_items_nullable: typing.Union[MetaOapg.properties.object_items_nullable, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additionalProperties, dict, frozendict.frozendict, None, ],
    ) -> 'NullableClass':
        return super().__new__(
            cls,
            *_args,
            integer_prop=integer_prop,
            number_prop=number_prop,
            boolean_prop=boolean_prop,
            string_prop=string_prop,
            date_prop=date_prop,
            datetime_prop=datetime_prop,
            array_nullable_prop=array_nullable_prop,
            array_and_items_nullable_prop=array_and_items_nullable_prop,
            array_items_nullable=array_items_nullable,
            object_nullable_prop=object_nullable_prop,
            object_and_items_nullable_prop=object_and_items_nullable_prop,
            object_items_nullable=object_items_nullable,
            _configuration=_configuration,
            **kwargs,
        )
