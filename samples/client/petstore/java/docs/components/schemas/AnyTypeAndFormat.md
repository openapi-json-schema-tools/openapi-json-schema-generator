# AnyTypeAndFormat1
org.openapijsonschematools.components.schemas.AnyTypeAndFormat.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | AnyTypeAndFormatMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | Object |  | [optional] value must be a uuid
**date** | Object |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**date-time** | Object |  | [optional] value must conform to RFC-3339 date-time
**number** | Object |  | [optional] value must be int or float numeric
**binary** | Object |  | [optional]
**int32** | Object |  | [optional] value must be a 32 bit integer
**int64** | Object |  | [optional] value must be a 64 bit integer
**double** | Object |  | [optional] value must be a 64 bit float
**float** | Object |  | [optional] value must be a 32 bit float
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## AnyTypeAndFormatMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | AnyTypeAndFormatMap | a constructor
**date** | | Object | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**binary** | | Object | [optional]
**int32** | | Object | [optional] value must be a 32 bit integer
**int64** | | Object | [optional] value must be a 64 bit integer
get | String | Object | This model has invalid python names so this method is used under the hood when you access instance["uuid"], instance["date-time"], instance["number"], instance["double"], instance["float"], 
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
