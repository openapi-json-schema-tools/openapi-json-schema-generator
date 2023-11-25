# ObjectWithNonIntersectingValues
org.openapijsonschematools.components.schemas.ObjectWithNonIntersectingValues.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjectWithNonIntersectingValues.AdditionalProperties<br> schema class |
| static class | ObjectWithNonIntersectingValues.A<br> schema class |
| static class | ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValuesMap<br> output class for Map payloads |
| static class | ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValues1<br> schema class |

## ObjectWithNonIntersectingValues1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithNonIntersectingValuesMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**a** | Number |  | [optional]
**anyStringName** | String | any string name can be used but the value must be the correct type | [optional]

## ObjectWithNonIntersectingValuesMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithNonIntersectingValuesMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | a()<br>[optional] |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
