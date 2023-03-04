<a name="deleteorder"></a>
# **delete_order**

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | Delete purchase order by ID |
| Description | For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors |
| Path | "/store/order/{order_id}" |
| HTTP Method | delete |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[path_params](#path_params) | [RequestPathParameters.Params](#requestpathparametersparams) | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### path_params
#### RequestPathParameters.Params

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
order_id | [Parameter0.schema](#parameter_0schema) | | 


#### Parameter Parameter0

##### Description
ID of the order that needs to be deleted

##### Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
400 | [ResponseFor400.response_cls](#response_400response_cls) | Invalid ID supplied
404 | [ResponseFor404.response_cls](#response_404response_cls) | Order not found

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
from petstore_api.apis.tags import store_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = store_api.StoreApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'order_id': "order_id_example",
    }
    try:
        # Delete purchase order by ID
        api_response = api_instance.delete_order(
            path_params=path_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling StoreApi->delete_order: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../StoreApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
