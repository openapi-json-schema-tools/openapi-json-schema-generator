# Drawing
org.openapijsonschematools.components.schemas.Drawing.java
public class Drawing

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Drawing.Drawing1](#drawing1)<br> schema class |
| static class | [Drawing.DrawingMap](#drawingmap)<br> output class for Map payloads |
| static class | [Drawing.Shapes](#shapes)<br> schema class |
| static class | [Drawing.ShapesList](#shapeslist)<br> output class for List payloads |

## Drawing1
public static class Drawing1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
    new PropertyEntry("mainShape", Shape.Shape1.class),
    new PropertyEntry("shapeOrNull", ShapeOrNull.ShapeOrNull1.class),
    new PropertyEntry("nullableShape", NullableShape.NullableShape1.class),
    new PropertyEntry("shapes", Shapes.class)
))),
new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(Fruit.Fruit1.class))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DrawingMap](#drawingmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## DrawingMap
public static class DrawingMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DrawingMap](#drawingmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | mainShape()<br>[optional] |
| Object | shapeOrNull()<br>[optional] |
| Object | nullableShape()<br>[optional] |
| [ShapesList](#shapeslist) | shapes()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **mainShape** | Object |  | [optional] |
| **shapeOrNull** | Object |  | [optional] |
| **nullableShape** | Object |  | [optional] |
| **shapes** | List<Object> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Shapes
public static class Shapes<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
new KeywordEntry("items", new ItemsValidator(Shape.Shape1.class))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ShapesList](#shapeslist) | validate(List<Object> arg, SchemaConfiguration configuration) |

## ShapesList
public class ShapesList<br>
extends FrozenList<Object>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ShapesList](#shapeslist) | of(List<Object> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Object>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Object |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
