# JSONPatchRequestRemove1
org.openapijsonschematools.components.schemas.JSONPatchRequestRemove.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, String> | JSONPatchRequestRemoveMap | |

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

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, String> | JSONPatchRequestRemoveMap | a constructor
**op** | | String | must be one of ["remove"]
**path** | | String |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
