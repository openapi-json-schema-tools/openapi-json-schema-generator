# ArrayOfNumberOnly
org.openapijsonschematools.components.schemas.ArrayOfNumberOnly.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ArrayOfNumberOnly.Items<br> schema class |
| static class | ArrayOfNumberOnly.ArrayNumberList<br> output class for List payloads |
| static class | ArrayOfNumberOnly.ArrayNumber<br> schema class |
| static class | ArrayOfNumberOnly.ArrayOfNumberOnlyMap<br> output class for Map payloads |
| static class | ArrayOfNumberOnly.ArrayOfNumberOnly1<br> schema class |

## ArrayOfNumberOnly1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayOfNumberOnlyMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**ArrayNumber** | List<Number> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ArrayOfNumberOnlyMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayOfNumberOnlyMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| ArrayNumberList | ArrayNumber()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
