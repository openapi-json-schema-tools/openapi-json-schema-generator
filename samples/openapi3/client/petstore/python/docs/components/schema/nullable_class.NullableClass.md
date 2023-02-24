petstore_api.components.schema.nullable_class
# Schema NullableClass

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**integer_prop** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  |  | [optional]
**number_prop** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  |  | [optional]
**boolean_prop** | None, bool,  | NoneClass, BoolClass,  |  | [optional]
**string_prop** | None, str,  | NoneClass, str,  |  | [optional]
**date_prop** | None, str, datetime.date,  | NoneClass, str,  |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**datetime_prop** | None, str, datetime.datetime,  | NoneClass, str,  |  | [optional] value must conform to RFC-3339 date-time
[**array_nullable_prop**](#properties-arraynullableprop) | None, list, tuple,  | NoneClass, tuple,  |  | [optional]
[**array_and_items_nullable_prop**](#properties-arrayanditemsnullableprop) | None, list, tuple,  | NoneClass, tuple,  |  | [optional]
[**array_items_nullable**](#properties-arrayitemsnullable) | list, tuple,  | tuple,  |  | [optional]
[**object_nullable_prop**](#properties-objectnullableprop) | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  | [optional]
[**object_and_items_nullable_prop**](#properties-objectanditemsnullableprop) | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  | [optional]
[**object_items_nullable**](#properties-objectitemsnullable) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional]
**any_string_name** | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

# properties ArrayNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, list, tuple,  | NoneClass, tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arraynullableprop-items) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# properties ArrayNullableProp Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# properties ArrayAndItemsNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, list, tuple,  | NoneClass, tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arrayanditemsnullableprop-items) | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

# properties ArrayAndItemsNullableProp Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

# properties ArrayItemsNullable

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arrayitemsnullable-items) | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

# properties ArrayItemsNullable Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

# properties ObjectNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | dict, frozendict.frozendict,  | frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

# properties ObjectNullableProp AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# properties ObjectAndItemsNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

# properties ObjectAndItemsNullableProp AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

# properties ObjectItemsNullable

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  | any string name can be used but the value must be the correct type | [optional]

# properties ObjectItemsNullable AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

# AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, frozendict.frozendict,  | NoneClass, frozendict.frozendict,  |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
