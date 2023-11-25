# JSONPatchRequestAddReplaceTest1
org.openapijsonschematools.components.schemas.JSONPatchRequestAddReplaceTest.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | JSONPatchRequestAddReplaceTestMap | |

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
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | JSONPatchRequestAddReplaceTestMap | a constructor
**op** | | String | must be one of ["add", "replace", "test"]
**path** | | String |
**value** | | Object |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
