# MinimumValidationWithSignedInteger
org.openapijsonschematools.client.components.schemas.MinimumValidationWithSignedInteger.java
public class MinimumValidationWithSignedInteger<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)<br> abstract sealed validated payload class |
| static class | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedVoid](#minimumvalidationwithsignedinteger1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedBoolean](#minimumvalidationwithsignedinteger1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedNumber](#minimumvalidationwithsignedinteger1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedString](#minimumvalidationwithsignedinteger1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedList](#minimumvalidationwithsignedinteger1boxedlist)<br> boxed class to store validated List payloads |
| static class | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedMap](#minimumvalidationwithsignedinteger1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1](#minimumvalidationwithsignedinteger1)<br> schema class |

## MinimumValidationWithSignedInteger1Boxed
public static abstract sealed class MinimumValidationWithSignedInteger1Boxed<br>
permits<br>
[MinimumValidationWithSignedInteger1BoxedVoid](#minimumvalidationwithsignedinteger1boxedvoid),
[MinimumValidationWithSignedInteger1BoxedBoolean](#minimumvalidationwithsignedinteger1boxedboolean),
[MinimumValidationWithSignedInteger1BoxedNumber](#minimumvalidationwithsignedinteger1boxednumber),
[MinimumValidationWithSignedInteger1BoxedString](#minimumvalidationwithsignedinteger1boxedstring),
[MinimumValidationWithSignedInteger1BoxedList](#minimumvalidationwithsignedinteger1boxedlist),
[MinimumValidationWithSignedInteger1BoxedMap](#minimumvalidationwithsignedinteger1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## MinimumValidationWithSignedInteger1BoxedVoid
public static final class MinimumValidationWithSignedInteger1BoxedVoid<br>
extends [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedBoolean
public static final class MinimumValidationWithSignedInteger1BoxedBoolean<br>
extends [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedNumber
public static final class MinimumValidationWithSignedInteger1BoxedNumber<br>
extends [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedString
public static final class MinimumValidationWithSignedInteger1BoxedString<br>
extends [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedList
public static final class MinimumValidationWithSignedInteger1BoxedList<br>
extends [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedMap
public static final class MinimumValidationWithSignedInteger1BoxedMap<br>
extends [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
