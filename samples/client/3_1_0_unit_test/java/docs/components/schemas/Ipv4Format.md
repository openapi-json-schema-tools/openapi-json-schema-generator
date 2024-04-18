# Ipv4Format
unit_test_api.components.schemas.Ipv4Format.java
public class Ipv4Format<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Ipv4Format.Ipv4Format1Boxed](#ipv4format1boxed)<br> sealed interface for validated payloads |
| record | [Ipv4Format.Ipv4Format1BoxedVoid](#ipv4format1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Ipv4Format.Ipv4Format1BoxedBoolean](#ipv4format1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Ipv4Format.Ipv4Format1BoxedNumber](#ipv4format1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Ipv4Format.Ipv4Format1BoxedString](#ipv4format1boxedstring)<br> boxed class to store validated String payloads |
| record | [Ipv4Format.Ipv4Format1BoxedList](#ipv4format1boxedlist)<br> boxed class to store validated List payloads |
| record | [Ipv4Format.Ipv4Format1BoxedMap](#ipv4format1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Ipv4Format.Ipv4Format1](#ipv4format1)<br> schema class |

## Ipv4Format1Boxed
public sealed interface Ipv4Format1Boxed<br>
permits<br>
[Ipv4Format1BoxedVoid](#ipv4format1boxedvoid),
[Ipv4Format1BoxedBoolean](#ipv4format1boxedboolean),
[Ipv4Format1BoxedNumber](#ipv4format1boxednumber),
[Ipv4Format1BoxedString](#ipv4format1boxedstring),
[Ipv4Format1BoxedList](#ipv4format1boxedlist),
[Ipv4Format1BoxedMap](#ipv4format1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Ipv4Format1BoxedVoid
public record Ipv4Format1BoxedVoid<br>
implements [Ipv4Format1Boxed](#ipv4format1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv4Format1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Ipv4Format1BoxedBoolean
public record Ipv4Format1BoxedBoolean<br>
implements [Ipv4Format1Boxed](#ipv4format1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv4Format1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Ipv4Format1BoxedNumber
public record Ipv4Format1BoxedNumber<br>
implements [Ipv4Format1Boxed](#ipv4format1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv4Format1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Ipv4Format1BoxedString
public record Ipv4Format1BoxedString<br>
implements [Ipv4Format1Boxed](#ipv4format1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv4Format1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Ipv4Format1BoxedList
public record Ipv4Format1BoxedList<br>
implements [Ipv4Format1Boxed](#ipv4format1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv4Format1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Ipv4Format1BoxedMap
public record Ipv4Format1BoxedMap<br>
implements [Ipv4Format1Boxed](#ipv4format1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv4Format1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Ipv4Format1
public static class Ipv4Format1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "ipv4"; |

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
| [Ipv4Format1BoxedString](#ipv4format1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Ipv4Format1BoxedVoid](#ipv4format1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Ipv4Format1BoxedNumber](#ipv4format1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Ipv4Format1BoxedBoolean](#ipv4format1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Ipv4Format1BoxedMap](#ipv4format1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Ipv4Format1BoxedList](#ipv4format1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Ipv4Format1Boxed](#ipv4format1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
