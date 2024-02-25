# FruitReq
org.openapijsonschematools.client.components.schemas.FruitReq.java
public class FruitReq<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FruitReq.FruitReq1Boxed](#fruitreq1boxed)<br> sealed interface for validated payloads |
| record | [FruitReq.FruitReq1BoxedVoid](#fruitreq1boxedvoid)<br> boxed class to store validated null payloads |
| record | [FruitReq.FruitReq1BoxedBoolean](#fruitreq1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FruitReq.FruitReq1BoxedNumber](#fruitreq1boxednumber)<br> boxed class to store validated Number payloads |
| record | [FruitReq.FruitReq1BoxedString](#fruitreq1boxedstring)<br> boxed class to store validated String payloads |
| record | [FruitReq.FruitReq1BoxedList](#fruitreq1boxedlist)<br> boxed class to store validated List payloads |
| record | [FruitReq.FruitReq1BoxedMap](#fruitreq1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FruitReq.FruitReq1](#fruitreq1)<br> schema class |
| sealed interface | [FruitReq.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [FruitReq.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [FruitReq.Schema0](#schema0)<br> schema class |

## FruitReq1Boxed
public sealed interface FruitReq1Boxed<br>
permits<br>
[FruitReq1BoxedVoid](#fruitreq1boxedvoid),
[FruitReq1BoxedBoolean](#fruitreq1boxedboolean),
[FruitReq1BoxedNumber](#fruitreq1boxednumber),
[FruitReq1BoxedString](#fruitreq1boxedstring),
[FruitReq1BoxedList](#fruitreq1boxedlist),
[FruitReq1BoxedMap](#fruitreq1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FruitReq1BoxedVoid
public record FruitReq1BoxedVoid<br>
implements [FruitReq1Boxed](#fruitreq1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FruitReq1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FruitReq1BoxedBoolean
public record FruitReq1BoxedBoolean<br>
implements [FruitReq1Boxed](#fruitreq1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FruitReq1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FruitReq1BoxedNumber
public record FruitReq1BoxedNumber<br>
implements [FruitReq1Boxed](#fruitreq1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FruitReq1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FruitReq1BoxedString
public record FruitReq1BoxedString<br>
implements [FruitReq1Boxed](#fruitreq1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FruitReq1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FruitReq1BoxedList
public record FruitReq1BoxedList<br>
implements [FruitReq1Boxed](#fruitreq1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FruitReq1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FruitReq1BoxedMap
public record FruitReq1BoxedMap<br>
implements [FruitReq1Boxed](#fruitreq1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FruitReq1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [FruitReq1BoxedString](#fruitreq1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [FruitReq1BoxedVoid](#fruitreq1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [FruitReq1BoxedNumber](#fruitreq1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [FruitReq1BoxedBoolean](#fruitreq1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [FruitReq1BoxedMap](#fruitreq1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [FruitReq1BoxedList](#fruitreq1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [FruitReq1Boxed](#fruitreq1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
| @Nullable Object | getData()<br>validated payload |

## Schema0
public static class Schema0<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
