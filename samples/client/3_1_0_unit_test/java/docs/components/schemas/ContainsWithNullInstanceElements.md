# ContainsWithNullInstanceElements
org.openapijsonschematools.client.components.schemas.ContainsWithNullInstanceElements.java
public class ContainsWithNullInstanceElements<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)<br> sealed interface for validated payloads |
| record | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedVoid](#containswithnullinstanceelements1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedBoolean](#containswithnullinstanceelements1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedNumber](#containswithnullinstanceelements1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedString](#containswithnullinstanceelements1boxedstring)<br> boxed class to store validated String payloads |
| record | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedList](#containswithnullinstanceelements1boxedlist)<br> boxed class to store validated List payloads |
| record | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedMap](#containswithnullinstanceelements1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1](#containswithnullinstanceelements1)<br> schema class |
| sealed interface | [ContainsWithNullInstanceElements.ContainsBoxed](#containsboxed)<br> sealed interface for validated payloads |
| record | [ContainsWithNullInstanceElements.ContainsBoxedVoid](#containsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ContainsWithNullInstanceElements.Contains](#contains)<br> schema class |

## ContainsWithNullInstanceElements1Boxed
public sealed interface ContainsWithNullInstanceElements1Boxed<br>
permits<br>
[ContainsWithNullInstanceElements1BoxedVoid](#containswithnullinstanceelements1boxedvoid),
[ContainsWithNullInstanceElements1BoxedBoolean](#containswithnullinstanceelements1boxedboolean),
[ContainsWithNullInstanceElements1BoxedNumber](#containswithnullinstanceelements1boxednumber),
[ContainsWithNullInstanceElements1BoxedString](#containswithnullinstanceelements1boxedstring),
[ContainsWithNullInstanceElements1BoxedList](#containswithnullinstanceelements1boxedlist),
[ContainsWithNullInstanceElements1BoxedMap](#containswithnullinstanceelements1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ContainsWithNullInstanceElements1BoxedVoid
public record ContainsWithNullInstanceElements1BoxedVoid<br>
implements [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsWithNullInstanceElements1BoxedBoolean
public record ContainsWithNullInstanceElements1BoxedBoolean<br>
implements [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsWithNullInstanceElements1BoxedNumber
public record ContainsWithNullInstanceElements1BoxedNumber<br>
implements [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsWithNullInstanceElements1BoxedString
public record ContainsWithNullInstanceElements1BoxedString<br>
implements [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsWithNullInstanceElements1BoxedList
public record ContainsWithNullInstanceElements1BoxedList<br>
implements [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsWithNullInstanceElements1BoxedMap
public record ContainsWithNullInstanceElements1BoxedMap<br>
implements [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsWithNullInstanceElements1
public static class ContainsWithNullInstanceElements1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | contains = [Contains.class](#contains) |

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
| [ContainsWithNullInstanceElements1BoxedString](#containswithnullinstanceelements1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ContainsWithNullInstanceElements1BoxedVoid](#containswithnullinstanceelements1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ContainsWithNullInstanceElements1BoxedNumber](#containswithnullinstanceelements1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ContainsWithNullInstanceElements1BoxedBoolean](#containswithnullinstanceelements1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ContainsWithNullInstanceElements1BoxedMap](#containswithnullinstanceelements1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ContainsWithNullInstanceElements1BoxedList](#containswithnullinstanceelements1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ContainsBoxed
public sealed interface ContainsBoxed<br>
permits<br>
[ContainsBoxedVoid](#containsboxedvoid)

sealed interface that stores validated payloads using boxed classes

## ContainsBoxedVoid
public record ContainsBoxedVoid<br>
implements [ContainsBoxed](#containsboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Contains
public static class Contains<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
