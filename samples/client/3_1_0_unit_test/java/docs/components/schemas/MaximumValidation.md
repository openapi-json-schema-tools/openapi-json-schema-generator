# MaximumValidation
org.openapijsonschematools.client.components.schemas.MaximumValidation.java
public class MaximumValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MaximumValidation.MaximumValidation1Boxed](#maximumvalidation1boxed)<br> sealed interface for validated payloads |
| record | [MaximumValidation.MaximumValidation1BoxedVoid](#maximumvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MaximumValidation.MaximumValidation1BoxedBoolean](#maximumvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MaximumValidation.MaximumValidation1BoxedNumber](#maximumvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MaximumValidation.MaximumValidation1BoxedString](#maximumvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [MaximumValidation.MaximumValidation1BoxedList](#maximumvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [MaximumValidation.MaximumValidation1BoxedMap](#maximumvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaximumValidation.MaximumValidation1](#maximumvalidation1)<br> schema class |

## MaximumValidation1Boxed
public sealed interface MaximumValidation1Boxed<br>
permits<br>
[MaximumValidation1BoxedVoid](#maximumvalidation1boxedvoid),
[MaximumValidation1BoxedBoolean](#maximumvalidation1boxedboolean),
[MaximumValidation1BoxedNumber](#maximumvalidation1boxednumber),
[MaximumValidation1BoxedString](#maximumvalidation1boxedstring),
[MaximumValidation1BoxedList](#maximumvalidation1boxedlist),
[MaximumValidation1BoxedMap](#maximumvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MaximumValidation1BoxedVoid
public record MaximumValidation1BoxedVoid<br>
implements [MaximumValidation1Boxed](#maximumvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaximumValidation1BoxedBoolean
public record MaximumValidation1BoxedBoolean<br>
implements [MaximumValidation1Boxed](#maximumvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaximumValidation1BoxedNumber
public record MaximumValidation1BoxedNumber<br>
implements [MaximumValidation1Boxed](#maximumvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaximumValidation1BoxedString
public record MaximumValidation1BoxedString<br>
implements [MaximumValidation1Boxed](#maximumvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaximumValidation1BoxedList
public record MaximumValidation1BoxedList<br>
implements [MaximumValidation1Boxed](#maximumvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaximumValidation1BoxedMap
public record MaximumValidation1BoxedMap<br>
implements [MaximumValidation1Boxed](#maximumvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaximumValidation1
public static class MaximumValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | maximum = 3.0 |

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
| [MaximumValidation1BoxedString](#maximumvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MaximumValidation1BoxedVoid](#maximumvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MaximumValidation1BoxedNumber](#maximumvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MaximumValidation1BoxedBoolean](#maximumvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MaximumValidation1BoxedMap](#maximumvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MaximumValidation1BoxedList](#maximumvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MaximumValidation1Boxed](#maximumvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
