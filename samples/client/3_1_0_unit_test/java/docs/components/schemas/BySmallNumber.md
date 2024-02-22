# BySmallNumber
org.openapijsonschematools.client.components.schemas.BySmallNumber.java
public class BySmallNumber<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [BySmallNumber.BySmallNumber1Boxed](#bysmallnumber1boxed)<br> sealed interface for validated payloads |
| record | [BySmallNumber.BySmallNumber1BoxedVoid](#bysmallnumber1boxedvoid)<br> boxed class to store validated null payloads |
| record | [BySmallNumber.BySmallNumber1BoxedBoolean](#bysmallnumber1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [BySmallNumber.BySmallNumber1BoxedNumber](#bysmallnumber1boxednumber)<br> boxed class to store validated Number payloads |
| record | [BySmallNumber.BySmallNumber1BoxedString](#bysmallnumber1boxedstring)<br> boxed class to store validated String payloads |
| record | [BySmallNumber.BySmallNumber1BoxedList](#bysmallnumber1boxedlist)<br> boxed class to store validated List payloads |
| record | [BySmallNumber.BySmallNumber1BoxedMap](#bysmallnumber1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [BySmallNumber.BySmallNumber1](#bysmallnumber1)<br> schema class |

## BySmallNumber1Boxed
public sealed interface BySmallNumber1Boxed<br>
permits<br>
[BySmallNumber1BoxedVoid](#bysmallnumber1boxedvoid),
[BySmallNumber1BoxedBoolean](#bysmallnumber1boxedboolean),
[BySmallNumber1BoxedNumber](#bysmallnumber1boxednumber),
[BySmallNumber1BoxedString](#bysmallnumber1boxedstring),
[BySmallNumber1BoxedList](#bysmallnumber1boxedlist),
[BySmallNumber1BoxedMap](#bysmallnumber1boxedmap)

sealed interface that stores validated payloads using boxed classes

## BySmallNumber1BoxedVoid
public record BySmallNumber1BoxedVoid<br>
implements [BySmallNumber1Boxed](#bysmallnumber1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BySmallNumber1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BySmallNumber1BoxedBoolean
public record BySmallNumber1BoxedBoolean<br>
implements [BySmallNumber1Boxed](#bysmallnumber1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BySmallNumber1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BySmallNumber1BoxedNumber
public record BySmallNumber1BoxedNumber<br>
implements [BySmallNumber1Boxed](#bysmallnumber1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BySmallNumber1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BySmallNumber1BoxedString
public record BySmallNumber1BoxedString<br>
implements [BySmallNumber1Boxed](#bysmallnumber1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BySmallNumber1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BySmallNumber1BoxedList
public record BySmallNumber1BoxedList<br>
implements [BySmallNumber1Boxed](#bysmallnumber1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BySmallNumber1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BySmallNumber1BoxedMap
public record BySmallNumber1BoxedMap<br>
implements [BySmallNumber1Boxed](#bysmallnumber1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BySmallNumber1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BySmallNumber1
public static class BySmallNumber1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = new BigDecimal("0.00010") |

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
| [BySmallNumber1BoxedString](#bysmallnumber1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [BySmallNumber1BoxedVoid](#bysmallnumber1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [BySmallNumber1BoxedNumber](#bysmallnumber1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [BySmallNumber1BoxedBoolean](#bysmallnumber1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [BySmallNumber1BoxedMap](#bysmallnumber1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [BySmallNumber1BoxedList](#bysmallnumber1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [BySmallNumber1Boxed](#bysmallnumber1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
