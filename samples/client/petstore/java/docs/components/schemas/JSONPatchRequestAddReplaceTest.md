# JSONPatchRequestAddReplaceTest1
org.openapijsonschematools.components.schemas.JSONPatchRequestAddReplaceTest.java
```
type: JsonSchema
```

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
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static JSONPatchRequestAddReplaceTestMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | op()<br> must be one of ["add", "replace", "test"] |
| String | path()<br> |
| Object | value()<br> |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
