# Schema1
org.openapijsonschematools.paths.fakemultiplerequestbodycontenttypes.post.requestbody.content.applicationjson.Schema.java
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
**a** | String |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**a** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | SchemaMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties
