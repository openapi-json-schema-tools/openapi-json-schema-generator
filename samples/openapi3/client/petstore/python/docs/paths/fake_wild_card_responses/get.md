petstore_api.paths.fake_wild_card_responses.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| wild_card_responses | [FakeApi](../../apis/tags/fake_api.md) | This api is only for tag=fake |
| get | ApiForGet | This api is only for this endpoint |
| get | FakeWildCardResponses | This api is only for path=/fake/wildCardResponses |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | operation with wildcard responses |
| Path | "/fake/wildCardResponses" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1, 2]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
1XX | [ResponseFor1XX.response_cls](#responsefor1xx-response_cls) | 1XX response
200 | [ResponseFor200.response_cls](#responsefor200-response_cls) | success
2XX | [ResponseFor2XX.response_cls](#responsefor2xx-response_cls) | 2XX response
3XX | [ResponseFor3XX.response_cls](#responsefor3xx-response_cls) | 3XX response
4XX | [ResponseFor4XX.response_cls](#responsefor4xx-response_cls) | 4XX response
5XX | [ResponseFor5XX.response_cls](#responsefor5xx-response_cls) | 5XX response

## ResponseFor1XX

### Description
1XX response

### ResponseFor1XX response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor1xx-body) | [content.application_json.schema](#responsefor1xx-content-applicationjson-schema) |  |
headers | Unset | headers were not defined |

### ResponseFor1XX Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responsefor1xx-content-applicationjson-schema)

### Body Details
#### ResponseFor1XX content ApplicationJson Schema

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |

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
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |

## ResponseFor2XX

### Description
2XX response

### ResponseFor2XX response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor2xx-body) | [content.application_json.schema](#responsefor2xx-content-applicationjson-schema) |  |
headers | Unset | headers were not defined |

### ResponseFor2XX Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responsefor2xx-content-applicationjson-schema)

### Body Details
#### ResponseFor2XX content ApplicationJson Schema

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |

## ResponseFor3XX

### Description
3XX response

### ResponseFor3XX response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor3xx-body) | [content.application_json.schema](#responsefor3xx-content-applicationjson-schema) |  |
headers | Unset | headers were not defined |

### ResponseFor3XX Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responsefor3xx-content-applicationjson-schema)

### Body Details
#### ResponseFor3XX content ApplicationJson Schema

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |

## ResponseFor4XX

### Description
4XX response

### ResponseFor4XX response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor4xx-body) | [content.application_json.schema](#responsefor4xx-content-applicationjson-schema) |  |
headers | Unset | headers were not defined |

### ResponseFor4XX Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responsefor4xx-content-applicationjson-schema)

### Body Details
#### ResponseFor4XX content ApplicationJson Schema

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |

## ResponseFor5XX

### Description
5XX response

### ResponseFor5XX response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor5xx-body) | [content.application_json.schema](#responsefor5xx-content-applicationjson-schema) |  |
headers | Unset | headers were not defined |

### ResponseFor5XX Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responsefor5xx-content-applicationjson-schema)

### Body Details
#### ResponseFor5XX content ApplicationJson Schema

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are the general api servers
- defaults to server_index=0, server.url = http://petstore.swagger.io:80/v2

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../servers/server_0.md) | petstore server
1 | [Server1](../../servers/server_1.md) | The local server
2 | [Server2](../../servers/server_2.md) | staging server with no variables

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import fake_api
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # operation with wildcard responses
        api_response = api_instance.wild_card_responses()
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->wild_card_responses: %s\n" % e)
```

[[Back to top]](#top)
[[Back to FakeApi API]](../../apis/tags/fake_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)