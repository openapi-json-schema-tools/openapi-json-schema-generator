<a name="top"></a>
## petstore_api.components.responses.success_with_json_api_response_response
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
stringHeader | [parameter_string_header.schema](#parameter_string_header.schema) | | optional
numberHeader | [parameter_number_header.schema](#parameter_number_header.schema) | | optional

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
