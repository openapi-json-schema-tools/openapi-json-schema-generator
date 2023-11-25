# ArrayOfArrayOfNumberOnly
org.openapijsonschematools.components.schemas.ArrayOfArrayOfNumberOnly.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ArrayOfArrayOfNumberOnly.Items1<br> schema class |
| static class | ArrayOfArrayOfNumberOnly.ItemsList<br> output class for List payloads |
| static class | ArrayOfArrayOfNumberOnly.Items<br> schema class |
| static class | ArrayOfArrayOfNumberOnly.ArrayArrayNumberList<br> output class for List payloads |
| static class | ArrayOfArrayOfNumberOnly.ArrayArrayNumber<br> schema class |
| static class | ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnlyMap<br> output class for Map payloads |
| static class | ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnly1<br> schema class |

## ArrayOfArrayOfNumberOnly1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayOfArrayOfNumberOnlyMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**ArrayArrayNumber** | List<List<Number>> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ArrayOfArrayOfNumberOnlyMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayOfArrayOfNumberOnlyMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| ArrayArrayNumberList | ArrayArrayNumber()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
