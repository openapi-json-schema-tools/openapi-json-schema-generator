petstore_api.paths.fake_upload_files.post.request_body.content.multipart_form_data.schema
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
**files** | list, tuple |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## SchemaDict
```
base class: schemas.immutabledict[str, typing.Tuple[schemas.OUTPUT_BASE_TYPES]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**files** | [FilesTupleInput](#filestupleinput), [FilesTuple](#filestuple), schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**files** | [FilesTuple](#filestuple), schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SchemaDictInput](#schemadictinput), [SchemaDict](#schemadict) | [SchemaDict](#schemadict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

petstore_api.paths.fake_upload_files.post.request_body.content.multipart_form_data.schema.properties.files
# Files

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[FilesTupleInput](#filestupleinput), [FilesTuple](#filestuple) | [FilesTuple](#filestuple) |

## FilesTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.FileIO
        ],
    ],
    typing.Tuple[
        typing.Union[
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.FileIO
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | bytes, io.FileIO, io.BufferedReader |  |

## FilesTuple
```
base class: typing.Tuple[
    typing.Union[bytes, schemas.FileIO],
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [FilesTupleInput](#filestupleinput), [FilesTuple](#filestuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | typing.Union[bytes, schemas.FileIO] | This method is used under the hood when instance[0] is called
