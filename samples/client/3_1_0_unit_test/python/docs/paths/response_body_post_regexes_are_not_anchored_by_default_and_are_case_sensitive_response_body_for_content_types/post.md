openapi_client.paths.response_body_post_regexes_are_not_anchored_by_default_and_are_case_sensitive_response_body_for_content_types.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| post_regexes_are_not_anchored_by_default_and_are_case_sensitive_response_body_for_content_types | [PatternPropertiesApi](../../apis/tags/pattern_properties_api.md) | This api is only for tag=patternProperties |
| post_regexes_are_not_anchored_by_default_and_are_case_sensitive_response_body_for_content_types | [PathPostApi](../../apis/tags/path_post_api.md) | This api is only for tag=path.post |
| post_regexes_are_not_anchored_by_default_and_are_case_sensitive_response_body_for_content_types | [ContentTypeJsonApi](../../apis/tags/content_type_json_api.md) | This api is only for tag=contentType_json |
| post_regexes_are_not_anchored_by_default_and_are_case_sensitive_response_body_for_content_types | [ResponseContentContentTypeSchemaApi](../../apis/tags/response_content_content_type_schema_api.md) | This api is only for tag=response.content.contentType.schema |
| post | ApiForPost | This api is only for this endpoint |
| post | ResponseBodyPostRegexesAreNotAnchoredByDefaultAndAreCaseSensitiveResponseBodyForContentTypes | This api is only for path=/responseBody/postRegexesAreNotAnchoredByDefaultAndAreCaseSensitiveResponseBodyForContentTypes |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Path | "/responseBody/postRegexesAreNotAnchoredByDefaultAndAreCaseSensitiveResponseBodyForContentTypes" |
| HTTP Method | post |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.ApiResponse](#responsefor200-apiresponse) | success

## ResponseFor200

### Description
success

### ResponseFor200 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor200-body) | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |
headers | Unset | headers were not defined |

### ResponseFor200 Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema2](#responsefor200-content-applicationjson-schema2)

### Body Details
#### ResponseFor200 content ApplicationJson Schema2
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**regexes_are_not_anchored_by_default_and_are_case_sensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive**](../../components/schema/regexes_are_not_anchored_by_default_and_are_case_sensitive.md) | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are the general api servers
- defaults to server_index=0, server.url = https://someserver.com/v1

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../servers/server_0.md) |

## Code Sample

```python
import openapi_client
from openapi_client.configurations import api_configuration
from openapi_client.apis.tags import pattern_properties_api
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with openapi_client.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = pattern_properties_api.PatternPropertiesApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_regexes_are_not_anchored_by_default_and_are_case_sensitive_response_body_for_content_types()
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling PatternPropertiesApi->post_regexes_are_not_anchored_by_default_and_are_case_sensitive_response_body_for_content_types: %s\n" % e)
```

[[Back to top]](#top)
[[Back to PatternPropertiesApi API]](../../apis/tags/pattern_properties_api.md)
[[Back to PathPostApi API]](../../apis/tags/path_post_api.md)
[[Back to ContentTypeJsonApi API]](../../apis/tags/content_type_json_api.md)
[[Back to ResponseContentContentTypeSchemaApi API]](../../apis/tags/response_content_content_type_schema_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)