<a name="top"></a>
## petstore_api.components.responses.response_success_inline_content_and_header
# <a id="ApiResponse" >ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[content.application_json.schema](#contentapplication_jsonschema), ] |  |
headers | [Headers](#Headers) |  |

# content.application_json.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | decimal.Decimal, int,  | decimal.Decimal,  | any string name can be used but the value must be the correct type | [optional] value must be a 32 bit integer
## Headers

Key | Accessed Type | Description  | Notes
------------- | ------------- | ------------- | -------------
someHeader | [response_success_inline_content_and_header.header_some_header.schema](#response_success_inline_content_and_headerheader_some_headerschema) | | optional

# <a id="response_for_someHeaderheader_some_headerschema" >response_for_.someHeader.header_some_header.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
