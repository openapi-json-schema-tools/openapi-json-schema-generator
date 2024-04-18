# AdditionalPropertiesClass
petstore_api.components.schema.additional_properties_class
```
type: schemas.Schema
```

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
**map_property** | [MapPropertyDictInput](#mappropertydictinput), [MapPropertyDict](#mappropertydict) |  | [optional]
**map_of_map_property** | [MapOfMapPropertyDictInput](#mapofmappropertydictinput), [MapOfMapPropertyDict](#mapofmappropertydict) |  | [optional]
**anytype_1** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**map_with_undeclared_properties_anytype_1** | dict, schemas.immutabledict |  | [optional]
**map_with_undeclared_properties_anytype_2** | dict, schemas.immutabledict |  | [optional]
**map_with_undeclared_properties_anytype_3** | [MapWithUndeclaredPropertiesAnytype3DictInput](#mapwithundeclaredpropertiesanytype3dictinput), [MapWithUndeclaredPropertiesAnytype3Dict](#mapwithundeclaredpropertiesanytype3dict) |  | [optional]
**empty_map** | [EmptyMapDictInput](#emptymapdictinput), [EmptyMapDict](#emptymapdict) | an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map. | [optional]
**map_with_undeclared_properties_string** | [MapWithUndeclaredPropertiesStringDictInput](#mapwithundeclaredpropertiesstringdictinput), [MapWithUndeclaredPropertiesStringDict](#mapwithundeclaredpropertiesstringdict) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## AdditionalPropertiesClassDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**map_property** | [MapPropertyDictInput](#mappropertydictinput), [MapPropertyDict](#mappropertydict), schemas.Unset |  | [optional]
**map_of_map_property** | [MapOfMapPropertyDictInput](#mapofmappropertydictinput), [MapOfMapPropertyDict](#mapofmappropertydict), schemas.Unset |  | [optional]
**anytype_1** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset |  | [optional]
**map_with_undeclared_properties_anytype_1** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**map_with_undeclared_properties_anytype_2** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**map_with_undeclared_properties_anytype_3** | [MapWithUndeclaredPropertiesAnytype3DictInput](#mapwithundeclaredpropertiesanytype3dictinput), [MapWithUndeclaredPropertiesAnytype3Dict](#mapwithundeclaredpropertiesanytype3dict), schemas.Unset |  | [optional]
**empty_map** | [EmptyMapDictInput](#emptymapdictinput), [EmptyMapDict](#emptymapdict), schemas.Unset | an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map. | [optional]
**map_with_undeclared_properties_string** | [MapWithUndeclaredPropertiesStringDictInput](#mapwithundeclaredpropertiesstringdictinput), [MapWithUndeclaredPropertiesStringDict](#mapwithundeclaredpropertiesstringdict), schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

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
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

# MapProperty
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapPropertyDictInput](#mappropertydictinput), [MapPropertyDict](#mappropertydict) | [MapPropertyDict](#mappropertydict) |

## MapPropertyDictInput
```
type: typing.Mapping[
    str,
    str,
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## MapPropertyDict
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
from_dict_ | [MapPropertyDictInput](#mappropertydictinput), [MapPropertyDict](#mappropertydict) | [MapPropertyDict](#mappropertydict) | a constructor
get_additional_property_ | str | str, schemas.Unset | provides type safety for additional properties

# MapOfMapProperty
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapOfMapPropertyDictInput](#mapofmappropertydictinput), [MapOfMapPropertyDict](#mapofmappropertydict) | [MapOfMapPropertyDict](#mapofmappropertydict) |

## MapOfMapPropertyDictInput
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
**any_string_name** | [AdditionalPropertiesDictInput](#additionalpropertiesdictinput), [AdditionalPropertiesDict](#additionalpropertiesdict) | any string name can be used but the value must be the correct type | [optional]

## MapOfMapPropertyDict
```
base class: schemas.immutabledict[str, AdditionalPropertiesDict]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | [AdditionalPropertiesDictInput](#additionalpropertiesdictinput), [AdditionalPropertiesDict](#additionalpropertiesdict) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [MapOfMapPropertyDictInput](#mapofmappropertydictinput), [MapOfMapPropertyDict](#mapofmappropertydict) | [MapOfMapPropertyDict](#mapofmappropertydict) | a constructor
get_additional_property_ | str | [AdditionalPropertiesDict](#additionalpropertiesdict), schemas.Unset | provides type safety for additional properties

# AdditionalProperties2
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AdditionalPropertiesDictInput](#additionalpropertiesdictinput), [AdditionalPropertiesDict](#additionalpropertiesdict) | [AdditionalPropertiesDict](#additionalpropertiesdict) |

## AdditionalPropertiesDictInput
```
type: typing.Mapping[
    str,
    str,
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## AdditionalPropertiesDict
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
from_dict_ | [AdditionalPropertiesDictInput](#additionalpropertiesdictinput), [AdditionalPropertiesDict](#additionalpropertiesdict) | [AdditionalPropertiesDict](#additionalpropertiesdict) | a constructor
get_additional_property_ | str | str, schemas.Unset | provides type safety for additional properties

# MapWithUndeclaredPropertiesAnytype1
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# MapWithUndeclaredPropertiesAnytype2
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# MapWithUndeclaredPropertiesAnytype3
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapWithUndeclaredPropertiesAnytype3DictInput](#mapwithundeclaredpropertiesanytype3dictinput), [MapWithUndeclaredPropertiesAnytype3Dict](#mapwithundeclaredpropertiesanytype3dict) | [MapWithUndeclaredPropertiesAnytype3Dict](#mapwithundeclaredpropertiesanytype3dict) |

## MapWithUndeclaredPropertiesAnytype3DictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## MapWithUndeclaredPropertiesAnytype3Dict
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
from_dict_ | [MapWithUndeclaredPropertiesAnytype3DictInput](#mapwithundeclaredpropertiesanytype3dictinput), [MapWithUndeclaredPropertiesAnytype3Dict](#mapwithundeclaredpropertiesanytype3dict) | [MapWithUndeclaredPropertiesAnytype3Dict](#mapwithundeclaredpropertiesanytype3dict) | a constructor
get_additional_property_ | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | provides type safety for additional properties

# EmptyMap
```
type: schemas.Schema
```

## Description
an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map.

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[EmptyMapDictInput](#emptymapdictinput), [EmptyMapDict](#emptymapdict) | [EmptyMapDict](#emptymapdict) |

## EmptyMapDictInput
```
type: typing.Mapping (empty)
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------

## EmptyMapDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [EmptyMapDictInput](#emptymapdictinput), [EmptyMapDict](#emptymapdict) | [EmptyMapDict](#emptymapdict) | a constructor

# MapWithUndeclaredPropertiesString
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapWithUndeclaredPropertiesStringDictInput](#mapwithundeclaredpropertiesstringdictinput), [MapWithUndeclaredPropertiesStringDict](#mapwithundeclaredpropertiesstringdict) | [MapWithUndeclaredPropertiesStringDict](#mapwithundeclaredpropertiesstringdict) |

## MapWithUndeclaredPropertiesStringDictInput
```
type: typing.Mapping[
    str,
    str,
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## MapWithUndeclaredPropertiesStringDict
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
from_dict_ | [MapWithUndeclaredPropertiesStringDictInput](#mapwithundeclaredpropertiesstringdictinput), [MapWithUndeclaredPropertiesStringDict](#mapwithundeclaredpropertiesstringdict) | [MapWithUndeclaredPropertiesStringDict](#mapwithundeclaredpropertiesstringdict) | a constructor
get_additional_property_ | str | str, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
