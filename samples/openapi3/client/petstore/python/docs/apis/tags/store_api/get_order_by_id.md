<a name="top"></a>
# **get_order_by_id**
<a name="get_order_by_id"></a>

Find purchase order by ID

For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions

### Example

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
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[path_params](#RequestPathParameters) | [RequestPathParameters.Params](#RequestPathParameters.Params) | |
accept_content_types | typing.Tuple[str] | default is ('application/xml', 'application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="RequestPathParameters" >path_params</a>
#### <a id="RequestPathParameters.Params" >RequestPathParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
order_id | [parameter_0.schema](#parameter_0.schema) | | 

# parameter_0.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_200.ApiResponse](#response_200ApiResponse) | successful operation
400 | [response_400.ApiResponse](#response_400ApiResponse) | Invalid ID supplied
404 | [response_404.ApiResponse](#response_404ApiResponse) | Order not found

#### <a id="response_200ApiResponse" >response_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.content.application_xml.schema](#response_for_200.content.application_xml.schema), [response_for_200.content.application_json.schema](#response_for_200.content.application_json.schema), ] |  |
headers | Unset | headers were not defined |

# <a id="response_200contentapplication_xmlschema" >response_200.content.application_xml.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Order**](../../../components/schema/order.Order.md) |  | 


# <a id="response_200contentapplication_jsonschema" >response_200.content.application_json.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Order**](../../../components/schema/order.Order.md) |  | 


#### <a id="response_400ApiResponse" >response_400.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### <a id="response_404ApiResponse" >response_404.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#top) [[Back to API]](../StoreApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
