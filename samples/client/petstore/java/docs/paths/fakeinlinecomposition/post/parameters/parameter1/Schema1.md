# Schema11
org.openapijsonschematools.paths.fakeinlinecomposition.post.parameters.parameter1.Schema1.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | SchemaMap1 | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**someProp** | Object |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap1
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**someProp** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | SchemaMap1 | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties

