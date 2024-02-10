# IfAndThenWithoutElse
org.openapijsonschematools.client.components.schemas.IfAndThenWithoutElse.java
public class IfAndThenWithoutElse

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IfAndThenWithoutElse.IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)<br> abstract sealed validated payload class |
| static class | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedVoid](#ifandthenwithoutelse1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedBoolean](#ifandthenwithoutelse1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedNumber](#ifandthenwithoutelse1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedString](#ifandthenwithoutelse1boxedstring)<br> boxed class to store validated String payloads |
| static class | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedList](#ifandthenwithoutelse1boxedlist)<br> boxed class to store validated List payloads |
| static class | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedMap](#ifandthenwithoutelse1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndThenWithoutElse.IfAndThenWithoutElse1](#ifandthenwithoutelse1)<br> schema class |
| static class | [IfAndThenWithoutElse.ThenBoxed](#thenboxed)<br> abstract sealed validated payload class |
| static class | [IfAndThenWithoutElse.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| static class | [IfAndThenWithoutElse.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IfAndThenWithoutElse.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| static class | [IfAndThenWithoutElse.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| static class | [IfAndThenWithoutElse.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| static class | [IfAndThenWithoutElse.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndThenWithoutElse.Then](#then)<br> schema class |
| static class | [IfAndThenWithoutElse.IfSchemaBoxed](#ifschemaboxed)<br> abstract sealed validated payload class |
| static class | [IfAndThenWithoutElse.IfSchemaBoxedVoid](#ifschemaboxedvoid)<br> boxed class to store validated null payloads |
| static class | [IfAndThenWithoutElse.IfSchemaBoxedBoolean](#ifschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IfAndThenWithoutElse.IfSchemaBoxedNumber](#ifschemaboxednumber)<br> boxed class to store validated Number payloads |
| static class | [IfAndThenWithoutElse.IfSchemaBoxedString](#ifschemaboxedstring)<br> boxed class to store validated String payloads |
| static class | [IfAndThenWithoutElse.IfSchemaBoxedList](#ifschemaboxedlist)<br> boxed class to store validated List payloads |
| static class | [IfAndThenWithoutElse.IfSchemaBoxedMap](#ifschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndThenWithoutElse.IfSchema](#ifschema)<br> schema class |

## IfAndThenWithoutElse1Boxed
public static abstract sealed class IfAndThenWithoutElse1Boxed<br>
permits<br>
[IfAndThenWithoutElse1BoxedVoid](#ifandthenwithoutelse1boxedvoid),
[IfAndThenWithoutElse1BoxedBoolean](#ifandthenwithoutelse1boxedboolean),
[IfAndThenWithoutElse1BoxedNumber](#ifandthenwithoutelse1boxednumber),
[IfAndThenWithoutElse1BoxedString](#ifandthenwithoutelse1boxedstring),
[IfAndThenWithoutElse1BoxedList](#ifandthenwithoutelse1boxedlist),
[IfAndThenWithoutElse1BoxedMap](#ifandthenwithoutelse1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## IfAndThenWithoutElse1BoxedVoid
public static final class IfAndThenWithoutElse1BoxedVoid<br>
extends [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## IfAndThenWithoutElse1BoxedBoolean
public static final class IfAndThenWithoutElse1BoxedBoolean<br>
extends [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## IfAndThenWithoutElse1BoxedNumber
public static final class IfAndThenWithoutElse1BoxedNumber<br>
extends [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IfAndThenWithoutElse1BoxedString
public static final class IfAndThenWithoutElse1BoxedString<br>
extends [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## IfAndThenWithoutElse1BoxedList
public static final class IfAndThenWithoutElse1BoxedList<br>
extends [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## IfAndThenWithoutElse1BoxedMap
public static final class IfAndThenWithoutElse1BoxedMap<br>
extends [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## IfAndThenWithoutElse1
public static class IfAndThenWithoutElse1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [IfSchema.class](#ifschema) |
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
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
