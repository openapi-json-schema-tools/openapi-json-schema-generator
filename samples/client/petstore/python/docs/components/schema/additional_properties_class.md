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
**map_property** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**map_of_map_property** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**anytype_1** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset |  | [optional]
**map_with_undeclared_properties_anytype_1** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**map_with_undeclared_properties_anytype_2** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**map_with_undeclared_properties_anytype_3** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**empty_map** | dict, schemas.immutabledict, schemas.Unset | an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map. | [optional]
**map_with_undeclared_properties_string** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**map_property** | [properties.MapProperty](#properties-mapproperty) |  | [optional]
**map_of_map_property** | [properties.MapOfMapProperty](#properties-mapofmapproperty) |  | [optional]
**anytype_1** | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset |  | [optional]
**map_with_undeclared_properties_anytype_1** | [properties.MapWithUndeclaredPropertiesAnytype1](#properties-mapwithundeclaredpropertiesanytype1) |  | [optional]
**map_with_undeclared_properties_anytype_2** | [properties.MapWithUndeclaredPropertiesAnytype2](#properties-mapwithundeclaredpropertiesanytype2) |  | [optional]
**map_with_undeclared_properties_anytype_3** | [properties.MapWithUndeclaredPropertiesAnytype3](#properties-mapwithundeclaredpropertiesanytype3) |  | [optional]
**empty_map** | [properties.EmptyMap](#properties-emptymap) | an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map. | [optional]
**map_with_undeclared_properties_string** | [properties.MapWithUndeclaredPropertiesString](#properties-mapwithundeclaredpropertiesstring) |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [AdditionalPropertiesClassDictInput](#additionalpropertiesclassdictinput), [AdditionalPropertiesClassDict](#additionalpropertiesclassdict) | [AdditionalPropertiesClassDict](#additionalpropertiesclassdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

# properties MapProperty

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapPropertyDictInput](#properties-mapproperty-mappropertydictinput), [MapPropertyDict](#properties-mapproperty-mappropertydict) | [MapPropertyDict](#properties-mapproperty-mappropertydict) |

## properties MapProperty MapPropertyDictInput
```
type: typing.Mapping[
    str,
    str,
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## properties MapProperty MapPropertyDict
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
from_dict_ | [MapPropertyDictInput](#properties-mapproperty-mappropertydictinput), [MapPropertyDict](#properties-mapproperty-mappropertydict) | [MapPropertyDict](#properties-mapproperty-mappropertydict) | a constructor
get_additional_property_ | str | str, schemas.Unset | provides type safety for additional properties

# properties MapOfMapProperty

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapOfMapPropertyDictInput](#properties-mapofmapproperty-mapofmappropertydictinput), [MapOfMapPropertyDict](#properties-mapofmapproperty-mapofmappropertydict) | [MapOfMapPropertyDict](#properties-mapofmapproperty-mapofmappropertydict) |

## properties MapOfMapProperty MapOfMapPropertyDictInput
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

## properties MapOfMapProperty MapOfMapPropertyDict
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
from_dict_ | [MapOfMapPropertyDictInput](#properties-mapofmapproperty-mapofmappropertydictinput), [MapOfMapPropertyDict](#properties-mapofmapproperty-mapofmappropertydict) | [MapOfMapPropertyDict](#properties-mapofmapproperty-mapofmappropertydict) | a constructor
get_additional_property_ | str | [AdditionalProperties2](#properties-mapofmapproperty-additionalproperties2) | provides type safety for additional properties

# properties MapOfMapProperty AdditionalProperties2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AdditionalPropertiesDictInput](#properties-mapofmapproperty-additionalproperties2-additionalpropertiesdictinput), [AdditionalPropertiesDict](#properties-mapofmapproperty-additionalproperties2-additionalpropertiesdict) | [AdditionalPropertiesDict](#properties-mapofmapproperty-additionalproperties2-additionalpropertiesdict) |

## properties MapOfMapProperty AdditionalProperties2 AdditionalPropertiesDictInput
```
type: typing.Mapping[
    str,
    str,
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## properties MapOfMapProperty AdditionalProperties2 AdditionalPropertiesDict
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
from_dict_ | [AdditionalPropertiesDictInput](#properties-mapofmapproperty-additionalproperties2-additionalpropertiesdictinput), [AdditionalPropertiesDict](#properties-mapofmapproperty-additionalproperties2-additionalpropertiesdict) | [AdditionalPropertiesDict](#properties-mapofmapproperty-additionalproperties2-additionalpropertiesdict) | a constructor
get_additional_property_ | str | str, schemas.Unset | provides type safety for additional properties

# properties MapWithUndeclaredPropertiesAnytype1

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# properties MapWithUndeclaredPropertiesAnytype2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# properties MapWithUndeclaredPropertiesAnytype3

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapWithUndeclaredPropertiesAnytype3DictInput](#properties-mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dictinput), [MapWithUndeclaredPropertiesAnytype3Dict](#properties-mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dict) | [MapWithUndeclaredPropertiesAnytype3Dict](#properties-mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dict) |

## properties MapWithUndeclaredPropertiesAnytype3 MapWithUndeclaredPropertiesAnytype3DictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## properties MapWithUndeclaredPropertiesAnytype3 MapWithUndeclaredPropertiesAnytype3Dict
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
from_dict_ | [MapWithUndeclaredPropertiesAnytype3DictInput](#properties-mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dictinput), [MapWithUndeclaredPropertiesAnytype3Dict](#properties-mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dict) | [MapWithUndeclaredPropertiesAnytype3Dict](#properties-mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dict) | a constructor
get_additional_property_ | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | provides type safety for additional properties

# properties EmptyMap

## Description
an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map.

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[EmptyMapDictInput](#properties-emptymap-emptymapdictinput), [EmptyMapDict](#properties-emptymap-emptymapdict) | [EmptyMapDict](#properties-emptymap-emptymapdict) |

## properties EmptyMap EmptyMapDictInput
```
type: typing.Mapping (empty)
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------

## properties EmptyMap EmptyMapDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [EmptyMapDictInput](#properties-emptymap-emptymapdictinput), [EmptyMapDict](#properties-emptymap-emptymapdict) | [EmptyMapDict](#properties-emptymap-emptymapdict) | a constructor

# properties MapWithUndeclaredPropertiesString

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapWithUndeclaredPropertiesStringDictInput](#properties-mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdictinput), [MapWithUndeclaredPropertiesStringDict](#properties-mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdict) | [MapWithUndeclaredPropertiesStringDict](#properties-mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdict) |

## properties MapWithUndeclaredPropertiesString MapWithUndeclaredPropertiesStringDictInput
```
type: typing.Mapping[
    str,
    str,
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## properties MapWithUndeclaredPropertiesString MapWithUndeclaredPropertiesStringDict
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
from_dict_ | [MapWithUndeclaredPropertiesStringDictInput](#properties-mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdictinput), [MapWithUndeclaredPropertiesStringDict](#properties-mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdict) | [MapWithUndeclaredPropertiesStringDict](#properties-mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdict) | a constructor
get_additional_property_ | str | str, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
