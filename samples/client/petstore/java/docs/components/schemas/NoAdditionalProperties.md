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

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | long |  | value must be a 64 bit integer
**petId** | long |  | [optional] value must be a 64 bit integer

## PetId
public class PetId
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

## Id
public class Id
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

## AdditionalProperties
public class AdditionalProperties
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
