<a name="top"></a>
# **get_order_by_id**
<a name="get_order_by_id"></a>

## Table of Contents
- [Summary](#summary)
- [Description](#description)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Summary
Find purchase order by ID

## Description
For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[path_params](#requestpathparameters) | [RequestPathParameters.Params](#RequestPathParametersParams) | |
accept_content_types | typing.Tuple[str] | default is ("application/xml", "application/json", ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="requestpathparameters" >path_params</a>
#### <a id="RequestPathParametersParams" >RequestPathParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
order_id | [Parameter0.schema](#parameter_0schema) | | 

#### Parameter0

##### Description
ID of pet that needs to be fetched
##### <a id="parameter_0org.openapijsonschematools.codegen.model.CodegenKey@be540734schema" >Parameter0.schema</a>
##### Schema

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

## 

### <a id="response_200description" >Description</a>
successful operation

### <a id="response_200response_cls" >response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | typing.Union[[content.application_xml.schema](#), [content.application_json.schema](#), ] |  |
headers | Unset | headers were not defined |

### Body
Content-Type | Schema
------------ | -------
"application/xml" | [content.application_xml.Schema](#)
"application/json" | [content.application_json.Schema](#)

### Body Details
#### 

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[Order](../../components/schemas/order.Order.md#order) | dict, frozendict.frozendict,  | frozendict.frozendict,  |
#### 

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[Order](../../components/schemas/order.Order.md#order) | dict, frozendict.frozendict,  | frozendict.frozendict,  |

## 

### <a id="response_400description" >Description</a>
Invalid ID supplied

### <a id="response_400response_cls" >response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## 

### <a id="response_404description" >Description</a>
Order not found

### <a id="response_404response_cls" >response_cls</a>
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
