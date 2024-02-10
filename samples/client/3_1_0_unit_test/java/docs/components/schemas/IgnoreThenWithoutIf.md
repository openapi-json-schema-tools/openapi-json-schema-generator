# IgnoreThenWithoutIf
org.openapijsonschematools.client.components.schemas.IgnoreThenWithoutIf.java
public class IgnoreThenWithoutIf

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)<br> abstract sealed validated payload class |
| static class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedVoid](#ignorethenwithoutif1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedBoolean](#ignorethenwithoutif1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedNumber](#ignorethenwithoutif1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedString](#ignorethenwithoutif1boxedstring)<br> boxed class to store validated String payloads |
| static class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedList](#ignorethenwithoutif1boxedlist)<br> boxed class to store validated List payloads |
| static class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedMap](#ignorethenwithoutif1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1](#ignorethenwithoutif1)<br> schema class |
| static class | [IgnoreThenWithoutIf.ThenBoxed](#thenboxed)<br> abstract sealed validated payload class |
| static class | [IgnoreThenWithoutIf.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| static class | [IgnoreThenWithoutIf.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IgnoreThenWithoutIf.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| static class | [IgnoreThenWithoutIf.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| static class | [IgnoreThenWithoutIf.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| static class | [IgnoreThenWithoutIf.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IgnoreThenWithoutIf.Then](#then)<br> schema class |
| enum | [IgnoreThenWithoutIf.StringThenConst](#stringthenconst)<br>String enum |

## IgnoreThenWithoutIf1Boxed
public static abstract sealed class IgnoreThenWithoutIf1Boxed<br>
permits<br>
[IgnoreThenWithoutIf1BoxedVoid](#ignorethenwithoutif1boxedvoid),
[IgnoreThenWithoutIf1BoxedBoolean](#ignorethenwithoutif1boxedboolean),
[IgnoreThenWithoutIf1BoxedNumber](#ignorethenwithoutif1boxednumber),
[IgnoreThenWithoutIf1BoxedString](#ignorethenwithoutif1boxedstring),
[IgnoreThenWithoutIf1BoxedList](#ignorethenwithoutif1boxedlist),
[IgnoreThenWithoutIf1BoxedMap](#ignorethenwithoutif1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## IgnoreThenWithoutIf1BoxedVoid
public static final class IgnoreThenWithoutIf1BoxedVoid<br>
extends [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## IgnoreThenWithoutIf1BoxedBoolean
public static final class IgnoreThenWithoutIf1BoxedBoolean<br>
extends [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## IgnoreThenWithoutIf1BoxedNumber
public static final class IgnoreThenWithoutIf1BoxedNumber<br>
extends [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IgnoreThenWithoutIf1BoxedString
public static final class IgnoreThenWithoutIf1BoxedString<br>
extends [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## IgnoreThenWithoutIf1BoxedList
public static final class IgnoreThenWithoutIf1BoxedList<br>
extends [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## IgnoreThenWithoutIf1BoxedMap
public static final class IgnoreThenWithoutIf1BoxedMap<br>
extends [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ThenBoxed
public static abstract sealed class ThenBoxed<br>
permits<br>
[ThenBoxedVoid](#thenboxedvoid),
[ThenBoxedBoolean](#thenboxedboolean),
[ThenBoxedNumber](#thenboxednumber),
[ThenBoxedString](#thenboxedstring),
[ThenBoxedList](#thenboxedlist),
[ThenBoxedMap](#thenboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ThenBoxedVoid
public static final class ThenBoxedVoid<br>
extends [ThenBoxed](#thenboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ThenBoxedBoolean
public static final class ThenBoxedBoolean<br>
extends [ThenBoxed](#thenboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ThenBoxedNumber
public static final class ThenBoxedNumber<br>
extends [ThenBoxed](#thenboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ThenBoxedString
public static final class ThenBoxedString<br>
extends [ThenBoxed](#thenboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ThenBoxedList
public static final class ThenBoxedList<br>
extends [ThenBoxed](#thenboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ThenBoxedMap
public static final class ThenBoxedMap<br>
extends [ThenBoxed](#thenboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
