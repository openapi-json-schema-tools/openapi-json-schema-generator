# ObjectWithInlineCompositionProperty
org.openapijsonschematools.components.schemas.ObjectWithInlineCompositionProperty.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjectWithInlineCompositionProperty.Schema0<br> schema class |
| static class | ObjectWithInlineCompositionProperty.SomeProp<br> schema class |
| static class | ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionPropertyMap<br> output class for Map payloads |
| static class | ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionProperty1<br> schema class |

## ObjectWithInlineCompositionProperty1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithInlineCompositionPropertyMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**someProp** | Object |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectWithInlineCompositionPropertyMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithInlineCompositionPropertyMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | someProp()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
