<a name="getorderbyid"></a>
# **get_order_by_id**

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
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
[path_params](#path_params) | [RequestPathParameters.Params](#requestpathparametersparams) | |
accept_content_types | typing.Tuple[str] | default is ("application/xml", "application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different server
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### path_params
#### RequestPathParameters.Params

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
order_id | [Parameter0.schema](#parameter0-schema) | | 


#### Parameter0

##### Description
ID of pet that needs to be fetched

##### Parameter0 Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | successful operation
400 | [ResponseFor400.response_cls](#response_400response_cls) | Invalid ID supplied
404 | [ResponseFor404.response_cls](#response_404response_cls) | Order not found

## responses ResponseFor200

### Description
successful operation

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | typing.Union[[content.application_xml.schema](#responses-responsefor200-content-applicationxml-schema), [content.application_json.schema](#responses-responsefor200-content-applicationjson-schema), ] |  |
headers | Unset | headers were not defined |

### Body
Content-Type | Schema
------------ | -------
"application/xml" | [content.application_xml.Schema](#responses-responsefor200-content-applicationxml-schema)
"application/json" | [content.application_json.Schema](#responses-responsefor200-content-applicationjson-schema)

### Body Details
#### responses ResponseFor200 content ApplicationXml Schema

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[Order](../../../components/schema/order.md) | dict, frozendict.frozendict,  | frozendict.frozendict,  |
#### responses ResponseFor200 content ApplicationJson Schema

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[Order](../../../components/schema/order.md) | dict, frozendict.frozendict,  | frozendict.frozendict,  |

## responses ResponseFor400

### Description
Invalid ID supplied

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## responses ResponseFor404

### Description
Order not found

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import store_api
from pprint import pprint
# See api_configuration.py for a list of all supported api configuration parameters
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = store_api.StoreApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
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

[[Back to top]](#top) [[Back to API]](../StoreApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
