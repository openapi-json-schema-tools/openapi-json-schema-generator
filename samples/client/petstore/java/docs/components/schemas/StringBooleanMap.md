# StringBooleanMap
org.openapijsonschematools.components.schemas.StringBooleanMap.java
public class StringBooleanMap

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [StringBooleanMap.StringBooleanMap1](#stringbooleanmap1)<br> schema class |
| static class | [StringBooleanMap.StringBooleanMapMap](#stringbooleanmapmap)<br> output class for Map payloads |
| static class | [StringBooleanMap.AdditionalProperties](#additionalproperties)<br> schema class |

## StringBooleanMap1
public class StringBooleanMap1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [StringBooleanMapMap](#stringbooleanmapmap) | validate(Map<String, Boolean> arg, SchemaConfiguration configuration) |

## StringBooleanMapMap
public class StringBooleanMapMap
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [StringBooleanMapMap](#stringbooleanmapmap) | of(Map<String, Boolean> arg, SchemaConfiguration configuration) |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | boolean | any string name can be used but the value must be the correct type | [optional]

## AdditionalProperties
public class AdditionalProperties
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
