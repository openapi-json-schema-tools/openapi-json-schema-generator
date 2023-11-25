# JSONPatchRequestMoveCopy
org.openapijsonschematools.components.schemas.JSONPatchRequestMoveCopy.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | JSONPatchRequestMoveCopy.AdditionalProperties<br> schema class |
| static class | JSONPatchRequestMoveCopy.From<br> schema class |
| static class | JSONPatchRequestMoveCopy.Path<br> schema class |
| static class | JSONPatchRequestMoveCopy.Op<br> schema class |
| static class | JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopyMap<br> output class for Map payloads |
| static class | JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopy1<br> schema class |

## JSONPatchRequestMoveCopy1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static JSONPatchRequestMoveCopyMap | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**from** | String | A JSON Pointer path. |
**op** | String | The operation to perform. | must be one of ["move", "copy"]
**path** | String | A JSON Pointer path. |

## JSONPatchRequestMoveCopyMap
```
base class: FrozenMap<String, String>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static JSONPatchRequestMoveCopyMap | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | from()<br> |
| String | op()<br> must be one of ["move", "copy"] |
| String | path()<br> |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
