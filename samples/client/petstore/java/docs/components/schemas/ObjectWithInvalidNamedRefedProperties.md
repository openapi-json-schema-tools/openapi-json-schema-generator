# ObjectWithInvalidNamedRefedProperties1
org.openapijsonschematools.components.schemas.ObjectWithInvalidNamedRefedProperties.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | ObjectWithInvalidNamedRefedPropertiesMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**!reference** | List<long> |  |
**from** | Map<String, Object> |  |
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectWithInvalidNamedRefedPropertiesMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | ObjectWithInvalidNamedRefedPropertiesMap | a constructor
**from** | | FromSchema.FromSchemaMap |
get | String | Object | This model has invalid python names so this method is used under the hood when you access instance["!reference"], 
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
