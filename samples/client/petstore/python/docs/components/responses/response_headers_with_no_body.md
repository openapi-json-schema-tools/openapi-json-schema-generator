petstore_api.components.responses.response_headers_with_no_body
# Response HeadersWithNoBody

## Description
A response that contains headers but no body


## ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
[headers](#headers) | [HeadersDict](#headers-headersdict) | |

## Headers
### Headers
```
type: schemas.Schema
```

#### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[HeadersDictInput](#headers-headersdictinput), [HeadersDict](#headers-headersdict) | [HeadersDict](#headers-headersdict) |

#### Headers HeadersDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**location** | str |  | [optional]

#### Headers HeadersDict
```
base class: schemas.immutabledict[str, str]

```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**location** | str, schemas.Unset |  | [optional]

##### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**location** | str, schemas.Unset |  | [optional]

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [HeadersDictInput](#headers-headersdictinput), [HeadersDict](#headers-headersdict) | [HeadersDict](#headers-headersdict) | a constructor

## Header Details
### headers Location

#### Description
Where to find the newly added key.

#### headers Location Schema
petstore_api.components.responses.response_headers_with_no_body.headers.header_location.schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
