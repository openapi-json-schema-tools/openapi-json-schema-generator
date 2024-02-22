# UniqueitemsFalseValidation
org.openapijsonschematools.client.components.schemas.UniqueitemsFalseValidation.java
public class UniqueitemsFalseValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)<br> sealed interface for validated payloads |
| record | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedVoid](#uniqueitemsfalsevalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedBoolean](#uniqueitemsfalsevalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedNumber](#uniqueitemsfalsevalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedString](#uniqueitemsfalsevalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedList](#uniqueitemsfalsevalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedMap](#uniqueitemsfalsevalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1](#uniqueitemsfalsevalidation1)<br> schema class |

## UniqueitemsFalseValidation1Boxed
public sealed interface UniqueitemsFalseValidation1Boxed<br>
permits<br>
[UniqueitemsFalseValidation1BoxedVoid](#uniqueitemsfalsevalidation1boxedvoid),
[UniqueitemsFalseValidation1BoxedBoolean](#uniqueitemsfalsevalidation1boxedboolean),
[UniqueitemsFalseValidation1BoxedNumber](#uniqueitemsfalsevalidation1boxednumber),
[UniqueitemsFalseValidation1BoxedString](#uniqueitemsfalsevalidation1boxedstring),
[UniqueitemsFalseValidation1BoxedList](#uniqueitemsfalsevalidation1boxedlist),
[UniqueitemsFalseValidation1BoxedMap](#uniqueitemsfalsevalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UniqueitemsFalseValidation1BoxedVoid
public record UniqueitemsFalseValidation1BoxedVoid<br>
implements [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsFalseValidation1BoxedBoolean
public record UniqueitemsFalseValidation1BoxedBoolean<br>
implements [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsFalseValidation1BoxedNumber
public record UniqueitemsFalseValidation1BoxedNumber<br>
implements [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsFalseValidation1BoxedString
public record UniqueitemsFalseValidation1BoxedString<br>
implements [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsFalseValidation1BoxedList
public record UniqueitemsFalseValidation1BoxedList<br>
implements [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsFalseValidation1BoxedMap
public record UniqueitemsFalseValidation1BoxedMap<br>
implements [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsFalseValidation1
public static class UniqueitemsFalseValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Boolean | uniqueItems = false |

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
| [UniqueitemsFalseValidation1BoxedString](#uniqueitemsfalsevalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseValidation1BoxedVoid](#uniqueitemsfalsevalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseValidation1BoxedNumber](#uniqueitemsfalsevalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseValidation1BoxedBoolean](#uniqueitemsfalsevalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseValidation1BoxedMap](#uniqueitemsfalsevalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseValidation1BoxedList](#uniqueitemsfalsevalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
