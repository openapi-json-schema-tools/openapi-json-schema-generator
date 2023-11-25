# Animal1
org.openapijsonschematools.components.schemas.Animal.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AnimalMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | String |  |
**color** | String |  | [optional] if omitted the server will use the default value of red
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## AnimalMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AnimalMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | className()<br> |
| String | color()<br>[optional] if omitted the server will use the default value of red |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
