petstore_api.components.schema.nullable_class
# Schema NullableClass

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[NullableClassDictInput](#nullableclassdictinput) | [NullableClassDict](#nullableclassdict) |  |

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
Key | Input Type | Accessed Type | Description | Notes
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
**any_string_name** | None, dict, schemas.immutabledict | [AdditionalProperties4](#additionalproperties4) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties ArrayNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, [ArrayNullablePropTupleInput](#properties-arraynullableprop-arraynullableproptupleinput) | None, tuple |  |

## properties ArrayNullableProp ArrayNullablePropTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
[items](#properties-arraynullableprop-items) | dict, schemas.immutabledict |  |

## properties ArrayNullableProp ArrayNullablePropTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arraynullableprop-items) | dict, schemas.immutabledict | schemas.immutabledict |  |

# properties ArrayNullableProp Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |  |

# properties ArrayAndItemsNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, [ArrayAndItemsNullablePropTupleInput](#properties-arrayanditemsnullableprop-arrayanditemsnullableproptupleinput) | None, tuple |  |

## properties ArrayAndItemsNullableProp ArrayAndItemsNullablePropTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
[items](#properties-arrayanditemsnullableprop-items2) | None, dict, schemas.immutabledict |  |

## properties ArrayAndItemsNullableProp ArrayAndItemsNullablePropTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arrayanditemsnullableprop-items2) | None, dict, schemas.immutabledict | None, schemas.immutabledict |  |

# properties ArrayAndItemsNullableProp Items2

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |  |

# properties ArrayItemsNullable

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ArrayItemsNullableTupleInput](#properties-arrayitemsnullable-arrayitemsnullabletupleinput) | tuple |  |

## properties ArrayItemsNullable ArrayItemsNullableTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
[items](#properties-arrayitemsnullable-items3) | None, dict, schemas.immutabledict |  |

## properties ArrayItemsNullable ArrayItemsNullableTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arrayitemsnullable-items3) | None, dict, schemas.immutabledict | None, schemas.immutabledict |  |

# properties ArrayItemsNullable Items3

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |  |

# properties ObjectNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, [ObjectNullablePropDictInput](#properties-objectnullableprop-objectnullablepropdictinput) | None, [ObjectNullablePropDict](#properties-objectnullableprop-objectnullablepropdict) |  |

## properties ObjectNullableProp ObjectNullablePropDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## properties ObjectNullableProp ObjectNullablePropDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict | [AdditionalProperties](#properties-objectnullableprop-additionalproperties) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties ObjectNullableProp AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |  |

# properties ObjectAndItemsNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, [ObjectAndItemsNullablePropDictInput](#properties-objectanditemsnullableprop-objectanditemsnullablepropdictinput) | None, [ObjectAndItemsNullablePropDict](#properties-objectanditemsnullableprop-objectanditemsnullablepropdict) |  |

## properties ObjectAndItemsNullableProp ObjectAndItemsNullablePropDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | None, dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## properties ObjectAndItemsNullableProp ObjectAndItemsNullablePropDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | None, dict, schemas.immutabledict | [AdditionalProperties2](#properties-objectanditemsnullableprop-additionalproperties2) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties ObjectAndItemsNullableProp AdditionalProperties2

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |  |

# properties ObjectItemsNullable

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ObjectItemsNullableDictInput](#properties-objectitemsnullable-objectitemsnullabledictinput) | [ObjectItemsNullableDict](#properties-objectitemsnullable-objectitemsnullabledict) |  |

## properties ObjectItemsNullable ObjectItemsNullableDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | None, dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## properties ObjectItemsNullable ObjectItemsNullableDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | None, dict, schemas.immutabledict | [AdditionalProperties3](#properties-objectitemsnullable-additionalproperties3) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties ObjectItemsNullable AdditionalProperties3

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |  |

# AdditionalProperties4

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, schemas.immutabledict | None, schemas.immutabledict |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
