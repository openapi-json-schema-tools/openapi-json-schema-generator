# NullableShape
org.openapijsonschematools.client.components.schemas.NullableShape.java
public class NullableShape

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NullableShape.NullableShape1Boxed](#nullableshape1boxed)<br> sealed validated payload class |
| static class | [NullableShape.NullableShape1](#nullableshape1)<br> schema class |
| static class | [NullableShape.Schema2Boxed](#schema2boxed)<br> sealed validated payload class |
| static class | [NullableShape.Schema2](#schema2)<br> schema class |

## NullableShape1Boxed
public static abstract sealed class NullableShape1Boxed<br>
permits<br>
[NullableShape1BoxedVoid](#nullableshape1boxedvoid),
[NullableShape1BoxedBoolean](#nullableshape1boxedboolean),
[NullableShape1BoxedNumber](#nullableshape1boxednumber),
[NullableShape1BoxedString](#nullableshape1boxedstring),
[NullableShape1BoxedList](#nullableshape1boxedlist),
[NullableShape1BoxedMap](#nullableshape1boxedmap)

A sealed class that stores validated payloads using boxed classes

## NullableShape1
public static class NullableShape1<br>
extends JsonSchema

A schema class that validates payloads

## Description
The value may be a shape or the &#x27;null&#x27; value. For a composed schema to validate a null payload, one of its chosen oneOf schemas must be type null or nullable (introduced in OAS schema &gt;&#x3D; 3.0)

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Triangle.Triangle1.class](../../components/schemas/Triangle.md#triangle1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Quadrilateral.Quadrilateral1.class](../../components/schemas/Quadrilateral.md#quadrilateral1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema2.class](#schema2)<br>))<br> |

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
## Schema2Boxed
public static abstract sealed class Schema2Boxed<br>
permits<br>
[Schema2BoxedVoid](#schema2boxedvoid)

A sealed class that stores validated payloads using boxed classes

## Schema2
public static class Schema2<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
