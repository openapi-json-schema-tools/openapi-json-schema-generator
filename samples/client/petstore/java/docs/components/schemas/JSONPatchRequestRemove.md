# JSONPatchRequestRemove
org.openapijsonschematools.components.schemas.JSONPatchRequestRemove.java
public class JSONPatchRequestRemove

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [JSONPatchRequestRemove.JSONPatchRequestRemove1](#jsonpatchrequestremove1)<br> schema class |
| static class | [JSONPatchRequestRemove.JSONPatchRequestRemoveMap](#jsonpatchrequestremovemap)<br> output class for Map payloads |
| static class | [JSONPatchRequestRemove.Op](#op)<br> schema class |
| static class | [JSONPatchRequestRemove.Path](#path)<br> schema class |
| static class | [JSONPatchRequestRemove.AdditionalProperties](#additionalproperties)<br> schema class |

## JSONPatchRequestRemove1
public static class JSONPatchRequestRemove1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>
        new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
<br/>
        new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
        new PropertyEntry("path", Path.class),
        new PropertyEntry("op", Op.class)
    ))),
<br/>
        new KeywordEntry("required", new RequiredValidator(Set.of(
        "op",
        "path"
    ))),
<br/>
        new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
<br/>
));</code>

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [JSONPatchRequestRemoveMap](#jsonpatchrequestremovemap) | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## JSONPatchRequestRemoveMap
public static class JSONPatchRequestRemoveMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [JSONPatchRequestRemoveMap](#jsonpatchrequestremovemap) | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | op()<br> must be one of ["remove"] |
| String | path()<br> |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **op** | String | The operation to perform. | must be one of ["remove"] |
| **path** | String | A JSON Pointer path. | |

## Op
public static class Op<br>
extends JsonSchema

A schema class that validates payloads

## Description
The operation to perform.
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>
        new KeywordEntry("type", new TypeValidator(Set.of(
        String.class
    )))
<br/>
));</code>

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
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema
    // NotAnyTypeSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

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
