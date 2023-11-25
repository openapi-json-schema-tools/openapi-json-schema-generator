# Apple1
org.openapijsonschematools.components.schemas.Apple.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static AppleMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**cultivar** | String |  |
**origin** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## AppleMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AppleMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | cultivar()<br> |
| String | origin()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
