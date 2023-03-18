<a name="getinventory"></a>
# **get_inventory**

## Table of Contents
- [General Info](#general-info)
- [Return Types](#return-types)
- [Security](#security)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | Returns pet inventories by status |
| Description | Returns a map of status codes to quantities |
| Path | "/store/inventory" |
| HTTP Method | get |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessInlineContentAndHeader.response_cls](../../../components/responses/response_success_inline_content_and_header.md#response_success_inline_content_and_headerresponse_cls) | successful operation

## Security

Set auth info by setting Configuration.auth_info to a dict where the
key is the below security schema quoted name, and the value is an instance of the linked
component security scheme class. See how to do this in the code sample.

| Security Index | Security Scheme to Scope Names |
| -------------- | ------------------------------ |
| 0       | ["api_key"](../../../components/security_schemes/security_scheme_api_key.md) []<br> |

## Servers
server_index | Class | Description
------------ | ----- | ------------

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import store_api
from pprint import pprint
# security_index 0
from petstore_api.components.security_schemes import security_scheme_api_key


# auth_info for security_index 0
auth_info: configuration.AuthInfo = {
    "api_key": security_scheme_api_key.ApiKey(
        api_key='sampleApiKeyValue'
    ),
}

# See api_configuration.py for a list of all supported api configuration parameters
used_configuration = api_configuration.ApiConfiguration(
    auth_info = auth_info
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
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
