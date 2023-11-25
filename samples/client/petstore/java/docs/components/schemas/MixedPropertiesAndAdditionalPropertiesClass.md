# MixedPropertiesAndAdditionalPropertiesClass1
org.openapijsonschematools.components.schemas.MixedPropertiesAndAdditionalPropertiesClass.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MixedPropertiesAndAdditionalPropertiesClassMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | String |  | [optional] value must be a uuid
**dateTime** | String |  | [optional] value must conform to RFC-3339 date-time
**map** | Map<String, Map<String, Object>> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## MixedPropertiesAndAdditionalPropertiesClassMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MixedPropertiesAndAdditionalPropertiesClassMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | dateTime()<br>[optional] value must conform to RFC-3339 date-time |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["uuid"], instance["map"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
