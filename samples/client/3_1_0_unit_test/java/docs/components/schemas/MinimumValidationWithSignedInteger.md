# MinimumValidationWithSignedInteger
unit_test_api.components.schemas.MinimumValidationWithSignedInteger.java
public class MinimumValidationWithSignedInteger<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)<br> sealed interface for validated payloads |
| record | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedVoid](#minimumvalidationwithsignedinteger1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedBoolean](#minimumvalidationwithsignedinteger1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedNumber](#minimumvalidationwithsignedinteger1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedString](#minimumvalidationwithsignedinteger1boxedstring)<br> boxed class to store validated String payloads |
| record | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedList](#minimumvalidationwithsignedinteger1boxedlist)<br> boxed class to store validated List payloads |
| record | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedMap](#minimumvalidationwithsignedinteger1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1](#minimumvalidationwithsignedinteger1)<br> schema class |

## MinimumValidationWithSignedInteger1Boxed
public sealed interface MinimumValidationWithSignedInteger1Boxed<br>
permits<br>
[MinimumValidationWithSignedInteger1BoxedVoid](#minimumvalidationwithsignedinteger1boxedvoid),
[MinimumValidationWithSignedInteger1BoxedBoolean](#minimumvalidationwithsignedinteger1boxedboolean),
[MinimumValidationWithSignedInteger1BoxedNumber](#minimumvalidationwithsignedinteger1boxednumber),
[MinimumValidationWithSignedInteger1BoxedString](#minimumvalidationwithsignedinteger1boxedstring),
[MinimumValidationWithSignedInteger1BoxedList](#minimumvalidationwithsignedinteger1boxedlist),
[MinimumValidationWithSignedInteger1BoxedMap](#minimumvalidationwithsignedinteger1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MinimumValidationWithSignedInteger1BoxedVoid
public record MinimumValidationWithSignedInteger1BoxedVoid<br>
implements [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedBoolean
public record MinimumValidationWithSignedInteger1BoxedBoolean<br>
implements [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedNumber
public record MinimumValidationWithSignedInteger1BoxedNumber<br>
implements [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedString
public record MinimumValidationWithSignedInteger1BoxedString<br>
implements [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedList
public record MinimumValidationWithSignedInteger1BoxedList<br>
implements [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedMap
public record MinimumValidationWithSignedInteger1BoxedMap<br>
implements [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinimumValidationWithSignedInteger1
public static class MinimumValidationWithSignedInteger1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | minimum = -2 |

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
| [MinimumValidationWithSignedInteger1BoxedString](#minimumvalidationwithsignedinteger1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MinimumValidationWithSignedInteger1BoxedVoid](#minimumvalidationwithsignedinteger1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MinimumValidationWithSignedInteger1BoxedNumber](#minimumvalidationwithsignedinteger1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MinimumValidationWithSignedInteger1BoxedBoolean](#minimumvalidationwithsignedinteger1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MinimumValidationWithSignedInteger1BoxedMap](#minimumvalidationwithsignedinteger1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MinimumValidationWithSignedInteger1BoxedList](#minimumvalidationwithsignedinteger1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
