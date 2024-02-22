# DateFormat
org.openapijsonschematools.client.components.schemas.DateFormat.java
public class DateFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [DateFormat.DateFormat1Boxed](#dateformat1boxed)<br> sealed interface for validated payloads |
| record | [DateFormat.DateFormat1BoxedVoid](#dateformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [DateFormat.DateFormat1BoxedBoolean](#dateformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DateFormat.DateFormat1BoxedNumber](#dateformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [DateFormat.DateFormat1BoxedString](#dateformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [DateFormat.DateFormat1BoxedList](#dateformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [DateFormat.DateFormat1BoxedMap](#dateformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [DateFormat.DateFormat1](#dateformat1)<br> schema class |

## DateFormat1Boxed
public sealed interface DateFormat1Boxed<br>
permits<br>
[DateFormat1BoxedVoid](#dateformat1boxedvoid),
[DateFormat1BoxedBoolean](#dateformat1boxedboolean),
[DateFormat1BoxedNumber](#dateformat1boxednumber),
[DateFormat1BoxedString](#dateformat1boxedstring),
[DateFormat1BoxedList](#dateformat1boxedlist),
[DateFormat1BoxedMap](#dateformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## DateFormat1BoxedVoid
public record DateFormat1BoxedVoid<br>
implements [DateFormat1Boxed](#dateformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateFormat1BoxedBoolean
public record DateFormat1BoxedBoolean<br>
implements [DateFormat1Boxed](#dateformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateFormat1BoxedNumber
public record DateFormat1BoxedNumber<br>
implements [DateFormat1Boxed](#dateformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateFormat1BoxedString
public record DateFormat1BoxedString<br>
implements [DateFormat1Boxed](#dateformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateFormat1BoxedList
public record DateFormat1BoxedList<br>
implements [DateFormat1Boxed](#dateformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateFormat1BoxedMap
public record DateFormat1BoxedMap<br>
implements [DateFormat1Boxed](#dateformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateFormat1
public static class DateFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "date"; |

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
| [DateFormat1BoxedString](#dateformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DateFormat1BoxedVoid](#dateformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [DateFormat1BoxedNumber](#dateformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [DateFormat1BoxedBoolean](#dateformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [DateFormat1BoxedMap](#dateformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [DateFormat1BoxedList](#dateformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [DateFormat1Boxed](#dateformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
