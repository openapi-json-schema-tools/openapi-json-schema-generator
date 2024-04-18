# MaximumValidationWithUnsignedInteger
unit_test_api.components.schemas.MaximumValidationWithUnsignedInteger.java
public class MaximumValidationWithUnsignedInteger<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)<br> sealed interface for validated payloads |
| record | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedVoid](#maximumvalidationwithunsignedinteger1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedBoolean](#maximumvalidationwithunsignedinteger1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedNumber](#maximumvalidationwithunsignedinteger1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedString](#maximumvalidationwithunsignedinteger1boxedstring)<br> boxed class to store validated String payloads |
| record | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedList](#maximumvalidationwithunsignedinteger1boxedlist)<br> boxed class to store validated List payloads |
| record | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedMap](#maximumvalidationwithunsignedinteger1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1](#maximumvalidationwithunsignedinteger1)<br> schema class |

## MaximumValidationWithUnsignedInteger1Boxed
public sealed interface MaximumValidationWithUnsignedInteger1Boxed<br>
permits<br>
[MaximumValidationWithUnsignedInteger1BoxedVoid](#maximumvalidationwithunsignedinteger1boxedvoid),
[MaximumValidationWithUnsignedInteger1BoxedBoolean](#maximumvalidationwithunsignedinteger1boxedboolean),
[MaximumValidationWithUnsignedInteger1BoxedNumber](#maximumvalidationwithunsignedinteger1boxednumber),
[MaximumValidationWithUnsignedInteger1BoxedString](#maximumvalidationwithunsignedinteger1boxedstring),
[MaximumValidationWithUnsignedInteger1BoxedList](#maximumvalidationwithunsignedinteger1boxedlist),
[MaximumValidationWithUnsignedInteger1BoxedMap](#maximumvalidationwithunsignedinteger1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MaximumValidationWithUnsignedInteger1BoxedVoid
public record MaximumValidationWithUnsignedInteger1BoxedVoid<br>
implements [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedBoolean
public record MaximumValidationWithUnsignedInteger1BoxedBoolean<br>
implements [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedNumber
public record MaximumValidationWithUnsignedInteger1BoxedNumber<br>
implements [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedString
public record MaximumValidationWithUnsignedInteger1BoxedString<br>
implements [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedList
public record MaximumValidationWithUnsignedInteger1BoxedList<br>
implements [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedMap
public record MaximumValidationWithUnsignedInteger1BoxedMap<br>
implements [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaximumValidationWithUnsignedInteger1
public static class MaximumValidationWithUnsignedInteger1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | maximum = 300 |

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
| [MaximumValidationWithUnsignedInteger1BoxedString](#maximumvalidationwithunsignedinteger1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MaximumValidationWithUnsignedInteger1BoxedVoid](#maximumvalidationwithunsignedinteger1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MaximumValidationWithUnsignedInteger1BoxedNumber](#maximumvalidationwithunsignedinteger1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MaximumValidationWithUnsignedInteger1BoxedBoolean](#maximumvalidationwithunsignedinteger1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MaximumValidationWithUnsignedInteger1BoxedMap](#maximumvalidationwithunsignedinteger1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MaximumValidationWithUnsignedInteger1BoxedList](#maximumvalidationwithunsignedinteger1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
