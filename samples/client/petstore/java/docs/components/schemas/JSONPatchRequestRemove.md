# JSONPatchRequestRemove
org.openapijsonschematools.components.schemas.JSONPatchRequestRemove.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | JSONPatchRequestRemove.AdditionalProperties<br> schema class |
| static class | JSONPatchRequestRemove.Path<br> schema class |
| static class | JSONPatchRequestRemove.Op<br> schema class |
| static class | JSONPatchRequestRemove.JSONPatchRequestRemoveMap<br> output class for Map payloads |
| static class | JSONPatchRequestRemove.JSONPatchRequestRemove1<br> schema class |

## JSONPatchRequestRemove1
```
type: JsonSchema
```

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
```
base class: FrozenMap<String, String>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static JSONPatchRequestRemoveMap | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | op()<br> must be one of ["remove"] |
| String | path()<br> |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
