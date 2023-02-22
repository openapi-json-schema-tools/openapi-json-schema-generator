petstore_api.components.schema.object_with_decimal_properties
# ObjectWithDecimalProperties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**length** | [**DecimalPayload**](decimal_payload.DecimalPayload.md)dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | [**DecimalPayload**](decimal_payload.DecimalPayload.md)frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO  | [optional]
**width** | str,  | str,   | [optional] value must be numeric and storable in decimal.Decimal
**cost** | [**Money**](money.Money.md)dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | [**Money**](money.Money.md)frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
