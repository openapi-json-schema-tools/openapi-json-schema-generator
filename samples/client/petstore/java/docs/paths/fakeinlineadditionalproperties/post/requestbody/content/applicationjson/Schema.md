# Schema1
org.openapijsonschematools.paths.fakeinlineadditionalproperties.post.requestbody.content.applicationjson.Schema.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, String> | SchemaMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | String | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, String>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
get_additional_property_ | String |  | provides type safety for additional properties
