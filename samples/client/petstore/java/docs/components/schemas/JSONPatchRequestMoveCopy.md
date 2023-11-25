# JSONPatchRequestMoveCopy1
org.openapijsonschematools.components.schemas.JSONPatchRequestMoveCopy.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, String> | JSONPatchRequestMoveCopyMap | |

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

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, String> | JSONPatchRequestMoveCopyMap | a constructor
**from** | | String |
**op** | | String | must be one of ["move", "copy"]
**path** | | String |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
