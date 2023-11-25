# Drawing
org.openapijsonschematools.components.schemas.Drawing.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Drawing.ShapesList<br> output class for List payloads |
| static class | Drawing.Shapes<br> schema class |
| static class | Drawing.DrawingMap<br> output class for Map payloads |
| static class | Drawing.Drawing1<br> schema class |

## Drawing1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static DrawingMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**mainShape** | Object |  | [optional]
**shapeOrNull** | Object |  | [optional]
**nullableShape** | Object |  | [optional]
**shapes** | List<Object> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## DrawingMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static DrawingMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | mainShape()<br>[optional] |
| Object | shapeOrNull()<br>[optional] |
| Object | nullableShape()<br>[optional] |
| ShapesList | shapes()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
