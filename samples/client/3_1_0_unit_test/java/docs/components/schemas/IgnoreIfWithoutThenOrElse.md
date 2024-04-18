# IgnoreIfWithoutThenOrElse
org.openapijsonschematools.client.components.schemas.IgnoreIfWithoutThenOrElse.java
public class IgnoreIfWithoutThenOrElse<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)<br> sealed interface for validated payloads |
| record | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedVoid](#ignoreifwithoutthenorelse1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedBoolean](#ignoreifwithoutthenorelse1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedNumber](#ignoreifwithoutthenorelse1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedString](#ignoreifwithoutthenorelse1boxedstring)<br> boxed class to store validated String payloads |
| record | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedList](#ignoreifwithoutthenorelse1boxedlist)<br> boxed class to store validated List payloads |
| record | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedMap](#ignoreifwithoutthenorelse1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1](#ignoreifwithoutthenorelse1)<br> schema class |
| sealed interface | [IgnoreIfWithoutThenOrElse.IfSchemaBoxed](#ifschemaboxed)<br> sealed interface for validated payloads |
| record | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedVoid](#ifschemaboxedvoid)<br> boxed class to store validated null payloads |
| record | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedBoolean](#ifschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedNumber](#ifschemaboxednumber)<br> boxed class to store validated Number payloads |
| record | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedString](#ifschemaboxedstring)<br> boxed class to store validated String payloads |
| record | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedList](#ifschemaboxedlist)<br> boxed class to store validated List payloads |
| record | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedMap](#ifschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IgnoreIfWithoutThenOrElse.IfSchema](#ifschema)<br> schema class |
| enum | [IgnoreIfWithoutThenOrElse.StringIfConst](#stringifconst)<br>String enum |

## IgnoreIfWithoutThenOrElse1Boxed
public sealed interface IgnoreIfWithoutThenOrElse1Boxed<br>
permits<br>
[IgnoreIfWithoutThenOrElse1BoxedVoid](#ignoreifwithoutthenorelse1boxedvoid),
[IgnoreIfWithoutThenOrElse1BoxedBoolean](#ignoreifwithoutthenorelse1boxedboolean),
[IgnoreIfWithoutThenOrElse1BoxedNumber](#ignoreifwithoutthenorelse1boxednumber),
[IgnoreIfWithoutThenOrElse1BoxedString](#ignoreifwithoutthenorelse1boxedstring),
[IgnoreIfWithoutThenOrElse1BoxedList](#ignoreifwithoutthenorelse1boxedlist),
[IgnoreIfWithoutThenOrElse1BoxedMap](#ignoreifwithoutthenorelse1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IgnoreIfWithoutThenOrElse1BoxedVoid
public record IgnoreIfWithoutThenOrElse1BoxedVoid<br>
implements [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedBoolean
public record IgnoreIfWithoutThenOrElse1BoxedBoolean<br>
implements [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedNumber
public record IgnoreIfWithoutThenOrElse1BoxedNumber<br>
implements [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedString
public record IgnoreIfWithoutThenOrElse1BoxedString<br>
implements [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedList
public record IgnoreIfWithoutThenOrElse1BoxedList<br>
implements [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedMap
public record IgnoreIfWithoutThenOrElse1BoxedMap<br>
implements [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IgnoreIfWithoutThenOrElse1
public static class IgnoreIfWithoutThenOrElse1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [IfSchema.class](#ifschema) |

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
| [IgnoreIfWithoutThenOrElse1BoxedString](#ignoreifwithoutthenorelse1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IgnoreIfWithoutThenOrElse1BoxedVoid](#ignoreifwithoutthenorelse1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IgnoreIfWithoutThenOrElse1BoxedNumber](#ignoreifwithoutthenorelse1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IgnoreIfWithoutThenOrElse1BoxedBoolean](#ignoreifwithoutthenorelse1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IgnoreIfWithoutThenOrElse1BoxedMap](#ignoreifwithoutthenorelse1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IgnoreIfWithoutThenOrElse1BoxedList](#ignoreifwithoutthenorelse1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## IfSchemaBoxed
public sealed interface IfSchemaBoxed<br>
permits<br>
[IfSchemaBoxedVoid](#ifschemaboxedvoid),
[IfSchemaBoxedBoolean](#ifschemaboxedboolean),
[IfSchemaBoxedNumber](#ifschemaboxednumber),
[IfSchemaBoxedString](#ifschemaboxedstring),
[IfSchemaBoxedList](#ifschemaboxedlist),
[IfSchemaBoxedMap](#ifschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## IfSchemaBoxedVoid
public record IfSchemaBoxedVoid<br>
implements [IfSchemaBoxed](#ifschemaboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfSchemaBoxedBoolean
public record IfSchemaBoxedBoolean<br>
implements [IfSchemaBoxed](#ifschemaboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfSchemaBoxedNumber
public record IfSchemaBoxedNumber<br>
implements [IfSchemaBoxed](#ifschemaboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfSchemaBoxedString
public record IfSchemaBoxedString<br>
implements [IfSchemaBoxed](#ifschemaboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfSchemaBoxedList
public record IfSchemaBoxedList<br>
implements [IfSchemaBoxed](#ifschemaboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfSchemaBoxedMap
public record IfSchemaBoxedMap<br>
implements [IfSchemaBoxed](#ifschemaboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfSchema
public static class IfSchema<br>
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
| [IfSchemaBoxedString](#ifschemaboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedVoid](#ifschemaboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedNumber](#ifschemaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedBoolean](#ifschemaboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedMap](#ifschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedList](#ifschemaboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IfSchemaBoxed](#ifschemaboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringIfConst
public enum StringIfConst<br>
extends `Enum<StringIfConst>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = "0" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
