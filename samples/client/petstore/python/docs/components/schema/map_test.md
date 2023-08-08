petstore_api.components.schema.map_test
# Schema MapTest

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapTestDictInput](#maptestdictinput), [MapTestDict](#maptestdict) | [MapTestDict](#maptestdict) |

## MapTestDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**map_map_of_string** | dict, schemas.immutabledict |  | [optional]
**map_of_enum_string** | dict, schemas.immutabledict |  | [optional]
**direct_map** | dict, schemas.immutabledict |  | [optional]
**indirect_map** | [**StringBooleanMap**](string_boolean_map.md), dict, schemas.immutabledict |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## MapTestDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[MapTestDictInput](#maptestdictinput), [MapTestDict](#maptestdict) | [MapTestDict](#maptestdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**map_map_of_string** | dict, schemas.immutabledict, schemas.Unset | [properties.MapMapOfString](#properties-mapmapofstring) |  | [optional]
**map_of_enum_string** | dict, schemas.immutabledict, schemas.Unset | [properties.MapOfEnumString](#properties-mapofenumstring) |  | [optional]
**direct_map** | dict, schemas.immutabledict, schemas.Unset | [properties.DirectMap](#properties-directmap) |  | [optional]
**indirect_map** | [**StringBooleanMap**](string_boolean_map.md), dict, schemas.immutabledict, schemas.Unset | [**StringBooleanMap**](string_boolean_map.md) |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties MapMapOfString

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapMapOfStringDictInput](#properties-mapmapofstring-mapmapofstringdictinput), [MapMapOfStringDict](#properties-mapmapofstring-mapmapofstringdict) | [MapMapOfStringDict](#properties-mapmapofstring-mapmapofstringdict) |

## properties MapMapOfString MapMapOfStringDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## properties MapMapOfString MapMapOfStringDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[MapMapOfStringDictInput](#properties-mapmapofstring-mapmapofstringdictinput), [MapMapOfStringDict](#properties-mapmapofstring-mapmapofstringdict) | [MapMapOfStringDict](#properties-mapmapofstring-mapmapofstringdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**kwargs** | dict, schemas.immutabledict | [AdditionalProperties](#properties-mapmapofstring-additionalproperties) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties MapMapOfString AdditionalProperties

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AdditionalPropertiesDictInput](#properties-mapmapofstring-additionalproperties-additionalpropertiesdictinput), [AdditionalPropertiesDict](#properties-mapmapofstring-additionalproperties-additionalpropertiesdict) | [AdditionalPropertiesDict](#properties-mapmapofstring-additionalproperties-additionalpropertiesdict) |

## properties MapMapOfString AdditionalProperties AdditionalPropertiesDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## properties MapMapOfString AdditionalProperties AdditionalPropertiesDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[AdditionalPropertiesDictInput](#properties-mapmapofstring-additionalproperties-additionalpropertiesdictinput), [AdditionalPropertiesDict](#properties-mapmapofstring-additionalproperties-additionalpropertiesdict) | [AdditionalPropertiesDict](#properties-mapmapofstring-additionalproperties-additionalpropertiesdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**kwargs** | str | str, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties MapOfEnumString

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapOfEnumStringDictInput](#properties-mapofenumstring-mapofenumstringdictinput), [MapOfEnumStringDict](#properties-mapofenumstring-mapofenumstringdict) | [MapOfEnumStringDict](#properties-mapofenumstring-mapofenumstringdict) |

## properties MapOfEnumString MapOfEnumStringDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional] must be one of ["UPPER", "lower"]

## properties MapOfEnumString MapOfEnumStringDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[MapOfEnumStringDictInput](#properties-mapofenumstring-mapofenumstringdictinput), [MapOfEnumStringDict](#properties-mapofenumstring-mapofenumstringdict) | [MapOfEnumStringDict](#properties-mapofenumstring-mapofenumstringdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**kwargs** | str | str, schemas.Unset | any string name can be used but the value must be the correct type | [optional] must be one of ["UPPER", "lower"] typed value is accessed with the get_additional_property_ method

# properties DirectMap

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[DirectMapDictInput](#properties-directmap-directmapdictinput), [DirectMapDict](#properties-directmap-directmapdict) | [DirectMapDict](#properties-directmap-directmapdict) |

## properties DirectMap DirectMapDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | bool | any string name can be used but the value must be the correct type | [optional]

## properties DirectMap DirectMapDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[DirectMapDictInput](#properties-directmap-directmapdictinput), [DirectMapDict](#properties-directmap-directmapdict) | [DirectMapDict](#properties-directmap-directmapdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**kwargs** | bool | bool, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
