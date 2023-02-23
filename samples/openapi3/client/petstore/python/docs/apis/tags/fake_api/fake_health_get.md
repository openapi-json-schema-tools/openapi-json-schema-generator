<a name="top"></a>
# **fake_health_get**
<a name="fake_health_get"></a>

## Table of Contents
- [Summary](#summary)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Summary
Health check endpoint

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | The instance started successfully

## ResponseFor200

### <a id="response_200description" >Description</a>
The instance started successfully

### <a id="response_200response_cls" >response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | typing.Union[[content.application_json.schema](#content-applicationjson-schema), ] |  |
headers | Unset | headers were not defined |

### Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#content-applicationjson-schema)

### Body Details
#### content ApplicationJson Schema

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[HealthCheckResult](../../components/schemas/health_check_result.HealthCheckResult.md#health_check_result) | dict, frozendict.frozendict,  | frozendict.frozendict,  |

## Code Sample

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Health check endpoint
        api_response = api_instance.fake_health_get()
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->fake_health_get: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
