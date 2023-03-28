# this-package
No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)

This Python package is automatically generated by the [OpenAPI JSON Schema Generator](https://github.com/openapi-json-schema-tools/openapi-json-schema-generator) project:

- API version: 1.0
- Package version: 1.0.0
- Build package: PythonClientCodegen

## Requirements.

Python &gt;&#x3D;3.7

## Migration from other generators like python and python-legacy

### Changes
1. This generator uses spec case for all (object) property names and parameter names.
    - So if the spec has a property name like camelCase, it will use camelCase rather than camel_case
    - So you will need to update how you input and read properties to use spec case
2. Endpoint parameters are stored in dictionaries to prevent collisions (explanation below)
    - So you will need to update how you pass data in to endpoints
3. Endpoint responses now include the original response, the deserialized response body, and (todo)the deserialized headers
    - So you will need to update your code to use response.body to access deserialized data
4. All validated data is instantiated in an instance that subclasses all validated Schema classes and Decimal/str/tuple/frozendict/NoneClass/BoolClass/bytes/io.FileIO
    - This means that you can use isinstance to check if a payload validated against a schema class
    - This means that no data will be of type None/True/False
        - ingested None will subclass NoneClass
        - ingested True will subclass BoolClass
        - ingested False will subclass BoolClass
        - So if you need to check is True/False/None, instead use instance.is_true_()/.is_false_()/.is_none_()
5. All validated class instances are immutable except for ones based on io.File
    - This is because if properties were changed after validation, that validation would no longer apply
    - So no changing values or property values after a class has been instantiated
6. String + Number types with formats
    - String type data is stored as a string and if you need to access types based on its format like date,
    date-time, uuid, number etc then you will need to use accessor functions on the instance
    - type string + format: See .as_date_, .as_datetime_, .as_decimal_, .as_uuid_
    - type number + format: See .as_float_, .as_int_
    - this was done because openapi/json-schema defines constraints. string data may be type string with no format
    keyword in one schema, and include a format constraint in another schema
    - So if you need to access a string format based type, use as_date_/as_datetime_/as_decimal_/as_uuid_
    - So if you need to access a number format based type, use as_int_/as_float_
7. Property access on AnyType(type unset) or object(dict) schemas
    - Only required keys with valid python names are properties like .someProp and have type hints
    - All optional keys may not exist, so properties are not defined for them
    - One can access optional values with dict_instance['optionalProp'] and KeyError will be raised if it does not exist
    - Use get_item_ if you need a way to always get a value whether or not the key exists
        - If the key does not exist, schemas.unset is returned from calling dict_instance.get_item_('optionalProp')
        - All required and optional keys have type hints for this method, and @typing.overload is used
        - A type hint is also generated for additionalProperties accessed using this method
    - So you will need to update you code to use some_instance['optionalProp'] to access optional property
    and additionalProperty values
8. The location of the api classes has changed
    - Api classes are located in your_package.apis.tags.some_api
    - This change was made to eliminate redundant code generation
    - Legacy generators generated the same endpoint twice if it had > 1 tag on it
    - This generator defines an endpoint in one class, then inherits that class to generate
      apis by tags and by paths
    - This change reduces code and allows quicker run time if you use the path apis
        - path apis are at your_package.apis.paths.some_path
    - Those apis will only load their needed models, which is less to load than all of the resources needed in a tag api
    - So you will need to update your import paths to the api classes

### Why are Leading and Trailing Underscores in class and method names?
Classes can have arbitrarily named properties set on them
Endpoints can have arbitrary operationId method names set
For those reasons, I use the prefix and suffix _ to greatly reduce the likelihood of collisions
on protected + public classes/methods.

### Object property spec case
This was done because when payloads are ingested, they can be validated against N number of schemas.
If the input signature used a different property name then that has mutated the payload.
So SchemaA and SchemaB must both see the camelCase spec named variable.
Also it is possible to send in two properties, named camelCase and camel_case in the same payload.
That use case should work, so spec case is used.

### Parameter spec case
Parameters can be included in different locations including:
- query
- path
- header
- cookie

Any of those parameters could use the same parameter names, so if every parameter
was included as an endpoint parameter in a function signature, they would collide.
For that reason, each of those inputs have been separated out into separate typed dictionaries:
- query_params
- path_params
- header_params
- cookie_params

So when updating your code, you will need to pass endpoint parameters in using those
dictionaries.

### Endpoint responses
Endpoint responses have been enriched to now include more information.
Any response reom an endpoint will now include the following properties:
response: urllib3.HTTPResponse
body: typing.Union[Unset, Schema]
headers: typing.Union[Unset, TODO]
Note: response header deserialization has not yet been added


## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import this_package
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python -m pip install . --user
```
(or `python -m pip install .` to install the package for all users)

Then import the package:
```python
import this_package
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
import this_package
from this_package.configurations import api_configuration
from this_package.apis.tags import default_api
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with this_package.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # path with no explicit security
        api_response = api_instance.path_with_no_explicit_security()
        pprint(api_response)
    except this_package.ApiException as e:
        print("Exception when calling DefaultApi->path_with_no_explicit_security: %s\n" % e)
```

## Servers
server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](docs/servers/server_0.md) |

## Security

Set auth info by setting ApiConfiguration.security_scheme_info to a dict where the
key is the below security scheme quoted name, and the value is an instance of the linked
component security scheme class. See how to do this in the endpoint code sample.

| Security Index | Security Scheme to Scope Names |
| -------------- | ------------------------------ |
| 0       | ["api_key"](docs/components/security_schemes/security_scheme_api_key.md) []<br> |
| 1       | ["http_basic_test"](docs/components/security_schemes/security_scheme_http_basic_test.md) []<br> |
| 2       | no security |
| 3       | ["http_basic_test"](docs/components/security_schemes/security_scheme_http_basic_test.md) []<br>["api_key"](docs/components/security_schemes/security_scheme_api_key.md) []<br> |

## Endpoints

All URIs are relative to the selected server
- The server is selected by passing in server_info and server_index into api_configuration.ApiConfiguration
- Code samples in endpoints documents show how to do this
- server_index can also be passed in to endpoint calls, see endpoint documentation

HTTP request | Method | Description
------------ | ------ | -------------
/pathWithNoExplicitSecurity **get** | [DefaultApi](docs/apis/tags/default_api.md).[path_with_no_explicit_security](docs/apis/tags/default_api/path_with_no_explicit_security.md)  | path with no explicit security
/pathWithOneExplicitSecurity **get** | [DefaultApi](docs/apis/tags/default_api.md).[path_with_one_explicit_security](docs/apis/tags/default_api/path_with_one_explicit_security.md)  | path with one explicit security
/pathWithSecurityFromRoot **get** | [DefaultApi](docs/apis/tags/default_api.md).[path_with_security_from_root](docs/apis/tags/default_api/path_with_security_from_root.md)  | path with security from root
/pathWithTwoExplicitSecurity **get** | [DefaultApi](docs/apis/tags/default_api.md).[path_with_two_explicit_security](docs/apis/tags/default_api/path_with_two_explicit_security.md)  | path with two explicit security

## Component SecuritySchemes

Class | Description
----- | ------------
[ApiKey](docs/components/security_schemes/security_scheme_api_key.md) | apiKey in header
[BearerTest](docs/components/security_schemes/security_scheme_bearer_test.md) | http bearer with JWT bearer format
[HttpBasicTest](docs/components/security_schemes/security_scheme_http_basic_test.md) | http basic


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in this_package.apis.tags.tag_to_api and this_package.components.schemas may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from this_package.apis.default_api import DefaultApi`
- `from this_package.apis.paths.some_path import SomePath`
- `from this_package.paths.some_path.get import ApiForget`
- `from this_package.components.schema.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import this_package
from this_package.apis.tags.tag_to_api import *
from this_package.components.schemas import *
```