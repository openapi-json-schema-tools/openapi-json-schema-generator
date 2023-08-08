petstore_api.components.schema.mixed_properties_and_additional_properties_class
# Schema MixedPropertiesAndAdditionalPropertiesClass

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MixedPropertiesAndAdditionalPropertiesClassDictInput](#mixedpropertiesandadditionalpropertiesclassdictinput), [MixedPropertiesAndAdditionalPropertiesClassDict](#mixedpropertiesandadditionalpropertiesclassdict) | [MixedPropertiesAndAdditionalPropertiesClassDict](#mixedpropertiesandadditionalpropertiesclassdict) |

## MixedPropertiesAndAdditionalPropertiesClassDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | str, uuid.UUID |  | [optional] value must be a uuid
**dateTime** | str, datetime.datetime |  | [optional] value must conform to RFC-3339 date-time
**map** | dict, schemas.immutabledict |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## MixedPropertiesAndAdditionalPropertiesClassDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[MixedPropertiesAndAdditionalPropertiesClassDictInput](#mixedpropertiesandadditionalpropertiesclassdictinput), [MixedPropertiesAndAdditionalPropertiesClassDict](#mixedpropertiesandadditionalpropertiesclassdict) | [MixedPropertiesAndAdditionalPropertiesClassDict](#mixedpropertiesandadditionalpropertiesclassdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**uuid** | str, uuid.UUID, schemas.Unset |  | [optional] value must be a uuid
**dateTime** | str, datetime.datetime, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**map** | dict, schemas.immutabledict, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**uuid** | str, schemas.Unset |  | [optional] value must be a uuid
**dateTime** | str, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**map** | [properties.Map](#properties-map) |  | [optional]

# properties Map

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MapDictInput](#properties-map-mapdictinput), [MapDict](#properties-map-mapdict) | [MapDict](#properties-map-mapdict) |

## properties Map MapDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | [**Animal**](animal.md), dict, schemas.immutabledict | any string name can be used but the value must be the correct type | [optional]

## properties Map MapDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[MapDictInput](#properties-map-mapdictinput), [MapDict](#properties-map-mapdict) | [MapDict](#properties-map-mapdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | [**Animal**](animal.md), dict, schemas.immutabledict | [**Animal**](animal.md) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
