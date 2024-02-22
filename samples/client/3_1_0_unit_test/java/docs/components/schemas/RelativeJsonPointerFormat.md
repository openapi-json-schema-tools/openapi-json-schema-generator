# RelativeJsonPointerFormat
org.openapijsonschematools.client.components.schemas.RelativeJsonPointerFormat.java
public class RelativeJsonPointerFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)<br> sealed interface for validated payloads |
| record | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedVoid](#relativejsonpointerformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedBoolean](#relativejsonpointerformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedNumber](#relativejsonpointerformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedString](#relativejsonpointerformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedList](#relativejsonpointerformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedMap](#relativejsonpointerformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1](#relativejsonpointerformat1)<br> schema class |

## RelativeJsonPointerFormat1Boxed
public sealed interface RelativeJsonPointerFormat1Boxed<br>
permits<br>
[RelativeJsonPointerFormat1BoxedVoid](#relativejsonpointerformat1boxedvoid),
[RelativeJsonPointerFormat1BoxedBoolean](#relativejsonpointerformat1boxedboolean),
[RelativeJsonPointerFormat1BoxedNumber](#relativejsonpointerformat1boxednumber),
[RelativeJsonPointerFormat1BoxedString](#relativejsonpointerformat1boxedstring),
[RelativeJsonPointerFormat1BoxedList](#relativejsonpointerformat1boxedlist),
[RelativeJsonPointerFormat1BoxedMap](#relativejsonpointerformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RelativeJsonPointerFormat1BoxedVoid
public record RelativeJsonPointerFormat1BoxedVoid<br>
implements [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RelativeJsonPointerFormat1BoxedBoolean
public record RelativeJsonPointerFormat1BoxedBoolean<br>
implements [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RelativeJsonPointerFormat1BoxedNumber
public record RelativeJsonPointerFormat1BoxedNumber<br>
implements [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RelativeJsonPointerFormat1BoxedString
public record RelativeJsonPointerFormat1BoxedString<br>
implements [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RelativeJsonPointerFormat1BoxedList
public record RelativeJsonPointerFormat1BoxedList<br>
implements [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RelativeJsonPointerFormat1BoxedMap
public record RelativeJsonPointerFormat1BoxedMap<br>
implements [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RelativeJsonPointerFormat1
public static class RelativeJsonPointerFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "relative-json-pointer"; |

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
| [RelativeJsonPointerFormat1BoxedString](#relativejsonpointerformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RelativeJsonPointerFormat1BoxedVoid](#relativejsonpointerformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [RelativeJsonPointerFormat1BoxedNumber](#relativejsonpointerformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [RelativeJsonPointerFormat1BoxedBoolean](#relativejsonpointerformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [RelativeJsonPointerFormat1BoxedMap](#relativejsonpointerformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [RelativeJsonPointerFormat1BoxedList](#relativejsonpointerformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
