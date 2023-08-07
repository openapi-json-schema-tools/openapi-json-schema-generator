petstore_api.components.schema.map_test
# Schema MapTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[MapTestDictInput](#maptestdictinput) | [MapTestDict](#maptestdict) |  |

## MapTestDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**map_map_of_string** | dict, schemas.immutabledict |  | [optional]
**map_of_enum_string** | dict, schemas.immutabledict |  | [optional]
**direct_map** | dict, schemas.immutabledict |  | [optional]
**indirect_map** | [**StringBooleanMap**](string_boolean_map.md), dict, schemas.immutabledict |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | any string name can be used but the value must be the correct type | [optional]

## MapTestDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**map_map_of_string** | dict, schemas.immutabledict | [properties.MapMapOfString](#properties-mapmapofstring) |  | [optional]
**map_of_enum_string** | dict, schemas.immutabledict | [properties.MapOfEnumString](#properties-mapofenumstring) |  | [optional]
**direct_map** | dict, schemas.immutabledict | [properties.DirectMap](#properties-directmap) |  | [optional]
**indirect_map** | [**StringBooleanMap**](string_boolean_map.md), dict, schemas.immutabledict | [**StringBooleanMap**](string_boolean_map.md) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

# properties MapMapOfString

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[MapMapOfStringDictInput](#properties-mapmapofstring-mapmapofstringdictinput) | [MapMapOfStringDict](#properties-mapmapofstring-mapmapofstringdict) |  |

## properties MapMapOfString MapMapOfStringDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## properties MapMapOfString MapMapOfStringDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict | [AdditionalProperties](#properties-mapmapofstring-additionalproperties) | any string name can be used but the value must be the correct type | [optional]

# properties MapMapOfString AdditionalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[AdditionalPropertiesDictInput](#properties-mapmapofstring-additionalproperties-additionalpropertiesdictinput) | [AdditionalPropertiesDict](#properties-mapmapofstring-additionalproperties-additionalpropertiesdict) |  |

## properties MapMapOfString AdditionalProperties AdditionalPropertiesDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## properties MapMapOfString AdditionalProperties AdditionalPropertiesDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | str | str | any string name can be used but the value must be the correct type | [optional]

# properties MapOfEnumString

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[MapOfEnumStringDictInput](#properties-mapofenumstring-mapofenumstringdictinput) | [MapOfEnumStringDict](#properties-mapofenumstring-mapofenumstringdict) |  |

## properties MapOfEnumString MapOfEnumStringDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional] must be one of ["UPPER", "lower"]

## properties MapOfEnumString MapOfEnumStringDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | str | str | any string name can be used but the value must be the correct type | [optional] must be one of ["UPPER", "lower"]

# properties DirectMap

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[DirectMapDictInput](#properties-directmap-directmapdictinput) | [DirectMapDict](#properties-directmap-directmapdict) |  |

## properties DirectMap DirectMapDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | bool | any string name can be used but the value must be the correct type | [optional]

## properties DirectMap DirectMapDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | bool | bool | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
