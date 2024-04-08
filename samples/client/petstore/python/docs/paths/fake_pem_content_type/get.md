petstore_api.paths.fake_pem_content_type.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| pem_content_type | [FakeApi](../../apis/tags/fake_api.md) | This api is only for tag=fake |
| get | ApiForGet | This api is only for this endpoint |
| get | FakePemContentType | This api is only for path=/fake/pemContentType |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | route with tx and rx pem content type |
| Path | "/fake/pemContentType" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[str, schemas.Unset] | optional, default is unset |
content_type | str | optional, default is 'application/x-pem-file' | Selects the schema and serialization of the request body. value must be one of ['application/x-pem-file']
accept_content_types | typing.Tuple[str] | default is ("application/x-pem-file", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1, 2]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/x-pem-file" | [content.application_x_pem_file.Schema](#requestbody-content-applicationxpemfile-schema)

#### RequestBody content ApplicationXPemFile Schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |

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
[body](#responsefor200-body) | str |  |
headers | Unset | headers were not defined |

### ResponseFor200 Body
Content-Type | Schema
------------ | -------
"application/x-pem-file" | [content.application_x_pem_file.Schema](#responsefor200-content-applicationxpemfile-schema)

### Body Details
#### ResponseFor200 content ApplicationXPemFile Schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are specific to this endpoint
- defaults to server_index=0, server.url = http://petstore.swagger.io:80/v2

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](#server0) | petstore server
1 | [Server1](#server1) | The local server
2 | [Server2](#server2) | staging server with no variables

petstore_api.servers.server_0
### Server0

#### Description
petstore server

#### Url
http://{server}.swagger.io:{port}/v2

#### Variables
Key | Type | Description | Notes
--- | ---- | ----------- | ------
**server** | str | server host prefix |  must be one of ["petstore", "qa-petstore", "dev-petstore"] if omitted the client will use the default value of petstore
**port** | str | the port |  must be one of ["80", "8080"] if omitted the client will use the default value of 80

[[Back to top]](#top) [[Back to Servers]](../../README.md#Servers) [[Back to README]](../../README.md)

petstore_api.servers.server_1
### Server1

#### Description
The local server

#### Url
https://localhost:8080/{version}

#### Variables
Key | Type | Description | Notes
--- | ---- | ----------- | ------
**version** | str |  |  must be one of ["v1", "v2"] if omitted the client will use the default value of v2

[[Back to top]](#top) [[Back to Servers]](../../README.md#Servers) [[Back to README]](../../README.md)

petstore_api.servers.server_2
### Server2

#### Description
staging server with no variables

#### Url
https://localhost:8080

[[Back to top]](#top) [[Back to Servers]](../../README.md#Servers) [[Back to README]](../../README.md)

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

    # example passing only optional values
    body = "string_example"
    try:
        # route with tx and rx pem content type
        api_response = api_instance.pem_content_type(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->pem_content_type: %s\n" % e)
```

[[Back to top]](#top)
[[Back to FakeApi API]](../../apis/tags/fake_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)