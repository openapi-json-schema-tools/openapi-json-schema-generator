petstore_api.components.schema.nullable_class
# Schema NullableClass

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**integer_prop** | None, int | None, int |  | [optional]
**number_prop** | None, float, int | None, float, int |  | [optional]
**boolean_prop** | None, bool | None, bool |  | [optional]
**string_prop** | None, str | None, str |  | [optional]
**date_prop** | None, str, datetime.date | None, str |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**datetime_prop** | None, str, datetime.datetime | None, str |  | [optional] value must conform to RFC-3339 date-time
**array_nullable_prop** | None, list, tuple | [properties.ArrayNullableProp](#properties-arraynullableprop) |  | [optional]
**array_and_items_nullable_prop** | None, list, tuple | [properties.ArrayAndItemsNullableProp](#properties-arrayanditemsnullableprop) |  | [optional]
**array_items_nullable** | list, tuple | [properties.ArrayItemsNullable](#properties-arrayitemsnullable) |  | [optional]
**object_nullable_prop** | None, dict, immutabledict.immutabledict | [properties.ObjectNullableProp](#properties-objectnullableprop) |  | [optional]
**object_and_items_nullable_prop** | None, dict, immutabledict.immutabledict | [properties.ObjectAndItemsNullableProp](#properties-objectanditemsnullableprop) |  | [optional]
**object_items_nullable** | dict, immutabledict.immutabledict | [properties.ObjectItemsNullable](#properties-objectitemsnullable) |  | [optional]
**any_string_name** | None, dict, immutabledict.immutabledict | [AdditionalProperties4](#additionalproperties4) | any string name can be used but the value must be the correct type | [optional]

# properties ArrayNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, list, tuple | None, tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arraynullableprop-items) | dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

# properties ArrayNullableProp Items

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

# properties ArrayAndItemsNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, list, tuple | None, tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arrayanditemsnullableprop-items2) | None, dict, immutabledict.immutabledict | None, immutabledict.immutabledict |  |

# properties ArrayAndItemsNullableProp Items2

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, immutabledict.immutabledict | None, immutabledict.immutabledict |  |

# properties ArrayItemsNullable

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#properties-arrayitemsnullable-items3) | None, dict, immutabledict.immutabledict | None, immutabledict.immutabledict |  |

# properties ArrayItemsNullable Items3

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, immutabledict.immutabledict | None, immutabledict.immutabledict |  |

# properties ObjectNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, immutabledict.immutabledict | None, immutabledict.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | dict, immutabledict.immutabledict | [AdditionalProperties](#properties-objectnullableprop-additionalproperties) | any string name can be used but the value must be the correct type | [optional]

# properties ObjectNullableProp AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

# properties ObjectAndItemsNullableProp

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, immutabledict.immutabledict | None, immutabledict.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | None, dict, immutabledict.immutabledict | [AdditionalProperties2](#properties-objectanditemsnullableprop-additionalproperties2) | any string name can be used but the value must be the correct type | [optional]

# properties ObjectAndItemsNullableProp AdditionalProperties2

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, immutabledict.immutabledict | None, immutabledict.immutabledict |  |

# properties ObjectItemsNullable

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | None, dict, immutabledict.immutabledict | [AdditionalProperties3](#properties-objectitemsnullable-additionalproperties3) | any string name can be used but the value must be the correct type | [optional]

# properties ObjectItemsNullable AdditionalProperties3

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, immutabledict.immutabledict | None, immutabledict.immutabledict |  |

# AdditionalProperties4

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, dict, immutabledict.immutabledict | None, immutabledict.immutabledict |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
