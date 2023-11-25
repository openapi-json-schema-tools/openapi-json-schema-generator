# StringBooleanMap
org.openapijsonschematools.components.schemas.StringBooleanMap.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | StringBooleanMap.AdditionalProperties<br> schema class |
| static class | StringBooleanMap.StringBooleanMapMap<br> output class for Map payloads |
| static class | StringBooleanMap.StringBooleanMap1<br> schema class |

## StringBooleanMap1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static StringBooleanMapMap | validate(Map<String, Boolean> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | boolean | any string name can be used but the value must be the correct type | [optional]

## StringBooleanMapMap
```
base class: FrozenMap<String, Boolean>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static StringBooleanMapMap | of(Map<String, Boolean> arg, SchemaConfiguration configuration) |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
