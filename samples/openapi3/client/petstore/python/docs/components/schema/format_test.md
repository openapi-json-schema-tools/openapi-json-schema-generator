petstore_api.components.schema.format_test
# Schema FormatTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**byte** | str | str |  |
**date** | str, datetime.date | str |  | value must conform to RFC-3339 full-date YYYY-MM-DD
**number** | float, int | float, int |  |
**password** | str | str |  |
**integer** | int | int |  | [optional]
**int32** | int | int |  | [optional] value must be a 32 bit integer
**int32withValidations** | int | int |  | [optional] value must be a 32 bit integer
**int64** | int | int |  | [optional] value must be a 64 bit integer
**float** | float, int | float, int | this is a reserved python keyword | [optional] value must be a 32 bit float
**float32** | float, int | float, int |  | [optional] value must be a 32 bit float
**double** | float, int | float, int |  | [optional] value must be a 64 bit float
**float64** | float, int | float, int |  | [optional] value must be a 64 bit float
**arrayWithUniqueItems** | list, tuple | [properties.ArrayWithUniqueItems](#properties-arraywithuniqueitems) |  | [optional]
**string** | str | str |  | [optional]
**binary** | bytes, io.FileIO, io.BufferedReader | bytes, io.FileIO |  | [optional]
**dateTime** | str, datetime.datetime | str |  | [optional] value must conform to RFC-3339 date-time
**uuid** | str, uuid.UUID | str |  | [optional] value must be a uuid
**uuidNoExample** | str, uuid.UUID | str |  | [optional] value must be a uuid
**pattern_with_digits** | str | str | A string that is a 10 digit number. Can have leading zeros. | [optional]
**pattern_with_digits_and_delimiter** | str | str | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**noneProp** | None | None |  | [optional]
**any_string_name** | dict, immutabledict.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | immutabledict.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

# properties ArrayWithUniqueItems

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | float, int | float, int |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
