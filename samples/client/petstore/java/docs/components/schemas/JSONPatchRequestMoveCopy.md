# JSONPatchRequestMoveCopy1
org.openapijsonschematools.components.schemas.JSONPatchRequestMoveCopy.java
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
