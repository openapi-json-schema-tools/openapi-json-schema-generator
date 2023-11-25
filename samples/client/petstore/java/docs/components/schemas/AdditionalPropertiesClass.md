# AdditionalPropertiesClass1
org.openapijsonschematools.components.schemas.AdditionalPropertiesClass.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AdditionalPropertiesClassMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

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
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## AdditionalPropertiesClassMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AdditionalPropertiesClassMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| MapPropertyMap | map_property()<br>[optional] |
| MapOfMapPropertyMap | map_of_map_property()<br>[optional] |
| Object | anytype_1()<br>[optional] |
| FrozenMap<String, Object> | map_with_undeclared_properties_anytype_1()<br>[optional] |
| FrozenMap<String, Object> | map_with_undeclared_properties_anytype_2()<br>[optional] |
| MapWithUndeclaredPropertiesAnytype3Map | map_with_undeclared_properties_anytype_3()<br>[optional] |
| EmptyMapMap | empty_map()<br>[optional] |
| MapWithUndeclaredPropertiesStringMap | map_with_undeclared_properties_string()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |








[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
