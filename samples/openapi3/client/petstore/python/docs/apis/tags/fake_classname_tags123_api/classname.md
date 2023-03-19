<a name="classname"></a>
# **classname**

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
| Summary | To test class name in snake case |
| Description | To test class name in snake case |
| Path | "/fake_classname_test" |
| HTTP Method | patch |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[**body**](../../../components/request_bodies/request_body_client.md) | typing.Union[[Client.content.application_json.schema](../../../components/request_bodies/request_body_client.md#request_body_clientcontentapplication_jsonschema)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different server
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | successful operation

## responses ResponseFor200

### Description
successful operation

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | typing.Union[[content.application_json.schema](#responses-responsefor200-content-applicationjson-schema), ] |  |
headers | Unset | headers were not defined |

### Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responses-responsefor200-content-applicationjson-schema)

### Body Details
#### responses ResponseFor200 content ApplicationJson Schema

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[Client](../../../components/schema/client.md) | dict, frozendict.frozendict,  | frozendict.frozendict,  |

## Security

Set auth info by setting ApiConfiguration.auth_info to a dict where the
key is the below security schema quoted name, and the value is an instance of the linked
component security scheme class. See how to do this in the code sample.

| Security Index | Security Scheme to Scope Names |
| -------------- | ------------------------------ |
| 0       | ["api_key_query"](../../../components/security_schemes/security_scheme_api_key_query.md) []<br> |

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server_index in ApiConfiguration.server_index or by
passing server_index in to the endpoint function.
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
from petstore_api.apis.tags import fake_classname_tags123_api
from pprint import pprint
# security_index 0
from petstore_api.components.security_schemes import security_scheme_api_key_query


# auth_info for security_index 0
auth_info: api_configuration.AuthInfo = {
    "api_key_query": security_scheme_api_key_query.ApiKeyQuery(
        api_key='sampleApiKeyValue'
    ),
}

used_configuration = api_configuration.ApiConfiguration(
    auth_info=auth_info
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_classname_tags123_api.FakeClassnameTags123Api(api_client)

    # example passing only required values which don't have defaults set
    body = client.Client(
        client="client_example",
    )
    try:
        # To test class name in snake case
        api_response = api_instance.classname(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeClassnameTags123Api->classname: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../FakeClassnameTags123Api.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
