<a name="top"></a>
## petstore_api.components.responses.success_inline_content_and_header_response
# ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[application_json](#application_json), ] |  |
headers | [Headers](#Headers) |  |

# application_json

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
someHeader | [parameter_some_header.schema](#parameter_some_header.schema) | | optional

# <a id="parameter_some_header.schema" >parameter_some_header.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
