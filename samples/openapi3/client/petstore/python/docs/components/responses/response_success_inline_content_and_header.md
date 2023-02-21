petstore_api.components.responses.response_success_inline_content_and_header
# <a id="response_success_inline_content_and_header" >SuccessInlineContentAndHeader</a>

## <a id="response_success_inline_content_and_headerdescription" >Description</a>
successful operation

## <a id="response_success_inline_content_and_headerresponse_cls" >response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#response_success_inline_content_and_headercontent) | typing.Union[[content.application_json.schema](#response_success_inline_content_and_headercontentapplication_jsonschema), ] |  |
[headers](#response_success_inline_content_and_headerheaders) | [Headers](#response_success_inline_content_and_headerheaders) |  |

## <a id="response_success_inline_content_and_headerheaders" >Headers</a>

Key | Accessed Type | Description  | Notes
------------- | ------------- | ------------- | -------------
someHeader | [headers.header_some_header.schema](#response_success_inline_content_and_headerheadersheader_some_headerschema) | | optional

## <a id="response_success_inline_content_and_headercontent" >content</a>

### <a id="response_success_inline_content_and_headerorg.openapijsonschematools.codegen.model.CodegenKey@c55ad4e9contentapplication_jsonschema" >SuccessInlineContentAndHeader.content.application_json.schema</a>
<a id=""></a>
### 

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

#### <a id="response_success_inline_content_and_headerorg.openapijsonschematools.codegen.model.CodegenKey@c55ad4e9headersheader_some_headerschema" >SuccessInlineContentAndHeader.headers.header_some_header.schema</a>
<a id=""></a>
#### 

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
