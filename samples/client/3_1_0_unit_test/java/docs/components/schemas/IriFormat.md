# IriFormat
org.openapijsonschematools.client.components.schemas.IriFormat.java
public class IriFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IriFormat.IriFormat1Boxed](#iriformat1boxed)<br> sealed interface for validated payloads |
| record | [IriFormat.IriFormat1BoxedVoid](#iriformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IriFormat.IriFormat1BoxedBoolean](#iriformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IriFormat.IriFormat1BoxedNumber](#iriformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IriFormat.IriFormat1BoxedString](#iriformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [IriFormat.IriFormat1BoxedList](#iriformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [IriFormat.IriFormat1BoxedMap](#iriformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IriFormat.IriFormat1](#iriformat1)<br> schema class |

## IriFormat1Boxed
public sealed interface IriFormat1Boxed<br>
permits<br>
[IriFormat1BoxedVoid](#iriformat1boxedvoid),
[IriFormat1BoxedBoolean](#iriformat1boxedboolean),
[IriFormat1BoxedNumber](#iriformat1boxednumber),
[IriFormat1BoxedString](#iriformat1boxedstring),
[IriFormat1BoxedList](#iriformat1boxedlist),
[IriFormat1BoxedMap](#iriformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IriFormat1BoxedVoid
public record IriFormat1BoxedVoid<br>
implements [IriFormat1Boxed](#iriformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IriFormat1BoxedBoolean
public record IriFormat1BoxedBoolean<br>
implements [IriFormat1Boxed](#iriformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IriFormat1BoxedNumber
public record IriFormat1BoxedNumber<br>
implements [IriFormat1Boxed](#iriformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IriFormat1BoxedString
public record IriFormat1BoxedString<br>
implements [IriFormat1Boxed](#iriformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IriFormat1BoxedList
public record IriFormat1BoxedList<br>
implements [IriFormat1Boxed](#iriformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IriFormat1BoxedMap
public record IriFormat1BoxedMap<br>
implements [IriFormat1Boxed](#iriformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IriFormat1
public static class IriFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "iri"; |

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
| [IriFormat1BoxedString](#iriformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IriFormat1BoxedVoid](#iriformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IriFormat1BoxedNumber](#iriformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IriFormat1BoxedBoolean](#iriformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IriFormat1BoxedMap](#iriformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IriFormat1BoxedList](#iriformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IriFormat1Boxed](#iriformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
