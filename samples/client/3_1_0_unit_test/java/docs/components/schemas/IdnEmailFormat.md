# IdnEmailFormat
unit_test_api.components.schemas.IdnEmailFormat.java
public class IdnEmailFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IdnEmailFormat.IdnEmailFormat1Boxed](#idnemailformat1boxed)<br> sealed interface for validated payloads |
| record | [IdnEmailFormat.IdnEmailFormat1BoxedVoid](#idnemailformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IdnEmailFormat.IdnEmailFormat1BoxedBoolean](#idnemailformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IdnEmailFormat.IdnEmailFormat1BoxedNumber](#idnemailformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IdnEmailFormat.IdnEmailFormat1BoxedString](#idnemailformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [IdnEmailFormat.IdnEmailFormat1BoxedList](#idnemailformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [IdnEmailFormat.IdnEmailFormat1BoxedMap](#idnemailformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IdnEmailFormat.IdnEmailFormat1](#idnemailformat1)<br> schema class |

## IdnEmailFormat1Boxed
public sealed interface IdnEmailFormat1Boxed<br>
permits<br>
[IdnEmailFormat1BoxedVoid](#idnemailformat1boxedvoid),
[IdnEmailFormat1BoxedBoolean](#idnemailformat1boxedboolean),
[IdnEmailFormat1BoxedNumber](#idnemailformat1boxednumber),
[IdnEmailFormat1BoxedString](#idnemailformat1boxedstring),
[IdnEmailFormat1BoxedList](#idnemailformat1boxedlist),
[IdnEmailFormat1BoxedMap](#idnemailformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IdnEmailFormat1BoxedVoid
public record IdnEmailFormat1BoxedVoid<br>
implements [IdnEmailFormat1Boxed](#idnemailformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IdnEmailFormat1BoxedBoolean
public record IdnEmailFormat1BoxedBoolean<br>
implements [IdnEmailFormat1Boxed](#idnemailformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IdnEmailFormat1BoxedNumber
public record IdnEmailFormat1BoxedNumber<br>
implements [IdnEmailFormat1Boxed](#idnemailformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IdnEmailFormat1BoxedString
public record IdnEmailFormat1BoxedString<br>
implements [IdnEmailFormat1Boxed](#idnemailformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IdnEmailFormat1BoxedList
public record IdnEmailFormat1BoxedList<br>
implements [IdnEmailFormat1Boxed](#idnemailformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IdnEmailFormat1BoxedMap
public record IdnEmailFormat1BoxedMap<br>
implements [IdnEmailFormat1Boxed](#idnemailformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IdnEmailFormat1
public static class IdnEmailFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "idn-email"; |

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
| [IdnEmailFormat1BoxedString](#idnemailformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IdnEmailFormat1BoxedVoid](#idnemailformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IdnEmailFormat1BoxedNumber](#idnemailformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IdnEmailFormat1BoxedBoolean](#idnemailformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IdnEmailFormat1BoxedMap](#idnemailformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IdnEmailFormat1BoxedList](#idnemailformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IdnEmailFormat1Boxed](#idnemailformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
