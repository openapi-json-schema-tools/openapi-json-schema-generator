<a name="multiplesecurities"></a>
# **multiple_securities**

## Table of Contents
- [General Info](#general-info)
- [Return Types](#return-types)
- [Security](#security)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | multiple security requirements |
| Path | "/fake/multipleSecurities" |
| HTTP Method | get |

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
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO,  |  |

## Security

Set auth info by setting Configuration.auth_info to a dict where the
key is the below security schema quoted name, and the value is an instance of the linked
component security scheme class. See how to do this in the code sample.

| Security Index | Security Scheme to Scope Names |
| -------------- | ------------------------------ |
| 0       | no security |
| 1       | ["http_basic_test"](../../../components/security_schemes/security_scheme_http_basic_test.md) []<br>["api_key"](../../../components/security_schemes/security_scheme_api_key.md) []<br> |
| 2       | ["petstore_auth"](../../../components/security_schemes/security_scheme_petstore_auth.md) [write:pets, read:pets]<br> |

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import fake_api
from pprint import pprint
# security_index 1
from petstore_api.components.security_schemes import security_scheme_http_basic_test
from petstore_api.components.security_schemes import security_scheme_api_key
# security_index 2
from petstore_api.components.security_schemes import security_scheme_petstore_auth


# auth_info for security_index 0
# no auth required for this security_index
auth_info: configuration.AuthInfo = {}

# auth_info for security_index 1
auth_info: configuration.AuthInfo = {
    "http_basic_test": security_scheme_http_basic_test.HttpBasicTest(
        user_id='someUserIdOrName',
        password='somePassword',
    ),
    "api_key": security_scheme_api_key.ApiKey(
        api_key='sampleApiKeyValue'
    ),
}

# auth_info for security_index 2
auth_info: configuration.AuthInfo = {
    "petstore_auth": security_scheme_petstore_auth.PetstoreAuth(
    ),
}

# See api_configuration.py for a list of all supported api configuration parameters
used_configuration = api_configuration.ApiConfiguration(
    auth_info = auth_info
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # multiple security requirements
        api_response = api_instance.multiple_securities()
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->multiple_securities: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
