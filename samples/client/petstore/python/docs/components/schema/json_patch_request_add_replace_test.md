petstore_api.components.schema.json_patch_request_add_replace_test
# Schema JSONPatchRequestAddReplaceTest

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[JSONPatchRequestAddReplaceTestDictInput](#jsonpatchrequestaddreplacetestdictinput), [JSONPatchRequestAddReplaceTestDict](#jsonpatchrequestaddreplacetestdict) | [JSONPatchRequestAddReplaceTestDict](#jsonpatchrequestaddreplacetestdict) |

## JSONPatchRequestAddReplaceTestDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**op** | str | The operation to perform. | must be one of ["add", "replace", "test"]
**path** | str | A JSON Pointer path. |
**value** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | The value to add, replace or test. |

## JSONPatchRequestAddReplaceTestDict
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**op** | str | The operation to perform. | must be one of ["add", "replace", "test"]
**path** | str | A JSON Pointer path. |
**value** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | The value to add, replace or test. |

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**op** | str | The operation to perform. | must be one of ["add", "replace", "test"]
**path** | str | A JSON Pointer path. |
**value** | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | The value to add, replace or test. |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [JSONPatchRequestAddReplaceTestDictInput](#jsonpatchrequestaddreplacetestdictinput), [JSONPatchRequestAddReplaceTestDict](#jsonpatchrequestaddreplacetestdict) | [JSONPatchRequestAddReplaceTestDict](#jsonpatchrequestaddreplacetestdict) | a constructor

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
