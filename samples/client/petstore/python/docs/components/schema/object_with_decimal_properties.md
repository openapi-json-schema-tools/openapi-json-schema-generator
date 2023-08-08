petstore_api.components.schema.object_with_decimal_properties
# Schema ObjectWithDecimalProperties

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectWithDecimalPropertiesDictInput](#objectwithdecimalpropertiesdictinput), [ObjectWithDecimalPropertiesDict](#objectwithdecimalpropertiesdict) | [ObjectWithDecimalPropertiesDict](#objectwithdecimalpropertiesdict) |

## ObjectWithDecimalPropertiesDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**length** | [**DecimalPayload**](decimal_payload.md), str |  | [optional]
**width** | str |  | [optional] value must be int or float numeric
**cost** | [**Money**](money.md), dict, schemas.immutabledict |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ObjectWithDecimalPropertiesDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**length** | [**DecimalPayload**](decimal_payload.md), str, schemas.Unset | [**DecimalPayload**](decimal_payload.md) |  | [optional]
**width** | str, schemas.Unset | str, schemas.Unset |  | [optional] value must be int or float numeric
**cost** | [**Money**](money.md), dict, schemas.immutabledict, schemas.Unset | [**Money**](money.md) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
