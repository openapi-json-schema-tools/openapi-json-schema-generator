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
| static class | [NullableShape.NullableShape1BoxedVoid](#nullableshape1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NullableShape.NullableShape1BoxedBoolean](#nullableshape1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NullableShape.NullableShape1BoxedNumber](#nullableshape1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NullableShape.NullableShape1BoxedString](#nullableshape1boxedstring)<br> boxed class to store validated String payloads |
| static class | [NullableShape.NullableShape1BoxedList](#nullableshape1boxedlist)<br> boxed class to store validated List payloads |
| static class | [NullableShape.NullableShape1BoxedMap](#nullableshape1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NullableShape.NullableShape1](#nullableshape1)<br> schema class |
| static class | [NullableShape.Schema2Boxed](#schema2boxed)<br> sealed validated payload class |
| static class | [NullableShape.Schema2BoxedVoid](#schema2boxedvoid)<br> boxed class to store validated null payloads |
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

## NullableShape1BoxedVoid
public static final class NullableShape1BoxedVoid<br>
extends NullableShape1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NullableShape1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## NullableShape1BoxedBoolean
public static final class NullableShape1BoxedBoolean<br>
extends NullableShape1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NullableShape1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## NullableShape1BoxedNumber
public static final class NullableShape1BoxedNumber<br>
extends NullableShape1Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NullableShape1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## NullableShape1BoxedString
public static final class NullableShape1BoxedString<br>
extends NullableShape1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NullableShape1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## NullableShape1BoxedList
public static final class NullableShape1BoxedList<br>
extends NullableShape1Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NullableShape1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## NullableShape1BoxedMap
public static final class NullableShape1BoxedMap<br>
extends NullableShape1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NullableShape1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [NullableShape1BoxedString](#nullableshape1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [NullableShape1BoxedVoid](#nullableshape1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [NullableShape1BoxedNumber](#nullableshape1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [NullableShape1BoxedBoolean](#nullableshape1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [NullableShape1BoxedMap](#nullableshape1boxedmap) | validateAndBox(FrozenMap<@Nullable Object> arg, SchemaConfiguration configuration) |
| [NullableShape1BoxedList](#nullableshape1boxedlist) | validateAndBox(FrozenList<@Nullable Object> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema2Boxed
public static abstract sealed class Schema2Boxed<br>
permits<br>
[Schema2BoxedVoid](#schema2boxedvoid)

A sealed class that stores validated payloads using boxed classes

## Schema2BoxedVoid
public static final class Schema2BoxedVoid<br>
extends Schema2Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema2
public static class Schema2<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
