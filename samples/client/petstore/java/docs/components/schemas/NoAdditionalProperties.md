# NoAdditionalProperties
org.openapijsonschematools.components.schemas.NoAdditionalProperties.java
public class NoAdditionalProperties

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | NoAdditionalProperties.NoAdditionalProperties1<br> schema class |
| static class | NoAdditionalProperties.NoAdditionalPropertiesMap<br> output class for Map payloads |
| static class | NoAdditionalProperties.PetId<br> schema class |
| static class | NoAdditionalProperties.Id<br> schema class |
| static class | NoAdditionalProperties.AdditionalProperties<br> schema class |

## NoAdditionalProperties1
public class NoAdditionalProperties1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static NoAdditionalPropertiesMap | validate(Map<String, Long> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | long |  | value must be a 64 bit integer
**petId** | long |  | [optional] value must be a 64 bit integer

## NoAdditionalPropertiesMap
public class NoAdditionalPropertiesMap
extends FrozenMap<String, Long>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static NoAdditionalPropertiesMap | of(Map<String, Long> arg, SchemaConfiguration configuration) |
| long | id()<br> value must be a 64 bit integer |
| long | petId()<br>[optional] value must be a 64 bit integer |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
