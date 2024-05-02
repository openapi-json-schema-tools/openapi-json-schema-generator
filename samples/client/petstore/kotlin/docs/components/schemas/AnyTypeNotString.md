# AnyTypeNotString
org.openapijsonschematools.client.components.schemas.AnyTypeNotString.java
public class AnyTypeNotString<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AnyTypeNotString.AnyTypeNotString1Boxed](#anytypenotstring1boxed)<br> sealed interface for validated payloads |
| record | [AnyTypeNotString.AnyTypeNotString1BoxedVoid](#anytypenotstring1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeNotString.AnyTypeNotString1BoxedBoolean](#anytypenotstring1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeNotString.AnyTypeNotString1BoxedNumber](#anytypenotstring1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeNotString.AnyTypeNotString1BoxedString](#anytypenotstring1boxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeNotString.AnyTypeNotString1BoxedList](#anytypenotstring1boxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeNotString.AnyTypeNotString1BoxedMap](#anytypenotstring1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeNotString.AnyTypeNotString1](#anytypenotstring1)<br> schema class |
| sealed interface | [AnyTypeNotString.NotBoxed](#notboxed)<br> sealed interface for validated payloads |
| record | [AnyTypeNotString.NotBoxedString](#notboxedstring)<br> boxed class to store validated String payloads |
| static class | [AnyTypeNotString.Not](#not)<br> schema class |

## AnyTypeNotString1Boxed
public sealed interface AnyTypeNotString1Boxed<br>
permits<br>
[AnyTypeNotString1BoxedVoid](#anytypenotstring1boxedvoid),
[AnyTypeNotString1BoxedBoolean](#anytypenotstring1boxedboolean),
[AnyTypeNotString1BoxedNumber](#anytypenotstring1boxednumber),
[AnyTypeNotString1BoxedString](#anytypenotstring1boxedstring),
[AnyTypeNotString1BoxedList](#anytypenotstring1boxedlist),
[AnyTypeNotString1BoxedMap](#anytypenotstring1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AnyTypeNotString1BoxedVoid
public record AnyTypeNotString1BoxedVoid<br>
implements [AnyTypeNotString1Boxed](#anytypenotstring1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeNotString1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AnyTypeNotString1BoxedBoolean
public record AnyTypeNotString1BoxedBoolean<br>
implements [AnyTypeNotString1Boxed](#anytypenotstring1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeNotString1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AnyTypeNotString1BoxedNumber
public record AnyTypeNotString1BoxedNumber<br>
implements [AnyTypeNotString1Boxed](#anytypenotstring1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeNotString1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AnyTypeNotString1BoxedString
public record AnyTypeNotString1BoxedString<br>
implements [AnyTypeNotString1Boxed](#anytypenotstring1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeNotString1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AnyTypeNotString1BoxedList
public record AnyTypeNotString1BoxedList<br>
implements [AnyTypeNotString1Boxed](#anytypenotstring1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeNotString1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AnyTypeNotString1BoxedMap
public record AnyTypeNotString1BoxedMap<br>
implements [AnyTypeNotString1Boxed](#anytypenotstring1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeNotString1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AnyTypeNotString1
public static class AnyTypeNotString1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | not = [Not.class](#not) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [AnyTypeNotString1BoxedString](#anytypenotstring1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AnyTypeNotString1BoxedVoid](#anytypenotstring1boxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| [AnyTypeNotString1BoxedNumber](#anytypenotstring1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AnyTypeNotString1BoxedBoolean](#anytypenotstring1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AnyTypeNotString1BoxedMap](#anytypenotstring1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AnyTypeNotString1BoxedList](#anytypenotstring1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [AnyTypeNotString1Boxed](#anytypenotstring1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## NotBoxed
public sealed interface NotBoxed<br>
permits<br>
[NotBoxedString](#notboxedstring)

sealed interface that stores validated payloads using boxed classes

## NotBoxedString
public record NotBoxedString<br>
implements [NotBoxed](#notboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Not
public static class Not<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
