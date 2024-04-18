openapi_client.components.responses.response_success_with_json_api_response
# Response SuccessWithJsonApiResponse

## Description
successful operation

## ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | [api_response.ApiResponseDict](../../components/schema/api_response.md#apiresponsedict) |  |
[headers](#headers) | [HeadersDict](#headers-headersdict) | |

## Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#content-applicationjson-schema)

## Body Details
### content ApplicationJson Schema
```
type: schemas.Schema
```

#### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**api_response.ApiResponse**](../../components/schema/api_response.md) | [api_response.ApiResponseDictInput](../../components/schema/api_response.md#apiresponsedictinput), [api_response.ApiResponseDict](../../components/schema/api_response.md#apiresponsedict) | [api_response.ApiResponseDict](../../components/schema/api_response.md#apiresponsedict)

## Headers
### Headers
```
type: schemas.Schema
```

#### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[HeadersDictInput](#headers-headersdictinput), [HeadersDict](#headers-headersdict) | [HeadersDict](#headers-headersdict) |

#### Headers HeadersDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**int32** | int |  |
**ref-content-schema-header** | str |  |
**ref-schema-header** | str |  |
**stringHeader** | str |  |
**numberHeader** | str |  | [optional]

#### Headers HeadersDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**int32** | int |  |
**stringHeader** | str |  |
**numberHeader** | str, schemas.Unset |  | [optional]

##### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**int32** | int |  |
**stringHeader** | str |  |
**numberHeader** | str, schemas.Unset |  | [optional]

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [HeadersDictInput](#headers-headersdictinput), [HeadersDict](#headers-headersdict) | [HeadersDict](#headers-headersdict) | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | This model has invalid python names so this method is used under the hood when you access instance["ref-content-schema-header"], instance["ref-schema-header"], 

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
