# IgnoreElseWithoutIf
org.openapijsonschematools.client.components.schemas.IgnoreElseWithoutIf.java
public class IgnoreElseWithoutIf

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)<br> abstract sealed validated payload class |
| static class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedVoid](#ignoreelsewithoutif1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedBoolean](#ignoreelsewithoutif1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedNumber](#ignoreelsewithoutif1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedString](#ignoreelsewithoutif1boxedstring)<br> boxed class to store validated String payloads |
| static class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedList](#ignoreelsewithoutif1boxedlist)<br> boxed class to store validated List payloads |
| static class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedMap](#ignoreelsewithoutif1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1](#ignoreelsewithoutif1)<br> schema class |
| static class | [IgnoreElseWithoutIf.ElseSchemaBoxed](#elseschemaboxed)<br> abstract sealed validated payload class |
| static class | [IgnoreElseWithoutIf.ElseSchemaBoxedVoid](#elseschemaboxedvoid)<br> boxed class to store validated null payloads |
| static class | [IgnoreElseWithoutIf.ElseSchemaBoxedBoolean](#elseschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IgnoreElseWithoutIf.ElseSchemaBoxedNumber](#elseschemaboxednumber)<br> boxed class to store validated Number payloads |
| static class | [IgnoreElseWithoutIf.ElseSchemaBoxedString](#elseschemaboxedstring)<br> boxed class to store validated String payloads |
| static class | [IgnoreElseWithoutIf.ElseSchemaBoxedList](#elseschemaboxedlist)<br> boxed class to store validated List payloads |
| static class | [IgnoreElseWithoutIf.ElseSchemaBoxedMap](#elseschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IgnoreElseWithoutIf.ElseSchema](#elseschema)<br> schema class |
| enum | [IgnoreElseWithoutIf.StringElseConst](#stringelseconst)<br>String enum |

## IgnoreElseWithoutIf1Boxed
public static abstract sealed class IgnoreElseWithoutIf1Boxed<br>
permits<br>
[IgnoreElseWithoutIf1BoxedVoid](#ignoreelsewithoutif1boxedvoid),
[IgnoreElseWithoutIf1BoxedBoolean](#ignoreelsewithoutif1boxedboolean),
[IgnoreElseWithoutIf1BoxedNumber](#ignoreelsewithoutif1boxednumber),
[IgnoreElseWithoutIf1BoxedString](#ignoreelsewithoutif1boxedstring),
[IgnoreElseWithoutIf1BoxedList](#ignoreelsewithoutif1boxedlist),
[IgnoreElseWithoutIf1BoxedMap](#ignoreelsewithoutif1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## IgnoreElseWithoutIf1BoxedVoid
public static final class IgnoreElseWithoutIf1BoxedVoid<br>
extends [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## IgnoreElseWithoutIf1BoxedBoolean
public static final class IgnoreElseWithoutIf1BoxedBoolean<br>
extends [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## IgnoreElseWithoutIf1BoxedNumber
public static final class IgnoreElseWithoutIf1BoxedNumber<br>
extends [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IgnoreElseWithoutIf1BoxedString
public static final class IgnoreElseWithoutIf1BoxedString<br>
extends [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## IgnoreElseWithoutIf1BoxedList
public static final class IgnoreElseWithoutIf1BoxedList<br>
extends [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## IgnoreElseWithoutIf1BoxedMap
public static final class IgnoreElseWithoutIf1BoxedMap<br>
extends [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ElseSchemaBoxed
public static abstract sealed class ElseSchemaBoxed<br>
permits<br>
[ElseSchemaBoxedVoid](#elseschemaboxedvoid),
[ElseSchemaBoxedBoolean](#elseschemaboxedboolean),
[ElseSchemaBoxedNumber](#elseschemaboxednumber),
[ElseSchemaBoxedString](#elseschemaboxedstring),
[ElseSchemaBoxedList](#elseschemaboxedlist),
[ElseSchemaBoxedMap](#elseschemaboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ElseSchemaBoxedVoid
public static final class ElseSchemaBoxedVoid<br>
extends [ElseSchemaBoxed](#elseschemaboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ElseSchemaBoxedBoolean
public static final class ElseSchemaBoxedBoolean<br>
extends [ElseSchemaBoxed](#elseschemaboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ElseSchemaBoxedNumber
public static final class ElseSchemaBoxedNumber<br>
extends [ElseSchemaBoxed](#elseschemaboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ElseSchemaBoxedString
public static final class ElseSchemaBoxedString<br>
extends [ElseSchemaBoxed](#elseschemaboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ElseSchemaBoxedList
public static final class ElseSchemaBoxedList<br>
extends [ElseSchemaBoxed](#elseschemaboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ElseSchemaBoxedMap
public static final class ElseSchemaBoxedMap<br>
extends [ElseSchemaBoxed](#elseschemaboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
