# JSONPatchRequestAddReplaceTest
org.openapijsonschematools.components.schemas.JSONPatchRequestAddReplaceTest.java
public class JSONPatchRequestAddReplaceTest

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTest1](#jsonpatchrequestaddreplacetest1)<br> schema class |
| static class | [JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTestMap](#jsonpatchrequestaddreplacetestmap)<br> output class for Map payloads |
| static class | [JSONPatchRequestAddReplaceTest.Op](#op)<br> schema class |
| static class | [JSONPatchRequestAddReplaceTest.Value](#value)<br> schema class |
| static class | [JSONPatchRequestAddReplaceTest.Path](#path)<br> schema class |
| static class | [JSONPatchRequestAddReplaceTest.AdditionalProperties](#additionalproperties)<br> schema class |

## JSONPatchRequestAddReplaceTest1
public static class JSONPatchRequestAddReplaceTest1<br>
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [JSONPatchRequestAddReplaceTestMap](#jsonpatchrequestaddreplacetestmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## JSONPatchRequestAddReplaceTestMap
public static class JSONPatchRequestAddReplaceTestMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [JSONPatchRequestAddReplaceTestMap](#jsonpatchrequestaddreplacetestmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | op()<br> must be one of ["add", "replace", "test"] |
| String | path()<br> |
| Object | value()<br> |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **op** | String | The operation to perform. | must be one of ["add", "replace", "test"] |
| **path** | String | A JSON Pointer path. | |
| **value** | Object | The value to add, replace or test. | |

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

## Value
public static class Value<br>
extends JsonSchema

A schema class that validates payloads

## Description
The value to add, replace or test.

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

## Path
public static class Path<br>
extends JsonSchema

A schema class that validates payloads

## Description
A JSON Pointer path.

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## AdditionalProperties
public static class AdditionalProperties<br>
extends JsonSchema

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
