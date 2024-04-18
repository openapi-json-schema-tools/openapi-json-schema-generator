# NullableClass
petstore_api.components.schema.nullable_class
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[NullableClassDictInput](#nullableclassdictinput), [NullableClassDict](#nullableclassdict) | [NullableClassDict](#nullableclassdict) |

## NullableClassDictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            None,
            int,
        ],
        typing.Union[
            None,
            typing.Union[
                int,
                float
            ],
        ],
        typing.Union[
            None,
            bool,
        ],
        typing.Union[
            None,
            str,
        ],
        typing.Union[
            None,
            typing.Union[
                str,
                datetime.date
            ],
        ],
        typing.Union[
            None,
            typing.Union[
                str,
                datetime.datetime
            ],
        ],
        typing.Union[
            None,
            typing.Union[
                ArrayNullablePropTupleInput,
                ArrayNullablePropTuple
            ],
        ],
        typing.Union[
            None,
            typing.Union[
                ArrayAndItemsNullablePropTupleInput,
                ArrayAndItemsNullablePropTuple
            ],
        ],
        typing.Union[
            ArrayItemsNullableTupleInput,
            ArrayItemsNullableTuple
        ],
        typing.Union[
            None,
            typing.Union[
                ObjectNullablePropDictInput,
                ObjectNullablePropDict,
            ],
        ],
        typing.Union[
            None,
            typing.Union[
                ObjectAndItemsNullablePropDictInput,
                ObjectAndItemsNullablePropDict,
            ],
        ],
        typing.Union[
            ObjectItemsNullableDictInput,
            ObjectItemsNullableDict,
        ],
        typing.Union[
            None,
            typing.Union[
                typing.Mapping[str, schemas.INPUT_TYPES_ALL],
                schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
            ],
        ],
    ]
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**integer_prop** | None, int |  | [optional]
**number_prop** | None, float, int |  | [optional]
**boolean_prop** | None, bool |  | [optional]
**string_prop** | None, str |  | [optional]
**date_prop** | None, str, datetime.date |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**datetime_prop** | None, str, datetime.datetime |  | [optional] value must conform to RFC-3339 date-time
**array_nullable_prop** | None, [ArrayNullablePropTupleInput](#arraynullableproptupleinput), [ArrayNullablePropTuple](#arraynullableproptuple) |  | [optional]
**array_and_items_nullable_prop** | None, [ArrayAndItemsNullablePropTupleInput](#arrayanditemsnullableproptupleinput), [ArrayAndItemsNullablePropTuple](#arrayanditemsnullableproptuple) |  | [optional]
**array_items_nullable** | [ArrayItemsNullableTupleInput](#arrayitemsnullabletupleinput), [ArrayItemsNullableTuple](#arrayitemsnullabletuple) |  | [optional]
**object_nullable_prop** | None, [ObjectNullablePropDictInput](#objectnullablepropdictinput), [ObjectNullablePropDict](#objectnullablepropdict) |  | [optional]
**object_and_items_nullable_prop** | None, [ObjectAndItemsNullablePropDictInput](#objectanditemsnullablepropdictinput), [ObjectAndItemsNullablePropDict](#objectanditemsnullablepropdict) |  | [optional]
**object_items_nullable** | [ObjectItemsNullableDictInput](#objectitemsnullabledictinput), [ObjectItemsNullableDict](#objectitemsnullabledict) |  | [optional]
**any_string_name** | None, dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## NullableClassDict
```
base class: schemas.immutabledict[str, typing.Union[
    schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
    None,
    typing.Tuple[schemas.OUTPUT_BASE_TYPES],
    str,
    bool,
    typing.Union[int, float],
    int,
]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**integer_prop** | None, int, schemas.Unset |  | [optional]
**number_prop** | None, float, int, schemas.Unset |  | [optional]
**boolean_prop** | None, bool, schemas.Unset |  | [optional]
**string_prop** | None, str, schemas.Unset |  | [optional]
**date_prop** | None, str, datetime.date, schemas.Unset |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**datetime_prop** | None, str, datetime.datetime, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**array_nullable_prop** | None, [ArrayNullablePropTupleInput](#arraynullableproptupleinput), [ArrayNullablePropTuple](#arraynullableproptuple), schemas.Unset |  | [optional]
**array_and_items_nullable_prop** | None, [ArrayAndItemsNullablePropTupleInput](#arrayanditemsnullableproptupleinput), [ArrayAndItemsNullablePropTuple](#arrayanditemsnullableproptuple), schemas.Unset |  | [optional]
**array_items_nullable** | [ArrayItemsNullableTupleInput](#arrayitemsnullabletupleinput), [ArrayItemsNullableTuple](#arrayitemsnullabletuple), schemas.Unset |  | [optional]
**object_nullable_prop** | None, [ObjectNullablePropDictInput](#objectnullablepropdictinput), [ObjectNullablePropDict](#objectnullablepropdict), schemas.Unset |  | [optional]
**object_and_items_nullable_prop** | None, [ObjectAndItemsNullablePropDictInput](#objectanditemsnullablepropdictinput), [ObjectAndItemsNullablePropDict](#objectanditemsnullablepropdict), schemas.Unset |  | [optional]
**object_items_nullable** | [ObjectItemsNullableDictInput](#objectitemsnullabledictinput), [ObjectItemsNullableDict](#objectitemsnullabledict), schemas.Unset |  | [optional]
**kwargs** | None, dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**integer_prop** | None, int, schemas.Unset |  | [optional]
**number_prop** | None, float, int, schemas.Unset |  | [optional]
**boolean_prop** | None, bool, schemas.Unset |  | [optional]
**string_prop** | None, str, schemas.Unset |  | [optional]
**date_prop** | None, str, schemas.Unset |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**datetime_prop** | None, str, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**array_nullable_prop** | None, [ArrayNullablePropTuple](#arraynullableproptuple), schemas.Unset |  | [optional]
**array_and_items_nullable_prop** | None, [ArrayAndItemsNullablePropTuple](#arrayanditemsnullableproptuple), schemas.Unset |  | [optional]
**array_items_nullable** | [ArrayItemsNullableTuple](#arrayitemsnullabletuple), schemas.Unset |  | [optional]
**object_nullable_prop** | None, [ObjectNullablePropDict](#objectnullablepropdict), schemas.Unset |  | [optional]
**object_and_items_nullable_prop** | None, [ObjectAndItemsNullablePropDict](#objectanditemsnullablepropdict), schemas.Unset |  | [optional]
**object_items_nullable** | [ObjectItemsNullableDict](#objectitemsnullabledict), schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [NullableClassDictInput](#nullableclassdictinput), [NullableClassDict](#nullableclassdict) | [NullableClassDict](#nullableclassdict) | a constructor
get_additional_property_ | str | None, schemas.immutabledict, schemas.Unset | provides type safety for additional properties

# ArrayNullableProp
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, [ArrayNullablePropTupleInput](#arraynullableproptupleinput), [ArrayNullablePropTuple](#arraynullableproptuple) | None, [ArrayNullablePropTuple](#arraynullableproptuple) |

## ArrayNullablePropTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            typing.Mapping[str, schemas.INPUT_TYPES_ALL],
            schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
        ],
    ],
    typing.Tuple[
        typing.Union[
            typing.Mapping[str, schemas.INPUT_TYPES_ALL],
            schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
dict, schemas.immutabledict |  |

## ArrayNullablePropTuple
```
base class: typing.Tuple[
    schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | None, [ArrayNullablePropTupleInput](#arraynullableproptupleinput), [ArrayNullablePropTuple](#arraynullableproptuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | schemas.immutabledict | This method is used under the hood when instance[0] is called

# Items
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# ArrayAndItemsNullableProp
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, [ArrayAndItemsNullablePropTupleInput](#arrayanditemsnullableproptupleinput), [ArrayAndItemsNullablePropTuple](#arrayanditemsnullableproptuple) | None, [ArrayAndItemsNullablePropTuple](#arrayanditemsnullableproptuple) |

## ArrayAndItemsNullablePropTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            None,
            typing.Union[
                typing.Mapping[str, schemas.INPUT_TYPES_ALL],
                schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
            ],
        ],
    ],
    typing.Tuple[
        typing.Union[
            None,
            typing.Union[
                typing.Mapping[str, schemas.INPUT_TYPES_ALL],
                schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
            ],
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
None, dict, schemas.immutabledict |  |

## ArrayAndItemsNullablePropTuple
```
base class: typing.Tuple[
    typing.Union[
        None,
        schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
    ],
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | None, [ArrayAndItemsNullablePropTupleInput](#arrayanditemsnullableproptupleinput), [ArrayAndItemsNullablePropTuple](#arrayanditemsnullableproptuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | None, schemas.immutabledict | This method is used under the hood when instance[0] is called

# Items2
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |

# ArrayItemsNullable
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayItemsNullableTupleInput](#arrayitemsnullabletupleinput), [ArrayItemsNullableTuple](#arrayitemsnullabletuple) | [ArrayItemsNullableTuple](#arrayitemsnullabletuple) |

## ArrayItemsNullableTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            None,
            typing.Union[
                typing.Mapping[str, schemas.INPUT_TYPES_ALL],
                schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
            ],
        ],
    ],
    typing.Tuple[
        typing.Union[
            None,
            typing.Union[
                typing.Mapping[str, schemas.INPUT_TYPES_ALL],
                schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
            ],
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
None, dict, schemas.immutabledict |  |

## ArrayItemsNullableTuple
```
base class: typing.Tuple[
    typing.Union[
        None,
        schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
    ],
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ArrayItemsNullableTupleInput](#arrayitemsnullabletupleinput), [ArrayItemsNullableTuple](#arrayitemsnullabletuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | None, schemas.immutabledict | This method is used under the hood when instance[0] is called

# Items3
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |

# ObjectNullableProp
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, [ObjectNullablePropDictInput](#objectnullablepropdictinput), [ObjectNullablePropDict](#objectnullablepropdict) | None, [ObjectNullablePropDict](#objectnullablepropdict) |

## ObjectNullablePropDictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        typing.Mapping[str, schemas.INPUT_TYPES_ALL],
        schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
    ],
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## ObjectNullablePropDict
```
base class: schemas.immutabledict[str, schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | None, [ObjectNullablePropDictInput](#objectnullablepropdictinput), [ObjectNullablePropDict](#objectnullablepropdict) | None, [ObjectNullablePropDict](#objectnullablepropdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, schemas.Unset | provides type safety for additional properties

# AdditionalProperties
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# ObjectAndItemsNullableProp
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, [ObjectAndItemsNullablePropDictInput](#objectanditemsnullablepropdictinput), [ObjectAndItemsNullablePropDict](#objectanditemsnullablepropdict) | None, [ObjectAndItemsNullablePropDict](#objectanditemsnullablepropdict) |

## ObjectAndItemsNullablePropDictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        None,
        typing.Union[
            typing.Mapping[str, schemas.INPUT_TYPES_ALL],
            schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
        ],
    ],
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | None, dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## ObjectAndItemsNullablePropDict
```
base class: schemas.immutabledict[str, typing.Union[
    None,
    schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | None, dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | None, [ObjectAndItemsNullablePropDictInput](#objectanditemsnullablepropdictinput), [ObjectAndItemsNullablePropDict](#objectanditemsnullablepropdict) | None, [ObjectAndItemsNullablePropDict](#objectanditemsnullablepropdict) | a constructor
get_additional_property_ | str | None, schemas.immutabledict, schemas.Unset | provides type safety for additional properties

# AdditionalProperties2
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |

# ObjectItemsNullable
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectItemsNullableDictInput](#objectitemsnullabledictinput), [ObjectItemsNullableDict](#objectitemsnullabledict) | [ObjectItemsNullableDict](#objectitemsnullabledict) |

## ObjectItemsNullableDictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        None,
        typing.Union[
            typing.Mapping[str, schemas.INPUT_TYPES_ALL],
            schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
        ],
    ],
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | None, dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## ObjectItemsNullableDict
```
base class: schemas.immutabledict[str, typing.Union[
    None,
    schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | None, dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ObjectItemsNullableDictInput](#objectitemsnullabledictinput), [ObjectItemsNullableDict](#objectitemsnullabledict) | [ObjectItemsNullableDict](#objectitemsnullabledict) | a constructor
get_additional_property_ | str | None, schemas.immutabledict, schemas.Unset | provides type safety for additional properties

# AdditionalProperties3
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |

# AdditionalProperties4
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
