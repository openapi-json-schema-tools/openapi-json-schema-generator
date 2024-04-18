# TimeFormat
org.openapijsonschematools.client.components.schemas.TimeFormat.java
public class TimeFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [TimeFormat.TimeFormat1Boxed](#timeformat1boxed)<br> sealed interface for validated payloads |
| record | [TimeFormat.TimeFormat1BoxedVoid](#timeformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [TimeFormat.TimeFormat1BoxedBoolean](#timeformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [TimeFormat.TimeFormat1BoxedNumber](#timeformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [TimeFormat.TimeFormat1BoxedString](#timeformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [TimeFormat.TimeFormat1BoxedList](#timeformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [TimeFormat.TimeFormat1BoxedMap](#timeformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [TimeFormat.TimeFormat1](#timeformat1)<br> schema class |

## TimeFormat1Boxed
public sealed interface TimeFormat1Boxed<br>
permits<br>
[TimeFormat1BoxedVoid](#timeformat1boxedvoid),
[TimeFormat1BoxedBoolean](#timeformat1boxedboolean),
[TimeFormat1BoxedNumber](#timeformat1boxednumber),
[TimeFormat1BoxedString](#timeformat1boxedstring),
[TimeFormat1BoxedList](#timeformat1boxedlist),
[TimeFormat1BoxedMap](#timeformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## TimeFormat1BoxedVoid
public record TimeFormat1BoxedVoid<br>
implements [TimeFormat1Boxed](#timeformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## TimeFormat1BoxedBoolean
public record TimeFormat1BoxedBoolean<br>
implements [TimeFormat1Boxed](#timeformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## TimeFormat1BoxedNumber
public record TimeFormat1BoxedNumber<br>
implements [TimeFormat1Boxed](#timeformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## TimeFormat1BoxedString
public record TimeFormat1BoxedString<br>
implements [TimeFormat1Boxed](#timeformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## TimeFormat1BoxedList
public record TimeFormat1BoxedList<br>
implements [TimeFormat1Boxed](#timeformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## TimeFormat1BoxedMap
public record TimeFormat1BoxedMap<br>
implements [TimeFormat1Boxed](#timeformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## TimeFormat1
public static class TimeFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "time"; |

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
| [TimeFormat1BoxedString](#timeformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [TimeFormat1BoxedVoid](#timeformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [TimeFormat1BoxedNumber](#timeformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [TimeFormat1BoxedBoolean](#timeformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [TimeFormat1BoxedMap](#timeformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [TimeFormat1BoxedList](#timeformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [TimeFormat1Boxed](#timeformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
