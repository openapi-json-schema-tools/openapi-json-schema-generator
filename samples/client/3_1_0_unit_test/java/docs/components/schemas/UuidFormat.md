# UuidFormat
org.openapijsonschematools.client.components.schemas.UuidFormat.java
public class UuidFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UuidFormat.UuidFormat1Boxed](#uuidformat1boxed)<br> abstract sealed validated payload class |
| static class | [UuidFormat.UuidFormat1BoxedVoid](#uuidformat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [UuidFormat.UuidFormat1BoxedBoolean](#uuidformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UuidFormat.UuidFormat1BoxedNumber](#uuidformat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [UuidFormat.UuidFormat1BoxedString](#uuidformat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [UuidFormat.UuidFormat1BoxedList](#uuidformat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [UuidFormat.UuidFormat1BoxedMap](#uuidformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UuidFormat.UuidFormat1](#uuidformat1)<br> schema class |

## UuidFormat1Boxed
public static abstract sealed class UuidFormat1Boxed<br>
permits<br>
[UuidFormat1BoxedVoid](#uuidformat1boxedvoid),
[UuidFormat1BoxedBoolean](#uuidformat1boxedboolean),
[UuidFormat1BoxedNumber](#uuidformat1boxednumber),
[UuidFormat1BoxedString](#uuidformat1boxedstring),
[UuidFormat1BoxedList](#uuidformat1boxedlist),
[UuidFormat1BoxedMap](#uuidformat1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## UuidFormat1BoxedVoid
public static final class UuidFormat1BoxedVoid<br>
extends [UuidFormat1Boxed](#uuidformat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## UuidFormat1BoxedBoolean
public static final class UuidFormat1BoxedBoolean<br>
extends [UuidFormat1Boxed](#uuidformat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## UuidFormat1BoxedNumber
public static final class UuidFormat1BoxedNumber<br>
extends [UuidFormat1Boxed](#uuidformat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## UuidFormat1BoxedString
public static final class UuidFormat1BoxedString<br>
extends [UuidFormat1Boxed](#uuidformat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## UuidFormat1BoxedList
public static final class UuidFormat1BoxedList<br>
extends [UuidFormat1Boxed](#uuidformat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## UuidFormat1BoxedMap
public static final class UuidFormat1BoxedMap<br>
extends [UuidFormat1Boxed](#uuidformat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## UuidFormat1
public static class UuidFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "uuid"; |

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
| [UuidFormat1BoxedString](#uuidformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UuidFormat1BoxedVoid](#uuidformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UuidFormat1BoxedNumber](#uuidformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UuidFormat1BoxedBoolean](#uuidformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UuidFormat1BoxedMap](#uuidformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UuidFormat1BoxedList](#uuidformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
