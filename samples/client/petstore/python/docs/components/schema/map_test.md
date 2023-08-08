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
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**map_map_of_string** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**map_of_enum_string** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**direct_map** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**indirect_map** | [**StringBooleanMap**](string_boolean_map.md), dict, schemas.immutabledict, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**map_map_of_string** | [properties.MapMapOfString](#properties-mapmapofstring) |  | [optional]
**map_of_enum_string** | [properties.MapOfEnumString](#properties-mapofenumstring) |  | [optional]
**direct_map** | [properties.DirectMap](#properties-directmap) |  | [optional]
**indirect_map** | [**StringBooleanMap**](string_boolean_map.md) |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [MapTestDictInput](#maptestdictinput), [MapTestDict](#maptestdict) | [MapTestDict](#maptestdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

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
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | dict, schemas.immutabledict | [AdditionalProperties](#properties-mapmapofstring-additionalproperties) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [MapMapOfStringDictInput](#properties-mapmapofstring-mapmapofstringdictinput), [MapMapOfStringDict](#properties-mapmapofstring-mapmapofstringdict) | [MapMapOfStringDict](#properties-mapmapofstring-mapmapofstringdict) | a constructor
get_additional_property_ | str | [AdditionalProperties](#properties-mapmapofstring-additionalproperties) | provides type safety for additional properties

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
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | str | str, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [AdditionalPropertiesDictInput](#properties-mapmapofstring-additionalproperties-additionalpropertiesdictinput), [AdditionalPropertiesDict](#properties-mapmapofstring-additionalproperties-additionalpropertiesdict) | [AdditionalPropertiesDict](#properties-mapmapofstring-additionalproperties-additionalpropertiesdict) | a constructor
get_additional_property_ | str | str, schemas.Unset | provides type safety for additional properties

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
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | str | str, schemas.Unset | any string name can be used but the value must be the correct type | [optional] must be one of ["UPPER", "lower"] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [MapOfEnumStringDictInput](#properties-mapofenumstring-mapofenumstringdictinput), [MapOfEnumStringDict](#properties-mapofenumstring-mapofenumstringdict) | [MapOfEnumStringDict](#properties-mapofenumstring-mapofenumstringdict) | a constructor
get_additional_property_ | str | str, schemas.Unset | provides type safety for additional properties

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
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | bool | bool, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [DirectMapDictInput](#properties-directmap-directmapdictinput), [DirectMapDict](#properties-directmap-directmapdict) | [DirectMapDict](#properties-directmap-directmapdict) | a constructor
get_additional_property_ | str | bool, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
