<a name="top"></a>
petstore_api.components.schema.json_patch_request
# JSONPatchRequest

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

# items

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**JSONPatchRequestAddReplaceTest**](json_patch_request_add_replace_test.JSONPatchRequestAddReplaceTest.md) | [**JSONPatchRequestAddReplaceTest**](json_patch_request_add_replace_test.JSONPatchRequestAddReplaceTest.md) | [**JSONPatchRequestAddReplaceTest**](json_patch_request_add_replace_test.JSONPatchRequestAddReplaceTest.md) |  |
[**JSONPatchRequestRemove**](json_patch_request_remove.JSONPatchRequestRemove.md) | [**JSONPatchRequestRemove**](json_patch_request_remove.JSONPatchRequestRemove.md) | [**JSONPatchRequestRemove**](json_patch_request_remove.JSONPatchRequestRemove.md) |  |
[**JSONPatchRequestMoveCopy**](json_patch_request_move_copy.JSONPatchRequestMoveCopy.md) | [**JSONPatchRequestMoveCopy**](json_patch_request_move_copy.JSONPatchRequestMoveCopy.md) | [**JSONPatchRequestMoveCopy**](json_patch_request_move_copy.JSONPatchRequestMoveCopy.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
