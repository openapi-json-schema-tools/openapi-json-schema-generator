# NestedOneofToCheckValidationSemantics
org.openapijsonschematools.client.components.schemas.NestedOneofToCheckValidationSemantics.java
public class NestedOneofToCheckValidationSemantics<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)<br> abstract sealed validated payload class |
| static class | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1BoxedVoid](#nestedoneoftocheckvalidationsemantics1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1BoxedBoolean](#nestedoneoftocheckvalidationsemantics1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1BoxedNumber](#nestedoneoftocheckvalidationsemantics1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1BoxedString](#nestedoneoftocheckvalidationsemantics1boxedstring)<br> boxed class to store validated String payloads |
| static class | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1BoxedList](#nestedoneoftocheckvalidationsemantics1boxedlist)<br> boxed class to store validated List payloads |
| static class | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1BoxedMap](#nestedoneoftocheckvalidationsemantics1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1](#nestedoneoftocheckvalidationsemantics1)<br> schema class |
| static class | [NestedOneofToCheckValidationSemantics.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [NestedOneofToCheckValidationSemantics.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NestedOneofToCheckValidationSemantics.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NestedOneofToCheckValidationSemantics.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NestedOneofToCheckValidationSemantics.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [NestedOneofToCheckValidationSemantics.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| static class | [NestedOneofToCheckValidationSemantics.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedOneofToCheckValidationSemantics.Schema0](#schema0)<br> schema class |
| static class | [NestedOneofToCheckValidationSemantics.Schema01Boxed](#schema01boxed)<br> abstract sealed validated payload class |
| static class | [NestedOneofToCheckValidationSemantics.Schema01BoxedVoid](#schema01boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NestedOneofToCheckValidationSemantics.Schema01](#schema01)<br> schema class |

## NestedOneofToCheckValidationSemantics1Boxed
public static abstract sealed class NestedOneofToCheckValidationSemantics1Boxed<br>
permits<br>
[NestedOneofToCheckValidationSemantics1BoxedVoid](#nestedoneoftocheckvalidationsemantics1boxedvoid),
[NestedOneofToCheckValidationSemantics1BoxedBoolean](#nestedoneoftocheckvalidationsemantics1boxedboolean),
[NestedOneofToCheckValidationSemantics1BoxedNumber](#nestedoneoftocheckvalidationsemantics1boxednumber),
[NestedOneofToCheckValidationSemantics1BoxedString](#nestedoneoftocheckvalidationsemantics1boxedstring),
[NestedOneofToCheckValidationSemantics1BoxedList](#nestedoneoftocheckvalidationsemantics1boxedlist),
[NestedOneofToCheckValidationSemantics1BoxedMap](#nestedoneoftocheckvalidationsemantics1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## NestedOneofToCheckValidationSemantics1BoxedVoid
public static final class NestedOneofToCheckValidationSemantics1BoxedVoid<br>
extends [NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedOneofToCheckValidationSemantics1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## NestedOneofToCheckValidationSemantics1BoxedBoolean
public static final class NestedOneofToCheckValidationSemantics1BoxedBoolean<br>
extends [NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedOneofToCheckValidationSemantics1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## NestedOneofToCheckValidationSemantics1BoxedNumber
public static final class NestedOneofToCheckValidationSemantics1BoxedNumber<br>
extends [NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedOneofToCheckValidationSemantics1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## NestedOneofToCheckValidationSemantics1BoxedString
public static final class NestedOneofToCheckValidationSemantics1BoxedString<br>
extends [NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedOneofToCheckValidationSemantics1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## NestedOneofToCheckValidationSemantics1BoxedList
public static final class NestedOneofToCheckValidationSemantics1BoxedList<br>
extends [NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedOneofToCheckValidationSemantics1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## NestedOneofToCheckValidationSemantics1BoxedMap
public static final class NestedOneofToCheckValidationSemantics1BoxedMap<br>
extends [NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedOneofToCheckValidationSemantics1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## NestedOneofToCheckValidationSemantics1
public static class NestedOneofToCheckValidationSemantics1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0)<br>))<br> |

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
| [NestedOneofToCheckValidationSemantics1BoxedString](#nestedoneoftocheckvalidationsemantics1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [NestedOneofToCheckValidationSemantics1BoxedVoid](#nestedoneoftocheckvalidationsemantics1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [NestedOneofToCheckValidationSemantics1BoxedNumber](#nestedoneoftocheckvalidationsemantics1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [NestedOneofToCheckValidationSemantics1BoxedBoolean](#nestedoneoftocheckvalidationsemantics1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [NestedOneofToCheckValidationSemantics1BoxedMap](#nestedoneoftocheckvalidationsemantics1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [NestedOneofToCheckValidationSemantics1BoxedList](#nestedoneoftocheckvalidationsemantics1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
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
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema01.class](#schema01)<br>))<br> |

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
