# ObjectWithCollidingProperties1
org.openapijsonschematools.components.schemas.ObjectWithCollidingProperties.java
```
type: JsonSchema
```

## Description
component with properties that have name collisions

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithCollidingPropertiesMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**someProp** | Map<String, Object> |  | [optional]
**someprop** | Map<String, Object> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectWithCollidingPropertiesMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithCollidingPropertiesMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenMap<String, Object> | someProp()<br>[optional] |
| FrozenMap<String, Object> | someprop()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |



[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
