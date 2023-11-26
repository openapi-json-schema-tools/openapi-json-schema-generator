# JSONPatchRequestAddReplaceTest
org.openapijsonschematools.components.schemas.JSONPatchRequestAddReplaceTest.java
public class JSONPatchRequestAddReplaceTest

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTest1<br> schema class |
| static class | JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTestMap<br> output class for Map payloads |
| static class | JSONPatchRequestAddReplaceTest.Op<br> schema class |
| static class | JSONPatchRequestAddReplaceTest.Value<br> schema class |
| static class | JSONPatchRequestAddReplaceTest.Path<br> schema class |
| static class | JSONPatchRequestAddReplaceTest.AdditionalProperties<br> schema class |

## JSONPatchRequestAddReplaceTest1
public class JSONPatchRequestAddReplaceTest1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static JSONPatchRequestAddReplaceTestMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**op** | String | The operation to perform. | must be one of ["add", "replace", "test"]
**path** | String | A JSON Pointer path. |
**value** | Object | The value to add, replace or test. |

## JSONPatchRequestAddReplaceTestMap
public class JSONPatchRequestAddReplaceTestMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static JSONPatchRequestAddReplaceTestMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | op()<br> must be one of ["add", "replace", "test"] |
| String | path()<br> |
| Object | value()<br> |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
