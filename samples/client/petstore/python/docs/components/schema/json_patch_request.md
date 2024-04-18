# JSONPatchRequest
openapi_client.components.schema.json_patch_request
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[JSONPatchRequestTupleInput](#jsonpatchrequesttupleinput), [JSONPatchRequestTuple](#jsonpatchrequesttuple) | [JSONPatchRequestTuple](#jsonpatchrequesttuple) |

## JSONPatchRequestTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
    ],
    typing.Tuple[
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |

## JSONPatchRequestTuple
```
base class: typing.Tuple[
    schemas.OUTPUT_BASE_TYPES,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [JSONPatchRequestTupleInput](#jsonpatchrequesttupleinput), [JSONPatchRequestTuple](#jsonpatchrequesttuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | This method is used under the hood when instance[0] is called

# Items
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

## Composed Schemas (allOf/anyOf/oneOf/not)
## oneOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
[**json_patch_request_add_replace_test.JSONPatchRequestAddReplaceTest**](../../components/schema/json_patch_request_add_replace_test.md) | [json_patch_request_add_replace_test.JSONPatchRequestAddReplaceTestDictInput](../../components/schema/json_patch_request_add_replace_test.md#jsonpatchrequestaddreplacetestdictinput), [json_patch_request_add_replace_test.JSONPatchRequestAddReplaceTestDict](../../components/schema/json_patch_request_add_replace_test.md#jsonpatchrequestaddreplacetestdict) | [json_patch_request_add_replace_test.JSONPatchRequestAddReplaceTestDict](../../components/schema/json_patch_request_add_replace_test.md#jsonpatchrequestaddreplacetestdict)
[**json_patch_request_remove.JSONPatchRequestRemove**](../../components/schema/json_patch_request_remove.md) | [json_patch_request_remove.JSONPatchRequestRemoveDictInput](../../components/schema/json_patch_request_remove.md#jsonpatchrequestremovedictinput), [json_patch_request_remove.JSONPatchRequestRemoveDict](../../components/schema/json_patch_request_remove.md#jsonpatchrequestremovedict) | [json_patch_request_remove.JSONPatchRequestRemoveDict](../../components/schema/json_patch_request_remove.md#jsonpatchrequestremovedict)
[**json_patch_request_move_copy.JSONPatchRequestMoveCopy**](../../components/schema/json_patch_request_move_copy.md) | [json_patch_request_move_copy.JSONPatchRequestMoveCopyDictInput](../../components/schema/json_patch_request_move_copy.md#jsonpatchrequestmovecopydictinput), [json_patch_request_move_copy.JSONPatchRequestMoveCopyDict](../../components/schema/json_patch_request_move_copy.md#jsonpatchrequestmovecopydict) | [json_patch_request_move_copy.JSONPatchRequestMoveCopyDict](../../components/schema/json_patch_request_move_copy.md#jsonpatchrequestmovecopydict)

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
