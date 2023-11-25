main.java.org.openapijsonschematools.paths.fake.post.requestbody.content.applicationxwwwformurlencoded.Schema
```
type: JsonSchema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
 |  |

```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**byte** |  | None |
**double** |  | None |
**number** |  | None |
**pattern_without_delimiter** |  | None |
**integer** |  | None | [optional]
**int32** |  | None | [optional]
**int64** |  | None | [optional]
**float** |  | None | [optional]
**string** |  | None | [optional]
**binary** |  | None | [optional]
**date** |  | None | [optional]
**dateTime** |  | None | [optional]
**password** |  | None | [optional]
**callback** |  | None | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

```
base class: schemas.immutabledict[str, 
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**pattern_without_delimiter** |  | None |
**int32** |  | None | [optional]
**int64** |  | None | [optional]
**binary** |  | None | [optional]
**date** |  | None | [optional]
**dateTime** |  | None | [optional]
**password** |  | None | [optional]
**callback** |  | None | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**pattern_without_delimiter** |  | None |
**int32** |  | None | [optional]
**int64** |  | None | [optional]
**binary** |  | None | [optional]
**date** |  | None | [optional]
**dateTime** |  | None | [optional]
**password** |  | None | [optional]
**callback** |  | None | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str |  | This model has invalid python names so this method is used under the hood when you access instance["byte"], instance["double"], instance["number"], instance["integer"], instance["float"], instance["string"], 
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties
