<a name="top"></a>
## petstore_api.components.responses.response_success_with_json_api_response
# ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[application_json](#application_json), ] |  |
headers | [Headers](#Headers) |  |

# application_json
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponse**](../../components/schema/api_response.ApiResponse.md) |  | 

## Headers

Key | Accessed Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ref-schema-header | [header_ref_schema_header.schema](../../components/headers/header_ref_schema_header.md#schema) | | 
int32 | [header_int32_json_content_type_header.application_json](../../components/headers/header_int32_json_content_type_header.md#application_json) | | 
ref-content-schema-header | [header_ref_content_schema_header.application_json](../../components/headers/header_ref_content_schema_header.md#application_json) | | 
stringHeader | [header_string_header.schema](../../components/headers/header_string_header.md#schema) | | 
numberHeader | [header_number_header.schema](../../components/headers/header_number_header.md#schema) | | optional

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
