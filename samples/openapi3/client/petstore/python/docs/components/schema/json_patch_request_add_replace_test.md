petstore_api.components.schema.json_patch_request_add_replace_test
# Schema JSONPatchRequestAddReplaceTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**op** | str | str | The operation to perform. | must be one of ["add", "replace", "test"]
**path** | str | str | A JSON Pointer path. |
**value** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | The value to add, replace or test. |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
