<a name="top"></a>
# **logout_user**
<a name="logout_user"></a>

Logs out current logged in user session

### Example

```python
import petstore_api
from petstore_api.apis.tags import user_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
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
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
default | [.ApiResponse](../../../components/responses/.md) | Success

### Authorization

No authorization required

[[Back to top]](#top) [[Back to API]](../UserApi.md) [[Back to README]](../../../../README.md)
