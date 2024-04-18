# JsonPointerFormat
org.openapijsonschematools.client.components.schemas.JsonPointerFormat.java
public class JsonPointerFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [JsonPointerFormat.JsonPointerFormat1Boxed](#jsonpointerformat1boxed)<br> sealed interface for validated payloads |
| record | [JsonPointerFormat.JsonPointerFormat1BoxedVoid](#jsonpointerformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [JsonPointerFormat.JsonPointerFormat1BoxedBoolean](#jsonpointerformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [JsonPointerFormat.JsonPointerFormat1BoxedNumber](#jsonpointerformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [JsonPointerFormat.JsonPointerFormat1BoxedString](#jsonpointerformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [JsonPointerFormat.JsonPointerFormat1BoxedList](#jsonpointerformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [JsonPointerFormat.JsonPointerFormat1BoxedMap](#jsonpointerformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [JsonPointerFormat.JsonPointerFormat1](#jsonpointerformat1)<br> schema class |

## JsonPointerFormat1Boxed
public sealed interface JsonPointerFormat1Boxed<br>
permits<br>
[JsonPointerFormat1BoxedVoid](#jsonpointerformat1boxedvoid),
[JsonPointerFormat1BoxedBoolean](#jsonpointerformat1boxedboolean),
[JsonPointerFormat1BoxedNumber](#jsonpointerformat1boxednumber),
[JsonPointerFormat1BoxedString](#jsonpointerformat1boxedstring),
[JsonPointerFormat1BoxedList](#jsonpointerformat1boxedlist),
[JsonPointerFormat1BoxedMap](#jsonpointerformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## JsonPointerFormat1BoxedVoid
public record JsonPointerFormat1BoxedVoid<br>
implements [JsonPointerFormat1Boxed](#jsonpointerformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JsonPointerFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## JsonPointerFormat1BoxedBoolean
public record JsonPointerFormat1BoxedBoolean<br>
implements [JsonPointerFormat1Boxed](#jsonpointerformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JsonPointerFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## JsonPointerFormat1BoxedNumber
public record JsonPointerFormat1BoxedNumber<br>
implements [JsonPointerFormat1Boxed](#jsonpointerformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JsonPointerFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## JsonPointerFormat1BoxedString
public record JsonPointerFormat1BoxedString<br>
implements [JsonPointerFormat1Boxed](#jsonpointerformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JsonPointerFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## JsonPointerFormat1BoxedList
public record JsonPointerFormat1BoxedList<br>
implements [JsonPointerFormat1Boxed](#jsonpointerformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JsonPointerFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## JsonPointerFormat1BoxedMap
public record JsonPointerFormat1BoxedMap<br>
implements [JsonPointerFormat1Boxed](#jsonpointerformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JsonPointerFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## JsonPointerFormat1
public static class JsonPointerFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "json-pointer"; |

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
| [JsonPointerFormat1BoxedString](#jsonpointerformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [JsonPointerFormat1BoxedVoid](#jsonpointerformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [JsonPointerFormat1BoxedNumber](#jsonpointerformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [JsonPointerFormat1BoxedBoolean](#jsonpointerformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [JsonPointerFormat1BoxedMap](#jsonpointerformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [JsonPointerFormat1BoxedList](#jsonpointerformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [JsonPointerFormat1Boxed](#jsonpointerformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
