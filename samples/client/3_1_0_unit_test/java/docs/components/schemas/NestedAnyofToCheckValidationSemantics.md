# NestedAnyofToCheckValidationSemantics
unit_test_api.components.schemas.NestedAnyofToCheckValidationSemantics.java
public class NestedAnyofToCheckValidationSemantics<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)<br> sealed interface for validated payloads |
| record | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedVoid](#nestedanyoftocheckvalidationsemantics1boxedvoid)<br> boxed class to store validated null payloads |
| record | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedBoolean](#nestedanyoftocheckvalidationsemantics1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedNumber](#nestedanyoftocheckvalidationsemantics1boxednumber)<br> boxed class to store validated Number payloads |
| record | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedString](#nestedanyoftocheckvalidationsemantics1boxedstring)<br> boxed class to store validated String payloads |
| record | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedList](#nestedanyoftocheckvalidationsemantics1boxedlist)<br> boxed class to store validated List payloads |
| record | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedMap](#nestedanyoftocheckvalidationsemantics1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1](#nestedanyoftocheckvalidationsemantics1)<br> schema class |
| sealed interface | [NestedAnyofToCheckValidationSemantics.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedAnyofToCheckValidationSemantics.Schema0](#schema0)<br> schema class |
| sealed interface | [NestedAnyofToCheckValidationSemantics.Schema01Boxed](#schema01boxed)<br> sealed interface for validated payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema01BoxedVoid](#schema01boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NestedAnyofToCheckValidationSemantics.Schema01](#schema01)<br> schema class |

## NestedAnyofToCheckValidationSemantics1Boxed
public sealed interface NestedAnyofToCheckValidationSemantics1Boxed<br>
permits<br>
[NestedAnyofToCheckValidationSemantics1BoxedVoid](#nestedanyoftocheckvalidationsemantics1boxedvoid),
[NestedAnyofToCheckValidationSemantics1BoxedBoolean](#nestedanyoftocheckvalidationsemantics1boxedboolean),
[NestedAnyofToCheckValidationSemantics1BoxedNumber](#nestedanyoftocheckvalidationsemantics1boxednumber),
[NestedAnyofToCheckValidationSemantics1BoxedString](#nestedanyoftocheckvalidationsemantics1boxedstring),
[NestedAnyofToCheckValidationSemantics1BoxedList](#nestedanyoftocheckvalidationsemantics1boxedlist),
[NestedAnyofToCheckValidationSemantics1BoxedMap](#nestedanyoftocheckvalidationsemantics1boxedmap)

sealed interface that stores validated payloads using boxed classes

## NestedAnyofToCheckValidationSemantics1BoxedVoid
public record NestedAnyofToCheckValidationSemantics1BoxedVoid<br>
implements [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedBoolean
public record NestedAnyofToCheckValidationSemantics1BoxedBoolean<br>
implements [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedNumber
public record NestedAnyofToCheckValidationSemantics1BoxedNumber<br>
implements [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedString
public record NestedAnyofToCheckValidationSemantics1BoxedString<br>
implements [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedList
public record NestedAnyofToCheckValidationSemantics1BoxedList<br>
implements [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedMap
public record NestedAnyofToCheckValidationSemantics1BoxedMap<br>
implements [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema0Boxed
public sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedVoid
public record Schema0BoxedVoid<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedBoolean
public record Schema0BoxedBoolean<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedNumber
public record Schema0BoxedNumber<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedString
public record Schema0BoxedString<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedList
public record Schema0BoxedList<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedMap
public record Schema0BoxedMap<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [Schema0Boxed](#schema0boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema01Boxed
public sealed interface Schema01Boxed<br>
permits<br>
[Schema01BoxedVoid](#schema01boxedvoid)

sealed interface that stores validated payloads using boxed classes

## Schema01BoxedVoid
public record Schema01BoxedVoid<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01
public static class Schema01<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
