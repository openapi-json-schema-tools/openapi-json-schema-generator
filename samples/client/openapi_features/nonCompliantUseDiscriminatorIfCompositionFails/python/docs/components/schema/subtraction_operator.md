# SubtractionOperator
openapi_client.components.schema.subtraction_operator
```
type: schemas.Schema
```

## Description


## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SubtractionOperatorDictInput](#subtractionoperatordictinput), [SubtractionOperatorDict](#subtractionoperatordict) | [SubtractionOperatorDict](#subtractionoperatordict) |

## SubtractionOperatorDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**a** | float, int |  | value must be a 64 bit float
**b** | float, int |  | value must be a 64 bit float
**operator_id** | str |  | if omitted the server will use the default value of SUB

## SubtractionOperatorDict
```
base class: schemas.immutabledict[str, typing.Union[
    str,
    typing.Union[int, float],
]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**a** | float, int |  | value must be a 64 bit float
**b** | float, int |  | value must be a 64 bit float
**operator_id** | str |  | if omitted the server will use the default value of SUB

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**a** | float, int |  | value must be a 64 bit float
**b** | float, int |  | value must be a 64 bit float
**operator_id** | str |  | if omitted the server will use the default value of SUB

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SubtractionOperatorDictInput](#subtractionoperatordictinput), [SubtractionOperatorDict](#subtractionoperatordict) | [SubtractionOperatorDict](#subtractionoperatordict) | a constructor

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
