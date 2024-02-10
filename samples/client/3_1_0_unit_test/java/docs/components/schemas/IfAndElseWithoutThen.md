# IfAndElseWithoutThen
org.openapijsonschematools.client.components.schemas.IfAndElseWithoutThen.java
public class IfAndElseWithoutThen

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IfAndElseWithoutThen.IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)<br> abstract sealed validated payload class |
| static class | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedVoid](#ifandelsewithoutthen1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedBoolean](#ifandelsewithoutthen1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedNumber](#ifandelsewithoutthen1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedString](#ifandelsewithoutthen1boxedstring)<br> boxed class to store validated String payloads |
| static class | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedList](#ifandelsewithoutthen1boxedlist)<br> boxed class to store validated List payloads |
| static class | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedMap](#ifandelsewithoutthen1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndElseWithoutThen.IfAndElseWithoutThen1](#ifandelsewithoutthen1)<br> schema class |
| static class | [IfAndElseWithoutThen.IfSchemaBoxed](#ifschemaboxed)<br> abstract sealed validated payload class |
| static class | [IfAndElseWithoutThen.IfSchemaBoxedVoid](#ifschemaboxedvoid)<br> boxed class to store validated null payloads |
| static class | [IfAndElseWithoutThen.IfSchemaBoxedBoolean](#ifschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IfAndElseWithoutThen.IfSchemaBoxedNumber](#ifschemaboxednumber)<br> boxed class to store validated Number payloads |
| static class | [IfAndElseWithoutThen.IfSchemaBoxedString](#ifschemaboxedstring)<br> boxed class to store validated String payloads |
| static class | [IfAndElseWithoutThen.IfSchemaBoxedList](#ifschemaboxedlist)<br> boxed class to store validated List payloads |
| static class | [IfAndElseWithoutThen.IfSchemaBoxedMap](#ifschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndElseWithoutThen.IfSchema](#ifschema)<br> schema class |
| static class | [IfAndElseWithoutThen.ElseSchemaBoxed](#elseschemaboxed)<br> abstract sealed validated payload class |
| static class | [IfAndElseWithoutThen.ElseSchemaBoxedVoid](#elseschemaboxedvoid)<br> boxed class to store validated null payloads |
| static class | [IfAndElseWithoutThen.ElseSchemaBoxedBoolean](#elseschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IfAndElseWithoutThen.ElseSchemaBoxedNumber](#elseschemaboxednumber)<br> boxed class to store validated Number payloads |
| static class | [IfAndElseWithoutThen.ElseSchemaBoxedString](#elseschemaboxedstring)<br> boxed class to store validated String payloads |
| static class | [IfAndElseWithoutThen.ElseSchemaBoxedList](#elseschemaboxedlist)<br> boxed class to store validated List payloads |
| static class | [IfAndElseWithoutThen.ElseSchemaBoxedMap](#elseschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndElseWithoutThen.ElseSchema](#elseschema)<br> schema class |

## IfAndElseWithoutThen1Boxed
public static abstract sealed class IfAndElseWithoutThen1Boxed<br>
permits<br>
[IfAndElseWithoutThen1BoxedVoid](#ifandelsewithoutthen1boxedvoid),
[IfAndElseWithoutThen1BoxedBoolean](#ifandelsewithoutthen1boxedboolean),
[IfAndElseWithoutThen1BoxedNumber](#ifandelsewithoutthen1boxednumber),
[IfAndElseWithoutThen1BoxedString](#ifandelsewithoutthen1boxedstring),
[IfAndElseWithoutThen1BoxedList](#ifandelsewithoutthen1boxedlist),
[IfAndElseWithoutThen1BoxedMap](#ifandelsewithoutthen1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## IfAndElseWithoutThen1BoxedVoid
public static final class IfAndElseWithoutThen1BoxedVoid<br>
extends [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## IfAndElseWithoutThen1BoxedBoolean
public static final class IfAndElseWithoutThen1BoxedBoolean<br>
extends [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## IfAndElseWithoutThen1BoxedNumber
public static final class IfAndElseWithoutThen1BoxedNumber<br>
extends [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IfAndElseWithoutThen1BoxedString
public static final class IfAndElseWithoutThen1BoxedString<br>
extends [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## IfAndElseWithoutThen1BoxedList
public static final class IfAndElseWithoutThen1BoxedList<br>
extends [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## IfAndElseWithoutThen1BoxedMap
public static final class IfAndElseWithoutThen1BoxedMap<br>
extends [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## IfAndElseWithoutThen1
public static class IfAndElseWithoutThen1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [IfSchema.class](#ifschema) |
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
| [IfAndElseWithoutThen1BoxedString](#ifandelsewithoutthen1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IfAndElseWithoutThen1BoxedVoid](#ifandelsewithoutthen1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IfAndElseWithoutThen1BoxedNumber](#ifandelsewithoutthen1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IfAndElseWithoutThen1BoxedBoolean](#ifandelsewithoutthen1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IfAndElseWithoutThen1BoxedMap](#ifandelsewithoutthen1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IfAndElseWithoutThen1BoxedList](#ifandelsewithoutthen1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
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
| [IfSchemaBoxedString](#ifschemaboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedVoid](#ifschemaboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedNumber](#ifschemaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedBoolean](#ifschemaboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedMap](#ifschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedList](#ifschemaboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
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
| [ElseSchemaBoxedString](#elseschemaboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedVoid](#elseschemaboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedNumber](#elseschemaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedBoolean](#elseschemaboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedMap](#elseschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedList](#elseschemaboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
