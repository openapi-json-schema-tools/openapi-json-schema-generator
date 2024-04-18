# UuidFormat
unit_test_api.components.schemas.UuidFormat.java
public class UuidFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UuidFormat.UuidFormat1Boxed](#uuidformat1boxed)<br> sealed interface for validated payloads |
| record | [UuidFormat.UuidFormat1BoxedVoid](#uuidformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UuidFormat.UuidFormat1BoxedBoolean](#uuidformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UuidFormat.UuidFormat1BoxedNumber](#uuidformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UuidFormat.UuidFormat1BoxedString](#uuidformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [UuidFormat.UuidFormat1BoxedList](#uuidformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [UuidFormat.UuidFormat1BoxedMap](#uuidformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UuidFormat.UuidFormat1](#uuidformat1)<br> schema class |

## UuidFormat1Boxed
public sealed interface UuidFormat1Boxed<br>
permits<br>
[UuidFormat1BoxedVoid](#uuidformat1boxedvoid),
[UuidFormat1BoxedBoolean](#uuidformat1boxedboolean),
[UuidFormat1BoxedNumber](#uuidformat1boxednumber),
[UuidFormat1BoxedString](#uuidformat1boxedstring),
[UuidFormat1BoxedList](#uuidformat1boxedlist),
[UuidFormat1BoxedMap](#uuidformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UuidFormat1BoxedVoid
public record UuidFormat1BoxedVoid<br>
implements [UuidFormat1Boxed](#uuidformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidFormat1BoxedBoolean
public record UuidFormat1BoxedBoolean<br>
implements [UuidFormat1Boxed](#uuidformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidFormat1BoxedNumber
public record UuidFormat1BoxedNumber<br>
implements [UuidFormat1Boxed](#uuidformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidFormat1BoxedString
public record UuidFormat1BoxedString<br>
implements [UuidFormat1Boxed](#uuidformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidFormat1BoxedList
public record UuidFormat1BoxedList<br>
implements [UuidFormat1Boxed](#uuidformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidFormat1BoxedMap
public record UuidFormat1BoxedMap<br>
implements [UuidFormat1Boxed](#uuidformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [UuidFormat1Boxed](#uuidformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
