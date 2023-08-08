petstore_api.components.schema.money
# Schema Money

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[MoneyDictInput](#moneydictinput), [MoneyDict](#moneydict) | [MoneyDict](#moneydict) |

## MoneyDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | str |  | value must be int or float numeric
**currency** | [**Currency**](currency.md), str |  |

## MoneyDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**amount** | str | str |  | value must be int or float numeric
**currency** | [**Currency**](currency.md), str | [**Currency**](currency.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
