petstore_api.paths.user_username.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| get_user_by_name | [UserApi](../../apis/tags/user_api.md) | This api is only for tag=user |
| get | ApiForGet | This api is only for this endpoint |
| get | UserUsername | This api is only for path=/user/{username} |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | Get user by user name |
| Path | "/user/{username}" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[path_params](#path_params) | [PathParametersDictInput](#pathparameters-pathparametersdictinput), [PathParametersDict](#pathparameters-pathparametersdict) | |
accept_content_types | typing.Tuple[str] | default is ("application/xml", "application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1, 2]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned
### path_params
### PathParameters
```
type: schemas.Schema
```

#### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PathParametersDictInput](#pathparameters-pathparametersdictinput), [PathParametersDict](#pathparameters-pathparametersdict) | [PathParametersDict](#pathparameters-pathparametersdict) |

#### PathParameters PathParametersDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**username** | str |  |

#### PathParameters PathParametersDict
```
base class: schemas.immutabledict[str, str]

```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**username** | str |  |

##### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**username** | str |  |

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [PathParametersDictInput](#pathparameters-pathparametersdictinput), [PathParametersDict](#pathparameters-pathparametersdict) | [PathParametersDict](#pathparameters-pathparametersdict) | a constructor

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.ApiResponse](#responsefor200-apiresponse) | successful operation
400 | [ResponseFor400.ApiResponse](#responsefor400-apiresponse) | Invalid username supplied
404 | [ResponseFor404.ApiResponse](#responsefor404-apiresponse) | User not found

## ResponseFor200

### Description
successful operation

### ResponseFor200 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor200-body) | typing.Union[[user.UserDict](../../components/schema/user.md#userdict), [user.UserDict](../../components/schema/user.md#userdict)] |  |
headers | Unset | headers were not defined |

### ResponseFor200 Body
Content-Type | Schema
------------ | -------
"application/xml" | [content.application_xml.Schema](#responsefor200-content-applicationxml-schema)
"application/json" | [content.application_json.Schema](#responsefor200-content-applicationjson-schema)

### Body Details
#### ResponseFor200 content ApplicationXml Schema
petstore_api.paths.user_username.get.responses.response_200.content.application_xml.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**user.User**](../../components/schema/user.md) | [user.UserDictInput](../../components/schema/user.md#userdictinput), [user.UserDict](../../components/schema/user.md#userdict) | [user.UserDict](../../components/schema/user.md#userdict)
#### ResponseFor200 content ApplicationJson Schema
petstore_api.paths.user_username.get.responses.response_200.content.application_json.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**user.User**](../../components/schema/user.md) | [user.UserDictInput](../../components/schema/user.md#userdictinput), [user.UserDict](../../components/schema/user.md#userdict) | [user.UserDict](../../components/schema/user.md#userdict)

## ResponseFor400

### Description
Invalid username supplied

### ResponseFor400 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor404

### Description
User not found

### ResponseFor404 ApiResponse
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
from petstore_api.paths.user_username.get import operation
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_api.UserApi(api_client)

    # example passing only required values which don't have defaults set
    path_params: operation.PathParametersDictInput = {
        'username': "username_example",
    }
    try:
        # Get user by user name
        api_response = api_instance.get_user_by_name(
            path_params=path_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling UserApi->get_user_by_name: %s\n" % e)
```

[[Back to top]](#top)
[[Back to UserApi API]](../../apis/tags/user_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)