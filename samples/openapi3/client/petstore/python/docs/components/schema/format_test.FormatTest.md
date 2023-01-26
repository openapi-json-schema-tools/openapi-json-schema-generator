<a name="top"></a>
## petstore_api.components.schema.format_test
# 

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**** | str,  | str,  |  |
**** | str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
**** | decimal.Decimal, int, float,  | decimal.Decimal,  |  |
**** | str,  | str,  |  |
**** |  |  |  | [optional]
**** |  |  |  | [optional] value must be a 32 bit integer
**** |  |  |  | [optional] value must be a 32 bit integer
**** |  |  |  | [optional] value must be a 64 bit integer
**** | decimal.Decimal, int, float,  | decimal.Decimal,  | this is a reserved python keyword | [optional] value must be a 32 bit float
**** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] value must be a 32 bit float
**** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] value must be a 64 bit float
**** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] value must be a 64 bit float
**** | [list, tuple, ](#) | [tuple, ](#) |  | [optional]
**** | str,  | str,  |  | [optional]
**** | bytes, io.FileIO, io.BufferedReader,  | bytes, FileIO,  |  | [optional]
**** | str, datetime.datetime,  | str,  |  | [optional] value must conform to RFC-3339 date-time
**** | str, uuid.UUID,  | str,  |  | [optional] value must be a uuid
**** | str, uuid.UUID,  | str,  |  | [optional] value must be a uuid
**** | str,  | str,  | A string that is a 10 digit number. Can have leading zeros. | [optional]
**** | str,  | str,  | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**** | None,  | NoneClass,  |  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

# 

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
 | decimal.Decimal, int, float,  | decimal.Decimal,  |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
