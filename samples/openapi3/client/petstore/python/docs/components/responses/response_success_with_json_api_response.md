petstore_api.components.responses.response_success_with_json_api_response
# Response SuccessWithJsonApiResponse

## Description
successful operation

## response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | [content.application_json.schema](#content-applicationjson-schema) |  |
[headers](#headers) | [Headers](#headers) |  |

## Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#content-applicationjson-schema)

## Headers
Key | Accessed Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ref-schema-header | [RefSchemaHeader.schema](../../components/headers/header_ref_schema_header.md#schema) | | 
int32 | [Int32JsonContentTypeHeader.content.application_json.schema](../../components/headers/header_int32_json_content_type_header.md#content-applicationjson-schema) | | 
ref-content-schema-header | [RefContentSchemaHeader.content.application_json.schema](../../components/headers/header_ref_content_schema_header.md#content-applicationjson-schema) | | 
stringHeader | [RefStringHeader.schema](../../components/headers/header_ref_string_header.md#schema) | | 
numberHeader | [NumberHeader.schema](../../components/headers/header_number_header.md#schema) | | optional

## Body Details
### content ApplicationJson Schema

#### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[ApiResponse](../../components/schema/api_response.md) | dict, frozendict.frozendict | frozendict.frozendict |

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
