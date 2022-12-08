<a name="top"></a>
## petstore_api.components.responses.success_with_json_api_response_response
# ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[schema](#schema), ] |  |
headers | [Headers](#Headers) |  |

# schema
Type | Description  | Notes
------------- | ------------- | -------------
[**api_response.ApiResponse**](../../components/schema/api_response.ApiResponse.md) |  | 

## Headers

Key | Accessed Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ref-schema-header | [ref_schema_header_header.schema](../../components/headers/ref_schema_header_header.md#schema) | | optional
int32 | [int32_json_content_type_header_header.schema](../../components/headers/int32_json_content_type_header_header.md#schema) | | optional
ref-content-schema-header | [ref_content_schema_header_header.schema](../../components/headers/ref_content_schema_header_header.md#schema) | | optional
stringHeader | [string_header_header.schema](../../components/headers/string_header_header.md#schema) | | optional
numberHeader | [number_header_header.schema](../../components/headers/number_header_header.md#schema) | | optional

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
