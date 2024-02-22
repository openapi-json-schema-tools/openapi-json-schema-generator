# DateTimeFormat
org.openapijsonschematools.client.components.schemas.DateTimeFormat.java
public class DateTimeFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [DateTimeFormat.DateTimeFormat1Boxed](#datetimeformat1boxed)<br> sealed interface for validated payloads |
| record | [DateTimeFormat.DateTimeFormat1BoxedVoid](#datetimeformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [DateTimeFormat.DateTimeFormat1BoxedBoolean](#datetimeformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DateTimeFormat.DateTimeFormat1BoxedNumber](#datetimeformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [DateTimeFormat.DateTimeFormat1BoxedString](#datetimeformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [DateTimeFormat.DateTimeFormat1BoxedList](#datetimeformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [DateTimeFormat.DateTimeFormat1BoxedMap](#datetimeformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [DateTimeFormat.DateTimeFormat1](#datetimeformat1)<br> schema class |

## DateTimeFormat1Boxed
public sealed interface DateTimeFormat1Boxed<br>
permits<br>
[DateTimeFormat1BoxedVoid](#datetimeformat1boxedvoid),
[DateTimeFormat1BoxedBoolean](#datetimeformat1boxedboolean),
[DateTimeFormat1BoxedNumber](#datetimeformat1boxednumber),
[DateTimeFormat1BoxedString](#datetimeformat1boxedstring),
[DateTimeFormat1BoxedList](#datetimeformat1boxedlist),
[DateTimeFormat1BoxedMap](#datetimeformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## DateTimeFormat1BoxedVoid
public record DateTimeFormat1BoxedVoid<br>
implements [DateTimeFormat1Boxed](#datetimeformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateTimeFormat1BoxedBoolean
public record DateTimeFormat1BoxedBoolean<br>
implements [DateTimeFormat1Boxed](#datetimeformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateTimeFormat1BoxedNumber
public record DateTimeFormat1BoxedNumber<br>
implements [DateTimeFormat1Boxed](#datetimeformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateTimeFormat1BoxedString
public record DateTimeFormat1BoxedString<br>
implements [DateTimeFormat1Boxed](#datetimeformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateTimeFormat1BoxedList
public record DateTimeFormat1BoxedList<br>
implements [DateTimeFormat1Boxed](#datetimeformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateTimeFormat1BoxedMap
public record DateTimeFormat1BoxedMap<br>
implements [DateTimeFormat1Boxed](#datetimeformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateTimeFormat1
public static class DateTimeFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "date-time"; |

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
| [DateTimeFormat1BoxedString](#datetimeformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DateTimeFormat1BoxedVoid](#datetimeformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [DateTimeFormat1BoxedNumber](#datetimeformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [DateTimeFormat1BoxedBoolean](#datetimeformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [DateTimeFormat1BoxedMap](#datetimeformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [DateTimeFormat1BoxedList](#datetimeformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [DateTimeFormat1Boxed](#datetimeformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
