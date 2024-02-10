# ShapeOrNull
org.openapijsonschematools.client.components.schemas.ShapeOrNull.java
public class ShapeOrNull

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ShapeOrNull.ShapeOrNull1Boxed](#shapeornull1boxed)<br> sealed validated payload class |
| static class | [ShapeOrNull.ShapeOrNull1BoxedVoid](#shapeornull1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ShapeOrNull.ShapeOrNull1BoxedBoolean](#shapeornull1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ShapeOrNull.ShapeOrNull1BoxedNumber](#shapeornull1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ShapeOrNull.ShapeOrNull1BoxedString](#shapeornull1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ShapeOrNull.ShapeOrNull1BoxedList](#shapeornull1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ShapeOrNull.ShapeOrNull1BoxedMap](#shapeornull1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ShapeOrNull.ShapeOrNull1](#shapeornull1)<br> schema class |
| static class | [ShapeOrNull.Schema0Boxed](#schema0boxed)<br> sealed validated payload class |
| static class | [ShapeOrNull.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ShapeOrNull.Schema0](#schema0)<br> schema class |

## ShapeOrNull1Boxed
public static abstract sealed class ShapeOrNull1Boxed<br>
permits<br>
[ShapeOrNull1BoxedVoid](#shapeornull1boxedvoid),
[ShapeOrNull1BoxedBoolean](#shapeornull1boxedboolean),
[ShapeOrNull1BoxedNumber](#shapeornull1boxednumber),
[ShapeOrNull1BoxedString](#shapeornull1boxedstring),
[ShapeOrNull1BoxedList](#shapeornull1boxedlist),
[ShapeOrNull1BoxedMap](#shapeornull1boxedmap)

A sealed class that stores validated payloads using boxed classes

## ShapeOrNull1BoxedVoid
public static final class ShapeOrNull1BoxedVoid<br>
extends ShapeOrNull1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeOrNull1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ShapeOrNull1BoxedBoolean
public static final class ShapeOrNull1BoxedBoolean<br>
extends ShapeOrNull1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeOrNull1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ShapeOrNull1BoxedNumber
public static final class ShapeOrNull1BoxedNumber<br>
extends ShapeOrNull1Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeOrNull1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ShapeOrNull1BoxedString
public static final class ShapeOrNull1BoxedString<br>
extends ShapeOrNull1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeOrNull1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ShapeOrNull1BoxedList
public static final class ShapeOrNull1BoxedList<br>
extends ShapeOrNull1Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeOrNull1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ShapeOrNull1BoxedMap
public static final class ShapeOrNull1BoxedMap<br>
extends ShapeOrNull1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeOrNull1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ShapeOrNull1
public static class ShapeOrNull1<br>
extends JsonSchema

A schema class that validates payloads

## Description
The value may be a shape or the &#x27;null&#x27; value. This is introduced in OAS schema &gt;&#x3D; 3.1.

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Triangle.Triangle1.class](../../components/schemas/Triangle.md#triangle1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Quadrilateral.Quadrilateral1.class](../../components/schemas/Quadrilateral.md#quadrilateral1)<br>))<br> |

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
## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid)

A sealed class that stores validated payloads using boxed classes

## Schema0BoxedVoid
public static final class Schema0BoxedVoid<br>
extends Schema0Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema0
public static class Schema0<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
