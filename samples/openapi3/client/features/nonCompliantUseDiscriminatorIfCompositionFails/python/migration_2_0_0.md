# Migration v1.X.X to v2.0.0

- [Compatibility note for opeanpi-generator](#compatibility-note-for-opeanpi-generator)
- [Component Generation](#component-generation)
- [Packaging Changes](#packaging-changes)
- [Path Generation](#path-generation)
- [Configuration Info Refactored](#configuration-info-refactored)
- [Servers and Security Generation](#servers-and-security-generation)
- [Java Classes for Openapi Data Refactored](#java-classes-for-openapi-data-refactored)
- [Api Access by Tags and Paths Updated](#api-access-by-tags-and-paths-updated)
- [Some Method/Property/Input/Class Names Updated](#some-methodpropertyinputclass-names-updated)
- [Documentation Updated](#documentation-updated)

## Compatibility note for opeanpi-generator
The v1.0.4 release is nearly identical to the openapi-generator v6.3.0 release

Below is a summary of big changes when updating you code from v1.X.X to 2.0.0

## Component Generation
Update:
Openapi document components in "#/components/x" are now generated in a components/x packages
Ths applies to:
- headers
- parameters
- request_bodies
- responses
- schemas
- security_schemes

The generator now writes a class for each of those generated components.

### Reason
A lot of openapi data is $ref references throughout an openapi document.
With this update, those $ref source locations are generated with file system paths that closely mirror the openapi
document json schema path to that info. $ref definition is then imported in generated python code.
This minimizes the amount of code that is generated, imposes well defined encapsulation and allows templates to be
re-used for many types of data regardless of where the data is in the source openapi document.

### Action
- Update where you are importing models from, models are now component schemas
  - File path change: model/pet.py -> components/schema/pet.py

## Packaging changes
Code has been updated to use .toml packaging. Code is now distributed in a src directory

### Reason
These updates follow latest python packaging best practices

### Action
- if you are suppressing generation of any files, you will need to edit those file paths
  - File Path Change: package_name -> src/package_name

## Path Generation
If paths contain inline descriptions of parameters, request bodies, responses, security, or servers,
then those are now generated in separate files. Those files are imported into the endpoint code.
File locations closely mirror the openapi data json schema path.

### Reason
Generating those files in paths that closely mirror the json schema paths will allow
the generator to use $ref to any location in the openapi document in the future, not just components.
These could include:
- relative $refs
- a request body $ref referring to the request body in another endpoint

This also allowed the generation code to work the same way regardless of where the header/requestBody etc
is in the source spec.

Note:
Operations are now at
paths/somePath/get/operation.py
and not at
paths/somePath/get/__init__.py
to minimize the amount of memory needed when importing the python package.
The configurations.api_configuration.py file imports all servers defined at:
- openapi document root
- pathItem
- pathItem operation
And if servers were defined in pathItem operations, then every operation that contains a server would be imported
in api_configuration.py. Which could be many many files.

So instead
- operation endpoint definition was moved to paths/somePath/get/operation.py
- paths/somePath/get/__init__.py stays empty and does not need lots of memory when api_configuration.py imports servers
- server information was kept in paths/somePath/get/servers/server_x.py

### Action
- if you are importing any endpoint form its file, update your import
  - File path update: paths/somePath/get.py -> paths/somePath/get/operation.py

## Configuration Info Refactored
Configuration information was separated into two classes
- configurations/api_configuration.py ApiConfiguration for:
  - server info
  - security (auth) info
  - logging info
- configurations/schema_configuration.py SchemaConfiguration for:
  - disabled openapi/json-schema keywords

### Reason
Schema validation only relies on SchemaConfiguration data and does not need to know about any ApiConfiguration info
General api configuration info was poorly structured in the legacy configuration class which had 13 inputs.
The refactored ApiConfiguration now has 4 inputs which define servers and security info.
Having these separate classes prevents circular imports when the schemas.py file imports its SchemaConfiguration class.

### Action
- When you instantiate ApiClient, update your code to pass in an instance of SchemaConfiguration + ApiConfiguration


## Servers and Security Generation
Servers are now generated as separate files with one class per file wherever they were defined in the openapi document
- servers/server_0.py
- paths/somePath/servers/server_0.py
- paths/somePath/get/servers/server_0.py
Security requirements objects are now generated as separate files with one security requirement object per file
wherever they were defined in the openapi document
- security/security_requirement_object_0.py
- paths/somePath/get/security/security_requirement_object_0.py

### Reason
Server classes now re-use schema validation code to ensure that inputs to server variables are valid.
Generating these separate files minimizes generated code and maximizes code re-use.

### Action
- If endpoints need to use specific servers or security not at index 0, pass security_index_info + server_index_info
  into ApiConfiguration when instantiating it
- If you use non-default server variable values, then update your code to pass in server_info into ApiConfiguration

## Java Classes for Openapi Data Refactored
Almost every java class used to store openapi document data at generation time has been re-written or refactored.
The new classes are much shorter and contain only what is needed to generate code and documentation.
This will make it much easier to add new openapi v3.1.0 features like new json schema keywords.
Generator interface methods were also refactored to simplify Java model instantiation and code generation.
Almost all properties are now public static final and are:
- immutable
- publicly accessible to the templates

### Reason
These updates make the code much more maintainable.
The number of properties that have to be maintained is much smaller
- Component Schema: ~100 properties in CodegenModel.java -> ~50 properties in CodegenSchema.java
- PathItem Operation: ~75 properties CodegenOperation: ~25 properties

This will reduce bugs like: why can't I access this property in this template
Because instances are mostly immutable it is very clear where the wrong value is being created/assigned.

### Action
- if you are customizing the python generator, you will need to update your java code

## Api Access By Tags and Paths Updated
Previously, keys togo from tags and paths to apis were enums.
The code was updated to use a TypedDict and uses strings as the keys.

### Reason
Making this change allows type hinting to work for the TypedDict with string keys

### Action
- If you use path_to_api.py or tag_to_api.py, update the key that you use to access the api

## Some Method/Property/Input/Class Names Updated
- is_true_oapg -> is_true_
- is_false_oapg -> is_false_
- is_none_oapg -> is_none_
- as_date_oapg -> as_date_
- as_datetime_oapg -> as_datetime_
- as_decimal_oapg -> as_decimal_
- as_uuid_oapg -> as_uuid_
- as_float_oapg -> as_float_
- as_int_oapg -> as_int_
- get_item_oapg -> get_item_
- from_openapi_data_oapg -> from_openapi_data_
- _verify_typed_dict_inputs_oapg -> _verify_typed_dict_inputs
- _configuration -> configuration_
- _arg -> arg_
- _args -> args_
- MetaOapg -> Schema_
- JsonSchema -> OpenApiSchema

### Reason
Classes can have arbitrarily named properties set on them
Endpoints can have arbitrary operationId method names set
For those reasons, I use the prefix and suffix _ to greatly reduce the likelihood of collisions
on protected + public classes/methods.

### Action
- if you use the above methods/inputs/properties/classes update them to the latest names

## Documentation Updated
- components now have sections in the readme
  - models became component schemas
- one file is now generated for each endpoint
  - that file now has a table of contents
  - heading indentation levels now are indented correctly in descending order
  - endpoint now includes server and security info (if security exists)
- servers section added to readme if servers were defined in the openapi document root
- security section added to readme if security was defined in the openapi document root

### Reason
Endpoint documentation had indentation and linking bugs before, this fixes them.
When all endpoints docs were written in one file it was difficult to link ot the correct section.
How to set server and security info was unclear before, the new docs and classes should clarify that.

### Action
- if you link to specific parts of the documentation, update your links