petstore_api.components.schema.map_test
# Schema MapTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**map_map_of_string** | dict, immutabledict.immutabledict | [properties.MapMapOfString](#properties-mapmapofstring) |  | [optional]
**map_of_enum_string** | dict, immutabledict.immutabledict | [properties.MapOfEnumString](#properties-mapofenumstring) |  | [optional]
**direct_map** | dict, immutabledict.immutabledict | [properties.DirectMap](#properties-directmap) |  | [optional]
**indirect_map** | [**StringBooleanMap**](string_boolean_map.md), dict, immutabledict.immutabledict | [**StringBooleanMap**](string_boolean_map.md) |  | [optional]
**any_string_name** | dict, immutabledict.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | immutabledict.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

# properties MapMapOfString

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | dict, immutabledict.immutabledict | [AdditionalProperties](#properties-mapmapofstring-additionalproperties) | any string name can be used but the value must be the correct type | [optional]

# properties MapMapOfString AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | str | str | any string name can be used but the value must be the correct type | [optional]

# properties MapOfEnumString

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | str | str | any string name can be used but the value must be the correct type | [optional] must be one of ["UPPER", "lower"]

# properties DirectMap

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | bool | bool | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
