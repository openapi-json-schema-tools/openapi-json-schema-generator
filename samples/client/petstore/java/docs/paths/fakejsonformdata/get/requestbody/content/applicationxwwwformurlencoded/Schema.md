# Schema1
org.openapijsonschematools.paths.fakejsonformdata.get.requestbody.content.applicationxwwwformurlencoded.Schema.java
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
**param** | String | field1 |
**param2** | String | field2 |
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | SchemaMap | a constructor
**param** | | String |
**param2** | | String |
getAdditionalProperty | String | Object | provides type safety for additional properties
