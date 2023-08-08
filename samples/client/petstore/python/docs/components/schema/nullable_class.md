petstore_api.components.schema.nullable_class
# Schema NullableClass

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[NullableClassDictInput](#nullableclassdictinput), [NullableClassDict](#nullableclassdict) | [NullableClassDict](#nullableclassdict) |

## NullableClassDictInput
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
### from_dict_ method
Input Type | Return Type
---------- | -----------
[NullableClassDictInput](#nullableclassdictinput), [NullableClassDict](#nullableclassdict) | [NullableClassDict](#nullableclassdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**integer_prop** | None, int, schemas.Unset | None, int, schemas.Unset |  | [optional]
**number_prop** | None, float, int, schemas.Unset | None, float, int, schemas.Unset |  | [optional]
**boolean_prop** | None, bool, schemas.Unset | None, bool, schemas.Unset |  | [optional]
**string_prop** | None, str, schemas.Unset | None, str, schemas.Unset |  | [optional]
**date_prop** | None, str, datetime.date, schemas.Unset | None, str, schemas.Unset |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**datetime_prop** | None, str, datetime.datetime, schemas.Unset | None, str, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**array_nullable_prop** | None, list, tuple, schemas.Unset | [properties.ArrayNullableProp](#properties-arraynullableprop) |  | [optional]
**array_and_items_nullable_prop** | None, list, tuple, schemas.Unset | [properties.ArrayAndItemsNullableProp](#properties-arrayanditemsnullableprop) |  | [optional]
**array_items_nullable** | list, tuple, schemas.Unset | [properties.ArrayItemsNullable](#properties-arrayitemsnullable) |  | [optional]
**object_nullable_prop** | None, dict, schemas.immutabledict, schemas.Unset | [properties.ObjectNullableProp](#properties-objectnullableprop) |  | [optional]
**object_and_items_nullable_prop** | None, dict, schemas.immutabledict, schemas.Unset | [properties.ObjectAndItemsNullableProp](#properties-objectanditemsnullableprop) |  | [optional]
**object_items_nullable** | dict, schemas.immutabledict, schemas.Unset | [properties.ObjectItemsNullable](#properties-objectitemsnullable) |  | [optional]
**kwargs** | None, dict, schemas.immutabledict | [AdditionalProperties4](#additionalproperties4) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties ArrayNullableProp

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, [ArrayNullablePropTupleInput](#properties-arraynullableprop-arraynullableproptupleinput), [ArrayNullablePropTuple](#properties-arraynullableprop-arraynullableproptuple) | None, [ArrayNullablePropTuple](#properties-arraynullableprop-arraynullableproptuple) |

## properties ArrayNullableProp ArrayNullablePropTupleInput
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
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## properties ObjectNullableProp ObjectNullablePropDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
None, [ObjectNullablePropDictInput](#properties-objectnullableprop-objectnullablepropdictinput), [ObjectNullablePropDict](#properties-objectnullableprop-objectnullablepropdict) | None, [ObjectNullablePropDict](#properties-objectnullableprop-objectnullablepropdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**kwargs** | dict, schemas.immutabledict | [AdditionalProperties](#properties-objectnullableprop-additionalproperties) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

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
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | None, dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## properties ObjectAndItemsNullableProp ObjectAndItemsNullablePropDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
None, [ObjectAndItemsNullablePropDictInput](#properties-objectanditemsnullableprop-objectanditemsnullablepropdictinput), [ObjectAndItemsNullablePropDict](#properties-objectanditemsnullableprop-objectanditemsnullablepropdict) | None, [ObjectAndItemsNullablePropDict](#properties-objectanditemsnullableprop-objectanditemsnullablepropdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**kwargs** | None, dict, schemas.immutabledict | [AdditionalProperties2](#properties-objectanditemsnullableprop-additionalproperties2) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

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
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | None, dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## properties ObjectItemsNullable ObjectItemsNullableDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[ObjectItemsNullableDictInput](#properties-objectitemsnullable-objectitemsnullabledictinput), [ObjectItemsNullableDict](#properties-objectitemsnullable-objectitemsnullabledict) | [ObjectItemsNullableDict](#properties-objectitemsnullable-objectitemsnullabledict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**kwargs** | None, dict, schemas.immutabledict | [AdditionalProperties3](#properties-objectitemsnullable-additionalproperties3) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

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
