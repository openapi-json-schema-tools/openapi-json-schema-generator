petstore_api.components.schema.additional_properties_class
# Schema AdditionalPropertiesClass

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AdditionalPropertiesClassDictInput](#additionalpropertiesclassdictinput), [AdditionalPropertiesClassDict](#additionalpropertiesclassdict) | [AdditionalPropertiesClassDict](#additionalpropertiesclassdict) |

## AdditionalPropertiesClassDictInput
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
### from_dict_ method
Input Type | Return Type
---------- | -----------
[AdditionalPropertiesClassDictInput](#additionalpropertiesclassdictinput), [AdditionalPropertiesClassDict](#additionalpropertiesclassdict) | [AdditionalPropertiesClassDict](#additionalpropertiesclassdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**map_property** | dict, schemas.immutabledict, schemas.Unset | [properties.MapProperty](#properties-mapproperty) |  | [optional]
**map_of_map_property** | dict, schemas.immutabledict, schemas.Unset | [properties.MapOfMapProperty](#properties-mapofmapproperty) |  | [optional]
**anytype_1** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset |  | [optional]
**map_with_undeclared_properties_anytype_1** | dict, schemas.immutabledict, schemas.Unset | [properties.MapWithUndeclaredPropertiesAnytype1](#properties-mapwithundeclaredpropertiesanytype1) |  | [optional]
**map_with_undeclared_properties_anytype_2** | dict, schemas.immutabledict, schemas.Unset | [properties.MapWithUndeclaredPropertiesAnytype2](#properties-mapwithundeclaredpropertiesanytype2) |  | [optional]
**map_with_undeclared_properties_anytype_3** | dict, schemas.immutabledict, schemas.Unset | [properties.MapWithUndeclaredPropertiesAnytype3](#properties-mapwithundeclaredpropertiesanytype3) |  | [optional]
**empty_map** | dict, schemas.immutabledict, schemas.Unset | [properties.EmptyMap](#properties-emptymap) | an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map. | [optional]
**map_with_undeclared_properties_string** | dict, schemas.immutabledict, schemas.Unset | [properties.MapWithUndeclaredPropertiesString](#properties-mapwithundeclaredpropertiesstring) |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties MapProperty

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapPropertyDictInput](#properties-mapproperty-mappropertydictinput), [MapPropertyDict](#properties-mapproperty-mappropertydict) | [MapPropertyDict](#properties-mapproperty-mappropertydict) |

## properties MapProperty MapPropertyDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## properties MapProperty MapPropertyDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[MapPropertyDictInput](#properties-mapproperty-mappropertydictinput), [MapPropertyDict](#properties-mapproperty-mappropertydict) | [MapPropertyDict](#properties-mapproperty-mappropertydict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**kwargs** | str | str, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties MapOfMapProperty

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapOfMapPropertyDictInput](#properties-mapofmapproperty-mapofmappropertydictinput), [MapOfMapPropertyDict](#properties-mapofmapproperty-mapofmappropertydict) | [MapOfMapPropertyDict](#properties-mapofmapproperty-mapofmappropertydict) |

## properties MapOfMapProperty MapOfMapPropertyDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## properties MapOfMapProperty MapOfMapPropertyDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[MapOfMapPropertyDictInput](#properties-mapofmapproperty-mapofmappropertydictinput), [MapOfMapPropertyDict](#properties-mapofmapproperty-mapofmappropertydict) | [MapOfMapPropertyDict](#properties-mapofmapproperty-mapofmappropertydict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**kwargs** | dict, schemas.immutabledict | [AdditionalProperties2](#properties-mapofmapproperty-additionalproperties2) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties MapOfMapProperty AdditionalProperties2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AdditionalPropertiesDictInput](#properties-mapofmapproperty-additionalproperties2-additionalpropertiesdictinput), [AdditionalPropertiesDict](#properties-mapofmapproperty-additionalproperties2-additionalpropertiesdict) | [AdditionalPropertiesDict](#properties-mapofmapproperty-additionalproperties2-additionalpropertiesdict) |

## properties MapOfMapProperty AdditionalProperties2 AdditionalPropertiesDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## properties MapOfMapProperty AdditionalProperties2 AdditionalPropertiesDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[AdditionalPropertiesDictInput](#properties-mapofmapproperty-additionalproperties2-additionalpropertiesdictinput), [AdditionalPropertiesDict](#properties-mapofmapproperty-additionalproperties2-additionalpropertiesdict) | [AdditionalPropertiesDict](#properties-mapofmapproperty-additionalproperties2-additionalpropertiesdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**kwargs** | str | str, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

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
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## properties MapWithUndeclaredPropertiesAnytype3 MapWithUndeclaredPropertiesAnytype3Dict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[MapWithUndeclaredPropertiesAnytype3DictInput](#properties-mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dictinput), [MapWithUndeclaredPropertiesAnytype3Dict](#properties-mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dict) | [MapWithUndeclaredPropertiesAnytype3Dict](#properties-mapwithundeclaredpropertiesanytype3-mapwithundeclaredpropertiesanytype3dict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**kwargs** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties EmptyMap

## Description
an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map.

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[EmptyMapDictInput](#properties-emptymap-emptymapdictinput), [EmptyMapDict](#properties-emptymap-emptymapdict) | [EmptyMapDict](#properties-emptymap-emptymapdict) |

## properties EmptyMap EmptyMapDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------

## properties EmptyMap EmptyMapDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[EmptyMapDictInput](#properties-emptymap-emptymapdictinput), [EmptyMapDict](#properties-emptymap-emptymapdict) | [EmptyMapDict](#properties-emptymap-emptymapdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------

# properties MapWithUndeclaredPropertiesString

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapWithUndeclaredPropertiesStringDictInput](#properties-mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdictinput), [MapWithUndeclaredPropertiesStringDict](#properties-mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdict) | [MapWithUndeclaredPropertiesStringDict](#properties-mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdict) |

## properties MapWithUndeclaredPropertiesString MapWithUndeclaredPropertiesStringDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | str | any string name can be used but the value must be the correct type | [optional]

## properties MapWithUndeclaredPropertiesString MapWithUndeclaredPropertiesStringDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[MapWithUndeclaredPropertiesStringDictInput](#properties-mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdictinput), [MapWithUndeclaredPropertiesStringDict](#properties-mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdict) | [MapWithUndeclaredPropertiesStringDict](#properties-mapwithundeclaredpropertiesstring-mapwithundeclaredpropertiesstringdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**kwargs** | str | str, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
