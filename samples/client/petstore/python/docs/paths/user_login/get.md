petstore_api.paths.user_login.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| login_user | [UserApi](../../apis/tags/user_api.md) | This api is only for tag=user |
| get | ApiForGet | This api is only for this endpoint |
| get | UserLogin | This api is only for path=/user/login |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | Logs user into the system |
| Description |  |
| Path | "/user/login" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#query_params) | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | |
accept_content_types | typing.Tuple[str] | default is ("application/xml", "application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1, 2]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned
### query_params
### QueryParameters
```
type: schemas.Schema
```

#### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | [QueryParametersDict](#queryparameters-queryparametersdict) |

#### QueryParameters QueryParametersDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**password** | str |  |
**username** | str |  |

#### QueryParameters QueryParametersDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**password** | str |  |
**username** | str |  |

##### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**password** | str |  |
**username** | str |  |

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | [QueryParametersDict](#queryparameters-queryparametersdict) | a constructor

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [_200.ApiResponse](#_200-apiresponse) | successful operation
400 | [_400.ApiResponse](#_400-apiresponse) | Invalid username/password supplied

## _200

### Description
successful operation

### _200 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#_200-body) | typing.Union[str, str] |  |
[headers](#headers) | [HeadersDict](#headers-headersdict) | |

### _200 Body
Content-Type | Schema
------------ | -------
"application/xml" | [content.application_xml.Schema](#_200-content-applicationxml-schema)
"application/json" | [content.application_json.Schema](#_200-content-applicationjson-schema)

### Body Details
#### _200 content ApplicationXml Schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |
#### _200 content ApplicationJson Schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |

### Headers
#### _200 Headers
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[HeadersDictInput](#_200-headers-headersdictinput), [HeadersDict](#_200-headers-headersdict) | [HeadersDict](#_200-headers-headersdict) |

##### _200 Headers HeadersDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**X-Rate-Limit** | int |  |
**int32** | int |  |
**ref-content-schema-header** | str |  |
**X-Expires-After** | str, datetime.datetime |  | [optional]
**numberHeader** | str |  | [optional]

##### _200 Headers HeadersDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
###### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**int32** | int |  |
**numberHeader** | str, schemas.Unset |  | [optional]

###### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**int32** | int |  |
**numberHeader** | str, schemas.Unset |  | [optional]

###### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [HeadersDictInput](#_200-headers-headersdictinput), [HeadersDict](#_200-headers-headersdict) | [HeadersDict](#_200-headers-headersdict) | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | This model has invalid python names so this method is used under the hood when you access instance["X-Rate-Limit"], instance["ref-content-schema-header"], instance["X-Expires-After"], 

### Header Details
#### _200 headers XRateLimit

##### Description
calls per hour allowed by the user

##### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#_200-headers-xratelimit-content-applicationjson-schema)

##### _200 headers XRateLimit content ApplicationJson Schema
```
type: schemas.Schema
```

###### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
int | int | value must be a 32 bit integer
#### _200 headers XExpiresAfter

##### Description
date in UTC when token expires

##### _200 headers XExpiresAfter Schema
```
type: schemas.Schema
```

###### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str, datetime.datetime | str | value must conform to RFC-3339 date-time

## _400

### Description
Invalid username/password supplied

### _400 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

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
from petstore_api.apis.tags import user_api
from petstore_api.paths.user_login.get import operation
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_api.UserApi(api_client)

    # example passing only required values which don't have defaults set
    query_params: operation.QueryParametersDictInput = {
        'username': "username_example",
        'password': "password_example",
    }
    try:
        # Logs user into the system
        api_response = api_instance.login_user(
            query_params=query_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling UserApi->login_user: %s\n" % e)
```

[[Back to top]](#top)
[[Back to UserApi API]](../../apis/tags/user_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)