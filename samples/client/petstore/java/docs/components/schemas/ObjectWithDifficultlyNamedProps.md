# ObjectWithDifficultlyNamedProps1
org.openapijsonschematools.components.schemas.ObjectWithDifficultlyNamedProps.java
```
type: JsonSchema
```

## Description
model with properties that have invalid names for python

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithDifficultlyNamedPropsMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**123-list** | String |  |
**$special[property.name]** | long |  | [optional] value must be a 64 bit integer
**123Number** | long |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectWithDifficultlyNamedPropsMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithDifficultlyNamedPropsMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["123-list"], instance["$special[property.name]"], instance["123Number"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
