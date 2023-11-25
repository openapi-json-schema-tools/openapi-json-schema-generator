# ObjectWithInvalidNamedRefedProperties
org.openapijsonschematools.components.schemas.ObjectWithInvalidNamedRefedProperties.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedPropertiesMap<br> output class for Map payloads |
| static class | ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedProperties1<br> schema class |

## ObjectWithInvalidNamedRefedProperties1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithInvalidNamedRefedPropertiesMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**!reference** | List<long> |  |
**from** | Map<String, Object> |  |
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectWithInvalidNamedRefedPropertiesMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithInvalidNamedRefedPropertiesMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| FromSchema.FromSchemaMap | from()<br> |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["!reference"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
