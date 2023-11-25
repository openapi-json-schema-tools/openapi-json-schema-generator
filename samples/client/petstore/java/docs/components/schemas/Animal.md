# Animal1
org.openapijsonschematools.components.schemas.Animal.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | AnimalMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | String |  |
**color** | String |  | [optional] if omitted the server will use the default value of red
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## AnimalMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | AnimalMap | a constructor
**className** | | String |
**color** | | String | [optional] if omitted the server will use the default value of red
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
