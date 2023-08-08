petstore_api.components.schema.health_check_result
# Schema HealthCheckResult

## Description
Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[HealthCheckResultDictInput](#healthcheckresultdictinput), [HealthCheckResultDict](#healthcheckresultdict) | [HealthCheckResultDict](#healthcheckresultdict) |

## HealthCheckResultDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**NullableMessage** | None, str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## HealthCheckResultDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[HealthCheckResultDictInput](#healthcheckresultdictinput), [HealthCheckResultDict](#healthcheckresultdict) | [HealthCheckResultDict](#healthcheckresultdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**NullableMessage** | None, str, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**NullableMessage** | None, str, schemas.Unset |  | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
