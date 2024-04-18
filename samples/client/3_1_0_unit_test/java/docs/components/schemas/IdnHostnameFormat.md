# IdnHostnameFormat
unit_test_api.components.schemas.IdnHostnameFormat.java
public class IdnHostnameFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IdnHostnameFormat.IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)<br> sealed interface for validated payloads |
| record | [IdnHostnameFormat.IdnHostnameFormat1BoxedVoid](#idnhostnameformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IdnHostnameFormat.IdnHostnameFormat1BoxedBoolean](#idnhostnameformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IdnHostnameFormat.IdnHostnameFormat1BoxedNumber](#idnhostnameformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IdnHostnameFormat.IdnHostnameFormat1BoxedString](#idnhostnameformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [IdnHostnameFormat.IdnHostnameFormat1BoxedList](#idnhostnameformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [IdnHostnameFormat.IdnHostnameFormat1BoxedMap](#idnhostnameformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IdnHostnameFormat.IdnHostnameFormat1](#idnhostnameformat1)<br> schema class |

## IdnHostnameFormat1Boxed
public sealed interface IdnHostnameFormat1Boxed<br>
permits<br>
[IdnHostnameFormat1BoxedVoid](#idnhostnameformat1boxedvoid),
[IdnHostnameFormat1BoxedBoolean](#idnhostnameformat1boxedboolean),
[IdnHostnameFormat1BoxedNumber](#idnhostnameformat1boxednumber),
[IdnHostnameFormat1BoxedString](#idnhostnameformat1boxedstring),
[IdnHostnameFormat1BoxedList](#idnhostnameformat1boxedlist),
[IdnHostnameFormat1BoxedMap](#idnhostnameformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IdnHostnameFormat1BoxedVoid
public record IdnHostnameFormat1BoxedVoid<br>
implements [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IdnHostnameFormat1BoxedBoolean
public record IdnHostnameFormat1BoxedBoolean<br>
implements [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IdnHostnameFormat1BoxedNumber
public record IdnHostnameFormat1BoxedNumber<br>
implements [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IdnHostnameFormat1BoxedString
public record IdnHostnameFormat1BoxedString<br>
implements [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IdnHostnameFormat1BoxedList
public record IdnHostnameFormat1BoxedList<br>
implements [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IdnHostnameFormat1BoxedMap
public record IdnHostnameFormat1BoxedMap<br>
implements [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IdnHostnameFormat1
public static class IdnHostnameFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "idn-hostname"; |

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
| [IdnHostnameFormat1BoxedString](#idnhostnameformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IdnHostnameFormat1BoxedVoid](#idnhostnameformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IdnHostnameFormat1BoxedNumber](#idnhostnameformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IdnHostnameFormat1BoxedBoolean](#idnhostnameformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IdnHostnameFormat1BoxedMap](#idnhostnameformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IdnHostnameFormat1BoxedList](#idnhostnameformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
