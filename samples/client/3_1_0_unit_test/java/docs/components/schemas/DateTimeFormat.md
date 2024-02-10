# DateTimeFormat
org.openapijsonschematools.client.components.schemas.DateTimeFormat.java
public class DateTimeFormat

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [DateTimeFormat.DateTimeFormat1Boxed](#datetimeformat1boxed)<br> abstract sealed validated payload class |
| static class | [DateTimeFormat.DateTimeFormat1BoxedVoid](#datetimeformat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [DateTimeFormat.DateTimeFormat1BoxedBoolean](#datetimeformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [DateTimeFormat.DateTimeFormat1BoxedNumber](#datetimeformat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [DateTimeFormat.DateTimeFormat1BoxedString](#datetimeformat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [DateTimeFormat.DateTimeFormat1BoxedList](#datetimeformat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [DateTimeFormat.DateTimeFormat1BoxedMap](#datetimeformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [DateTimeFormat.DateTimeFormat1](#datetimeformat1)<br> schema class |

## DateTimeFormat1Boxed
public static abstract sealed class DateTimeFormat1Boxed<br>
permits<br>
[DateTimeFormat1BoxedVoid](#datetimeformat1boxedvoid),
[DateTimeFormat1BoxedBoolean](#datetimeformat1boxedboolean),
[DateTimeFormat1BoxedNumber](#datetimeformat1boxednumber),
[DateTimeFormat1BoxedString](#datetimeformat1boxedstring),
[DateTimeFormat1BoxedList](#datetimeformat1boxedlist),
[DateTimeFormat1BoxedMap](#datetimeformat1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## DateTimeFormat1BoxedVoid
public static final class DateTimeFormat1BoxedVoid<br>
extends [DateTimeFormat1Boxed](#datetimeformat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## DateTimeFormat1BoxedBoolean
public static final class DateTimeFormat1BoxedBoolean<br>
extends [DateTimeFormat1Boxed](#datetimeformat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## DateTimeFormat1BoxedNumber
public static final class DateTimeFormat1BoxedNumber<br>
extends [DateTimeFormat1Boxed](#datetimeformat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## DateTimeFormat1BoxedString
public static final class DateTimeFormat1BoxedString<br>
extends [DateTimeFormat1Boxed](#datetimeformat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## DateTimeFormat1BoxedList
public static final class DateTimeFormat1BoxedList<br>
extends [DateTimeFormat1Boxed](#datetimeformat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## DateTimeFormat1BoxedMap
public static final class DateTimeFormat1BoxedMap<br>
extends [DateTimeFormat1Boxed](#datetimeformat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
