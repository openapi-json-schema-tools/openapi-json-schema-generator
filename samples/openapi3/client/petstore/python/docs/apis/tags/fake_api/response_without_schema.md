<a name="responsewithoutschema"></a>
# **response_without_schema**

## Table of Contents
- [Summary](#summary)
- Path
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Summary
receives a response without schema

## Path
"/fake/responseWithoutSchema"

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | contents without schema definition, multiple content types

## Response ResponseFor200

### Description
contents without schema definition, multiple content types

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | typing.Union[Unset, Unset, ] |  |
headers | Unset | headers were not defined |

### Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.](#content-applicationjson-)
"application/xml" | [content.application_xml.](#content-applicationxml-)

### Body Details

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
        # receives a response without schema
        api_response = api_instance.response_without_schema()
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->response_without_schema: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
