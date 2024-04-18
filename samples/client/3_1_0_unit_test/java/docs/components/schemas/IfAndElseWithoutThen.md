# IfAndElseWithoutThen
unit_test_api.components.schemas.IfAndElseWithoutThen.java
public class IfAndElseWithoutThen<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IfAndElseWithoutThen.IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)<br> sealed interface for validated payloads |
| record | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedVoid](#ifandelsewithoutthen1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedBoolean](#ifandelsewithoutthen1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedNumber](#ifandelsewithoutthen1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedString](#ifandelsewithoutthen1boxedstring)<br> boxed class to store validated String payloads |
| record | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedList](#ifandelsewithoutthen1boxedlist)<br> boxed class to store validated List payloads |
| record | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedMap](#ifandelsewithoutthen1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndElseWithoutThen.IfAndElseWithoutThen1](#ifandelsewithoutthen1)<br> schema class |
| sealed interface | [IfAndElseWithoutThen.IfBoxed](#ifboxed)<br> sealed interface for validated payloads |
| record | [IfAndElseWithoutThen.IfBoxedVoid](#ifboxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAndElseWithoutThen.IfBoxedBoolean](#ifboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAndElseWithoutThen.IfBoxedNumber](#ifboxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAndElseWithoutThen.IfBoxedString](#ifboxedstring)<br> boxed class to store validated String payloads |
| record | [IfAndElseWithoutThen.IfBoxedList](#ifboxedlist)<br> boxed class to store validated List payloads |
| record | [IfAndElseWithoutThen.IfBoxedMap](#ifboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndElseWithoutThen.If](#if)<br> schema class |
| sealed interface | [IfAndElseWithoutThen.ElseBoxed](#elseboxed)<br> sealed interface for validated payloads |
| record | [IfAndElseWithoutThen.ElseBoxedVoid](#elseboxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAndElseWithoutThen.ElseBoxedBoolean](#elseboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAndElseWithoutThen.ElseBoxedNumber](#elseboxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAndElseWithoutThen.ElseBoxedString](#elseboxedstring)<br> boxed class to store validated String payloads |
| record | [IfAndElseWithoutThen.ElseBoxedList](#elseboxedlist)<br> boxed class to store validated List payloads |
| record | [IfAndElseWithoutThen.ElseBoxedMap](#elseboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndElseWithoutThen.Else](#else)<br> schema class |

## IfAndElseWithoutThen1Boxed
public sealed interface IfAndElseWithoutThen1Boxed<br>
permits<br>
[IfAndElseWithoutThen1BoxedVoid](#ifandelsewithoutthen1boxedvoid),
[IfAndElseWithoutThen1BoxedBoolean](#ifandelsewithoutthen1boxedboolean),
[IfAndElseWithoutThen1BoxedNumber](#ifandelsewithoutthen1boxednumber),
[IfAndElseWithoutThen1BoxedString](#ifandelsewithoutthen1boxedstring),
[IfAndElseWithoutThen1BoxedList](#ifandelsewithoutthen1boxedlist),
[IfAndElseWithoutThen1BoxedMap](#ifandelsewithoutthen1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IfAndElseWithoutThen1BoxedVoid
public record IfAndElseWithoutThen1BoxedVoid<br>
implements [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAndElseWithoutThen1BoxedBoolean
public record IfAndElseWithoutThen1BoxedBoolean<br>
implements [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAndElseWithoutThen1BoxedNumber
public record IfAndElseWithoutThen1BoxedNumber<br>
implements [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAndElseWithoutThen1BoxedString
public record IfAndElseWithoutThen1BoxedString<br>
implements [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAndElseWithoutThen1BoxedList
public record IfAndElseWithoutThen1BoxedList<br>
implements [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAndElseWithoutThen1BoxedMap
public record IfAndElseWithoutThen1BoxedMap<br>
implements [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfAndElseWithoutThen1
public static class IfAndElseWithoutThen1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [If.class](#if) |
| Class<? extends JsonSchema> | elseSchema = [Else.class](#else) |

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
| [IfAndElseWithoutThen1BoxedString](#ifandelsewithoutthen1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IfAndElseWithoutThen1BoxedVoid](#ifandelsewithoutthen1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IfAndElseWithoutThen1BoxedNumber](#ifandelsewithoutthen1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IfAndElseWithoutThen1BoxedBoolean](#ifandelsewithoutthen1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IfAndElseWithoutThen1BoxedMap](#ifandelsewithoutthen1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IfAndElseWithoutThen1BoxedList](#ifandelsewithoutthen1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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

## ElseBoxed
public sealed interface ElseBoxed<br>
permits<br>
[ElseBoxedVoid](#elseboxedvoid),
[ElseBoxedBoolean](#elseboxedboolean),
[ElseBoxedNumber](#elseboxednumber),
[ElseBoxedString](#elseboxedstring),
[ElseBoxedList](#elseboxedlist),
[ElseBoxedMap](#elseboxedmap)

sealed interface that stores validated payloads using boxed classes

## ElseBoxedVoid
public record ElseBoxedVoid<br>
implements [ElseBoxed](#elseboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseBoxedBoolean
public record ElseBoxedBoolean<br>
implements [ElseBoxed](#elseboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseBoxedNumber
public record ElseBoxedNumber<br>
implements [ElseBoxed](#elseboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseBoxedString
public record ElseBoxedString<br>
implements [ElseBoxed](#elseboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseBoxedList
public record ElseBoxedList<br>
implements [ElseBoxed](#elseboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseBoxedMap
public record ElseBoxedMap<br>
implements [ElseBoxed](#elseboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Else
public static class Else<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = new BigDecimal("2") |

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
| [ElseBoxedString](#elseboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ElseBoxedVoid](#elseboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ElseBoxedNumber](#elseboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ElseBoxedBoolean](#elseboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ElseBoxedMap](#elseboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ElseBoxedList](#elseboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ElseBoxed](#elseboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
