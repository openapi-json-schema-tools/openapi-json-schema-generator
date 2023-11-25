# MapTest
org.openapijsonschematools.components.schemas.MapTest.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | MapTest.AdditionalProperties1<br> schema class |
| static class | MapTest.AdditionalPropertiesMap<br> output class for Map payloads |
| static class | MapTest.AdditionalProperties<br> schema class |
| static class | MapTest.MapMapOfStringMap<br> output class for Map payloads |
| static class | MapTest.MapMapOfString<br> schema class |
| static class | MapTest.AdditionalProperties2<br> schema class |
| static class | MapTest.MapOfEnumStringMap<br> output class for Map payloads |
| static class | MapTest.MapOfEnumString<br> schema class |
| static class | MapTest.AdditionalProperties3<br> schema class |
| static class | MapTest.DirectMapMap<br> output class for Map payloads |
| static class | MapTest.DirectMap<br> schema class |
| static class | MapTest.MapTestMap<br> output class for Map payloads |
| static class | MapTest.MapTest1<br> schema class |

## MapTest1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MapTestMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**map_map_of_string** | Map<String, Map<String, String>> |  | [optional]
**map_of_enum_string** | Map<String, String> |  | [optional]
**direct_map** | Map<String, boolean> |  | [optional]
**indirect_map** | Map<String, boolean> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## MapTestMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MapTestMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| MapMapOfStringMap | map_map_of_string()<br>[optional] |
| MapOfEnumStringMap | map_of_enum_string()<br>[optional] |
| DirectMapMap | direct_map()<br>[optional] |
| StringBooleanMap.StringBooleanMapMap | indirect_map()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |




[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
