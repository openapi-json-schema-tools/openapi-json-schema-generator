# json-schema-api
No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)

This Python package is automatically generated by the [OpenAPI JSON Schema Generator](https://github.com/openapi-json-schema-tools/openapi-json-schema-generator) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: PythonClientGenerator

## Requirements

Python &gt;&#x3D;3.8

## Migration Guides
- [3.0.0 Migration Guide](migration_3_0_0.md)
- [2.0.0 Migration Guide](migration_2_0_0.md)
- [Migration from Other Python Generators](migration_other_python_generators.md)


## Installation
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import json_schema_api
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python -m pip install . --user
```
(or `python -m pip install .` to install the package for all users)

Then import the package:
```python
import json_schema_api
```

## Usage Notes
### Validation, Immutability, and Data Type
This python code validates data to schema classes and return back an immutable instance containing the data
which subclasses all validated schema classes. This ensure that
- valid data cannot be mutated and become invalid to a set of schemas
  - the one exception is that files are not immutable, so schema instances storing/sending/receiving files are not immutable

Here is the mapping from json schema types to python subclassed types:
| Json Schema Type | Python Base Class |
| ---------------- | ----------------- |
| object           | schemas.immutabledict |
| array            | tuple |
| string           | str |
| number           | float, int |
| integer          | int |
| boolean          | bool |
| null             | None |
| AnyType (unset)  | typing.Union[schemas.immutabledict, tuple, str, float, int, bool, None] |

### Storage of Json Schema Definition in Python Classes
In openapi v3.0.3 there are ~ 28 json schema keywords. Almost all of them can apply if
type is unset. I have chosen to separate the storage of json schema definition info and output
validated classes for payload instantiation.

<details>
  <summary>Reason</summary>

This json schema data is stored in each class that is written for a schema, in a component or
other openapi document location. This class is only responsible for storing schema info.
Output classes like those that store dict payloads are written separately and are
returned by the Schema.validate method when that method is passed in dict input.
This prevents payload property access methods from
colliding with json schema definition.
</details>

### Json Schema Type Object
Most component schemas (models) are probably of type object. Which is a map data structure.
Json schema allows string keys in this map, which means schema properties can have key names that are
invalid python variable names. Names like:
- "hi-there"
- "1variable"
- "@now"
- " "
- "from"

To allow these use cases to work, schemas.immutabledict is used as the base class of type object schemas.
This means that one can use normal dict methods on instances of these classes.

<details>
  <summary>Other Details</summary>

- optional properties which were not set will not exist in the instance
- None is only allowed in as a value if type: "null" was included or nullable: true was set
- preserving the original key names is required to properly validate a payload to multiple json schemas
</details>

### Json Schema Type + Format, Validated Data Storage
N schemas can be validated on the same payload.
To allow multiple schemas to validate, the data must be stored using one base class whether or not
a json schema format constraint exists in the schema.
See the below accessors for string data:
- type string + format: See schemas.as_date, schemas.as_datetime, schemas.as_decimal, schemas.as_uuid

In json schema, type: number with no format validates both integers and floats,
so int and float values are stored for type number.

<details>
  <summary>String + Date Example</summary>

For example the string payload '2023-12-20' is validates to both of these schemas:
1. string only
```
- type: string
```
2. string and date format
```
- type: string
  format: date
```
Because of use cases like this, a datetime.date is allowed as an input to this schema, but the data
is stored as a string.
</details>

## Getting Started

Please follow the [installation procedure](#installation) and then run the following:

```python
import json_schema_api
from json_schema_api.configurations import api_configuration
from json_schema_api.apis.tags import default_api
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with json_schema_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.get_some_path()
        pprint(api_response)
    except json_schema_api.ApiException as e:
        print("Exception when calling DefaultApi->get_some_path: %s\n" % e)
```

## Servers
server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](docs/servers/server_0.md) |

## Endpoints

All URIs are relative to the selected server
- The server is selected by passing in server_info and server_index into api_configuration.ApiConfiguration
- Code samples in endpoints documents show how to do this
- server_index can also be passed in to endpoint calls, see endpoint documentation

HTTP request | Method | Description
------------ | ------ | -------------
/somePath **get** | [DefaultApi](docs/apis/tags/default_api.md).[get_some_path](docs/paths/some_path/get.md)  | 

## Component Schemas

Class | Description
----- | ------------
[AnyTypeConstString](docs/components/schema/any_type_const_string.md) |
[AnyTypeContainsValue](docs/components/schema/any_type_contains_value.md) |
[AnyTypeDependentRequired](docs/components/schema/any_type_dependent_required.md) |
[AnyTypeDependentSchemas](docs/components/schema/any_type_dependent_schemas.md) |
[AnyTypeMaxContainsValue](docs/components/schema/any_type_max_contains_value.md) |
[AnyTypeMinContainsValue](docs/components/schema/any_type_min_contains_value.md) |
[AnyTypePropertyNames](docs/components/schema/any_type_property_names.md) |
[ArrayContainsValue](docs/components/schema/array_contains_value.md) |
[ArrayMaxContainsValue](docs/components/schema/array_max_contains_value.md) |
[ArrayMinContainsValue](docs/components/schema/array_min_contains_value.md) |
[ObjectDependentRequired](docs/components/schema/object_dependent_required.md) |
[ObjectDependentSchemas](docs/components/schema/object_dependent_schemas.md) |
[ObjectPropertyNames](docs/components/schema/object_property_names.md) |
[StringConstString](docs/components/schema/string_const_string.md) |

## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in json_schema_api.apis.tags.tag_to_api and json_schema_api.components.schemas may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- tagged api: `from json_schema_api.apis.tags.default_api import DefaultApi`
- api for one path: `from json_schema_api.apis.paths.some_path import SomePath`
- api for one operation (path + verb): `from json_schema_api.paths.some_path.get import ApiForget`
- single model import: `from json_schema_api.components.schema.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import json_schema_api
from json_schema_api.apis.tags.tag_to_api import *
from json_schema_api.components.schemas import *
```