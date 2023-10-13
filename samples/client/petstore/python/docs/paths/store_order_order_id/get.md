petstore_api.paths.store_order_order_id.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| get_order_by_id | [StoreApi](../../apis/tags/store_api.md) | This api is only for tag=store |
| get | ApiForGet | This api is only for this endpoint |
| get | StoreOrderOrderId | This api is only for path=/store/order/{order_id} |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | Find purchase order by ID |
| Description | For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions |
| Path | "/store/order/{order_id}" |
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
**order_id** | int |  |

#### PathParameters PathParametersDict
```
base class: schemas.immutabledict[str, int]

```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**order_id** | int |  |

##### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**order_id** | int |  |

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [PathParametersDictInput](#pathparameters-pathparametersdictinput), [PathParametersDict](#pathparameters-pathparametersdict) | [PathParametersDict](#pathparameters-pathparametersdict) | a constructor

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.ApiResponse](#responsefor200-apiresponse) | successful operation
400 | [ResponseFor400.ApiResponse](#responsefor400-apiresponse) | Invalid ID supplied
404 | [ResponseFor404.ApiResponse](#responsefor404-apiresponse) | Order not found

## ResponseFor200

### Description
successful operation

### ResponseFor200 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor200-body) | typing.Union[[order.OrderDict](../../components/schema/order.md#orderdict), [order.OrderDict](../../components/schema/order.md#orderdict)] |  |
headers | Unset | headers were not defined |

### ResponseFor200 Body
Content-Type | Schema
------------ | -------
"application/xml" | [content.application_xml.Schema](#responsefor200-content-applicationxml-schema)
"application/json" | [content.application_json.Schema](#responsefor200-content-applicationjson-schema)

### Body Details
#### ResponseFor200 content ApplicationXml Schema
petstore_api.paths.store_order_order_id.get.responses.response_200.content.application_xml.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**order.Order**](../../components/schema/order.md) | [order.OrderDictInput](../../components/schema/order.md#orderdictinput), [order.OrderDict](../../components/schema/order.md#orderdict) | [order.OrderDict](../../components/schema/order.md#orderdict)
#### ResponseFor200 content ApplicationJson Schema
petstore_api.paths.store_order_order_id.get.responses.response_200.content.application_json.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**order.Order**](../../components/schema/order.md) | [order.OrderDictInput](../../components/schema/order.md#orderdictinput), [order.OrderDict](../../components/schema/order.md#orderdict) | [order.OrderDict](../../components/schema/order.md#orderdict)

## ResponseFor400

### Description
Invalid ID supplied

### ResponseFor400 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor404

### Description
Order not found

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
from petstore_api.apis.tags import store_api
from petstore_api.paths.store_order_order_id.get import operation
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = store_api.StoreApi(api_client)

    # example passing only required values which don't have defaults set
    path_params: operation.PathParametersDictInput = {
        'order_id': 1,
    }
    try:
        # Find purchase order by ID
        api_response = api_instance.get_order_by_id(
            path_params=path_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling StoreApi->get_order_by_id: %s\n" % e)
```

[[Back to top]](#top)
[[Back to StoreApi API]](../../apis/tags/store_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)