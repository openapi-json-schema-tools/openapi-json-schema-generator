# Schema1
org.openapijsonschematools.paths.petpetiduploadimage.post.requestbody.content.multipartformdata.Schema.java
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
**additionalMetadata** | String | Additional data to pass to server | [optional]
**file** | String | file to upload | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**additionalMetadata** |  | Additional data to pass to server | [optional]
**file** |  | file to upload | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | SchemaMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties
