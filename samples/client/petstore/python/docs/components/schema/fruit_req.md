# FruitReq
petstore_api.components.schema.fruit_req
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
[_0](#_0) | None | None
[**apple_req.AppleReq**](apple_req.md) | [apple_req.AppleReqDictInput](../../components/schema/apple_req.md#applereqdictinput), [apple_req.AppleReqDict](../../components/schema/apple_req.md#applereqdict) | [apple_req.AppleReqDict](../../components/schema/apple_req.md#applereqdict)
[**banana_req.BananaReq**](banana_req.md) | [banana_req.BananaReqDictInput](../../components/schema/banana_req.md#bananareqdictinput), [banana_req.BananaReqDict](../../components/schema/banana_req.md#bananareqdict) | [banana_req.BananaReqDict](../../components/schema/banana_req.md#bananareqdict)

# _0
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None | None |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
