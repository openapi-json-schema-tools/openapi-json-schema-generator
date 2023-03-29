petstore_api.components.schema.format_test
# Schema FormatTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict | frozendict.frozendict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**byte** | str | str |  |
**date** | strdatetime.date | str |  | value must conform to RFC-3339 full-date YYYY-MM-DD
**number** | decimal.Decimal, int, float | decimal.Decimal |  |
**password** | str | str |  |
**integer** | decimal.Decimal, int | decimal.Decimal |  | [optional]
**int32** | decimal.Decimal, int | decimal.Decimal |  | [optional] value must be a 32 bit integer
**int32withValidations** | decimal.Decimal, int | decimal.Decimal |  | [optional] value must be a 32 bit integer
**int64** | decimal.Decimal, int | decimal.Decimal |  | [optional] value must be a 64 bit integer
**float** | decimal.Decimal, int, float | decimal.Decimal | this is a reserved python keyword | [optional] value must be a 32 bit float
**float32** | decimal.Decimal, int, float | decimal.Decimal |  | [optional] value must be a 32 bit float
**double** | decimal.Decimal, int, float | decimal.Decimal |  | [optional] value must be a 64 bit float
**float64** | decimal.Decimal, int, float | decimal.Decimal |  | [optional] value must be a 64 bit float
**arrayWithUniqueItems** | list, tuple | [properties.ArrayWithUniqueItems](#properties-arraywithuniqueitems) |  | [optional]
**string** | str | str |  | [optional]
**binary** | bytes, io.FileIO, io.BufferedReader | bytes, io.FileIO |  | [optional]
**dateTime** | strdatetime.datetime | str |  | [optional] value must conform to RFC-3339 date-time
**uuid** | struuid.UUID | str |  | [optional] value must be a uuid
**uuidNoExample** | struuid.UUID | str |  | [optional] value must be a uuid
**pattern_with_digits** | str | str | A string that is a 10 digit number. Can have leading zeros. | [optional]
**pattern_with_digits_and_delimiter** | str | str | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**noneProp** | None | NoneClass |  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

# properties ArrayWithUniqueItems

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | decimal.Decimal, int, float | decimal.Decimal |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
