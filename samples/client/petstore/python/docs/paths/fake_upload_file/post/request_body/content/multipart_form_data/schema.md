# Schema
petstore_api.paths.fake_upload_file.post.request_body.content.multipart_form_data.schema

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaDictInput](#schemadictinput), [SchemaDict](#schemadict) | [SchemaDict](#schemadict) |

## SchemaDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**file** | bytes, io.FileIO, io.BufferedReader | file to upload |
**additionalMetadata** | str | Additional data to pass to server | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## SchemaDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**file** | bytes, io.FileIO, io.BufferedReader | file to upload |
**additionalMetadata** | str, schemas.Unset | Additional data to pass to server | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**file** | bytes, io.FileIO | file to upload |
**additionalMetadata** | str, schemas.Unset | Additional data to pass to server | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SchemaDictInput](#schemadictinput), [SchemaDict](#schemadict) | [SchemaDict](#schemadict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties
