# JSONPatchRequestRemove
org.openapijsonschematools.components.schemas.JSONPatchRequestRemove.java
public class JSONPatchRequestRemove

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | JSONPatchRequestRemove.AdditionalProperties<br> schema class |
| static class | JSONPatchRequestRemove.Path<br> schema class |
| static class | JSONPatchRequestRemove.Op<br> schema class |
| static class | JSONPatchRequestRemove.JSONPatchRequestRemoveMap<br> output class for Map payloads |
| static class | JSONPatchRequestRemove.JSONPatchRequestRemove1<br> schema class |

## JSONPatchRequestRemove1
public class JSONPatchRequestRemove1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static JSONPatchRequestRemoveMap | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**op** | String | The operation to perform. | must be one of ["remove"]
**path** | String | A JSON Pointer path. |

## JSONPatchRequestRemoveMap
public class JSONPatchRequestRemoveMap
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static JSONPatchRequestRemoveMap | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | op()<br> must be one of ["remove"] |
| String | path()<br> |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
