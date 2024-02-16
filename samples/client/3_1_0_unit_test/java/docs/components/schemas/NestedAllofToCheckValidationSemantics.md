# NestedAllofToCheckValidationSemantics
org.openapijsonschematools.client.components.schemas.NestedAllofToCheckValidationSemantics.java
public class NestedAllofToCheckValidationSemantics<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)<br> abstract sealed validated payload class |
| static class | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1BoxedVoid](#nestedalloftocheckvalidationsemantics1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1BoxedBoolean](#nestedalloftocheckvalidationsemantics1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1BoxedNumber](#nestedalloftocheckvalidationsemantics1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1BoxedString](#nestedalloftocheckvalidationsemantics1boxedstring)<br> boxed class to store validated String payloads |
| static class | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1BoxedList](#nestedalloftocheckvalidationsemantics1boxedlist)<br> boxed class to store validated List payloads |
| static class | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1BoxedMap](#nestedalloftocheckvalidationsemantics1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1](#nestedalloftocheckvalidationsemantics1)<br> schema class |
| static class | [NestedAllofToCheckValidationSemantics.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [NestedAllofToCheckValidationSemantics.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NestedAllofToCheckValidationSemantics.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NestedAllofToCheckValidationSemantics.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NestedAllofToCheckValidationSemantics.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [NestedAllofToCheckValidationSemantics.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| static class | [NestedAllofToCheckValidationSemantics.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedAllofToCheckValidationSemantics.Schema0](#schema0)<br> schema class |
| static class | [NestedAllofToCheckValidationSemantics.Schema01Boxed](#schema01boxed)<br> abstract sealed validated payload class |
| static class | [NestedAllofToCheckValidationSemantics.Schema01BoxedVoid](#schema01boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NestedAllofToCheckValidationSemantics.Schema01](#schema01)<br> schema class |

## NestedAllofToCheckValidationSemantics1Boxed
public static abstract sealed class NestedAllofToCheckValidationSemantics1Boxed<br>
permits<br>
[NestedAllofToCheckValidationSemantics1BoxedVoid](#nestedalloftocheckvalidationsemantics1boxedvoid),
[NestedAllofToCheckValidationSemantics1BoxedBoolean](#nestedalloftocheckvalidationsemantics1boxedboolean),
[NestedAllofToCheckValidationSemantics1BoxedNumber](#nestedalloftocheckvalidationsemantics1boxednumber),
[NestedAllofToCheckValidationSemantics1BoxedString](#nestedalloftocheckvalidationsemantics1boxedstring),
[NestedAllofToCheckValidationSemantics1BoxedList](#nestedalloftocheckvalidationsemantics1boxedlist),
[NestedAllofToCheckValidationSemantics1BoxedMap](#nestedalloftocheckvalidationsemantics1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## NestedAllofToCheckValidationSemantics1BoxedVoid
public static final class NestedAllofToCheckValidationSemantics1BoxedVoid<br>
extends [NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAllofToCheckValidationSemantics1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## NestedAllofToCheckValidationSemantics1BoxedBoolean
public static final class NestedAllofToCheckValidationSemantics1BoxedBoolean<br>
extends [NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAllofToCheckValidationSemantics1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## NestedAllofToCheckValidationSemantics1BoxedNumber
public static final class NestedAllofToCheckValidationSemantics1BoxedNumber<br>
extends [NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAllofToCheckValidationSemantics1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## NestedAllofToCheckValidationSemantics1BoxedString
public static final class NestedAllofToCheckValidationSemantics1BoxedString<br>
extends [NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAllofToCheckValidationSemantics1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## NestedAllofToCheckValidationSemantics1BoxedList
public static final class NestedAllofToCheckValidationSemantics1BoxedList<br>
extends [NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAllofToCheckValidationSemantics1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## NestedAllofToCheckValidationSemantics1BoxedMap
public static final class NestedAllofToCheckValidationSemantics1BoxedMap<br>
extends [NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAllofToCheckValidationSemantics1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## NestedAllofToCheckValidationSemantics1
public static class NestedAllofToCheckValidationSemantics1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0)<br>;)<br> |

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
| [NestedAllofToCheckValidationSemantics1BoxedString](#nestedalloftocheckvalidationsemantics1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [NestedAllofToCheckValidationSemantics1BoxedVoid](#nestedalloftocheckvalidationsemantics1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [NestedAllofToCheckValidationSemantics1BoxedNumber](#nestedalloftocheckvalidationsemantics1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [NestedAllofToCheckValidationSemantics1BoxedBoolean](#nestedalloftocheckvalidationsemantics1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [NestedAllofToCheckValidationSemantics1BoxedMap](#nestedalloftocheckvalidationsemantics1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [NestedAllofToCheckValidationSemantics1BoxedList](#nestedalloftocheckvalidationsemantics1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
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
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema01.class](#schema01)<br>;)<br> |

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
