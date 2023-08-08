petstore_api.components.schema.json_patch_request_remove
# Schema JSONPatchRequestRemove

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[JSONPatchRequestRemoveDictInput](#jsonpatchrequestremovedictinput), [JSONPatchRequestRemoveDict](#jsonpatchrequestremovedict) | [JSONPatchRequestRemoveDict](#jsonpatchrequestremovedict) |

## JSONPatchRequestRemoveDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**op** | str | The operation to perform. | must be one of ["remove"]
**path** | str | A JSON Pointer path. |

## JSONPatchRequestRemoveDict
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**op** | str | The operation to perform. | must be one of ["remove"]
**path** | str | A JSON Pointer path. |

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**op** | str | The operation to perform. | must be one of ["remove"]
**path** | str | A JSON Pointer path. |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [JSONPatchRequestRemoveDictInput](#jsonpatchrequestremovedictinput), [JSONPatchRequestRemoveDict](#jsonpatchrequestremovedict) | [JSONPatchRequestRemoveDict](#jsonpatchrequestremovedict) | a constructor

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
