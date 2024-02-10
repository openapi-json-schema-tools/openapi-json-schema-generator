# ByInt
org.openapijsonschematools.client.components.schemas.ByInt.java
public class ByInt

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ByInt.ByInt1Boxed](#byint1boxed)<br> abstract sealed validated payload class |
| static class | [ByInt.ByInt1BoxedVoid](#byint1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ByInt.ByInt1BoxedBoolean](#byint1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ByInt.ByInt1BoxedNumber](#byint1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ByInt.ByInt1BoxedString](#byint1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ByInt.ByInt1BoxedList](#byint1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ByInt.ByInt1BoxedMap](#byint1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ByInt.ByInt1](#byint1)<br> schema class |

## ByInt1Boxed
public static abstract sealed class ByInt1Boxed<br>
permits<br>
[ByInt1BoxedVoid](#byint1boxedvoid),
[ByInt1BoxedBoolean](#byint1boxedboolean),
[ByInt1BoxedNumber](#byint1boxednumber),
[ByInt1BoxedString](#byint1boxedstring),
[ByInt1BoxedList](#byint1boxedlist),
[ByInt1BoxedMap](#byint1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ByInt1BoxedVoid
public static final class ByInt1BoxedVoid<br>
extends [ByInt1Boxed](#byint1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ByInt1BoxedBoolean
public static final class ByInt1BoxedBoolean<br>
extends [ByInt1Boxed](#byint1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ByInt1BoxedNumber
public static final class ByInt1BoxedNumber<br>
extends [ByInt1Boxed](#byint1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ByInt1BoxedString
public static final class ByInt1BoxedString<br>
extends [ByInt1Boxed](#byint1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ByInt1BoxedList
public static final class ByInt1BoxedList<br>
extends [ByInt1Boxed](#byint1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ByInt1BoxedMap
public static final class ByInt1BoxedMap<br>
extends [ByInt1Boxed](#byint1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
