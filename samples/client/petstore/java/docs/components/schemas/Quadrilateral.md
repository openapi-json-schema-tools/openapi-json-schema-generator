# Quadrilateral
org.openapijsonschematools.client.components.schemas.Quadrilateral.java
public class Quadrilateral

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Quadrilateral.Quadrilateral1Boxed](#quadrilateral1boxed)<br> sealed validated payload class |
| static class | [Quadrilateral.Quadrilateral1](#quadrilateral1)<br> schema class |

## Quadrilateral1Boxed
public static abstract sealed class Quadrilateral1Boxed<br>
permits<br>
[Quadrilateral1BoxedVoid](#quadrilateral1boxedvoid),
[Quadrilateral1BoxedBoolean](#quadrilateral1boxedboolean),
[Quadrilateral1BoxedNumber](#quadrilateral1boxednumber),
[Quadrilateral1BoxedString](#quadrilateral1boxedstring),
[Quadrilateral1BoxedList](#quadrilateral1boxedlist),
[Quadrilateral1BoxedMap](#quadrilateral1boxedmap)

## Quadrilateral1
public static class Quadrilateral1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[SimpleQuadrilateral.SimpleQuadrilateral1.class](../../components/schemas/SimpleQuadrilateral.md#simplequadrilateral1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[ComplexQuadrilateral.ComplexQuadrilateral1.class](../../components/schemas/ComplexQuadrilateral.md#complexquadrilateral1)<br>))<br> |

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
