<a name="top"></a>
# **foo_get**
<a name="foo_get"></a>

## Table of Contents
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
default | [Default.response_cls](#response_defaultresponse_cls) | response

### <a id="response_default" >Default</a>

#### <a id="response_defaultdescription" >Default.description</a>
response

#### <a id="response_defaultresponse_cls" >Default.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#response_defaultcontent) | typing.Union[[Default.content.application_json.schema](#response_defaultcontentapplication_jsonschema), ] |  |
headers | Unset | headers were not defined |

#### <a id="response_defaultcontent" >Default.content</a>

##### <a id="response_defaultcontentapplication_jsonschema" >Default.content.application_json.schema</a>
##### Schema

##### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

##### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**string** | [**Foo**](../../../components/schema/foo.Foo.md) | [**Foo**](../../../components/schema/foo.Foo.md) |  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

## Code Sample

```python
import petstore_api
from petstore_api.apis.tags import default_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.foo_get()
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling DefaultApi->foo_get: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../DefaultApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
