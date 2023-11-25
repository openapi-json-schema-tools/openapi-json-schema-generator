# Player1
org.openapijsonschematools.components.schemas.Player.java
```
type: JsonSchema
```

## Description
a model that includes a self reference this forces properties and additionalProperties to be lazy loaded in python models because the Player class has not fully loaded when defining properties

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static PlayerMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | String |  | [optional]
**enemyPlayer** | Map |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## PlayerMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static PlayerMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | name()<br>[optional] |
| PlayerMap | enemyPlayer()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
