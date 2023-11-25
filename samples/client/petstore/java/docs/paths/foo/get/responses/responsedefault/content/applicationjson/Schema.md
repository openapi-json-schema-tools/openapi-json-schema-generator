# Schema1
org.openapijsonschematools.paths.foo.get.responses.responsedefault.content.applicationjson.Schema.java
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
**string** | Map<String, Object> |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | SchemaMap | a constructor
get | String | Object | This model has invalid python names so this method is used under the hood when you access instance["string"], 
getAdditionalProperty | String | Object | provides type safety for additional properties
