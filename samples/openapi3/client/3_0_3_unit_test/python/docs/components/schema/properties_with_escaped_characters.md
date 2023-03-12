unit_test_api.components.schema.properties_with_escaped_characters
# Schema PropertiesWithEscapedCharacters

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**foo\nbar** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional]
**foo\&quot;bar** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional]
**foo\\bar** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional]
**foo\rbar** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional]
**foo\tbar** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional]
**foo\fbar** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)