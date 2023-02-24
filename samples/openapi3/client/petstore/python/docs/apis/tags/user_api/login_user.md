<a name="loginuser"></a>
# **login_user**

## Table of Contents
- [Summary](#summary)
- Path
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Summary
Logs user into the system

## Path
"/user/login"

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#requestqueryparameters) | [RequestQueryParameters.Params](#RequestQueryParametersParams) | |
accept_content_types | typing.Tuple[str] | default is ("application/xml", "application/json", ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="requestqueryparameters" >query_params</a>
#### <a id="RequestQueryParametersParams" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
username | [Parameter0.schema](#parameter_0schema) | | 
password | [Parameter1.schema](#parameter_1schema) | | 


#### Parameter Parameter0

##### Description
The user name for login

##### Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### Parameter Parameter1

##### Description
The password for login in clear text

##### Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | successful operation
400 | [ResponseFor400.response_cls](#response_400response_cls) | Invalid username/password supplied

## Response ResponseFor200

### Description
successful operation

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | typing.Union[[content.application_xml.schema](#content-applicationxml-schema), [content.application_json.schema](#content-applicationjson-schema), ] |  |
[headers](#headers) | [Headers](#headers) |  |

### Body
Content-Type | Schema
------------ | -------
"application/xml" | [content.application_xml.Schema](#content-applicationxml-schema)
"application/json" | [content.application_json.Schema](#content-applicationjson-schema)

### Headers
Key | Accessed Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ref-schema-header | [RefSchemaHeader.schema](../../../components/headers/header_ref_schema_header.md#schema) | | 
X-Rate-Limit | [headers.header_x_rate_limit.content.application_json.schema](#headers-xratelimit-content-applicationjson-schema) | | 
int32 | [Int32JsonContentTypeHeader.content.application_json.schema](../../../components/headers/header_int32_json_content_type_header.md#content-applicationjson-schema) | | 
X-Expires-After | [headers.header_x_expires_after.schema](#headers-xexpiresafter-schema) | | optional
ref-content-schema-header | [RefContentSchemaHeader.content.application_json.schema](../../../components/headers/header_ref_content_schema_header.md#content-applicationjson-schema) | | 
stringHeader | [RefStringHeader.schema](../../../components/headers/header_ref_string_header.md#schema) | | 
numberHeader | [NumberHeader.schema](../../../components/headers/header_number_header.md#schema) | | optional

### Body Details
#### content ApplicationXml Schema

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |
#### content ApplicationJson Schema

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Header Details
#### headers XRateLimit

##### Description
calls per hour allowed by the user

##### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#headers-xratelimit-content-applicationjson-schema)

##### headers XRateLimit content ApplicationJson Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer
#### headers XExpiresAfter

##### Description
date in UTC when token expires

##### headers XExpiresAfter Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

## Response ResponseFor400

### Description
Invalid username/password supplied

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Code Sample

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

    # example passing only required values which don't have defaults set
    query_params = {
        'username': "username_example",
        'password': "password_example",
    }
    try:
        # Logs user into the system
        api_response = api_instance.login_user(
            query_params=query_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling UserApi->login_user: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../UserApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
