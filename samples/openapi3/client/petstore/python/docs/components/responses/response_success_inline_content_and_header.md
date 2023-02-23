petstore_api.components.responses.response_success_inline_content_and_header
# SuccessInlineContentAndHeader

## <a id="response_success_inline_content_and_headerdescription" >Description</a>
successful operation

## <a id="response_success_inline_content_and_headerresponse_cls" >response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#content) | typing.Union[[content.application_json.schema](#content-applicationjson-schema), ] |  |
[headers](#headers) | [Headers](#headers) |  |

## Headers

Key | Accessed Type | Description  | Notes
------------- | ------------- | ------------- | -------------
someHeader | [headers.header_some_header.schema](#someheader-schema) | | optional
## content

### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#content-applicationjson-schema)
### content ApplicationJson Schema

#### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

#### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | decimal.Decimal, int,  | decimal.Decimal,  | any string name can be used but the value must be the correct type | [optional] value must be a 32 bit integer

## Header Details
### SomeHeader

#### SomeHeader Schema

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
