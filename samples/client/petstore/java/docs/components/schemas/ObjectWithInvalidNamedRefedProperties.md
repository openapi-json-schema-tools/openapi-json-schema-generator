# ObjectWithInvalidNamedRefedProperties
org.openapijsonschematools.components.schemas.ObjectWithInvalidNamedRefedProperties.java
public class ObjectWithInvalidNamedRefedProperties

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedProperties1](#objectwithinvalidnamedrefedproperties1)<br> schema class |
| static class | [ObjectWithInvalidNamedRefedProperties.ObjectWithInvalidNamedRefedPropertiesMap](#objectwithinvalidnamedrefedpropertiesmap)<br> output class for Map payloads |

## ObjectWithInvalidNamedRefedProperties1
public static class ObjectWithInvalidNamedRefedProperties1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithInvalidNamedRefedPropertiesMap](#objectwithinvalidnamedrefedpropertiesmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectWithInvalidNamedRefedPropertiesMap
public static class ObjectWithInvalidNamedRefedPropertiesMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithInvalidNamedRefedPropertiesMap](#objectwithinvalidnamedrefedpropertiesmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| FromSchema.FromSchemaMap | from()<br> |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["!reference"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**!reference** | List<long> |  |
**from** | Map<String, Object> |  |
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
