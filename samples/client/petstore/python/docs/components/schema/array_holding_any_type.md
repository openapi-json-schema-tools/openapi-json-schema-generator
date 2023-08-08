petstore_api.components.schema.array_holding_any_type
# Schema ArrayHoldingAnyType

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayHoldingAnyTypeTupleInput](#arrayholdinganytypetupleinput), [ArrayHoldingAnyTypeTuple](#arrayholdinganytypetuple) | [ArrayHoldingAnyTypeTuple](#arrayholdinganytypetuple) |

## ArrayHoldingAnyTypeTupleInput
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any type can be stored here |

## ArrayHoldingAnyTypeTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | any type can be stored here |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
