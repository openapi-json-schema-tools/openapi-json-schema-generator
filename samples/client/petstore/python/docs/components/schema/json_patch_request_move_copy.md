petstore_api.components.schema.json_patch_request_move_copy
# Schema JSONPatchRequestMoveCopy

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[JSONPatchRequestMoveCopyDictInput](#jsonpatchrequestmovecopydictinput) | [JSONPatchRequestMoveCopyDict](#jsonpatchrequestmovecopydict) |

## JSONPatchRequestMoveCopyDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**from** | str | A JSON Pointer path. |
**op** | str | The operation to perform. | must be one of ["move", "copy"]
**path** | str | A JSON Pointer path. |

## JSONPatchRequestMoveCopyDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**from** | str | str | A JSON Pointer path. | value must be accessed with instance["from"] because the key is not a valid identifier 
**op** | str | str | The operation to perform. | must be one of ["move", "copy"]
**path** | str | str | A JSON Pointer path. |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
