# IfAndThenWithoutElse
unit_test_api.components.schemas.IfAndThenWithoutElse.java
public class IfAndThenWithoutElse<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IfAndThenWithoutElse.IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)<br> sealed interface for validated payloads |
| record | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedVoid](#ifandthenwithoutelse1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedBoolean](#ifandthenwithoutelse1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedNumber](#ifandthenwithoutelse1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedString](#ifandthenwithoutelse1boxedstring)<br> boxed class to store validated String payloads |
| record | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedList](#ifandthenwithoutelse1boxedlist)<br> boxed class to store validated List payloads |
| record | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedMap](#ifandthenwithoutelse1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndThenWithoutElse.IfAndThenWithoutElse1](#ifandthenwithoutelse1)<br> schema class |
| sealed interface | [IfAndThenWithoutElse.ThenBoxed](#thenboxed)<br> sealed interface for validated payloads |
| record | [IfAndThenWithoutElse.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAndThenWithoutElse.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAndThenWithoutElse.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAndThenWithoutElse.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| record | [IfAndThenWithoutElse.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| record | [IfAndThenWithoutElse.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndThenWithoutElse.Then](#then)<br> schema class |
| sealed interface | [IfAndThenWithoutElse.IfBoxed](#ifboxed)<br> sealed interface for validated payloads |
| record | [IfAndThenWithoutElse.IfBoxedVoid](#ifboxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAndThenWithoutElse.IfBoxedBoolean](#ifboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAndThenWithoutElse.IfBoxedNumber](#ifboxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAndThenWithoutElse.IfBoxedString](#ifboxedstring)<br> boxed class to store validated String payloads |
| record | [IfAndThenWithoutElse.IfBoxedList](#ifboxedlist)<br> boxed class to store validated List payloads |
| record | [IfAndThenWithoutElse.IfBoxedMap](#ifboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndThenWithoutElse.If](#if)<br> schema class |

## IfAndThenWithoutElse1Boxed
public sealed interface IfAndThenWithoutElse1Boxed<br>
permits<br>
[IfAndThenWithoutElse1BoxedVoid](#ifandthenwithoutelse1boxedvoid),
[IfAndThenWithoutElse1BoxedBoolean](#ifandthenwithoutelse1boxedboolean),
[IfAndThenWithoutElse1BoxedNumber](#ifandthenwithoutelse1boxednumber),
[IfAndThenWithoutElse1BoxedString](#ifandthenwithoutelse1boxedstring),
[IfAndThenWithoutElse1BoxedList](#ifandthenwithoutelse1boxedlist),
[IfAndThenWithoutElse1BoxedMap](#ifandthenwithoutelse1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IfAndThenWithoutElse1BoxedVoid
public record IfAndThenWithoutElse1BoxedVoid<br>
implements [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAndThenWithoutElse1BoxedBoolean
public record IfAndThenWithoutElse1BoxedBoolean<br>
implements [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAndThenWithoutElse1BoxedNumber
public record IfAndThenWithoutElse1BoxedNumber<br>
implements [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAndThenWithoutElse1BoxedString
public record IfAndThenWithoutElse1BoxedString<br>
implements [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAndThenWithoutElse1BoxedList
public record IfAndThenWithoutElse1BoxedList<br>
implements [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAndThenWithoutElse1BoxedMap
public record IfAndThenWithoutElse1BoxedMap<br>
implements [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAndThenWithoutElse1
public static class IfAndThenWithoutElse1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [If.class](#if) |
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
| [IfAndThenWithoutElse1BoxedString](#ifandthenwithoutelse1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IfAndThenWithoutElse1BoxedVoid](#ifandthenwithoutelse1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IfAndThenWithoutElse1BoxedNumber](#ifandthenwithoutelse1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IfAndThenWithoutElse1BoxedBoolean](#ifandthenwithoutelse1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IfAndThenWithoutElse1BoxedMap](#ifandthenwithoutelse1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IfAndThenWithoutElse1BoxedList](#ifandthenwithoutelse1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
| Number | minimum = -10 |

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

## IfBoxed
public sealed interface IfBoxed<br>
permits<br>
[IfBoxedVoid](#ifboxedvoid),
[IfBoxedBoolean](#ifboxedboolean),
[IfBoxedNumber](#ifboxednumber),
[IfBoxedString](#ifboxedstring),
[IfBoxedList](#ifboxedlist),
[IfBoxedMap](#ifboxedmap)

sealed interface that stores validated payloads using boxed classes

## IfBoxedVoid
public record IfBoxedVoid<br>
implements [IfBoxed](#ifboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfBoxedBoolean
public record IfBoxedBoolean<br>
implements [IfBoxed](#ifboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfBoxedNumber
public record IfBoxedNumber<br>
implements [IfBoxed](#ifboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfBoxedString
public record IfBoxedString<br>
implements [IfBoxed](#ifboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfBoxedList
public record IfBoxedList<br>
implements [IfBoxed](#ifboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfBoxedMap
public record IfBoxedMap<br>
implements [IfBoxed](#ifboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## If
public static class If<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | exclusiveMaximum = 0 |

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
| [IfBoxedString](#ifboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IfBoxedVoid](#ifboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IfBoxedNumber](#ifboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IfBoxedBoolean](#ifboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IfBoxedMap](#ifboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IfBoxedList](#ifboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IfBoxed](#ifboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
