# Schema1
org.openapijsonschematools.paths.fake.post.requestbody.content.applicationxwwwformurlencoded.Schema.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

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
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | pattern_without_delimiter()<br> |
| int | int32()<br>[optional] value must be a 32 bit integer |
| long | int64()<br>[optional] value must be a 64 bit integer |
| String | binary()<br>[optional] |
| String | date()<br>[optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| String | dateTime()<br>[optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time |
| String | password()<br>[optional] |
| String | callback()<br>[optional] |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["byte"], instance["double"], instance["number"], instance["integer"], instance["float"], instance["string"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |
