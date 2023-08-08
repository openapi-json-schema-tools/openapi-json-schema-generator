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
base class: schemas.immutabledict[str, str]

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

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [JSONPatchRequestMoveCopyDictInput](#jsonpatchrequestmovecopydictinput), [JSONPatchRequestMoveCopyDict](#jsonpatchrequestmovecopydict) | [JSONPatchRequestMoveCopyDict](#jsonpatchrequestmovecopydict) | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | str | This model has invalid python names so this method is used under the hood when you access instance["from"], 

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
