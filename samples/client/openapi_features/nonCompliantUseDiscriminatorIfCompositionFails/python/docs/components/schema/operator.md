# Operator
this_package.components.schema.operator
```
type: schemas.Schema
```

## Description


## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

## Composed Schemas (allOf/anyOf/oneOf/not)
## oneOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
[**addition_operator.AdditionOperator**](../../components/schema/addition_operator.md) | [addition_operator.AdditionOperatorDictInput](../../components/schema/addition_operator.md#additionoperatordictinput), [addition_operator.AdditionOperatorDict](../../components/schema/addition_operator.md#additionoperatordict) | [addition_operator.AdditionOperatorDict](../../components/schema/addition_operator.md#additionoperatordict)
[**subtraction_operator.SubtractionOperator**](../../components/schema/subtraction_operator.md) | [subtraction_operator.SubtractionOperatorDictInput](../../components/schema/subtraction_operator.md#subtractionoperatordictinput), [subtraction_operator.SubtractionOperatorDict](../../components/schema/subtraction_operator.md#subtractionoperatordict) | [subtraction_operator.SubtractionOperatorDict](../../components/schema/subtraction_operator.md#subtractionoperatordict)

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
