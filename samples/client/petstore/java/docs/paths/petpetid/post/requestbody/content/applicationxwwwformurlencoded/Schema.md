# Schema1
org.openapijsonschematools.paths.petpetid.post.requestbody.content.applicationxwwwformurlencoded.Schema.java
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
**name** | String | Updated name of the pet | [optional]
**status** | String | Updated status of the pet | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**name** |  | Updated name of the pet | [optional]
**status** |  | Updated status of the pet | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | SchemaMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties
