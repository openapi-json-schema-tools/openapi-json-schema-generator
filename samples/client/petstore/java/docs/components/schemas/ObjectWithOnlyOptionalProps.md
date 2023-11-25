# ObjectWithOnlyOptionalProps
org.openapijsonschematools.components.schemas.ObjectWithOnlyOptionalProps.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjectWithOnlyOptionalProps.AdditionalProperties<br> schema class |
| static class | ObjectWithOnlyOptionalProps.A<br> schema class |
| static class | ObjectWithOnlyOptionalProps.B<br> schema class |
| static class | ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMap<br> output class for Map payloads |
| static class | ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalProps1<br> schema class |

## ObjectWithOnlyOptionalProps1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithOnlyOptionalPropsMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**a** | String |  | [optional]
**b** | Number |  | [optional]

## ObjectWithOnlyOptionalPropsMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithOnlyOptionalPropsMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | a()<br>[optional] |
| Number | b()<br>[optional] |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
