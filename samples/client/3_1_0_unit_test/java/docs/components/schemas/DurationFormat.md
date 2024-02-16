# DurationFormat
org.openapijsonschematools.client.components.schemas.DurationFormat.java
public class DurationFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [DurationFormat.DurationFormat1Boxed](#durationformat1boxed)<br> abstract sealed validated payload class |
| static class | [DurationFormat.DurationFormat1BoxedVoid](#durationformat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [DurationFormat.DurationFormat1BoxedBoolean](#durationformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [DurationFormat.DurationFormat1BoxedNumber](#durationformat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [DurationFormat.DurationFormat1BoxedString](#durationformat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [DurationFormat.DurationFormat1BoxedList](#durationformat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [DurationFormat.DurationFormat1BoxedMap](#durationformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [DurationFormat.DurationFormat1](#durationformat1)<br> schema class |

## DurationFormat1Boxed
public static abstract sealed class DurationFormat1Boxed<br>
permits<br>
[DurationFormat1BoxedVoid](#durationformat1boxedvoid),
[DurationFormat1BoxedBoolean](#durationformat1boxedboolean),
[DurationFormat1BoxedNumber](#durationformat1boxednumber),
[DurationFormat1BoxedString](#durationformat1boxedstring),
[DurationFormat1BoxedList](#durationformat1boxedlist),
[DurationFormat1BoxedMap](#durationformat1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## DurationFormat1BoxedVoid
public static final class DurationFormat1BoxedVoid<br>
extends [DurationFormat1Boxed](#durationformat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DurationFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## DurationFormat1BoxedBoolean
public static final class DurationFormat1BoxedBoolean<br>
extends [DurationFormat1Boxed](#durationformat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DurationFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## DurationFormat1BoxedNumber
public static final class DurationFormat1BoxedNumber<br>
extends [DurationFormat1Boxed](#durationformat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DurationFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## DurationFormat1BoxedString
public static final class DurationFormat1BoxedString<br>
extends [DurationFormat1Boxed](#durationformat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DurationFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## DurationFormat1BoxedList
public static final class DurationFormat1BoxedList<br>
extends [DurationFormat1Boxed](#durationformat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DurationFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## DurationFormat1BoxedMap
public static final class DurationFormat1BoxedMap<br>
extends [DurationFormat1Boxed](#durationformat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DurationFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## DurationFormat1
public static class DurationFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "duration"; |

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
| [DurationFormat1BoxedString](#durationformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DurationFormat1BoxedVoid](#durationformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [DurationFormat1BoxedNumber](#durationformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [DurationFormat1BoxedBoolean](#durationformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [DurationFormat1BoxedMap](#durationformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [DurationFormat1BoxedList](#durationformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
