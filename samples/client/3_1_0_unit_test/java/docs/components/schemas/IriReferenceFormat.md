# IriReferenceFormat
unit_test_api.components.schemas.IriReferenceFormat.java
public class IriReferenceFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IriReferenceFormat.IriReferenceFormat1Boxed](#irireferenceformat1boxed)<br> sealed interface for validated payloads |
| record | [IriReferenceFormat.IriReferenceFormat1BoxedVoid](#irireferenceformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IriReferenceFormat.IriReferenceFormat1BoxedBoolean](#irireferenceformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IriReferenceFormat.IriReferenceFormat1BoxedNumber](#irireferenceformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IriReferenceFormat.IriReferenceFormat1BoxedString](#irireferenceformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [IriReferenceFormat.IriReferenceFormat1BoxedList](#irireferenceformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [IriReferenceFormat.IriReferenceFormat1BoxedMap](#irireferenceformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IriReferenceFormat.IriReferenceFormat1](#irireferenceformat1)<br> schema class |

## IriReferenceFormat1Boxed
public sealed interface IriReferenceFormat1Boxed<br>
permits<br>
[IriReferenceFormat1BoxedVoid](#irireferenceformat1boxedvoid),
[IriReferenceFormat1BoxedBoolean](#irireferenceformat1boxedboolean),
[IriReferenceFormat1BoxedNumber](#irireferenceformat1boxednumber),
[IriReferenceFormat1BoxedString](#irireferenceformat1boxedstring),
[IriReferenceFormat1BoxedList](#irireferenceformat1boxedlist),
[IriReferenceFormat1BoxedMap](#irireferenceformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IriReferenceFormat1BoxedVoid
public record IriReferenceFormat1BoxedVoid<br>
implements [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IriReferenceFormat1BoxedBoolean
public record IriReferenceFormat1BoxedBoolean<br>
implements [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IriReferenceFormat1BoxedNumber
public record IriReferenceFormat1BoxedNumber<br>
implements [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IriReferenceFormat1BoxedString
public record IriReferenceFormat1BoxedString<br>
implements [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IriReferenceFormat1BoxedList
public record IriReferenceFormat1BoxedList<br>
implements [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IriReferenceFormat1BoxedMap
public record IriReferenceFormat1BoxedMap<br>
implements [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IriReferenceFormat1
public static class IriReferenceFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "iri-reference"; |

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
| [IriReferenceFormat1BoxedString](#irireferenceformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IriReferenceFormat1BoxedVoid](#irireferenceformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IriReferenceFormat1BoxedNumber](#irireferenceformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IriReferenceFormat1BoxedBoolean](#irireferenceformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IriReferenceFormat1BoxedMap](#irireferenceformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IriReferenceFormat1BoxedList](#irireferenceformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IriReferenceFormat1Boxed](#irireferenceformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
