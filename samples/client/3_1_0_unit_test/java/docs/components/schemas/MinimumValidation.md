# MinimumValidation
org.openapijsonschematools.client.components.schemas.MinimumValidation.java
public class MinimumValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MinimumValidation.MinimumValidation1Boxed](#minimumvalidation1boxed)<br> sealed interface for validated payloads |
| record | [MinimumValidation.MinimumValidation1BoxedVoid](#minimumvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MinimumValidation.MinimumValidation1BoxedBoolean](#minimumvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MinimumValidation.MinimumValidation1BoxedNumber](#minimumvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MinimumValidation.MinimumValidation1BoxedString](#minimumvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [MinimumValidation.MinimumValidation1BoxedList](#minimumvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [MinimumValidation.MinimumValidation1BoxedMap](#minimumvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MinimumValidation.MinimumValidation1](#minimumvalidation1)<br> schema class |

## MinimumValidation1Boxed
public sealed interface MinimumValidation1Boxed<br>
permits<br>
[MinimumValidation1BoxedVoid](#minimumvalidation1boxedvoid),
[MinimumValidation1BoxedBoolean](#minimumvalidation1boxedboolean),
[MinimumValidation1BoxedNumber](#minimumvalidation1boxednumber),
[MinimumValidation1BoxedString](#minimumvalidation1boxedstring),
[MinimumValidation1BoxedList](#minimumvalidation1boxedlist),
[MinimumValidation1BoxedMap](#minimumvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MinimumValidation1BoxedVoid
public record MinimumValidation1BoxedVoid<br>
implements [MinimumValidation1Boxed](#minimumvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinimumValidation1BoxedBoolean
public record MinimumValidation1BoxedBoolean<br>
implements [MinimumValidation1Boxed](#minimumvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinimumValidation1BoxedNumber
public record MinimumValidation1BoxedNumber<br>
implements [MinimumValidation1Boxed](#minimumvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinimumValidation1BoxedString
public record MinimumValidation1BoxedString<br>
implements [MinimumValidation1Boxed](#minimumvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinimumValidation1BoxedList
public record MinimumValidation1BoxedList<br>
implements [MinimumValidation1Boxed](#minimumvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinimumValidation1BoxedMap
public record MinimumValidation1BoxedMap<br>
implements [MinimumValidation1Boxed](#minimumvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinimumValidation1
public static class MinimumValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | minimum = 1.1 |

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
| [MinimumValidation1BoxedString](#minimumvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MinimumValidation1BoxedVoid](#minimumvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MinimumValidation1BoxedNumber](#minimumvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MinimumValidation1BoxedBoolean](#minimumvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MinimumValidation1BoxedMap](#minimumvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MinimumValidation1BoxedList](#minimumvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MinimumValidation1Boxed](#minimumvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
