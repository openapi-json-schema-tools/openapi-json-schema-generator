# AnyTypeAndFormat1
org.openapijsonschematools.components.schemas.AnyTypeAndFormat.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AnyTypeAndFormatMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

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
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## AnyTypeAndFormatMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AnyTypeAndFormatMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | date()<br>[optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| Object | binary()<br>[optional] |
| Object | int32()<br>[optional] value must be a 32 bit integer |
| Object | int64()<br>[optional] value must be a 64 bit integer |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["uuid"], instance["date-time"], instance["number"], instance["double"], instance["float"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
