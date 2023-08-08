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
### from_dict_ method
Input Type | Return Type
---------- | -----------
[JSONPatchRequestRemoveDictInput](#jsonpatchrequestremovedictinput), [JSONPatchRequestRemoveDict](#jsonpatchrequestremovedict) | [JSONPatchRequestRemoveDict](#jsonpatchrequestremovedict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**op** | str | str | The operation to perform. | must be one of ["remove"]
**path** | str | str | A JSON Pointer path. |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
