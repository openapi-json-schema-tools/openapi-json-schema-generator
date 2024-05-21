# IgnoreElseWithoutIf
unit_test_api.components.schemas.IgnoreElseWithoutIf.java
public class IgnoreElseWithoutIf<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)<br> sealed interface for validated payloads |
| record | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedVoid](#ignoreelsewithoutif1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedBoolean](#ignoreelsewithoutif1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedNumber](#ignoreelsewithoutif1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedString](#ignoreelsewithoutif1boxedstring)<br> boxed class to store validated String payloads |
| record | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedList](#ignoreelsewithoutif1boxedlist)<br> boxed class to store validated List payloads |
| record | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedMap](#ignoreelsewithoutif1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1](#ignoreelsewithoutif1)<br> schema class |
| sealed interface | [IgnoreElseWithoutIf.ElseSchemaBoxed](#elseschemaboxed)<br> sealed interface for validated payloads |
| record | [IgnoreElseWithoutIf.ElseSchemaBoxedVoid](#elseschemaboxedvoid)<br> boxed class to store validated null payloads |
| record | [IgnoreElseWithoutIf.ElseSchemaBoxedBoolean](#elseschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IgnoreElseWithoutIf.ElseSchemaBoxedNumber](#elseschemaboxednumber)<br> boxed class to store validated Number payloads |
| record | [IgnoreElseWithoutIf.ElseSchemaBoxedString](#elseschemaboxedstring)<br> boxed class to store validated String payloads |
| record | [IgnoreElseWithoutIf.ElseSchemaBoxedList](#elseschemaboxedlist)<br> boxed class to store validated List payloads |
| record | [IgnoreElseWithoutIf.ElseSchemaBoxedMap](#elseschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IgnoreElseWithoutIf.ElseSchema](#elseschema)<br> schema class |
| enum | [IgnoreElseWithoutIf.StringElseConst](#stringelseconst)<br>String enum |

## IgnoreElseWithoutIf1Boxed
public sealed interface IgnoreElseWithoutIf1Boxed<br>
permits<br>
[IgnoreElseWithoutIf1BoxedVoid](#ignoreelsewithoutif1boxedvoid),
[IgnoreElseWithoutIf1BoxedBoolean](#ignoreelsewithoutif1boxedboolean),
[IgnoreElseWithoutIf1BoxedNumber](#ignoreelsewithoutif1boxednumber),
[IgnoreElseWithoutIf1BoxedString](#ignoreelsewithoutif1boxedstring),
[IgnoreElseWithoutIf1BoxedList](#ignoreelsewithoutif1boxedlist),
[IgnoreElseWithoutIf1BoxedMap](#ignoreelsewithoutif1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IgnoreElseWithoutIf1BoxedVoid
public record IgnoreElseWithoutIf1BoxedVoid<br>
implements [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreElseWithoutIf1BoxedBoolean
public record IgnoreElseWithoutIf1BoxedBoolean<br>
implements [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreElseWithoutIf1BoxedNumber
public record IgnoreElseWithoutIf1BoxedNumber<br>
implements [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreElseWithoutIf1BoxedString
public record IgnoreElseWithoutIf1BoxedString<br>
implements [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreElseWithoutIf1BoxedList
public record IgnoreElseWithoutIf1BoxedList<br>
implements [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreElseWithoutIf1BoxedMap
public record IgnoreElseWithoutIf1BoxedMap<br>
implements [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreElseWithoutIf1
public static class IgnoreElseWithoutIf1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | elseSchema = [ElseSchema.class](#elseschema) |

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
| [IgnoreElseWithoutIf1BoxedString](#ignoreelsewithoutif1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IgnoreElseWithoutIf1BoxedVoid](#ignoreelsewithoutif1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IgnoreElseWithoutIf1BoxedNumber](#ignoreelsewithoutif1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IgnoreElseWithoutIf1BoxedBoolean](#ignoreelsewithoutif1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IgnoreElseWithoutIf1BoxedMap](#ignoreelsewithoutif1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IgnoreElseWithoutIf1BoxedList](#ignoreelsewithoutif1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ElseSchemaBoxed
public sealed interface ElseSchemaBoxed<br>
permits<br>
[ElseSchemaBoxedVoid](#elseschemaboxedvoid),
[ElseSchemaBoxedBoolean](#elseschemaboxedboolean),
[ElseSchemaBoxedNumber](#elseschemaboxednumber),
[ElseSchemaBoxedString](#elseschemaboxedstring),
[ElseSchemaBoxedList](#elseschemaboxedlist),
[ElseSchemaBoxedMap](#elseschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## ElseSchemaBoxedVoid
public record ElseSchemaBoxedVoid<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseSchemaBoxedBoolean
public record ElseSchemaBoxedBoolean<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseSchemaBoxedNumber
public record ElseSchemaBoxedNumber<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseSchemaBoxedString
public record ElseSchemaBoxedString<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseSchemaBoxedList
public record ElseSchemaBoxedList<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseSchemaBoxedMap
public record ElseSchemaBoxedMap<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseSchema
public static class ElseSchema<br>
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
| [ElseSchemaBoxedString](#elseschemaboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedVoid](#elseschemaboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedNumber](#elseschemaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedBoolean](#elseschemaboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedMap](#elseschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedList](#elseschemaboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxed](#elseschemaboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringElseConst
public enum StringElseConst<br>
extends `Enum<StringElseConst>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = "0" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
