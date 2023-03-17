<a name="responsewithoutschema"></a>
# **response_without_schema**

## Table of Contents
- [General Info](#general-info)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | receives a response without schema |
| Path | "/fake/responseWithoutSchema" |
| HTTP Method | get |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | contents without schema definition, multiple content types

## responses ResponseFor200

### Description
contents without schema definition, multiple content types

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | Unset | body was not defined |
headers | Unset | headers were not defined |

### Body
Content-Type | Schema
------------ | -------
"application/json" | no schema defined
"application/xml" | no schema defined

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import fake_api
from pprint import pprint
# See api_configuration.py for a list of all supported api configuration parameters
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # receives a response without schema
        api_response = api_instance.response_without_schema()
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->response_without_schema: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
