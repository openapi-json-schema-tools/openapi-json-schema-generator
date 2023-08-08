petstore_api.components.schema.format_test
# Schema FormatTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[FormatTestDictInput](#formattestdictinput) | [FormatTestDict](#formattestdict) |  |

## FormatTestDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**byte** | str |  |
**date** | str, datetime.date |  | value must conform to RFC-3339 full-date YYYY-MM-DD
**number** | float, int |  |
**password** | str |  |
**integer** | int |  | [optional]
**int32** | int |  | [optional] value must be a 32 bit integer
**int32withValidations** | int |  | [optional] value must be a 32 bit integer
**int64** | int |  | [optional] value must be a 64 bit integer
**float** | float, int | this is a reserved python keyword | [optional] value must be a 32 bit float
**float32** | float, int |  | [optional] value must be a 32 bit float
**double** | float, int |  | [optional] value must be a 64 bit float
**float64** | float, int |  | [optional] value must be a 64 bit float
**arrayWithUniqueItems** | list, tuple |  | [optional]
**string** | str |  | [optional]
**binary** | bytes, io.FileIO, io.BufferedReader |  | [optional]
**dateTime** | str, datetime.datetime |  | [optional] value must conform to RFC-3339 date-time
**uuid** | str, uuid.UUID |  | [optional] value must be a uuid
**uuidNoExample** | str, uuid.UUID |  | [optional] value must be a uuid
**pattern_with_digits** | str | A string that is a 10 digit number. Can have leading zeros. | [optional]
**pattern_with_digits_and_delimiter** | str | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**noneProp** | None |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## FormatTestDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**byte** | str | str |  |
**date** | str, datetime.date | str |  | value must conform to RFC-3339 full-date YYYY-MM-DD
**number** | float, int | float, int |  |
**password** | str | str |  |
**integer** | int, schemas.Unset | int, schemas.Unset |  | [optional]
**int32** | int, schemas.Unset | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**int32withValidations** | int, schemas.Unset | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**int64** | int, schemas.Unset | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**float** | float, int, schemas.Unset | float, int, schemas.Unset | this is a reserved python keyword | [optional] value must be accessed with instance["float"] because the key is not a valid identifier  value must be a 32 bit float
**float32** | float, int, schemas.Unset | float, int, schemas.Unset |  | [optional] value must be a 32 bit float
**double** | float, int, schemas.Unset | float, int, schemas.Unset |  | [optional] value must be a 64 bit float
**float64** | float, int, schemas.Unset | float, int, schemas.Unset |  | [optional] value must be a 64 bit float
**arrayWithUniqueItems** | list, tuple, schemas.Unset | [properties.ArrayWithUniqueItems](#properties-arraywithuniqueitems) |  | [optional]
**string** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**binary** | bytes, io.FileIO, io.BufferedReader, schemas.Unset | bytes, io.FileIO, schemas.Unset |  | [optional]
**dateTime** | str, datetime.datetime, schemas.Unset | str, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**uuid** | str, uuid.UUID, schemas.Unset | str, schemas.Unset |  | [optional] value must be a uuid
**uuidNoExample** | str, uuid.UUID, schemas.Unset | str, schemas.Unset |  | [optional] value must be a uuid
**pattern_with_digits** | str, schemas.Unset | str, schemas.Unset | A string that is a 10 digit number. Can have leading zeros. | [optional]
**pattern_with_digits_and_delimiter** | str, schemas.Unset | str, schemas.Unset | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**noneProp** | None, schemas.Unset | None, schemas.Unset |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties ArrayWithUniqueItems

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## properties ArrayWithUniqueItems ArrayWithUniqueItemsTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
items | float, int |  |

## properties ArrayWithUniqueItems ArrayWithUniqueItemsTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | float, int | float, int |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
