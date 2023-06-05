# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class AdditionalProperties(
    schemas.NoneBase,
    schemas.DictBase,
    schemas.Schema[schemas.T],
    schemas.NoneFrozenDictMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            frozendict.frozendict,
        })


    def __new__(
        cls,
        *args_: typing.Union[
            None,
            dict,
            frozendict.frozendict
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            dict,
            frozendict.frozendict,
            list,
            tuple,
            decimal.Decimal,
            float,
            int,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            bool,
            None,
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.Schema
        ],
    ) -> AdditionalProperties[
        typing.Union[
            schemas.NoneClass,
            frozendict.frozendict
        ]
    ]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            AdditionalProperties[
                typing.Union[
                    schemas.NoneClass,
                    frozendict.frozendict
                ]
            ],
            inst
        )
        return inst



class IntegerProp(
    schemas.NoneBase,
    schemas.IntBase,
    schemas.Schema[schemas.T],
    schemas.NoneDecimalMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            decimal.Decimal,
        })
        format: str = 'int'


    def __new__(
        cls,
        arg_: typing.Union[
            None,
            decimal.Decimal,
            int
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> IntegerProp[
        typing.Union[
            schemas.NoneClass,
            decimal.Decimal
        ]
    ]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            IntegerProp[
                typing.Union[
                    schemas.NoneClass,
                    decimal.Decimal
                ]
            ],
            inst
        )
        return inst



class NumberProp(
    schemas.NoneBase,
    schemas.NumberBase,
    schemas.Schema[schemas.T],
    schemas.NoneDecimalMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            decimal.Decimal,
        })


    def __new__(
        cls,
        arg_: typing.Union[
            None,
            decimal.Decimal,
            int,
            float
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> NumberProp[
        typing.Union[
            schemas.NoneClass,
            decimal.Decimal
        ]
    ]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            NumberProp[
                typing.Union[
                    schemas.NoneClass,
                    decimal.Decimal
                ]
            ],
            inst
        )
        return inst



class BooleanProp(
    schemas.NoneBase,
    schemas.BoolBase,
    schemas.Schema[schemas.T],
    schemas.NoneBoolMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            schemas.BoolClass,
        })


    def __new__(
        cls,
        arg_: typing.Union[
            None,
            bool
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> BooleanProp[
        typing.Union[
            schemas.NoneClass,
            schemas.BoolClass
        ]
    ]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            BooleanProp[
                typing.Union[
                    schemas.NoneClass,
                    schemas.BoolClass
                ]
            ],
            inst
        )
        return inst



class StringProp(
    schemas.NoneBase,
    schemas.StrBase,
    schemas.Schema[schemas.T],
    schemas.NoneStrMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            str,
        })


    def __new__(
        cls,
        arg_: typing.Union[
            None,
            str
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> StringProp[
        typing.Union[
            schemas.NoneClass,
            str
        ]
    ]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            StringProp[
                typing.Union[
                    schemas.NoneClass,
                    str
                ]
            ],
            inst
        )
        return inst



class DateProp(
    schemas.NoneBase,
    schemas.DateBase,
    schemas.StrBase,
    schemas.Schema[schemas.T],
    schemas.NoneStrMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            str,
        })
        format: str = 'date'


    def __new__(
        cls,
        arg_: typing.Union[
            None,
            str,
            datetime.date
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> DateProp[
        typing.Union[
            schemas.NoneClass,
            str
        ]
    ]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            DateProp[
                typing.Union[
                    schemas.NoneClass,
                    str
                ]
            ],
            inst
        )
        return inst



class DatetimeProp(
    schemas.NoneBase,
    schemas.DateTimeBase,
    schemas.StrBase,
    schemas.Schema[schemas.T],
    schemas.NoneStrMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            str,
        })
        format: str = 'date-time'


    def __new__(
        cls,
        arg_: typing.Union[
            None,
            str,
            datetime.datetime
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> DatetimeProp[
        typing.Union[
            schemas.NoneClass,
            str
        ]
    ]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            DatetimeProp[
                typing.Union[
                    schemas.NoneClass,
                    str
                ]
            ],
            inst
        )
        return inst

Items: typing_extensions.TypeAlias = schemas.DictSchema[U]


class ArrayNullableProp(
    schemas.NoneBase,
    schemas.ListBase,
    schemas.Schema[schemas.T],
    schemas.NoneTupleMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            tuple,
        })
        items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore


    def __new__(
        cls,
        arg_: typing.Union[
            None,
            list,
            tuple
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> ArrayNullableProp[
        typing.Union[
            schemas.NoneClass,
            tuple
        ]
    ]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            ArrayNullableProp[
                typing.Union[
                    schemas.NoneClass,
                    tuple
                ]
            ],
            inst
        )
        return inst



class Items(
    schemas.NoneBase,
    schemas.DictBase,
    schemas.Schema[schemas.T],
    schemas.NoneFrozenDictMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            frozendict.frozendict,
        })


    def __new__(
        cls,
        *args_: typing.Union[
            None,
            dict,
            frozendict.frozendict
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            dict,
            frozendict.frozendict,
            list,
            tuple,
            decimal.Decimal,
            float,
            int,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            bool,
            None,
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.Schema
        ],
    ) -> Items[
        typing.Union[
            schemas.NoneClass,
            frozendict.frozendict
        ]
    ]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            Items[
                typing.Union[
                    schemas.NoneClass,
                    frozendict.frozendict
                ]
            ],
            inst
        )
        return inst



class ArrayAndItemsNullableProp(
    schemas.NoneBase,
    schemas.ListBase,
    schemas.Schema[schemas.T],
    schemas.NoneTupleMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            tuple,
        })
        items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore


    def __new__(
        cls,
        arg_: typing.Union[
            None,
            list,
            tuple
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> ArrayAndItemsNullableProp[
        typing.Union[
            schemas.NoneClass,
            tuple
        ]
    ]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            ArrayAndItemsNullableProp[
                typing.Union[
                    schemas.NoneClass,
                    tuple
                ]
            ],
            inst
        )
        return inst



class Items(
    schemas.NoneBase,
    schemas.DictBase,
    schemas.Schema[schemas.T],
    schemas.NoneFrozenDictMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            frozendict.frozendict,
        })


    def __new__(
        cls,
        *args_: typing.Union[
            None,
            dict,
            frozendict.frozendict
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            dict,
            frozendict.frozendict,
            list,
            tuple,
            decimal.Decimal,
            float,
            int,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            bool,
            None,
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.Schema
        ],
    ) -> Items[
        typing.Union[
            schemas.NoneClass,
            frozendict.frozendict
        ]
    ]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            Items[
                typing.Union[
                    schemas.NoneClass,
                    frozendict.frozendict
                ]
            ],
            inst
        )
        return inst



class ArrayItemsNullable(
    schemas.ListSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({tuple})
        items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore

    def __new__(
        cls,
        arg_: typing.Sequence[
            typing.Union[
                Items[typing.Union[
                    schemas.NoneClass,
                    frozendict.frozendict
                ]],
                None,
                dict,
                frozendict.frozendict
            ]
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> ArrayItemsNullable[tuple]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            ArrayItemsNullable[tuple],
            inst
        )
        return inst

    def __getitem__(self, name: int) -> Items[typing.Union[
        schemas.NoneClass,
        frozendict.frozendict
    ]]:
        return super().__getitem__(name)

AdditionalProperties: typing_extensions.TypeAlias = schemas.DictSchema[U]


class ObjectNullableProp(
    schemas.NoneBase,
    schemas.DictBase,
    schemas.Schema[schemas.T],
    schemas.NoneFrozenDictMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            frozendict.frozendict,
        })
        additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore

    
    def __getitem__(self, name: str) -> AdditionalProperties[frozendict.frozendict]:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[
            None,
            dict,
            frozendict.frozendict
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            AdditionalProperties[frozendict.frozendict],
            dict,
            frozendict.frozendict
        ],
    ) -> ObjectNullableProp[
        typing.Union[
            schemas.NoneClass,
            frozendict.frozendict
        ]
    ]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            ObjectNullableProp[
                typing.Union[
                    schemas.NoneClass,
                    frozendict.frozendict
                ]
            ],
            inst
        )
        return inst



class AdditionalProperties(
    schemas.NoneBase,
    schemas.DictBase,
    schemas.Schema[schemas.T],
    schemas.NoneFrozenDictMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            frozendict.frozendict,
        })


    def __new__(
        cls,
        *args_: typing.Union[
            None,
            dict,
            frozendict.frozendict
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            dict,
            frozendict.frozendict,
            list,
            tuple,
            decimal.Decimal,
            float,
            int,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            bool,
            None,
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.Schema
        ],
    ) -> AdditionalProperties[
        typing.Union[
            schemas.NoneClass,
            frozendict.frozendict
        ]
    ]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            AdditionalProperties[
                typing.Union[
                    schemas.NoneClass,
                    frozendict.frozendict
                ]
            ],
            inst
        )
        return inst



class ObjectAndItemsNullableProp(
    schemas.NoneBase,
    schemas.DictBase,
    schemas.Schema[schemas.T],
    schemas.NoneFrozenDictMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            frozendict.frozendict,
        })
        additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore

    
    def __getitem__(self, name: str) -> AdditionalProperties[typing.Union[
        schemas.NoneClass,
        frozendict.frozendict
    ]]:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[
            None,
            dict,
            frozendict.frozendict
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            AdditionalProperties[typing.Union[
                schemas.NoneClass,
                frozendict.frozendict
            ]],
            None,
            dict,
            frozendict.frozendict
        ],
    ) -> ObjectAndItemsNullableProp[
        typing.Union[
            schemas.NoneClass,
            frozendict.frozendict
        ]
    ]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            ObjectAndItemsNullableProp[
                typing.Union[
                    schemas.NoneClass,
                    frozendict.frozendict
                ]
            ],
            inst
        )
        return inst



class AdditionalProperties(
    schemas.NoneBase,
    schemas.DictBase,
    schemas.Schema[schemas.T],
    schemas.NoneFrozenDictMixin
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.NoneClass,
            frozendict.frozendict,
        })


    def __new__(
        cls,
        *args_: typing.Union[
            None,
            dict,
            frozendict.frozendict
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            dict,
            frozendict.frozendict,
            list,
            tuple,
            decimal.Decimal,
            float,
            int,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            bool,
            None,
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.Schema
        ],
    ) -> AdditionalProperties[
        typing.Union[
            schemas.NoneClass,
            frozendict.frozendict
        ]
    ]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            AdditionalProperties[
                typing.Union[
                    schemas.NoneClass,
                    frozendict.frozendict
                ]
            ],
            inst
        )
        return inst



class ObjectItemsNullable(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    
    def __getitem__(self, name: str) -> AdditionalProperties[typing.Union[
        schemas.NoneClass,
        frozendict.frozendict
    ]]:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            AdditionalProperties[typing.Union[
                schemas.NoneClass,
                frozendict.frozendict
            ]],
            None,
            dict,
            frozendict.frozendict
        ],
    ) -> ObjectItemsNullable[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            ObjectItemsNullable[frozendict.frozendict],
            inst
        )
        return inst



class NullableClass(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
        additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["integer_prop"]) -> IntegerProp[typing.Union[
        schemas.NoneClass,
        decimal.Decimal
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number_prop"]) -> NumberProp[typing.Union[
        schemas.NoneClass,
        decimal.Decimal
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["boolean_prop"]) -> BooleanProp[typing.Union[
        schemas.NoneClass,
        schemas.BoolClass
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["string_prop"]) -> StringProp[typing.Union[
        schemas.NoneClass,
        str
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date_prop"]) -> DateProp[typing.Union[
        schemas.NoneClass,
        str
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["datetime_prop"]) -> DatetimeProp[typing.Union[
        schemas.NoneClass,
        str
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["array_nullable_prop"]) -> ArrayNullableProp[typing.Union[
        schemas.NoneClass,
        tuple
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["array_and_items_nullable_prop"]) -> ArrayAndItemsNullableProp[typing.Union[
        schemas.NoneClass,
        tuple
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["array_items_nullable"]) -> ArrayItemsNullable[tuple]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["object_nullable_prop"]) -> ObjectNullableProp[typing.Union[
        schemas.NoneClass,
        frozendict.frozendict
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["object_and_items_nullable_prop"]) -> ObjectAndItemsNullableProp[typing.Union[
        schemas.NoneClass,
        frozendict.frozendict
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["object_items_nullable"]) -> ObjectItemsNullable[frozendict.frozendict]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> AdditionalProperties[typing.Union[
        schemas.NoneClass,
        frozendict.frozendict
    ]]: ...
    
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

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        integer_prop: typing.Union[
            IntegerProp[typing.Union[
                schemas.NoneClass,
                decimal.Decimal
            ]],
            schemas.Unset,
            None,
            decimal.Decimal,
            int
        ] = schemas.unset,
        number_prop: typing.Union[
            NumberProp[typing.Union[
                schemas.NoneClass,
                decimal.Decimal
            ]],
            schemas.Unset,
            None,
            decimal.Decimal,
            int,
            float
        ] = schemas.unset,
        boolean_prop: typing.Union[
            BooleanProp[typing.Union[
                schemas.NoneClass,
                schemas.BoolClass
            ]],
            schemas.Unset,
            None,
            bool
        ] = schemas.unset,
        string_prop: typing.Union[
            StringProp[typing.Union[
                schemas.NoneClass,
                str
            ]],
            schemas.Unset,
            None,
            str
        ] = schemas.unset,
        date_prop: typing.Union[
            DateProp[typing.Union[
                schemas.NoneClass,
                str
            ]],
            schemas.Unset,
            None,
            str,
            datetime.date
        ] = schemas.unset,
        datetime_prop: typing.Union[
            DatetimeProp[typing.Union[
                schemas.NoneClass,
                str
            ]],
            schemas.Unset,
            None,
            str,
            datetime.datetime
        ] = schemas.unset,
        array_nullable_prop: typing.Union[
            ArrayNullableProp[typing.Union[
                schemas.NoneClass,
                tuple
            ]],
            schemas.Unset,
            None,
            list,
            tuple
        ] = schemas.unset,
        array_and_items_nullable_prop: typing.Union[
            ArrayAndItemsNullableProp[typing.Union[
                schemas.NoneClass,
                tuple
            ]],
            schemas.Unset,
            None,
            list,
            tuple
        ] = schemas.unset,
        array_items_nullable: typing.Union[
            ArrayItemsNullable[tuple],
            schemas.Unset,
            list,
            tuple
        ] = schemas.unset,
        object_nullable_prop: typing.Union[
            ObjectNullableProp[typing.Union[
                schemas.NoneClass,
                frozendict.frozendict
            ]],
            schemas.Unset,
            None,
            dict,
            frozendict.frozendict
        ] = schemas.unset,
        object_and_items_nullable_prop: typing.Union[
            ObjectAndItemsNullableProp[typing.Union[
                schemas.NoneClass,
                frozendict.frozendict
            ]],
            schemas.Unset,
            None,
            dict,
            frozendict.frozendict
        ] = schemas.unset,
        object_items_nullable: typing.Union[
            ObjectItemsNullable[frozendict.frozendict],
            schemas.Unset,
            dict,
            frozendict.frozendict
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            AdditionalProperties[typing.Union[
                schemas.NoneClass,
                frozendict.frozendict
            ]],
            None,
            dict,
            frozendict.frozendict
        ],
    ) -> NullableClass[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
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
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            NullableClass[frozendict.frozendict],
            inst
        )
        return inst

Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "integer_prop": typing.Type[IntegerProp],
        "number_prop": typing.Type[NumberProp],
        "boolean_prop": typing.Type[BooleanProp],
        "string_prop": typing.Type[StringProp],
        "date_prop": typing.Type[DateProp],
        "datetime_prop": typing.Type[DatetimeProp],
        "array_nullable_prop": typing.Type[ArrayNullableProp],
        "array_and_items_nullable_prop": typing.Type[ArrayAndItemsNullableProp],
        "array_items_nullable": typing.Type[ArrayItemsNullable],
        "object_nullable_prop": typing.Type[ObjectNullableProp],
        "object_and_items_nullable_prop": typing.Type[ObjectAndItemsNullableProp],
        "object_items_nullable": typing.Type[ObjectItemsNullable],
    }
)
