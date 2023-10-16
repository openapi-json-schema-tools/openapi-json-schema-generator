# AdditionOperator
this_package.components.schema.addition_operator
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AdditionOperatorDictInput](#additionoperatordictinput), [AdditionOperatorDict](#additionoperatordict) | [AdditionOperatorDict](#additionoperatordict) |

## AdditionOperatorDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**a** | float, int |  | value must be a 64 bit float
**b** | float, int |  | value must be a 64 bit float
**operator_id** | str |  | if omitted the server will use the default value of ADD

## AdditionOperatorDict
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
**operator_id** | str |  | if omitted the server will use the default value of ADD

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**a** | float, int |  | value must be a 64 bit float
**b** | float, int |  | value must be a 64 bit float
**operator_id** | str |  | if omitted the server will use the default value of ADD

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [AdditionOperatorDictInput](#additionoperatordictinput), [AdditionOperatorDict](#additionoperatordict) | [AdditionOperatorDict](#additionoperatordict) | a constructor

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
