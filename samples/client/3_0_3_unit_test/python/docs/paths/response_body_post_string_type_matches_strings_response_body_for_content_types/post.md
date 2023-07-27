unit_test_api.paths.response_body_post_string_type_matches_strings_response_body_for_content_types.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| post_string_type_matches_strings_response_body_for_content_types | [PathPostApi](../../apis/tags/path_post_api.md) | This api is only for tag=path.post |
| post_string_type_matches_strings_response_body_for_content_types | [ContentTypeJsonApi](../../apis/tags/content_type_json_api.md) | This api is only for tag=contentType_json |
| post_string_type_matches_strings_response_body_for_content_types | [TypeApi](../../apis/tags/type_api.md) | This api is only for tag=type |
| post_string_type_matches_strings_response_body_for_content_types | [ResponseContentContentTypeSchemaApi](../../apis/tags/response_content_content_type_schema_api.md) | This api is only for tag=response.content.contentType.schema |
| post | ApiForPost | This api is only for this endpoint |
| post | ResponseBodyPostStringTypeMatchesStringsResponseBodyForContentTypes | This api is only for path=/responseBody/postStringTypeMatchesStringsResponseBodyForContentTypes |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Path | "/responseBody/postStringTypeMatchesStringsResponseBodyForContentTypes" |
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
200 | [ResponseFor200.response_cls](#responsefor200-response_cls) | success

## ResponseFor200

### Description
success

### ResponseFor200 response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor200-body) | [content.application_json.schema](#responsefor200-content-applicationjson-schema) |  |
headers | Unset | headers were not defined |

### ResponseFor200 Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responsefor200-content-applicationjson-schema)

### Body Details
#### ResponseFor200 content ApplicationJson Schema

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[StringTypeMatchesStrings](../../components/schema/string_type_matches_strings.md) | str | str |

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
import unit_test_api
from unit_test_api.configurations import api_configuration
from unit_test_api.apis.tags import path_post_api
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with unit_test_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = path_post_api.PathPostApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_string_type_matches_strings_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling PathPostApi->post_string_type_matches_strings_response_body_for_content_types: %s\n" % e)
```

[[Back to top]](#top)
[[Back to PathPostApi API]](../../apis/tags/path_post_api.md)
[[Back to ContentTypeJsonApi API]](../../apis/tags/content_type_json_api.md)
[[Back to TypeApi API]](../../apis/tags/type_api.md)
[[Back to ResponseContentContentTypeSchemaApi API]](../../apis/tags/response_content_content_type_schema_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)