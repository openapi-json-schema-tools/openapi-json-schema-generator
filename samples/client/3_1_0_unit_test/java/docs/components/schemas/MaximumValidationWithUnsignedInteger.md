# MaximumValidationWithUnsignedInteger
org.openapijsonschematools.client.components.schemas.MaximumValidationWithUnsignedInteger.java
public class MaximumValidationWithUnsignedInteger

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)<br> abstract sealed validated payload class |
| static class | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedVoid](#maximumvalidationwithunsignedinteger1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedBoolean](#maximumvalidationwithunsignedinteger1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedNumber](#maximumvalidationwithunsignedinteger1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedString](#maximumvalidationwithunsignedinteger1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedList](#maximumvalidationwithunsignedinteger1boxedlist)<br> boxed class to store validated List payloads |
| static class | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedMap](#maximumvalidationwithunsignedinteger1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1](#maximumvalidationwithunsignedinteger1)<br> schema class |

## MaximumValidationWithUnsignedInteger1Boxed
public static abstract sealed class MaximumValidationWithUnsignedInteger1Boxed<br>
permits<br>
[MaximumValidationWithUnsignedInteger1BoxedVoid](#maximumvalidationwithunsignedinteger1boxedvoid),
[MaximumValidationWithUnsignedInteger1BoxedBoolean](#maximumvalidationwithunsignedinteger1boxedboolean),
[MaximumValidationWithUnsignedInteger1BoxedNumber](#maximumvalidationwithunsignedinteger1boxednumber),
[MaximumValidationWithUnsignedInteger1BoxedString](#maximumvalidationwithunsignedinteger1boxedstring),
[MaximumValidationWithUnsignedInteger1BoxedList](#maximumvalidationwithunsignedinteger1boxedlist),
[MaximumValidationWithUnsignedInteger1BoxedMap](#maximumvalidationwithunsignedinteger1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## MaximumValidationWithUnsignedInteger1BoxedVoid
public static final class MaximumValidationWithUnsignedInteger1BoxedVoid<br>
extends [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedBoolean
public static final class MaximumValidationWithUnsignedInteger1BoxedBoolean<br>
extends [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedNumber
public static final class MaximumValidationWithUnsignedInteger1BoxedNumber<br>
extends [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedString
public static final class MaximumValidationWithUnsignedInteger1BoxedString<br>
extends [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedList
public static final class MaximumValidationWithUnsignedInteger1BoxedList<br>
extends [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedMap
public static final class MaximumValidationWithUnsignedInteger1BoxedMap<br>
extends [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
