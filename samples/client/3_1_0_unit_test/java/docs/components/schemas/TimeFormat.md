# TimeFormat
org.openapijsonschematools.client.components.schemas.TimeFormat.java
public class TimeFormat

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [TimeFormat.TimeFormat1Boxed](#timeformat1boxed)<br> abstract sealed validated payload class |
| static class | [TimeFormat.TimeFormat1BoxedVoid](#timeformat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [TimeFormat.TimeFormat1BoxedBoolean](#timeformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [TimeFormat.TimeFormat1BoxedNumber](#timeformat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [TimeFormat.TimeFormat1BoxedString](#timeformat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [TimeFormat.TimeFormat1BoxedList](#timeformat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [TimeFormat.TimeFormat1BoxedMap](#timeformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [TimeFormat.TimeFormat1](#timeformat1)<br> schema class |

## TimeFormat1Boxed
public static abstract sealed class TimeFormat1Boxed<br>
permits<br>
[TimeFormat1BoxedVoid](#timeformat1boxedvoid),
[TimeFormat1BoxedBoolean](#timeformat1boxedboolean),
[TimeFormat1BoxedNumber](#timeformat1boxednumber),
[TimeFormat1BoxedString](#timeformat1boxedstring),
[TimeFormat1BoxedList](#timeformat1boxedlist),
[TimeFormat1BoxedMap](#timeformat1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## TimeFormat1BoxedVoid
public static final class TimeFormat1BoxedVoid<br>
extends [TimeFormat1Boxed](#timeformat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## TimeFormat1BoxedBoolean
public static final class TimeFormat1BoxedBoolean<br>
extends [TimeFormat1Boxed](#timeformat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## TimeFormat1BoxedNumber
public static final class TimeFormat1BoxedNumber<br>
extends [TimeFormat1Boxed](#timeformat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## TimeFormat1BoxedString
public static final class TimeFormat1BoxedString<br>
extends [TimeFormat1Boxed](#timeformat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## TimeFormat1BoxedList
public static final class TimeFormat1BoxedList<br>
extends [TimeFormat1Boxed](#timeformat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## TimeFormat1BoxedMap
public static final class TimeFormat1BoxedMap<br>
extends [TimeFormat1Boxed](#timeformat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
