petstore_api.components.schema.json_patch_request_move_copy
# Schema JSONPatchRequestMoveCopy

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[JSONPatchRequestMoveCopyDictInput](#jsonpatchrequestmovecopydictinput), [JSONPatchRequestMoveCopyDict](#jsonpatchrequestmovecopydict) | [JSONPatchRequestMoveCopyDict](#jsonpatchrequestmovecopydict) |

## JSONPatchRequestMoveCopyDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**from** | str | A JSON Pointer path. |
**op** | str | The operation to perform. | must be one of ["move", "copy"]
**path** | str | A JSON Pointer path. |

## JSONPatchRequestMoveCopyDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[JSONPatchRequestMoveCopyDictInput](#jsonpatchrequestmovecopydictinput), [JSONPatchRequestMoveCopyDict](#jsonpatchrequestmovecopydict) | [JSONPatchRequestMoveCopyDict](#jsonpatchrequestmovecopydict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**op** | str | The operation to perform. | must be one of ["move", "copy"]
**path** | str | A JSON Pointer path. |

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**op** | str | The operation to perform. | must be one of ["move", "copy"]
**path** | str | A JSON Pointer path. |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
