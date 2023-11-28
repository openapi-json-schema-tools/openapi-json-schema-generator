# JSONPatchRequestMoveCopy
org.openapijsonschematools.components.schemas.JSONPatchRequestMoveCopy.java
public class JSONPatchRequestMoveCopy

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopy1](#jsonpatchrequestmovecopy1)<br> schema class |
| static class | [JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopyMap](#jsonpatchrequestmovecopymap)<br> output class for Map payloads |
| static class | [JSONPatchRequestMoveCopy.Op](#op)<br> schema class |
| static class | [JSONPatchRequestMoveCopy.Path](#path)<br> schema class |
| static class | [JSONPatchRequestMoveCopy.From](#from)<br> schema class |
| static class | [JSONPatchRequestMoveCopy.AdditionalProperties](#additionalproperties)<br> schema class |

## JSONPatchRequestMoveCopy1
public static class JSONPatchRequestMoveCopy1<br>
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [JSONPatchRequestMoveCopyMap](#jsonpatchrequestmovecopymap) | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## JSONPatchRequestMoveCopyMap
public static class JSONPatchRequestMoveCopyMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [JSONPatchRequestMoveCopyMap](#jsonpatchrequestmovecopymap) | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | from()<br> |
| String | op()<br> must be one of ["move", "copy"] |
| String | path()<br> |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **from** | String | A JSON Pointer path. | |
| **op** | String | The operation to perform. | must be one of ["move", "copy"] |
| **path** | String | A JSON Pointer path. | |

## Op
public static class Op<br>
extends JsonSchema

A schema class that validates payloads

## Description
The operation to perform.

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Path
public static class Path<br>
extends StringJsonSchema

A schema class that validates payloads

## Description
A JSON Pointer path.

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## From
public static class From<br>
extends StringJsonSchema

A schema class that validates payloads

## Description
A JSON Pointer path.

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema
    // NotAnyTypeSchema

A schema class that validates payloads

### Method Summary
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
