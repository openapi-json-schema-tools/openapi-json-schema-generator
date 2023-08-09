petstore_api.components.schema.additional_properties_class
# Schema AdditionalPropertiesClass

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AdditionalPropertiesClassDictInput](#additionalpropertiesclassdictinput), [AdditionalPropertiesClassDict](#additionalpropertiesclassdict) | [AdditionalPropertiesClassDict](#additionalpropertiesclassdict) |

## AdditionalPropertiesClassDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**map_property** | dict, schemas.immutabledict |  | [optional]
**map_of_map_property** | dict, schemas.immutabledict |  | [optional]
**anytype_1** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**map_with_undeclared_properties_anytype_1** | dict, schemas.immutabledict |  | [optional]
**map_with_undeclared_properties_anytype_2** | dict, schemas.immutabledict |  | [optional]
**map_with_undeclared_properties_anytype_3** | dict, schemas.immutabledict |  | [optional]
**empty_map** | dict, schemas.immutabledict | an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map. | [optional]
**map_with_undeclared_properties_string** | dict, schemas.immutabledict |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## AdditionalPropertiesClassDict
```
base class: schemas.immutabledict[str, schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**map_property** | [MapPropertyDictInput](#mappropertydictinput), [MapPropertyDict](#mappropertydict) |  | [optional]
**map_of_map_property** | [MapOfMapPropertyDictInput](#mapofmappropertydictinput), [MapOfMapPropertyDict](#mapofmappropertydict) |  | [optional]
**anytype_1** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**map_with_undeclared_properties_anytype_1** | dict, schemas.immutabledict |  | [optional]
**map_with_undeclared_properties_anytype_2** | dict, schemas.immutabledict |  | [optional]
**map_with_undeclared_properties_anytype_3** | [MapWithUndeclaredPropertiesAnytype3DictInput](#mapwithundeclaredpropertiesanytype3dictinput), [MapWithUndeclaredPropertiesAnytype3Dict](#mapwithundeclaredpropertiesanytype3dict) |  | [optional]
**empty_map** | [EmptyMapDictInput](#emptymapdictinput), [EmptyMapDict](#emptymapdict) | an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map. | [optional]
**map_with_undeclared_properties_string** | [MapWithUndeclaredPropertiesStringDictInput](#mapwithundeclaredpropertiesstringdictinput), [MapWithUndeclaredPropertiesStringDict](#mapwithundeclaredpropertiesstringdict) |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**map_property** | [MapPropertyDict](#mappropertydict), schemas.Unset |  | [optional]
**map_of_map_property** | [MapOfMapPropertyDict](#mapofmappropertydict), schemas.Unset |  | [optional]
**anytype_1** | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset |  | [optional]
**map_with_undeclared_properties_anytype_1** | schemas.immutabledict, schemas.Unset |  | [optional]
**map_with_undeclared_properties_anytype_2** | schemas.immutabledict, schemas.Unset |  | [optional]
**map_with_undeclared_properties_anytype_3** | [MapWithUndeclaredPropertiesAnytype3Dict](#mapwithundeclaredpropertiesanytype3dict), schemas.Unset |  | [optional]
**empty_map** | [EmptyMapDict](#emptymapdict), schemas.Unset | an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map. | [optional]
**map_with_undeclared_properties_string** | [MapWithUndeclaredPropertiesStringDict](#mapwithundeclaredpropertiesstringdict), schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [AdditionalPropertiesClassDictInput](#additionalpropertiesclassdictinput), [AdditionalPropertiesClassDict](#additionalpropertiesclassdict) | [AdditionalPropertiesClassDict](#additionalpropertiesclassdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

# MapProperty

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapPropertyDictInput](#mapproperty-mappropertydictinput), [MapPropertyDict](#mapproperty-mappropertydict) | [MapPropertyDict](#mapproperty-mappropertydict) |

## MapProperty MapPropertyDictInput
```
type: typing.Mapping[
    str,
    str,
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## MapProperty MapPropertyDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | str | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [MapPropertyDictInput](#mapproperty-mappropertydictinput), [MapPropertyDict](#mapproperty-mappropertydict) | [MapPropertyDict](#mapproperty-mappropertydict) | a constructor
get_additional_property_ | str | str, schemas.Unset | provides type safety for additional properties

# MapOfMapProperty

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapOfMapPropertyDictInput](#mapofmapproperty-mapofmappropertydictinput), [MapOfMapPropertyDict](#mapofmapproperty-mapofmappropertydict) | [MapOfMapPropertyDict](#mapofmapproperty-mapofmappropertydict) |

## MapOfMapProperty MapOfMapPropertyDictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        AdditionalPropertiesDictInput,
        AdditionalPropertiesDict,
    ],
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## MapOfMapProperty MapOfMapPropertyDict
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
from_dict_ | [MapOfMapPropertyDictInput](#mapofmapproperty-mapofmappropertydictinput), [MapOfMapPropertyDict](#mapofmapproperty-mapofmappropertydict) | [MapOfMapPropertyDict](#mapofmapproperty-mapofmappropertydict) | a constructor
get_additional_property_ | str | [AdditionalProperties2](#mapofmapproperty-additionalproperties2) | provides type safety for additional properties

# MapOfMapProperty AdditionalProperties2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AdditionalPropertiesDictInput](#mapofmapproperty-additionalproperties2-additionalpropertiesdictinput), [AdditionalPropertiesDict](#mapofmapproperty-additionalproperties2-additionalpropertiesdict) | [AdditionalPropertiesDict](#mapofmapproperty-additionalproperties2-additionalpropertiesdict) |

## MapOfMapProperty AdditionalProperties2 AdditionalPropertiesDictInput
```
type: typing.Mapping[
    str,
    str,
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## MapOfMapProperty AdditionalProperties2 AdditionalPropertiesDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | str | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [AdditionalPropertiesDictInput](#mapofmapproperty-additionalproperties2-additionalpropertiesdictinput), [AdditionalPropertiesDict](#mapofmapproperty-additionalproperties2-additionalpropertiesdict) | [AdditionalPropertiesDict](#mapofmapproperty-additionalproperties2-additionalpropertiesdict) | a constructor
get_additional_property_ | str | str, schemas.Unset | provides type safety for additional properties

# MapWithUndeclaredPropertiesAnytype1

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# MapWithUndeclaredPropertiesAnytype2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# MapWithUndeclaredPropertiesAnytype3

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapWithUndeclaredPropertiesAnytype3DictInput](#mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dictinput), [MapWithUndeclaredPropertiesAnytype3Dict](#mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dict) | [MapWithUndeclaredPropertiesAnytype3Dict](#mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dict) |

## MapWithUndeclaredPropertiesAnytype3 MapWithUndeclaredPropertiesAnytype3DictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## MapWithUndeclaredPropertiesAnytype3 MapWithUndeclaredPropertiesAnytype3Dict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [MapWithUndeclaredPropertiesAnytype3DictInput](#mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dictinput), [MapWithUndeclaredPropertiesAnytype3Dict](#mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dict) | [MapWithUndeclaredPropertiesAnytype3Dict](#mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dict) | a constructor
get_additional_property_ | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | provides type safety for additional properties

# EmptyMap

## Description
an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map.

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[EmptyMapDictInput](#emptymap-emptymapdictinput), [EmptyMapDict](#emptymap-emptymapdict) | [EmptyMapDict](#emptymap-emptymapdict) |

## EmptyMap EmptyMapDictInput
```
type: typing.Mapping (empty)
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------

## EmptyMap EmptyMapDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [EmptyMapDictInput](#emptymap-emptymapdictinput), [EmptyMapDict](#emptymap-emptymapdict) | [EmptyMapDict](#emptymap-emptymapdict) | a constructor

# MapWithUndeclaredPropertiesString

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapWithUndeclaredPropertiesStringDictInput](#mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdictinput), [MapWithUndeclaredPropertiesStringDict](#mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdict) | [MapWithUndeclaredPropertiesStringDict](#mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdict) |

## MapWithUndeclaredPropertiesString MapWithUndeclaredPropertiesStringDictInput
```
type: typing.Mapping[
    str,
    str,
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## MapWithUndeclaredPropertiesString MapWithUndeclaredPropertiesStringDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | str | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [MapWithUndeclaredPropertiesStringDictInput](#mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdictinput), [MapWithUndeclaredPropertiesStringDict](#mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdict) | [MapWithUndeclaredPropertiesStringDict](#mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdict) | a constructor
get_additional_property_ | str | str, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
