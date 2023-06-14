petstore_api.components.responses.response_success_inline_content_and_header
# Response SuccessInlineContentAndHeader

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
someHeader | [headers.header_some_header.schema](#headers-someheader-schema) | | optional

## Body Details
### content ApplicationJson Schema

#### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

#### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | int | int | any string name can be used but the value must be the correct type | [optional] value must be a 32 bit integer

## Header Details
### headers SomeHeader

#### headers SomeHeader Schema

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str | str |  |

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
