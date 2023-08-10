# Mammal
petstore_api.components.schema.mammal
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
[**whale.Whale**](whale.md) | [whale.WhaleDictInput](../../components/schema/whale.md#whaledictinput), [whale.WhaleDict](../../components/schema/whale.md#whaledict) | [whale.WhaleDict](../../components/schema/whale.md#whaledict)
[**zebra.Zebra**](zebra.md) | [zebra.ZebraDictInput](../../components/schema/zebra.md#zebradictinput), [zebra.ZebraDict](../../components/schema/zebra.md#zebradict) | [zebra.ZebraDict](../../components/schema/zebra.md#zebradict)
[**pig.Pig**](pig.md) | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
