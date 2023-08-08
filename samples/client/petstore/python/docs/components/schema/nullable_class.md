petstore_api.components.schema.nullable_class
# Schema NullableClass

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[NullableClassDictInput](#nullableclassdictinput), [NullableClassDict](#nullableclassdict) | [NullableClassDict](#nullableclassdict) |

## NullableClassDictInput
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
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**integer_prop** | None, int |  | [optional]
**number_prop** | None, float, int |  | [optional]
**boolean_prop** | None, bool |  | [optional]
**string_prop** | None, str |  | [optional]
**date_prop** | None, str, datetime.date |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**datetime_prop** | None, str, datetime.datetime |  | [optional] value must conform to RFC-3339 date-time
**array_nullable_prop** | None, list, tuple |  | [optional]
**array_and_items_nullable_prop** | None, list, tuple |  | [optional]
**array_items_nullable** | list, tuple |  | [optional]
**object_nullable_prop** | None, dict, schemas.immutabledict |  | [optional]
**object_and_items_nullable_prop** | None, dict, schemas.immutabledict |  | [optional]
**object_items_nullable** | dict, schemas.immutabledict |  | [optional]
**any_string_name** | None, dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## NullableClassDict
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**integer_prop** | None, int, schemas.Unset |  | [optional]
**number_prop** | None, float, int, schemas.Unset |  | [optional]
**boolean_prop** | None, bool, schemas.Unset |  | [optional]
**string_prop** | None, str, schemas.Unset |  | [optional]
**date_prop** | None, str, datetime.date, schemas.Unset |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**datetime_prop** | None, str, datetime.datetime, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**array_nullable_prop** | None, list, tuple, schemas.Unset |  | [optional]
**array_and_items_nullable_prop** | None, list, tuple, schemas.Unset |  | [optional]
**array_items_nullable** | list, tuple, schemas.Unset |  | [optional]
**object_nullable_prop** | None, dict, schemas.immutabledict, schemas.Unset |  | [optional]
**object_and_items_nullable_prop** | None, dict, schemas.immutabledict, schemas.Unset |  | [optional]
**object_items_nullable** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**kwargs** | None, dict, schemas.immutabledict | [AdditionalProperties4](#additionalproperties4) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**integer_prop** | None, int, schemas.Unset |  | [optional]
**number_prop** | None, float, int, schemas.Unset |  | [optional]
**boolean_prop** | None, bool, schemas.Unset |  | [optional]
**string_prop** | None, str, schemas.Unset |  | [optional]
**date_prop** | None, str, schemas.Unset |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**datetime_prop** | None, str, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**array_nullable_prop** | [properties.ArrayNullableProp](#properties-arraynullableprop) |  | [optional]
**array_and_items_nullable_prop** | [properties.ArrayAndItemsNullableProp](#properties-arrayanditemsnullableprop) |  | [optional]
**array_items_nullable** | [properties.ArrayItemsNullable](#properties-arrayitemsnullable) |  | [optional]
**object_nullable_prop** | [properties.ObjectNullableProp](#properties-objectnullableprop) |  | [optional]
**object_and_items_nullable_prop** | [properties.ObjectAndItemsNullableProp](#properties-objectanditemsnullableprop) |  | [optional]
**object_items_nullable** | [properties.ObjectItemsNullable](#properties-objectitemsnullable) |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [NullableClassDictInput](#nullableclassdictinput), [NullableClassDict](#nullableclassdict) | [NullableClassDict](#nullableclassdict) | a constructor
get_additional_property_ | str | [AdditionalProperties4](#additionalproperties4) | provides type safety for additional properties

# properties ArrayNullableProp

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, [ArrayNullablePropTupleInput](#properties-arraynullableprop-arraynullableproptupleinput), [ArrayNullablePropTuple](#properties-arraynullableprop-arraynullableproptuple) | None, [ArrayNullablePropTuple](#properties-arraynullableprop-arraynullableproptuple) |

## properties ArrayNullableProp ArrayNullablePropTupleInput
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
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | dict, schemas.immutabledict |  |

## properties ArrayNullableProp ArrayNullablePropTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | dict, schemas.immutabledict | schemas.immutabledict |  |

# properties ArrayNullableProp Items

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# properties ArrayAndItemsNullableProp

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, [ArrayAndItemsNullablePropTupleInput](#properties-arrayanditemsnullableprop-arrayanditemsnullableproptupleinput), [ArrayAndItemsNullablePropTuple](#properties-arrayanditemsnullableprop-arrayanditemsnullableproptuple) | None, [ArrayAndItemsNullablePropTuple](#properties-arrayanditemsnullableprop-arrayanditemsnullableproptuple) |

## properties ArrayAndItemsNullableProp ArrayAndItemsNullablePropTupleInput
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
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | None, dict, schemas.immutabledict |  |

## properties ArrayAndItemsNullableProp ArrayAndItemsNullablePropTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | None, dict, schemas.immutabledict | None, schemas.immutabledict |  |

# properties ArrayAndItemsNullableProp Items2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |

# properties ArrayItemsNullable

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayItemsNullableTupleInput](#properties-arrayitemsnullable-arrayitemsnullabletupleinput), [ArrayItemsNullableTuple](#properties-arrayitemsnullable-arrayitemsnullabletuple) | [ArrayItemsNullableTuple](#properties-arrayitemsnullable-arrayitemsnullabletuple) |

## properties ArrayItemsNullable ArrayItemsNullableTupleInput
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
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | None, dict, schemas.immutabledict |  |

## properties ArrayItemsNullable ArrayItemsNullableTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | None, dict, schemas.immutabledict | None, schemas.immutabledict |  |

# properties ArrayItemsNullable Items3

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |

# properties ObjectNullableProp

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, [ObjectNullablePropDictInput](#properties-objectnullableprop-objectnullablepropdictinput), [ObjectNullablePropDict](#properties-objectnullableprop-objectnullablepropdict) | None, [ObjectNullablePropDict](#properties-objectnullableprop-objectnullablepropdict) |

## properties ObjectNullableProp ObjectNullablePropDictInput
type: typing.Mapping[
    str,
    typing.Union[
        typing.Mapping[str, schemas.INPUT_TYPES_ALL],
        schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
    ],
]
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## properties ObjectNullableProp ObjectNullablePropDict
base class: schemas.immutabledict[str, schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | dict, schemas.immutabledict | [AdditionalProperties](#properties-objectnullableprop-additionalproperties) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | None, [ObjectNullablePropDictInput](#properties-objectnullableprop-objectnullablepropdictinput), [ObjectNullablePropDict](#properties-objectnullableprop-objectnullablepropdict) | None, [ObjectNullablePropDict](#properties-objectnullableprop-objectnullablepropdict) | a constructor
get_additional_property_ | str | [AdditionalProperties](#properties-objectnullableprop-additionalproperties) | provides type safety for additional properties

# properties ObjectNullableProp AdditionalProperties

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# properties ObjectAndItemsNullableProp

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, [ObjectAndItemsNullablePropDictInput](#properties-objectanditemsnullableprop-objectanditemsnullablepropdictinput), [ObjectAndItemsNullablePropDict](#properties-objectanditemsnullableprop-objectanditemsnullablepropdict) | None, [ObjectAndItemsNullablePropDict](#properties-objectanditemsnullableprop-objectanditemsnullablepropdict) |

## properties ObjectAndItemsNullableProp ObjectAndItemsNullablePropDictInput
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
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | None, dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## properties ObjectAndItemsNullableProp ObjectAndItemsNullablePropDict
base class: schemas.immutabledict[str, typing.Union[
    None,
    schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
]]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | None, dict, schemas.immutabledict | [AdditionalProperties2](#properties-objectanditemsnullableprop-additionalproperties2) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | None, [ObjectAndItemsNullablePropDictInput](#properties-objectanditemsnullableprop-objectanditemsnullablepropdictinput), [ObjectAndItemsNullablePropDict](#properties-objectanditemsnullableprop-objectanditemsnullablepropdict) | None, [ObjectAndItemsNullablePropDict](#properties-objectanditemsnullableprop-objectanditemsnullablepropdict) | a constructor
get_additional_property_ | str | [AdditionalProperties2](#properties-objectanditemsnullableprop-additionalproperties2) | provides type safety for additional properties

# properties ObjectAndItemsNullableProp AdditionalProperties2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |

# properties ObjectItemsNullable

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectItemsNullableDictInput](#properties-objectitemsnullable-objectitemsnullabledictinput), [ObjectItemsNullableDict](#properties-objectitemsnullable-objectitemsnullabledict) | [ObjectItemsNullableDict](#properties-objectitemsnullable-objectitemsnullabledict) |

## properties ObjectItemsNullable ObjectItemsNullableDictInput
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
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | None, dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## properties ObjectItemsNullable ObjectItemsNullableDict
base class: schemas.immutabledict[str, typing.Union[
    None,
    schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
]]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | None, dict, schemas.immutabledict | [AdditionalProperties3](#properties-objectitemsnullable-additionalproperties3) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ObjectItemsNullableDictInput](#properties-objectitemsnullable-objectitemsnullabledictinput), [ObjectItemsNullableDict](#properties-objectitemsnullable-objectitemsnullabledict) | [ObjectItemsNullableDict](#properties-objectitemsnullable-objectitemsnullabledict) | a constructor
get_additional_property_ | str | [AdditionalProperties3](#properties-objectitemsnullable-additionalproperties3) | provides type safety for additional properties

# properties ObjectItemsNullable AdditionalProperties3

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |

# AdditionalProperties4

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
