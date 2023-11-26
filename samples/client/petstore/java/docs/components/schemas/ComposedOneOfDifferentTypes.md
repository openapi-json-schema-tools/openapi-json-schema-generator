# ComposedOneOfDifferentTypes
org.openapijsonschematools.components.schemas.ComposedOneOfDifferentTypes.java
public class ComposedOneOfDifferentTypes

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ComposedOneOfDifferentTypes.ComposedOneOfDifferentTypes1<br> schema class |
| static class | ComposedOneOfDifferentTypes.Schema6<br> schema class |
| static class | ComposedOneOfDifferentTypes.Schema5<br> schema class |
| static class | ComposedOneOfDifferentTypes.Schema5List<br> output class for List payloads |
| static class | ComposedOneOfDifferentTypes.Items<br> schema class |
| static class | ComposedOneOfDifferentTypes.Schema4<br> schema class |
| static class | ComposedOneOfDifferentTypes.Schema3<br> schema class |
| static class | ComposedOneOfDifferentTypes.Schema2<br> schema class |

## ComposedOneOfDifferentTypes1
public class ComposedOneOfDifferentTypes1
extends JsonSchema

A schema class that validates payloads


## Description
this is a model that allows payloads of type object or number

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## Composed Schemas (allOf/anyOf/oneOf/not)
## oneOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
 |  | 
 |  | 
[Schema2](#) |  | 
[Schema3](#) |  | 
[Schema4](#) |  | 
[Schema5](#) |  | 
[Schema6](#) |  | 






[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
