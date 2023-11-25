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

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**op** |  | The operation to perform. |
**path** |  | A JSON Pointer path. |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, String> | JSONPatchRequestRemoveMap | a constructor

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
