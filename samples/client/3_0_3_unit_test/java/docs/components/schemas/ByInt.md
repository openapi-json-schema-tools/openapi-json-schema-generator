# ByInt
org.openapijsonschematools.client.components.schemas.ByInt.java
public class ByInt<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ByInt.ByInt1Boxed](#byint1boxed)<br> sealed interface for validated payloads |
| record | [ByInt.ByInt1BoxedVoid](#byint1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ByInt.ByInt1BoxedBoolean](#byint1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ByInt.ByInt1BoxedNumber](#byint1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ByInt.ByInt1BoxedString](#byint1boxedstring)<br> boxed class to store validated String payloads |
| record | [ByInt.ByInt1BoxedList](#byint1boxedlist)<br> boxed class to store validated List payloads |
| record | [ByInt.ByInt1BoxedMap](#byint1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ByInt.ByInt1](#byint1)<br> schema class |

## ByInt1Boxed
public sealed interface ByInt1Boxed<br>
permits<br>
[ByInt1BoxedVoid](#byint1boxedvoid),
[ByInt1BoxedBoolean](#byint1boxedboolean),
[ByInt1BoxedNumber](#byint1boxednumber),
[ByInt1BoxedString](#byint1boxedstring),
[ByInt1BoxedList](#byint1boxedlist),
[ByInt1BoxedMap](#byint1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ByInt1BoxedVoid
public record ByInt1BoxedVoid<br>
implements [ByInt1Boxed](#byint1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ByInt1BoxedBoolean
public record ByInt1BoxedBoolean<br>
implements [ByInt1Boxed](#byint1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ByInt1BoxedNumber
public record ByInt1BoxedNumber<br>
implements [ByInt1Boxed](#byint1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ByInt1BoxedString
public record ByInt1BoxedString<br>
implements [ByInt1Boxed](#byint1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ByInt1BoxedList
public record ByInt1BoxedList<br>
implements [ByInt1Boxed](#byint1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ByInt1BoxedMap
public record ByInt1BoxedMap<br>
implements [ByInt1Boxed](#byint1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ByInt1
public static class ByInt1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = new BigDecimal("2") |

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
| [ByInt1BoxedString](#byint1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ByInt1BoxedVoid](#byint1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ByInt1BoxedNumber](#byint1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ByInt1BoxedBoolean](#byint1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ByInt1BoxedMap](#byint1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ByInt1BoxedList](#byint1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ByInt1Boxed](#byint1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
