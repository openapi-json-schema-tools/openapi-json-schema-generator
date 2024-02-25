# ContainsKeywordValidation
org.openapijsonschematools.client.components.schemas.ContainsKeywordValidation.java
public class ContainsKeywordValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ContainsKeywordValidation.ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)<br> sealed interface for validated payloads |
| record | [ContainsKeywordValidation.ContainsKeywordValidation1BoxedVoid](#containskeywordvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ContainsKeywordValidation.ContainsKeywordValidation1BoxedBoolean](#containskeywordvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ContainsKeywordValidation.ContainsKeywordValidation1BoxedNumber](#containskeywordvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ContainsKeywordValidation.ContainsKeywordValidation1BoxedString](#containskeywordvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [ContainsKeywordValidation.ContainsKeywordValidation1BoxedList](#containskeywordvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [ContainsKeywordValidation.ContainsKeywordValidation1BoxedMap](#containskeywordvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ContainsKeywordValidation.ContainsKeywordValidation1](#containskeywordvalidation1)<br> schema class |
| sealed interface | [ContainsKeywordValidation.ContainsBoxed](#containsboxed)<br> sealed interface for validated payloads |
| record | [ContainsKeywordValidation.ContainsBoxedVoid](#containsboxedvoid)<br> boxed class to store validated null payloads |
| record | [ContainsKeywordValidation.ContainsBoxedBoolean](#containsboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ContainsKeywordValidation.ContainsBoxedNumber](#containsboxednumber)<br> boxed class to store validated Number payloads |
| record | [ContainsKeywordValidation.ContainsBoxedString](#containsboxedstring)<br> boxed class to store validated String payloads |
| record | [ContainsKeywordValidation.ContainsBoxedList](#containsboxedlist)<br> boxed class to store validated List payloads |
| record | [ContainsKeywordValidation.ContainsBoxedMap](#containsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ContainsKeywordValidation.Contains](#contains)<br> schema class |

## ContainsKeywordValidation1Boxed
public sealed interface ContainsKeywordValidation1Boxed<br>
permits<br>
[ContainsKeywordValidation1BoxedVoid](#containskeywordvalidation1boxedvoid),
[ContainsKeywordValidation1BoxedBoolean](#containskeywordvalidation1boxedboolean),
[ContainsKeywordValidation1BoxedNumber](#containskeywordvalidation1boxednumber),
[ContainsKeywordValidation1BoxedString](#containskeywordvalidation1boxedstring),
[ContainsKeywordValidation1BoxedList](#containskeywordvalidation1boxedlist),
[ContainsKeywordValidation1BoxedMap](#containskeywordvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ContainsKeywordValidation1BoxedVoid
public record ContainsKeywordValidation1BoxedVoid<br>
implements [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsKeywordValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsKeywordValidation1BoxedBoolean
public record ContainsKeywordValidation1BoxedBoolean<br>
implements [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsKeywordValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsKeywordValidation1BoxedNumber
public record ContainsKeywordValidation1BoxedNumber<br>
implements [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsKeywordValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsKeywordValidation1BoxedString
public record ContainsKeywordValidation1BoxedString<br>
implements [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsKeywordValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsKeywordValidation1BoxedList
public record ContainsKeywordValidation1BoxedList<br>
implements [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsKeywordValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsKeywordValidation1BoxedMap
public record ContainsKeywordValidation1BoxedMap<br>
implements [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsKeywordValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsKeywordValidation1
public static class ContainsKeywordValidation1<br>
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
| [ContainsKeywordValidation1BoxedString](#containskeywordvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ContainsKeywordValidation1BoxedVoid](#containskeywordvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ContainsKeywordValidation1BoxedNumber](#containskeywordvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ContainsKeywordValidation1BoxedBoolean](#containskeywordvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ContainsKeywordValidation1BoxedMap](#containskeywordvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ContainsKeywordValidation1BoxedList](#containskeywordvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ContainsBoxed
public sealed interface ContainsBoxed<br>
permits<br>
[ContainsBoxedVoid](#containsboxedvoid),
[ContainsBoxedBoolean](#containsboxedboolean),
[ContainsBoxedNumber](#containsboxednumber),
[ContainsBoxedString](#containsboxedstring),
[ContainsBoxedList](#containsboxedlist),
[ContainsBoxedMap](#containsboxedmap)

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

## ContainsBoxedBoolean
public record ContainsBoxedBoolean<br>
implements [ContainsBoxed](#containsboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsBoxedNumber
public record ContainsBoxedNumber<br>
implements [ContainsBoxed](#containsboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsBoxedString
public record ContainsBoxedString<br>
implements [ContainsBoxed](#containsboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsBoxedList
public record ContainsBoxedList<br>
implements [ContainsBoxed](#containsboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ContainsBoxedMap
public record ContainsBoxedMap<br>
implements [ContainsBoxed](#containsboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Contains
public static class Contains<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | minimum = 5 |

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
| [ContainsBoxedString](#containsboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ContainsBoxedVoid](#containsboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ContainsBoxedNumber](#containsboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ContainsBoxedBoolean](#containsboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ContainsBoxedMap](#containsboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ContainsBoxedList](#containsboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ContainsBoxed](#containsboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
