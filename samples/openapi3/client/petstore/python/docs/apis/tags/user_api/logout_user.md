<a name="logoutuser"></a>
# **logout_user**

## Table of Contents
- [General Info](#general-info)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | Logs out current logged in user session |
| Path | "/user/logout" |
| HTTP Method | get |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
default | [RefSuccessDescriptionOnly.response_cls](../../../components/responses/response_ref_success_description_only.md#response_ref_success_description_onlyresponse_cls) | Success

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import user_api
from pprint import pprint
# See api_configuration.py for a list of all supported api configuration parameters
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_api.UserApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Logs out current logged in user session
        api_response = api_instance.logout_user()
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling UserApi->logout_user: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../UserApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
