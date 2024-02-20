# ShapeOrNull
org.openapijsonschematools.client.components.schemas.ShapeOrNull.java
public class ShapeOrNull<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ShapeOrNull.ShapeOrNull1Boxed](#shapeornull1boxed)<br> abstract sealed validated payload class |
| record | [ShapeOrNull.ShapeOrNull1BoxedVoid](#shapeornull1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ShapeOrNull.ShapeOrNull1BoxedBoolean](#shapeornull1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ShapeOrNull.ShapeOrNull1BoxedNumber](#shapeornull1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ShapeOrNull.ShapeOrNull1BoxedString](#shapeornull1boxedstring)<br> boxed class to store validated String payloads |
| record | [ShapeOrNull.ShapeOrNull1BoxedList](#shapeornull1boxedlist)<br> boxed class to store validated List payloads |
| record | [ShapeOrNull.ShapeOrNull1BoxedMap](#shapeornull1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ShapeOrNull.ShapeOrNull1](#shapeornull1)<br> schema class |
| sealed interface | [ShapeOrNull.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| record | [ShapeOrNull.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ShapeOrNull.Schema0](#schema0)<br> schema class |

## ShapeOrNull1Boxed
public sealed interface ShapeOrNull1Boxed<br>
permits<br>
[ShapeOrNull1BoxedVoid](#shapeornull1boxedvoid),
[ShapeOrNull1BoxedBoolean](#shapeornull1boxedboolean),
[ShapeOrNull1BoxedNumber](#shapeornull1boxednumber),
[ShapeOrNull1BoxedString](#shapeornull1boxedstring),
[ShapeOrNull1BoxedList](#shapeornull1boxedlist),
[ShapeOrNull1BoxedMap](#shapeornull1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ShapeOrNull1BoxedVoid
public record ShapeOrNull1BoxedVoid<br>
implements [ShapeOrNull1Boxed](#shapeornull1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeOrNull1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## ShapeOrNull1BoxedBoolean
public record ShapeOrNull1BoxedBoolean<br>
implements [ShapeOrNull1Boxed](#shapeornull1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeOrNull1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## ShapeOrNull1BoxedNumber
public record ShapeOrNull1BoxedNumber<br>
implements [ShapeOrNull1Boxed](#shapeornull1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeOrNull1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## ShapeOrNull1BoxedString
public record ShapeOrNull1BoxedString<br>
implements [ShapeOrNull1Boxed](#shapeornull1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeOrNull1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## ShapeOrNull1BoxedList
public record ShapeOrNull1BoxedList<br>
implements [ShapeOrNull1Boxed](#shapeornull1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeOrNull1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## ShapeOrNull1BoxedMap
public record ShapeOrNull1BoxedMap<br>
implements [ShapeOrNull1Boxed](#shapeornull1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapeOrNull1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ShapeOrNull1BoxedString](#shapeornull1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ShapeOrNull1BoxedVoid](#shapeornull1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ShapeOrNull1BoxedNumber](#shapeornull1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ShapeOrNull1BoxedBoolean](#shapeornull1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ShapeOrNull1BoxedMap](#shapeornull1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ShapeOrNull1BoxedList](#shapeornull1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0Boxed
public sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedVoid
public record Schema0BoxedVoid<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema0
public static class Schema0<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
