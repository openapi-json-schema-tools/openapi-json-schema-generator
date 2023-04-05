petstore_api.paths.fake_multiple_securities.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| multiple_securities | [FakeApi](../../apis/tags/fake_api.md) | This api is only for tag=fake
| get | ApiForGet | This api is only for this endpoint
| get | FakeMultipleSecurities | This api is only for path=/fake/multipleSecurities

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Security](#security)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | multiple security requirements |
| Path | "/fake/multipleSecurities" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different server
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
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
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

## Security

Set auth info by setting ApiConfiguration.security_scheme_info to a dict where the
key is the below security scheme quoted name, and the value is an instance of the linked
component security scheme class.
Select the security index by setting ApiConfiguration.security_index_info or by
passing in security_index into the endpoint method.
See how to do this in the code sample.
- these securities are specific to this to this endpoint

| Security Index | Security Scheme to Scope Names |
| -------------- | ------------------------------ |
| 0       | no security |
| 1       | ["http_basic_test"](../../../components/security_schemes/security_scheme_http_basic_test.md) []<br>["api_key"](../../../components/security_schemes/security_scheme_api_key.md) []<br> |
| 2       | ["petstore_auth"](../../../components/security_schemes/security_scheme_petstore_auth.md) [write:pets, read:pets]<br> |

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are the general api servers
- defaults to server_index=0, server.url = http://petstore.swagger.io:80/v2

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../../servers/server_0.md) | petstore server
1 | [Server1](../../../servers/server_1.md) | The local server
2 | [Server2](../../../servers/server_2.md) | staging server with no variables

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import fake_api
from pprint import pprint
# security_index 1
from petstore_api.components.security_schemes import security_scheme_http_basic_test
from petstore_api.components.security_schemes import security_scheme_api_key
# security_index 2
from petstore_api.components.security_schemes import security_scheme_petstore_auth

# security_scheme_info for security_index 0
# no auth required for this security_index
security_scheme_info: api_configuration.SecuritySchemeInfo = {}


# security_scheme_info for security_index 1
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "http_basic_test": security_scheme_http_basic_test.HttpBasicTest(
        user_id='someUserIdOrName',
        password='somePassword',
    ),
    "api_key": security_scheme_api_key.ApiKey(
        api_key='sampleApiKeyValue'
    ),
}


# security_scheme_info for security_index 2
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "petstore_auth": security_scheme_petstore_auth.PetstoreAuth(
    ),
}

used_configuration = api_configuration.ApiConfiguration(
    security_scheme_info=security_scheme_info
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # multiple security requirements
        api_response = api_instance.multiple_securities()
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->multiple_securities: %s\n" % e)
```

[[Back to top]](#top)
[[Back to FakeApi API]](../../apis/tags/fake_api.md)
[[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)