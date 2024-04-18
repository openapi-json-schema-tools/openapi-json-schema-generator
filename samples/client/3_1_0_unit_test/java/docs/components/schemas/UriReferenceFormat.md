# UriReferenceFormat
org.openapijsonschematools.client.components.schemas.UriReferenceFormat.java
public class UriReferenceFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UriReferenceFormat.UriReferenceFormat1Boxed](#urireferenceformat1boxed)<br> sealed interface for validated payloads |
| record | [UriReferenceFormat.UriReferenceFormat1BoxedVoid](#urireferenceformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UriReferenceFormat.UriReferenceFormat1BoxedBoolean](#urireferenceformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UriReferenceFormat.UriReferenceFormat1BoxedNumber](#urireferenceformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UriReferenceFormat.UriReferenceFormat1BoxedString](#urireferenceformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [UriReferenceFormat.UriReferenceFormat1BoxedList](#urireferenceformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [UriReferenceFormat.UriReferenceFormat1BoxedMap](#urireferenceformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UriReferenceFormat.UriReferenceFormat1](#urireferenceformat1)<br> schema class |

## UriReferenceFormat1Boxed
public sealed interface UriReferenceFormat1Boxed<br>
permits<br>
[UriReferenceFormat1BoxedVoid](#urireferenceformat1boxedvoid),
[UriReferenceFormat1BoxedBoolean](#urireferenceformat1boxedboolean),
[UriReferenceFormat1BoxedNumber](#urireferenceformat1boxednumber),
[UriReferenceFormat1BoxedString](#urireferenceformat1boxedstring),
[UriReferenceFormat1BoxedList](#urireferenceformat1boxedlist),
[UriReferenceFormat1BoxedMap](#urireferenceformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UriReferenceFormat1BoxedVoid
public record UriReferenceFormat1BoxedVoid<br>
implements [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriReferenceFormat1BoxedBoolean
public record UriReferenceFormat1BoxedBoolean<br>
implements [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriReferenceFormat1BoxedNumber
public record UriReferenceFormat1BoxedNumber<br>
implements [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriReferenceFormat1BoxedString
public record UriReferenceFormat1BoxedString<br>
implements [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriReferenceFormat1BoxedList
public record UriReferenceFormat1BoxedList<br>
implements [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriReferenceFormat1BoxedMap
public record UriReferenceFormat1BoxedMap<br>
implements [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UriReferenceFormat1
public static class UriReferenceFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "uri-reference"; |

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
| [UriReferenceFormat1BoxedString](#urireferenceformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UriReferenceFormat1BoxedVoid](#urireferenceformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UriReferenceFormat1BoxedNumber](#urireferenceformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UriReferenceFormat1BoxedBoolean](#urireferenceformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UriReferenceFormat1BoxedMap](#urireferenceformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UriReferenceFormat1BoxedList](#urireferenceformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [UriReferenceFormat1Boxed](#urireferenceformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
