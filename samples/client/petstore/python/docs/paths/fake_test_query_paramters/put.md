petstore_api.paths.fake_test_query_paramters.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| query_parameter_collection_format | [FakeApi](../../apis/tags/fake_api.md) | This api is only for tag=fake |
| put | ApiForPut | This api is only for this endpoint |
| put | FakeTestQueryParamters | This api is only for path=/fake/test-query-paramters |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Description | To test the collection format in query parameters |
| Path | "/fake/test-query-paramters" |
| HTTP Method | put |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#query_params) | [RequestQueryParameters.Params](#requestqueryparametersparams), dict | |
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1, 2]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParameters.Params
This is a TypedDict

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
pipe | [Parameter0.schema](#parameter0-schema), list, tuple | | 
ioutil | [Parameter1.schema](#parameter1-schema), list, tuple | | 
http | [Parameter2.schema](#parameter2-schema), list, tuple | | 
url | [Parameter3.schema](#parameter3-schema), list, tuple | | 
context | [Parameter4.schema](#parameter4-schema), list, tuple | | 
refParam | [Parameter5.schema](#parameter5-schema), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | | 


#### Parameter0

##### Parameter0 Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

###### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str | str |  |

#### Parameter1

##### Parameter1 Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

###### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str | str |  |

#### Parameter2

##### Parameter2 Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

###### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str | str |  |

#### Parameter3

##### Parameter3 Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

###### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str | str |  |

#### Parameter4

##### Parameter4 Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

###### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str | str |  |

#### Parameter5

##### Parameter5 Schema

###### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[StringWithValidation](../../components/schema/string_with_validation.md) | str | str |

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessDescriptionOnly.response_cls](../../components/responses/response_success_description_only.md#response_success_description_onlyresponse_cls) | Success

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are the general api servers
- defaults to server_index=0, server.url = http://petstore.swagger.io:80/v2

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../servers/server_0.md) | petstore server
1 | [Server1](../../servers/server_1.md) | The local server
2 | [Server2](../../servers/server_2.md) | staging server with no variables

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import fake_api
from petstore_api.paths.fake_test_query_paramters.put import operation
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example passing only required values which don't have defaults set
    query_params: operation.QueryParametersDictInput = {
        'pipe': [
        "pipe_example"
    ],
        'ioutil': [
        "ioutil_example"
    ],
        'http': [
        "http_example"
    ],
        'url': [
        "url_example"
    ],
        'context': [
        "context_example"
    ],
        'refParam': string_with_validation.StringWithValidation("refParam_example"),
    }
    try:
        api_response = api_instance.query_parameter_collection_format(
            query_params=query_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->query_parameter_collection_format: %s\n" % e)
```

[[Back to top]](#top)
[[Back to FakeApi API]](../../apis/tags/fake_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)