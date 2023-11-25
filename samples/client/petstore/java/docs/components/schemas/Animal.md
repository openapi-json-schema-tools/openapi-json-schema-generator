# Animal
org.openapijsonschematools.components.schemas.Animal.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Animal.ClassName<br> schema class |
| static class | Animal.Color<br> schema class |
| static class | Animal.AnimalMap<br> output class for Map payloads |
| static class | Animal.Animal1<br> schema class |

## Animal1
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
