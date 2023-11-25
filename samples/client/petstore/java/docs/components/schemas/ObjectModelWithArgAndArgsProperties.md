# ObjectModelWithArgAndArgsProperties
org.openapijsonschematools.components.schemas.ObjectModelWithArgAndArgsProperties.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjectModelWithArgAndArgsProperties.Arg<br> schema class |
| static class | ObjectModelWithArgAndArgsProperties.Args<br> schema class |
| static class | ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsPropertiesMap<br> output class for Map payloads |
| static class | ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsProperties1<br> schema class |

## ObjectModelWithArgAndArgsProperties1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectModelWithArgAndArgsPropertiesMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**arg** | String |  |
**args** | String |  |
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectModelWithArgAndArgsPropertiesMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectModelWithArgAndArgsPropertiesMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | arg()<br> |
| String | args()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
