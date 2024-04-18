# ByNumber
unit_test_api.components.schemas.ByNumber.java
public class ByNumber<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ByNumber.ByNumber1Boxed](#bynumber1boxed)<br> sealed interface for validated payloads |
| record | [ByNumber.ByNumber1BoxedVoid](#bynumber1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ByNumber.ByNumber1BoxedBoolean](#bynumber1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ByNumber.ByNumber1BoxedNumber](#bynumber1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ByNumber.ByNumber1BoxedString](#bynumber1boxedstring)<br> boxed class to store validated String payloads |
| record | [ByNumber.ByNumber1BoxedList](#bynumber1boxedlist)<br> boxed class to store validated List payloads |
| record | [ByNumber.ByNumber1BoxedMap](#bynumber1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ByNumber.ByNumber1](#bynumber1)<br> schema class |

## ByNumber1Boxed
public sealed interface ByNumber1Boxed<br>
permits<br>
[ByNumber1BoxedVoid](#bynumber1boxedvoid),
[ByNumber1BoxedBoolean](#bynumber1boxedboolean),
[ByNumber1BoxedNumber](#bynumber1boxednumber),
[ByNumber1BoxedString](#bynumber1boxedstring),
[ByNumber1BoxedList](#bynumber1boxedlist),
[ByNumber1BoxedMap](#bynumber1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ByNumber1BoxedVoid
public record ByNumber1BoxedVoid<br>
implements [ByNumber1Boxed](#bynumber1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByNumber1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ByNumber1BoxedBoolean
public record ByNumber1BoxedBoolean<br>
implements [ByNumber1Boxed](#bynumber1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByNumber1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ByNumber1BoxedNumber
public record ByNumber1BoxedNumber<br>
implements [ByNumber1Boxed](#bynumber1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByNumber1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ByNumber1BoxedString
public record ByNumber1BoxedString<br>
implements [ByNumber1Boxed](#bynumber1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByNumber1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ByNumber1BoxedList
public record ByNumber1BoxedList<br>
implements [ByNumber1Boxed](#bynumber1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByNumber1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ByNumber1BoxedMap
public record ByNumber1BoxedMap<br>
implements [ByNumber1Boxed](#bynumber1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByNumber1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ByNumber1
public static class ByNumber1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = new BigDecimal("1.5") |

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
| [ByNumber1BoxedString](#bynumber1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ByNumber1BoxedVoid](#bynumber1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ByNumber1BoxedNumber](#bynumber1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ByNumber1BoxedBoolean](#bynumber1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ByNumber1BoxedMap](#bynumber1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ByNumber1BoxedList](#bynumber1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ByNumber1Boxed](#bynumber1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
