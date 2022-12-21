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


class NullableClass(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class Properties:
            
            
            class IntegerProp(
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
            
            
            class NumberProp(
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
            
            
            class BooleanProp(
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
            
            
            class StringProp(
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
            
            
            class DateProp(
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
            
            
            class DatetimeProp(
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
            
            
            class ArrayNullableProp(
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
            
            
            class ArrayAndItemsNullableProp(
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
                    
                    
                    class Items(
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
                    
                    
                    class Items(
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
                    _arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.Items, dict, frozendict.frozendict, None, ]], typing.List[typing.Union[MetaOapg.Items, dict, frozendict.frozendict, None, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'ArrayItemsNullable':
                    return super().__new__(
                        cls,
                        _arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.Items:
                    return super().__getitem__(i)
            
            
            class ObjectNullableProp(
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
            
                
                def __getitem__(self, name: str) -> MetaOapg.AdditionalProperties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: str) -> MetaOapg.AdditionalProperties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.AdditionalProperties, dict, frozendict.frozendict, ],
                ) -> 'ObjectNullableProp':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class ObjectAndItemsNullableProp(
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
                    
                    
                    class AdditionalProperties(
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
            
                
                def __getitem__(self, name: str) -> MetaOapg.AdditionalProperties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: str) -> MetaOapg.AdditionalProperties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.AdditionalProperties, dict, frozendict.frozendict, None, ],
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
                    
                    
                    class AdditionalProperties(
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
                
                def __getitem__(self, name: str) -> MetaOapg.AdditionalProperties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: str) -> MetaOapg.AdditionalProperties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.AdditionalProperties, dict, frozendict.frozendict, None, ],
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
        
        
        class AdditionalProperties(
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
    def __getitem__(self, name: typing_extensions.Literal["integer_prop"]) -> MetaOapg.Properties.IntegerProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number_prop"]) -> MetaOapg.Properties.NumberProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["boolean_prop"]) -> MetaOapg.Properties.BooleanProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["string_prop"]) -> MetaOapg.Properties.StringProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date_prop"]) -> MetaOapg.Properties.DateProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["datetime_prop"]) -> MetaOapg.Properties.DatetimeProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["array_nullable_prop"]) -> MetaOapg.Properties.ArrayNullableProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["array_and_items_nullable_prop"]) -> MetaOapg.Properties.ArrayAndItemsNullableProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["array_items_nullable"]) -> MetaOapg.Properties.ArrayItemsNullable: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["object_nullable_prop"]) -> MetaOapg.Properties.ObjectNullableProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["object_and_items_nullable_prop"]) -> MetaOapg.Properties.ObjectAndItemsNullableProp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["object_items_nullable"]) -> MetaOapg.Properties.ObjectItemsNullable: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.AdditionalProperties: ...
    
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
    def get_item_oapg(self, name: typing_extensions.Literal["integer_prop"]) -> typing.Union[MetaOapg.Properties.IntegerProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["number_prop"]) -> typing.Union[MetaOapg.Properties.NumberProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["boolean_prop"]) -> typing.Union[MetaOapg.Properties.BooleanProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["string_prop"]) -> typing.Union[MetaOapg.Properties.StringProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date_prop"]) -> typing.Union[MetaOapg.Properties.DateProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["datetime_prop"]) -> typing.Union[MetaOapg.Properties.DatetimeProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["array_nullable_prop"]) -> typing.Union[MetaOapg.Properties.ArrayNullableProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["array_and_items_nullable_prop"]) -> typing.Union[MetaOapg.Properties.ArrayAndItemsNullableProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["array_items_nullable"]) -> typing.Union[MetaOapg.Properties.ArrayItemsNullable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["object_nullable_prop"]) -> typing.Union[MetaOapg.Properties.ObjectNullableProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["object_and_items_nullable_prop"]) -> typing.Union[MetaOapg.Properties.ObjectAndItemsNullableProp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["object_items_nullable"]) -> typing.Union[MetaOapg.Properties.ObjectItemsNullable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[MetaOapg.AdditionalProperties, schemas.Unset]: ...
    
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
        integer_prop: typing.Union[MetaOapg.Properties.IntegerProp, None, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        number_prop: typing.Union[MetaOapg.Properties.NumberProp, None, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        boolean_prop: typing.Union[MetaOapg.Properties.BooleanProp, None, bool, schemas.Unset] = schemas.unset,
        string_prop: typing.Union[MetaOapg.Properties.StringProp, None, str, schemas.Unset] = schemas.unset,
        date_prop: typing.Union[MetaOapg.Properties.DateProp, None, str, date, schemas.Unset] = schemas.unset,
        datetime_prop: typing.Union[MetaOapg.Properties.DatetimeProp, None, str, datetime, schemas.Unset] = schemas.unset,
        array_nullable_prop: typing.Union[MetaOapg.Properties.ArrayNullableProp, list, tuple, None, schemas.Unset] = schemas.unset,
        array_and_items_nullable_prop: typing.Union[MetaOapg.Properties.ArrayAndItemsNullableProp, list, tuple, None, schemas.Unset] = schemas.unset,
        array_items_nullable: typing.Union[MetaOapg.Properties.ArrayItemsNullable, list, tuple, schemas.Unset] = schemas.unset,
        object_nullable_prop: typing.Union[MetaOapg.Properties.ObjectNullableProp, dict, frozendict.frozendict, None, schemas.Unset] = schemas.unset,
        object_and_items_nullable_prop: typing.Union[MetaOapg.Properties.ObjectAndItemsNullableProp, dict, frozendict.frozendict, None, schemas.Unset] = schemas.unset,
        object_items_nullable: typing.Union[MetaOapg.Properties.ObjectItemsNullable, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.AdditionalProperties, dict, frozendict.frozendict, None, ],
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
