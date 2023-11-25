# Schema1
org.openapijsonschematools.paths.fake.post.requestbody.content.applicationxwwwformurlencoded.Schema.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | SchemaMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**byte** | String | None |
**double** | double | None | value must be a 64 bit float
**number** | Number | None |
**pattern_without_delimiter** | String | None |
**integer** | long | None | [optional]
**int32** | int | None | [optional] value must be a 32 bit integer
**int64** | long | None | [optional] value must be a 64 bit integer
**float** | float | None | [optional] value must be a 32 bit float
**string** | String | None | [optional]
**binary** | String | None | [optional]
**date** | String | None | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**dateTime** | String | None | [optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time
**password** | String | None | [optional]
**callback** | String | None | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, Object>
```

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
&lowbar;&lowbar;getitem&lowbar;&lowbar; | String |  | This model has invalid python names so this method is used under the hood when you access instance["byte"], instance["double"], instance["number"], instance["integer"], instance["float"], instance["string"], 
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties
