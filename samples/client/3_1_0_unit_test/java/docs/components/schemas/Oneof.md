# Oneof
org.openapijsonschematools.client.components.schemas.Oneof.java
public class Oneof

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Oneof.Oneof1Boxed](#oneof1boxed)<br> abstract sealed validated payload class |
| static class | [Oneof.Oneof1BoxedVoid](#oneof1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Oneof.Oneof1BoxedBoolean](#oneof1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Oneof.Oneof1BoxedNumber](#oneof1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Oneof.Oneof1BoxedString](#oneof1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Oneof.Oneof1BoxedList](#oneof1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Oneof.Oneof1BoxedMap](#oneof1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Oneof.Oneof1](#oneof1)<br> schema class |
| static class | [Oneof.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [Oneof.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Oneof.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Oneof.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Oneof.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Oneof.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Oneof.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Oneof.Schema1](#schema1)<br> schema class |
| static class | [Oneof.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [Oneof.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Oneof.Schema0](#schema0)<br> schema class |

## Oneof1Boxed
public static abstract sealed class Oneof1Boxed<br>
permits<br>
[Oneof1BoxedVoid](#oneof1boxedvoid),
[Oneof1BoxedBoolean](#oneof1boxedboolean),
[Oneof1BoxedNumber](#oneof1boxednumber),
[Oneof1BoxedString](#oneof1boxedstring),
[Oneof1BoxedList](#oneof1boxedlist),
[Oneof1BoxedMap](#oneof1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Oneof1BoxedVoid
public static final class Oneof1BoxedVoid<br>
extends [Oneof1Boxed](#oneof1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Oneof1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Oneof1BoxedBoolean
public static final class Oneof1BoxedBoolean<br>
extends [Oneof1Boxed](#oneof1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Oneof1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Oneof1BoxedNumber
public static final class Oneof1BoxedNumber<br>
extends [Oneof1Boxed](#oneof1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Oneof1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Oneof1BoxedString
public static final class Oneof1BoxedString<br>
extends [Oneof1Boxed](#oneof1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Oneof1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Oneof1BoxedList
public static final class Oneof1BoxedList<br>
extends [Oneof1Boxed](#oneof1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Oneof1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Oneof1BoxedMap
public static final class Oneof1BoxedMap<br>
extends [Oneof1Boxed](#oneof1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Oneof1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Oneof1
public static class Oneof1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>))<br> |

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
| [Oneof1BoxedString](#oneof1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Oneof1BoxedVoid](#oneof1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Oneof1BoxedNumber](#oneof1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Oneof1BoxedBoolean](#oneof1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Oneof1BoxedMap](#oneof1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Oneof1BoxedList](#oneof1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedVoid](#schema1boxedvoid),
[Schema1BoxedBoolean](#schema1boxedboolean),
[Schema1BoxedNumber](#schema1boxednumber),
[Schema1BoxedString](#schema1boxedstring),
[Schema1BoxedList](#schema1boxedlist),
[Schema1BoxedMap](#schema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema1BoxedVoid
public static final class Schema1BoxedVoid<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema1BoxedBoolean
public static final class Schema1BoxedBoolean<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema1BoxedNumber
public static final class Schema1BoxedNumber<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema1BoxedString
public static final class Schema1BoxedString<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema1BoxedList
public static final class Schema1BoxedList<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema1BoxedMap
public static final class Schema1BoxedMap<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Schema1
public static class Schema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | minimum = 2 |

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
| [Schema1BoxedString](#schema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema1BoxedVoid](#schema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema1BoxedNumber](#schema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema1BoxedBoolean](#schema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Schema1BoxedList](#schema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedNumber](#schema0boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Schema0BoxedNumber
public static final class Schema0BoxedNumber<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema0
public static class Schema0<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
