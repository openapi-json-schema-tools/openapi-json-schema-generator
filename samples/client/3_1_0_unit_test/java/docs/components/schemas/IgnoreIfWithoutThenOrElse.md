# IgnoreIfWithoutThenOrElse
org.openapijsonschematools.client.components.schemas.IgnoreIfWithoutThenOrElse.java
public class IgnoreIfWithoutThenOrElse<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)<br> abstract sealed validated payload class |
| static class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedVoid](#ignoreifwithoutthenorelse1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedBoolean](#ignoreifwithoutthenorelse1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedNumber](#ignoreifwithoutthenorelse1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedString](#ignoreifwithoutthenorelse1boxedstring)<br> boxed class to store validated String payloads |
| static class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedList](#ignoreifwithoutthenorelse1boxedlist)<br> boxed class to store validated List payloads |
| static class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedMap](#ignoreifwithoutthenorelse1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1](#ignoreifwithoutthenorelse1)<br> schema class |
| static class | [IgnoreIfWithoutThenOrElse.IfSchemaBoxed](#ifschemaboxed)<br> abstract sealed validated payload class |
| static class | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedVoid](#ifschemaboxedvoid)<br> boxed class to store validated null payloads |
| static class | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedBoolean](#ifschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedNumber](#ifschemaboxednumber)<br> boxed class to store validated Number payloads |
| static class | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedString](#ifschemaboxedstring)<br> boxed class to store validated String payloads |
| static class | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedList](#ifschemaboxedlist)<br> boxed class to store validated List payloads |
| static class | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedMap](#ifschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IgnoreIfWithoutThenOrElse.IfSchema](#ifschema)<br> schema class |
| enum | [IgnoreIfWithoutThenOrElse.StringIfConst](#stringifconst)<br>String enum |

## IgnoreIfWithoutThenOrElse1Boxed
public static abstract sealed class IgnoreIfWithoutThenOrElse1Boxed<br>
permits<br>
[IgnoreIfWithoutThenOrElse1BoxedVoid](#ignoreifwithoutthenorelse1boxedvoid),
[IgnoreIfWithoutThenOrElse1BoxedBoolean](#ignoreifwithoutthenorelse1boxedboolean),
[IgnoreIfWithoutThenOrElse1BoxedNumber](#ignoreifwithoutthenorelse1boxednumber),
[IgnoreIfWithoutThenOrElse1BoxedString](#ignoreifwithoutthenorelse1boxedstring),
[IgnoreIfWithoutThenOrElse1BoxedList](#ignoreifwithoutthenorelse1boxedlist),
[IgnoreIfWithoutThenOrElse1BoxedMap](#ignoreifwithoutthenorelse1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## IgnoreIfWithoutThenOrElse1BoxedVoid
public static final class IgnoreIfWithoutThenOrElse1BoxedVoid<br>
extends [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedBoolean
public static final class IgnoreIfWithoutThenOrElse1BoxedBoolean<br>
extends [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedNumber
public static final class IgnoreIfWithoutThenOrElse1BoxedNumber<br>
extends [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedString
public static final class IgnoreIfWithoutThenOrElse1BoxedString<br>
extends [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedList
public static final class IgnoreIfWithoutThenOrElse1BoxedList<br>
extends [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedMap
public static final class IgnoreIfWithoutThenOrElse1BoxedMap<br>
extends [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## IfSchemaBoxed
public static abstract sealed class IfSchemaBoxed<br>
permits<br>
[IfSchemaBoxedVoid](#ifschemaboxedvoid),
[IfSchemaBoxedBoolean](#ifschemaboxedboolean),
[IfSchemaBoxedNumber](#ifschemaboxednumber),
[IfSchemaBoxedString](#ifschemaboxedstring),
[IfSchemaBoxedList](#ifschemaboxedlist),
[IfSchemaBoxedMap](#ifschemaboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## IfSchemaBoxedVoid
public static final class IfSchemaBoxedVoid<br>
extends [IfSchemaBoxed](#ifschemaboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## IfSchemaBoxedBoolean
public static final class IfSchemaBoxedBoolean<br>
extends [IfSchemaBoxed](#ifschemaboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## IfSchemaBoxedNumber
public static final class IfSchemaBoxedNumber<br>
extends [IfSchemaBoxed](#ifschemaboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IfSchemaBoxedString
public static final class IfSchemaBoxedString<br>
extends [IfSchemaBoxed](#ifschemaboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## IfSchemaBoxedList
public static final class IfSchemaBoxedList<br>
extends [IfSchemaBoxed](#ifschemaboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## IfSchemaBoxedMap
public static final class IfSchemaBoxedMap<br>
extends [IfSchemaBoxed](#ifschemaboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
