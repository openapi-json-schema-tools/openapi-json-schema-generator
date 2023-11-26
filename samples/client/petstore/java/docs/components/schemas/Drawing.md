# Drawing
org.openapijsonschematools.components.schemas.Drawing.java
public class Drawing

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Drawing.Drawing1<br> schema class |
| static class | Drawing.DrawingMap<br> output class for Map payloads |
| static class | Drawing.Shapes<br> schema class |
| static class | Drawing.ShapesList<br> output class for List payloads |

## Drawing1
public class Drawing1
extends JsonSchema

A schema class that validates payloads

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
public class DrawingMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static DrawingMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | mainShape()<br>[optional] |
| Object | shapeOrNull()<br>[optional] |
| Object | nullableShape()<br>[optional] |
| ShapesList | shapes()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Shapes
public class Shapes
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ShapesList | validate(List<Object> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Object>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Object |  |

## ShapesList
public class ShapesList
extends FrozenList<Object>

A class to store validated List payloads

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | 
configuration | configurations.SchemaConfiguration

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
