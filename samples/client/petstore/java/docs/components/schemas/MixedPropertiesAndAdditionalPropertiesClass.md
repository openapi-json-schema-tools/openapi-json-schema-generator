# MixedPropertiesAndAdditionalPropertiesClass
org.openapijsonschematools.components.schemas.MixedPropertiesAndAdditionalPropertiesClass.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | MixedPropertiesAndAdditionalPropertiesClass.UuidSchema<br> schema class |
| static class | MixedPropertiesAndAdditionalPropertiesClass.DateTime<br> schema class |
| static class | MixedPropertiesAndAdditionalPropertiesClass.MapMap<br> output class for Map payloads |
| static class | MixedPropertiesAndAdditionalPropertiesClass.MapSchema<br> schema class |
| static class | MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClassMap<br> output class for Map payloads |
| static class | MixedPropertiesAndAdditionalPropertiesClass.MixedPropertiesAndAdditionalPropertiesClass1<br> schema class |

## MixedPropertiesAndAdditionalPropertiesClass1
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
