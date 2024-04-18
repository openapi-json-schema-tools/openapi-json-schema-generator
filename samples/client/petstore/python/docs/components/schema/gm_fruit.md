# GmFruit
openapi_client.components.schema.gm_fruit
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[GmFruitDictInput](#gmfruitdictinput), [GmFruitDict](#gmfruitdict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [GmFruitDict](#gmfruitdict), str, float, int, bool, None, tuple, bytes, io.FileIO |

## GmFruitDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**color** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## GmFruitDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**color** | str, schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**color** | str, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [GmFruitDictInput](#gmfruitdictinput), [GmFruitDict](#gmfruitdict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [GmFruitDict](#gmfruitdict), str, float, int, bool, None, tuple, bytes, io.FileIO | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

## Composed Schemas (allOf/anyOf/oneOf/not)
## anyOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
[**apple.Apple**](../../components/schema/apple.md) | None, [apple.AppleDictInput](../../components/schema/apple.md#appledictinput), [apple.AppleDict](../../components/schema/apple.md#appledict) | None, [apple.AppleDict](../../components/schema/apple.md#appledict)
[**banana.Banana**](../../components/schema/banana.md) | [banana.BananaDictInput](../../components/schema/banana.md#bananadictinput), [banana.BananaDict](../../components/schema/banana.md#bananadict) | [banana.BananaDict](../../components/schema/banana.md#bananadict)

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
