# Triangle
org.openapijsonschematools.client.components.schemas.Triangle.java
public class Triangle

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Triangle.Triangle1Boxed](#triangle1boxed)<br> sealed validated payload class |
| static class | [Triangle.Triangle1](#triangle1)<br> schema class |

## Triangle1Boxed
public static abstract sealed class Triangle1Boxed<br>
permits<br>
[Triangle1BoxedVoid](#triangle1boxedvoid),
[Triangle1BoxedBoolean](#triangle1boxedboolean),
[Triangle1BoxedNumber](#triangle1boxednumber),
[Triangle1BoxedString](#triangle1boxedstring),
[Triangle1BoxedList](#triangle1boxedlist),
[Triangle1BoxedMap](#triangle1boxedmap)

## Triangle1
public static class Triangle1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[EquilateralTriangle.EquilateralTriangle1.class](../../components/schemas/EquilateralTriangle.md#equilateraltriangle1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[IsoscelesTriangle.IsoscelesTriangle1.class](../../components/schemas/IsoscelesTriangle.md#isoscelestriangle1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[ScaleneTriangle.ScaleneTriangle1.class](../../components/schemas/ScaleneTriangle.md#scalenetriangle1)<br>))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
