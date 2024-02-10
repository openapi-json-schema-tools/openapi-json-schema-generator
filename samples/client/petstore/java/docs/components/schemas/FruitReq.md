# FruitReq
org.openapijsonschematools.client.components.schemas.FruitReq.java
public class FruitReq

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [FruitReq.FruitReq1Boxed](#fruitreq1boxed)<br> sealed validated payload class |
| static class | [FruitReq.FruitReq1](#fruitreq1)<br> schema class |
| static class | [FruitReq.Schema0Boxed](#schema0boxed)<br> sealed validated payload class |
| static class | [FruitReq.Schema0](#schema0)<br> schema class |

## FruitReq1Boxed
public static abstract sealed class FruitReq1Boxed<br>
permits<br>
[FruitReq1BoxedVoid](#fruitreq1boxedvoid),
[FruitReq1BoxedBoolean](#fruitreq1boxedboolean),
[FruitReq1BoxedNumber](#fruitreq1boxednumber),
[FruitReq1BoxedString](#fruitreq1boxedstring),
[FruitReq1BoxedList](#fruitreq1boxedlist),
[FruitReq1BoxedMap](#fruitreq1boxedmap)

A sealed class that stores validated payloads using boxed classes

## FruitReq1BoxedVoid
public static final class FruitReq1BoxedVoid<br>
extends FruitReq1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FruitReq1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## FruitReq1BoxedBoolean
public static final class FruitReq1BoxedBoolean<br>
extends FruitReq1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FruitReq1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## FruitReq1BoxedNumber
public static final class FruitReq1BoxedNumber<br>
extends FruitReq1Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FruitReq1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## FruitReq1BoxedString
public static final class FruitReq1BoxedString<br>
extends FruitReq1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FruitReq1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## FruitReq1BoxedList
public static final class FruitReq1BoxedList<br>
extends FruitReq1Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FruitReq1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## FruitReq1BoxedMap
public static final class FruitReq1BoxedMap<br>
extends FruitReq1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FruitReq1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## FruitReq1
public static class FruitReq1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[AppleReq.AppleReq1.class](../../components/schemas/AppleReq.md#applereq1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[BananaReq.BananaReq1.class](../../components/schemas/BananaReq.md#bananareq1)<br>))<br> |

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
