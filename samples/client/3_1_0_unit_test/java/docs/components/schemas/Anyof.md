# Anyof
unit_test_api.components.schemas.Anyof.java
public class Anyof<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Anyof.Anyof1Boxed](#anyof1boxed)<br> sealed interface for validated payloads |
| record | [Anyof.Anyof1BoxedVoid](#anyof1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Anyof.Anyof1BoxedBoolean](#anyof1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Anyof.Anyof1BoxedNumber](#anyof1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Anyof.Anyof1BoxedString](#anyof1boxedstring)<br> boxed class to store validated String payloads |
| record | [Anyof.Anyof1BoxedList](#anyof1boxedlist)<br> boxed class to store validated List payloads |
| record | [Anyof.Anyof1BoxedMap](#anyof1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Anyof.Anyof1](#anyof1)<br> schema class |
| sealed interface | [Anyof.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [Anyof.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Anyof.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Anyof.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Anyof.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| record | [Anyof.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| record | [Anyof.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Anyof.Schema1](#schema1)<br> schema class |
| sealed interface | [Anyof.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [Anyof.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Anyof.Schema0](#schema0)<br> schema class |

## Anyof1Boxed
public sealed interface Anyof1Boxed<br>
permits<br>
[Anyof1BoxedVoid](#anyof1boxedvoid),
[Anyof1BoxedBoolean](#anyof1boxedboolean),
[Anyof1BoxedNumber](#anyof1boxednumber),
[Anyof1BoxedString](#anyof1boxedstring),
[Anyof1BoxedList](#anyof1boxedlist),
[Anyof1BoxedMap](#anyof1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Anyof1BoxedVoid
public record Anyof1BoxedVoid<br>
implements [Anyof1Boxed](#anyof1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Anyof1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Anyof1BoxedBoolean
public record Anyof1BoxedBoolean<br>
implements [Anyof1Boxed](#anyof1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Anyof1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Anyof1BoxedNumber
public record Anyof1BoxedNumber<br>
implements [Anyof1Boxed](#anyof1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Anyof1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Anyof1BoxedString
public record Anyof1BoxedString<br>
implements [Anyof1Boxed](#anyof1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Anyof1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Anyof1BoxedList
public record Anyof1BoxedList<br>
implements [Anyof1Boxed](#anyof1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Anyof1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Anyof1BoxedMap
public record Anyof1BoxedMap<br>
implements [Anyof1Boxed](#anyof1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Anyof1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Anyof1
public static class Anyof1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | anyOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>)<br> |

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
| [Anyof1BoxedString](#anyof1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Anyof1BoxedVoid](#anyof1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Anyof1BoxedNumber](#anyof1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Anyof1BoxedBoolean](#anyof1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Anyof1BoxedMap](#anyof1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Anyof1BoxedList](#anyof1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Anyof1Boxed](#anyof1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema1Boxed
public sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedVoid](#schema1boxedvoid),
[Schema1BoxedBoolean](#schema1boxedboolean),
[Schema1BoxedNumber](#schema1boxednumber),
[Schema1BoxedString](#schema1boxedstring),
[Schema1BoxedList](#schema1boxedlist),
[Schema1BoxedMap](#schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedVoid
public record Schema1BoxedVoid<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedBoolean
public record Schema1BoxedBoolean<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedNumber
public record Schema1BoxedNumber<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedString
public record Schema1BoxedString<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedList
public record Schema1BoxedList<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedMap
public record Schema1BoxedMap<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1
public static class Schema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | minimum = 2 |

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
| [Schema1BoxedString](#schema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema1BoxedVoid](#schema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema1BoxedNumber](#schema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema1BoxedBoolean](#schema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Schema1BoxedList](#schema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Schema1Boxed](#schema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema0Boxed
public sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedNumber](#schema0boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedNumber
public record Schema0BoxedNumber<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0
public static class Schema0<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
