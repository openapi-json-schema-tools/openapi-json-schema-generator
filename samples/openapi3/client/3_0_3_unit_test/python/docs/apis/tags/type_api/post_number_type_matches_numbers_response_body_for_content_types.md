<a name="postnumbertypematchesnumbersresponsebodyforcontenttypes"></a>
# **post_number_type_matches_numbers_response_body_for_content_types**

## Table of Contents
- [Path](#path)
- [HTTP Method](#http-method)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Path
"/responseBody/postNumberTypeMatchesNumbersResponseBodyForContentTypes"

## HTTP Method
post

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | success

## responses ResponseFor200

### Description
success

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | typing.Union[[content.application_json.schema](#responses-responsefor200-content-applicationjson-schema), ] |  |
headers | Unset | headers were not defined |

### Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responses-responsefor200-content-applicationjson-schema)

### Body Details
#### responses ResponseFor200 content ApplicationJson Schema

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[NumberTypeMatchesNumbers](../../components/schemas/number_type_matches_numbers.md#number_type_matches_numbers) | decimal.Decimal, int, float,  | decimal.Decimal,  |

## Code Sample

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_number_type_matches_numbers_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_number_type_matches_numbers_response_body_for_content_types: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../TypeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
