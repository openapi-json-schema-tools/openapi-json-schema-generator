# HasOnlyReadOnly
org.openapijsonschematools.components.schemas.HasOnlyReadOnly.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | HasOnlyReadOnly.Bar<br> schema class |
| static class | HasOnlyReadOnly.Foo<br> schema class |
| static class | HasOnlyReadOnly.HasOnlyReadOnlyMap<br> output class for Map payloads |
| static class | HasOnlyReadOnly.HasOnlyReadOnly1<br> schema class |

## HasOnlyReadOnly1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static HasOnlyReadOnlyMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**bar** | String |  | [optional]
**foo** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## HasOnlyReadOnlyMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static HasOnlyReadOnlyMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | bar()<br>[optional] |
| String | foo()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
