# JSONPatchRequest
petstore_api.components.schema.json_patch_request
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
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |

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
Class Name | Input Type | Accessed Type | Description | Notes
---------- | ---------- | ------------- | ----------- | -----
[**JSONPatchRequestAddReplaceTest**](json_patch_request_add_replace_test.md) | [**JSONPatchRequestAddReplaceTest**](json_patch_request_add_replace_test.md) | [**JSONPatchRequestAddReplaceTest**](json_patch_request_add_replace_test.md) |  |
[**JSONPatchRequestRemove**](json_patch_request_remove.md) | [**JSONPatchRequestRemove**](json_patch_request_remove.md) | [**JSONPatchRequestRemove**](json_patch_request_remove.md) |  |
[**JSONPatchRequestMoveCopy**](json_patch_request_move_copy.md) | [**JSONPatchRequestMoveCopy**](json_patch_request_move_copy.md) | [**JSONPatchRequestMoveCopy**](json_patch_request_move_copy.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
