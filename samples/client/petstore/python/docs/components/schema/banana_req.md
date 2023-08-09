petstore_api.components.schema.banana_req
# BananaReq

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[BananaReqDictInput](#bananareqdictinput), [BananaReqDict](#bananareqdict) | [BananaReqDict](#bananareqdict) |

## BananaReqDictInput
```
type: typing_extensions.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**lengthCm** | float, int |  |
**sweet** | bool |  | [optional]

## BananaReqDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**lengthCm** | float, int |  |
**sweet** | bool, schemas.Unset |  | [optional]

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**lengthCm** | float, int |  |
**sweet** | bool, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [BananaReqDictInput](#bananareqdictinput), [BananaReqDict](#bananareqdict) | [BananaReqDict](#bananareqdict) | a constructor

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
