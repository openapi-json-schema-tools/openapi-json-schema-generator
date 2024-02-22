# IgnoreThenWithoutIf
org.openapijsonschematools.client.components.schemas.IgnoreThenWithoutIf.java
public class IgnoreThenWithoutIf<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)<br> sealed interface for validated payloads |
| record | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedVoid](#ignorethenwithoutif1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedBoolean](#ignorethenwithoutif1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedNumber](#ignorethenwithoutif1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedString](#ignorethenwithoutif1boxedstring)<br> boxed class to store validated String payloads |
| record | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedList](#ignorethenwithoutif1boxedlist)<br> boxed class to store validated List payloads |
| record | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedMap](#ignorethenwithoutif1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1](#ignorethenwithoutif1)<br> schema class |
| sealed interface | [IgnoreThenWithoutIf.ThenBoxed](#thenboxed)<br> sealed interface for validated payloads |
| record | [IgnoreThenWithoutIf.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| record | [IgnoreThenWithoutIf.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IgnoreThenWithoutIf.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| record | [IgnoreThenWithoutIf.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| record | [IgnoreThenWithoutIf.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| record | [IgnoreThenWithoutIf.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IgnoreThenWithoutIf.Then](#then)<br> schema class |
| enum | [IgnoreThenWithoutIf.StringThenConst](#stringthenconst)<br>String enum |

## IgnoreThenWithoutIf1Boxed
public sealed interface IgnoreThenWithoutIf1Boxed<br>
permits<br>
[IgnoreThenWithoutIf1BoxedVoid](#ignorethenwithoutif1boxedvoid),
[IgnoreThenWithoutIf1BoxedBoolean](#ignorethenwithoutif1boxedboolean),
[IgnoreThenWithoutIf1BoxedNumber](#ignorethenwithoutif1boxednumber),
[IgnoreThenWithoutIf1BoxedString](#ignorethenwithoutif1boxedstring),
[IgnoreThenWithoutIf1BoxedList](#ignorethenwithoutif1boxedlist),
[IgnoreThenWithoutIf1BoxedMap](#ignorethenwithoutif1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IgnoreThenWithoutIf1BoxedVoid
public record IgnoreThenWithoutIf1BoxedVoid<br>
implements [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreThenWithoutIf1BoxedBoolean
public record IgnoreThenWithoutIf1BoxedBoolean<br>
implements [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreThenWithoutIf1BoxedNumber
public record IgnoreThenWithoutIf1BoxedNumber<br>
implements [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreThenWithoutIf1BoxedString
public record IgnoreThenWithoutIf1BoxedString<br>
implements [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreThenWithoutIf1BoxedList
public record IgnoreThenWithoutIf1BoxedList<br>
implements [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreThenWithoutIf1BoxedMap
public record IgnoreThenWithoutIf1BoxedMap<br>
implements [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreThenWithoutIf1
public static class IgnoreThenWithoutIf1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | then = [Then.class](#then) |

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
| [IgnoreThenWithoutIf1BoxedString](#ignorethenwithoutif1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IgnoreThenWithoutIf1BoxedVoid](#ignorethenwithoutif1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IgnoreThenWithoutIf1BoxedNumber](#ignorethenwithoutif1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IgnoreThenWithoutIf1BoxedBoolean](#ignorethenwithoutif1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IgnoreThenWithoutIf1BoxedMap](#ignorethenwithoutif1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IgnoreThenWithoutIf1BoxedList](#ignorethenwithoutif1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ThenBoxed
public sealed interface ThenBoxed<br>
permits<br>
[ThenBoxedVoid](#thenboxedvoid),
[ThenBoxedBoolean](#thenboxedboolean),
[ThenBoxedNumber](#thenboxednumber),
[ThenBoxedString](#thenboxedstring),
[ThenBoxedList](#thenboxedlist),
[ThenBoxedMap](#thenboxedmap)

sealed interface that stores validated payloads using boxed classes

## ThenBoxedVoid
public record ThenBoxedVoid<br>
implements [ThenBoxed](#thenboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedBoolean
public record ThenBoxedBoolean<br>
implements [ThenBoxed](#thenboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedNumber
public record ThenBoxedNumber<br>
implements [ThenBoxed](#thenboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedString
public record ThenBoxedString<br>
implements [ThenBoxed](#thenboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedList
public record ThenBoxedList<br>
implements [ThenBoxed](#thenboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedMap
public record ThenBoxedMap<br>
implements [ThenBoxed](#thenboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Then
public static class Then<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| @Nullable Object | constValue = "0" |

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
| [ThenBoxedString](#thenboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ThenBoxedVoid](#thenboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ThenBoxedNumber](#thenboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ThenBoxedBoolean](#thenboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ThenBoxedMap](#thenboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ThenBoxedList](#thenboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ThenBoxed](#thenboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringThenConst
public enum StringThenConst<br>
extends `Enum<StringThenConst>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = "0" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
