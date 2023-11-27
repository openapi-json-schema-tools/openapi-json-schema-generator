# HasOnlyReadOnly
org.openapijsonschematools.components.schemas.HasOnlyReadOnly.java
public class HasOnlyReadOnly

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [HasOnlyReadOnly.HasOnlyReadOnly1](#hasonlyreadonly1)<br> schema class |
| static class | [HasOnlyReadOnly.HasOnlyReadOnlyMap](#hasonlyreadonlymap)<br> output class for Map payloads |
| static class | [HasOnlyReadOnly.Foo](#foo)<br> schema class |
| static class | [HasOnlyReadOnly.Bar](#bar)<br> schema class |

## HasOnlyReadOnly1
public static class HasOnlyReadOnly1<br>
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [HasOnlyReadOnlyMap](#hasonlyreadonlymap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## HasOnlyReadOnlyMap
public static class HasOnlyReadOnlyMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [HasOnlyReadOnlyMap](#hasonlyreadonlymap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | bar()<br>[optional] |
| String | foo()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **bar** | String |  | [optional] |
| **foo** | String |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Foo
public static class Foo<br>
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Bar
public static class Bar<br>
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
