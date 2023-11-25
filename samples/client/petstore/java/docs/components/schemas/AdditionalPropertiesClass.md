# AdditionalPropertiesClass
org.openapijsonschematools.components.schemas.AdditionalPropertiesClass.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | AdditionalPropertiesClass.AdditionalProperties<br> schema class |
| static class | AdditionalPropertiesClass.MapPropertyMap<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.MapProperty<br> schema class |
| static class | AdditionalPropertiesClass.AdditionalProperties2<br> schema class |
| static class | AdditionalPropertiesClass.AdditionalPropertiesMap<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.AdditionalProperties1<br> schema class |
| static class | AdditionalPropertiesClass.MapOfMapPropertyMap<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.MapOfMapProperty<br> schema class |
| static class | AdditionalPropertiesClass.Anytype1<br> schema class |
| static class | AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype1<br> schema class |
| static class | AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype2<br> schema class |
| static class | AdditionalPropertiesClass.AdditionalProperties3<br> schema class |
| static class | AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3Map<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.MapWithUndeclaredPropertiesAnytype3<br> schema class |
| static class | AdditionalPropertiesClass.AdditionalProperties4<br> schema class |
| static class | AdditionalPropertiesClass.EmptyMapMap<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.EmptyMap<br> schema class |
| static class | AdditionalPropertiesClass.AdditionalProperties5<br> schema class |
| static class | AdditionalPropertiesClass.MapWithUndeclaredPropertiesStringMap<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.MapWithUndeclaredPropertiesString<br> schema class |
| static class | AdditionalPropertiesClass.AdditionalPropertiesClassMap<br> output class for Map payloads |
| static class | AdditionalPropertiesClass.AdditionalPropertiesClass1<br> schema class |

## AdditionalPropertiesClass1
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
