# UriFormat
org.openapijsonschematools.client.components.schemas.UriFormat.java
public class UriFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UriFormat.UriFormat1Boxed](#uriformat1boxed)<br> sealed interface for validated payloads |
| record | [UriFormat.UriFormat1BoxedVoid](#uriformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UriFormat.UriFormat1BoxedBoolean](#uriformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UriFormat.UriFormat1BoxedNumber](#uriformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UriFormat.UriFormat1BoxedString](#uriformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [UriFormat.UriFormat1BoxedList](#uriformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [UriFormat.UriFormat1BoxedMap](#uriformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UriFormat.UriFormat1](#uriformat1)<br> schema class |

## UriFormat1Boxed
public sealed interface UriFormat1Boxed<br>
permits<br>
[UriFormat1BoxedVoid](#uriformat1boxedvoid),
[UriFormat1BoxedBoolean](#uriformat1boxedboolean),
[UriFormat1BoxedNumber](#uriformat1boxednumber),
[UriFormat1BoxedString](#uriformat1boxedstring),
[UriFormat1BoxedList](#uriformat1boxedlist),
[UriFormat1BoxedMap](#uriformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UriFormat1BoxedVoid
public record UriFormat1BoxedVoid<br>
implements [UriFormat1Boxed](#uriformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriFormat1BoxedBoolean
public record UriFormat1BoxedBoolean<br>
implements [UriFormat1Boxed](#uriformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriFormat1BoxedNumber
public record UriFormat1BoxedNumber<br>
implements [UriFormat1Boxed](#uriformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriFormat1BoxedString
public record UriFormat1BoxedString<br>
implements [UriFormat1Boxed](#uriformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriFormat1BoxedList
public record UriFormat1BoxedList<br>
implements [UriFormat1Boxed](#uriformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriFormat1BoxedMap
public record UriFormat1BoxedMap<br>
implements [UriFormat1Boxed](#uriformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriFormat1
public static class UriFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "uri"; |

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
| [UriFormat1BoxedString](#uriformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UriFormat1BoxedVoid](#uriformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UriFormat1BoxedNumber](#uriformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UriFormat1BoxedBoolean](#uriformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UriFormat1BoxedMap](#uriformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UriFormat1BoxedList](#uriformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [UriFormat1Boxed](#uriformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
