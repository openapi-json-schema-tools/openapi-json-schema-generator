petstore_api.paths.fake.post.request_body.content.application_x_www_form_urlencoded.schema
# Schema

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
**byte** | str | None |
**double** | float, int | None | value must be a 64 bit float
**number** | float, int | None |
**pattern_without_delimiter** | str | None |
**integer** | int | None | [optional]
**int32** | int | None | [optional] value must be a 32 bit integer
**int64** | int | None | [optional] value must be a 64 bit integer
**float** | float, int | None | [optional] value must be a 32 bit float
**string** | str | None | [optional]
**binary** | bytes, io.FileIO, io.BufferedReader | None | [optional]
**date** | str, datetime.date | None | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**dateTime** | str, datetime.datetime | None | [optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time
**password** | str | None | [optional]
**callback** | str | None | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## SchemaDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**byte** | str | None |
**double** | float, int | None | value must be a 64 bit float
**number** | float, int | None |
**pattern_without_delimiter** | str | None |
**integer** | int, schemas.Unset | None | [optional]
**int32** | int, schemas.Unset | None | [optional] value must be a 32 bit integer
**int64** | int, schemas.Unset | None | [optional] value must be a 64 bit integer
**string** | str, schemas.Unset | None | [optional]
**binary** | bytes, io.FileIO, io.BufferedReader, schemas.Unset | None | [optional]
**date** | str, datetime.date, schemas.Unset | None | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**dateTime** | str, datetime.datetime, schemas.Unset | None | [optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time
**password** | str, schemas.Unset | None | [optional]
**callback** | str, schemas.Unset | None | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**byte** | str | None |
**double** | float, int | None | value must be a 64 bit float
**number** | float, int | None |
**pattern_without_delimiter** | str | None |
**integer** | int, schemas.Unset | None | [optional]
**int32** | int, schemas.Unset | None | [optional] value must be a 32 bit integer
**int64** | int, schemas.Unset | None | [optional] value must be a 64 bit integer
**string** | str, schemas.Unset | None | [optional]
**binary** | bytes, io.FileIO, schemas.Unset | None | [optional]
**date** | str, schemas.Unset | None | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**dateTime** | str, schemas.Unset | None | [optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time
**password** | str, schemas.Unset | None | [optional]
**callback** | str, schemas.Unset | None | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SchemaDictInput](#schemadictinput), [SchemaDict](#schemadict) | [SchemaDict](#schemadict) | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | schemas.OUTPUT_BASE_TYPES | This model has invalid python names so this method is used under the hood when you access instance["float"], 
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties
