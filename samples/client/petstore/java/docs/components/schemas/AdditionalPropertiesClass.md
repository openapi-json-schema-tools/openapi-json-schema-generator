# AdditionalPropertiesClass1
org.openapijsonschematools.components.schemas.AdditionalPropertiesClass.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | AdditionalPropertiesClassMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**map_property** | Map<String, String> |  | [optional]
**map_of_map_property** | Map<String, Map<String, String>> |  | [optional]
**anytype_1** | Object |  | [optional]
**map_with_undeclared_properties_anytype_1** | Map<String, Object> |  | [optional]
**map_with_undeclared_properties_anytype_2** | Map<String, Object> |  | [optional]
**map_with_undeclared_properties_anytype_3** | Map<String, Object> |  | [optional]
**empty_map** | Map<String, Object> | an object with no declared properties and no undeclared properties, hence it&#x27;s an empty map. | [optional]
**map_with_undeclared_properties_string** | Map<String, String> |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## AdditionalPropertiesClassMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | AdditionalPropertiesClassMap | a constructor
**map_property** | | MapPropertyMap | [optional]
**map_of_map_property** | | MapOfMapPropertyMap | [optional]
**anytype_1** | | Object | [optional]
**map_with_undeclared_properties_anytype_1** | | FrozenMap<String, Object> | [optional]
**map_with_undeclared_properties_anytype_2** | | FrozenMap<String, Object> | [optional]
**map_with_undeclared_properties_anytype_3** | | MapWithUndeclaredPropertiesAnytype3Map | [optional]
**empty_map** | | EmptyMapMap | [optional]
**map_with_undeclared_properties_string** | | MapWithUndeclaredPropertiesStringMap | [optional]
getAdditionalProperty | String | Object | provides type safety for additional properties








[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
