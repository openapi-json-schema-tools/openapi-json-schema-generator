<a name="top"></a>
## petstore_api.components.responses.response_success_with_json_api_response
# <a id="" ></a>
## <a id="response_cls" >.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[.content..schema](#contentschema), ] |  |
headers | [.Headers](#Headers) |  |

# <a id="content" >.content.</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponse**](../../components/schema/api_response.ApiResponse.md) |  | 

## Headers

Key | Accessed Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ref-schema-header | [RefSchemaHeader.schema](../../components/headers/header_ref_schema_header.md#header_ref_schema_headerschema) | | 
int32 | [Int32JsonContentTypeHeader.content..](../../components/headers/header_int32_json_content_type_header.md#content) | | 
ref-content-schema-header | [RefContentSchemaHeader.content..](../../components/headers/header_ref_content_schema_header.md#content) | | 
stringHeader | [RefStringHeader.schema](../../components/headers/header_ref_string_header.md#header_ref_string_headerschema) | | 
numberHeader | [NumberHeader.schema](../../components/headers/header_number_header.md#header_number_headerschema) | | optional

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
