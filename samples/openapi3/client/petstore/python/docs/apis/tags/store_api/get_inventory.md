<a name="top"></a>
# **get_inventory**
<a name="get_inventory"></a>

## Table of Contents
- [Summary](#summary)
- [Description](#description)
- [Return Types](#return-types)
- [Authorization](#authorization)
- [Code Sample](#code-sample)

## Summary
Returns pet inventories by status

## Description
Returns a map of status codes to quantities
This endpoint does not need any parameter.

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessInlineContentAndHeader.response_cls](../../../components/responses/response_success_inline_content_and_header.md#response_success_inline_content_and_headerresponse_cls) | successful operation

## Authorization

[api_key](../../../../README.md#api_key)

## Code Sample

* Api Key Authentication (api_key):
```python
import petstore_api
from petstore_api.apis.tags import store_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: api_key
configuration.api_key['api_key'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key'] = 'Bearer'
# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = store_api.StoreApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Returns pet inventories by status
        api_response = api_instance.get_inventory()
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling StoreApi->get_inventory: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../StoreApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
