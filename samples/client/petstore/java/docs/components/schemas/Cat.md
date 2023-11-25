# Cat
org.openapijsonschematools.components.schemas.Cat.java
public class Cat

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Cat.Declawed<br> schema class |
| static class | Cat.Schema1Map<br> output class for Map payloads |
| static class | Cat.Schema1<br> schema class |
| static class | Cat.Cat1<br> schema class |

## Cat1
public class Cat1
extends JsonSchema

A schema class that validates payloads


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
## allOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
 |  | 
[Schema1](#) |  | 


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
