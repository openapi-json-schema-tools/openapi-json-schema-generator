# Schema1
org.openapijsonschematools.paths.fakeuploadfile.post.requestbody.content.multipartformdata.Schema.java
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
**file** | String | file to upload |
**additionalMetadata** | String | Additional data to pass to server | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | SchemaMap | a constructor
**file** | | String |
**additionalMetadata** | | String | [optional]
getAdditionalProperty | String | Object | provides type safety for additional properties
