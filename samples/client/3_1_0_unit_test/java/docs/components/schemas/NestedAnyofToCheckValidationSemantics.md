# NestedAnyofToCheckValidationSemantics
org.openapijsonschematools.client.components.schemas.NestedAnyofToCheckValidationSemantics.java
public class NestedAnyofToCheckValidationSemantics

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)<br> abstract sealed validated payload class |
| static class | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedVoid](#nestedanyoftocheckvalidationsemantics1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedBoolean](#nestedanyoftocheckvalidationsemantics1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedNumber](#nestedanyoftocheckvalidationsemantics1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedString](#nestedanyoftocheckvalidationsemantics1boxedstring)<br> boxed class to store validated String payloads |
| static class | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedList](#nestedanyoftocheckvalidationsemantics1boxedlist)<br> boxed class to store validated List payloads |
| static class | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedMap](#nestedanyoftocheckvalidationsemantics1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1](#nestedanyoftocheckvalidationsemantics1)<br> schema class |
| static class | [NestedAnyofToCheckValidationSemantics.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [NestedAnyofToCheckValidationSemantics.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NestedAnyofToCheckValidationSemantics.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NestedAnyofToCheckValidationSemantics.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NestedAnyofToCheckValidationSemantics.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [NestedAnyofToCheckValidationSemantics.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| static class | [NestedAnyofToCheckValidationSemantics.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedAnyofToCheckValidationSemantics.Schema0](#schema0)<br> schema class |
| static class | [NestedAnyofToCheckValidationSemantics.Schema01Boxed](#schema01boxed)<br> abstract sealed validated payload class |
| static class | [NestedAnyofToCheckValidationSemantics.Schema01BoxedVoid](#schema01boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NestedAnyofToCheckValidationSemantics.Schema01](#schema01)<br> schema class |

## NestedAnyofToCheckValidationSemantics1Boxed
public static abstract sealed class NestedAnyofToCheckValidationSemantics1Boxed<br>
permits<br>
[NestedAnyofToCheckValidationSemantics1BoxedVoid](#nestedanyoftocheckvalidationsemantics1boxedvoid),
[NestedAnyofToCheckValidationSemantics1BoxedBoolean](#nestedanyoftocheckvalidationsemantics1boxedboolean),
[NestedAnyofToCheckValidationSemantics1BoxedNumber](#nestedanyoftocheckvalidationsemantics1boxednumber),
[NestedAnyofToCheckValidationSemantics1BoxedString](#nestedanyoftocheckvalidationsemantics1boxedstring),
[NestedAnyofToCheckValidationSemantics1BoxedList](#nestedanyoftocheckvalidationsemantics1boxedlist),
[NestedAnyofToCheckValidationSemantics1BoxedMap](#nestedanyoftocheckvalidationsemantics1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## NestedAnyofToCheckValidationSemantics1BoxedVoid
public static final class NestedAnyofToCheckValidationSemantics1BoxedVoid<br>
extends [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedBoolean
public static final class NestedAnyofToCheckValidationSemantics1BoxedBoolean<br>
extends [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedNumber
public static final class NestedAnyofToCheckValidationSemantics1BoxedNumber<br>
extends [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedString
public static final class NestedAnyofToCheckValidationSemantics1BoxedString<br>
extends [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedList
public static final class NestedAnyofToCheckValidationSemantics1BoxedList<br>
extends [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedMap
public static final class NestedAnyofToCheckValidationSemantics1BoxedMap<br>
extends [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## NestedAnyofToCheckValidationSemantics1
public static class NestedAnyofToCheckValidationSemantics1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | anyOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0)<br>)<br> |

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
| [NestedAnyofToCheckValidationSemantics1BoxedString](#nestedanyoftocheckvalidationsemantics1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [NestedAnyofToCheckValidationSemantics1BoxedVoid](#nestedanyoftocheckvalidationsemantics1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [NestedAnyofToCheckValidationSemantics1BoxedNumber](#nestedanyoftocheckvalidationsemantics1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [NestedAnyofToCheckValidationSemantics1BoxedBoolean](#nestedanyoftocheckvalidationsemantics1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [NestedAnyofToCheckValidationSemantics1BoxedMap](#nestedanyoftocheckvalidationsemantics1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [NestedAnyofToCheckValidationSemantics1BoxedList](#nestedanyoftocheckvalidationsemantics1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema0BoxedVoid
public static final class Schema0BoxedVoid<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema0BoxedBoolean
public static final class Schema0BoxedBoolean<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

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

## Schema0BoxedString
public static final class Schema0BoxedString<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema0BoxedList
public static final class Schema0BoxedList<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema0BoxedMap
public static final class Schema0BoxedMap<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Schema0
public static class Schema0<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | anyOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema01.class](#schema01)<br>)<br> |

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
| [Schema0BoxedString](#schema0boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema0BoxedVoid](#schema0boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema0BoxedNumber](#schema0boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema0BoxedBoolean](#schema0boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema0BoxedMap](#schema0boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Schema0BoxedList](#schema0boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema01Boxed
public static abstract sealed class Schema01Boxed<br>
permits<br>
[Schema01BoxedVoid](#schema01boxedvoid)

abstract sealed class that stores validated payloads using boxed classes

## Schema01BoxedVoid
public static final class Schema01BoxedVoid<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema01
public static class Schema01<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
