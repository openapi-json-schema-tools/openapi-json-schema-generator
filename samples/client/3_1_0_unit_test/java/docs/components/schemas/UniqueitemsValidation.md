# UniqueitemsValidation
org.openapijsonschematools.client.components.schemas.UniqueitemsValidation.java
public class UniqueitemsValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UniqueitemsValidation.UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)<br> sealed interface for validated payloads |
| record | [UniqueitemsValidation.UniqueitemsValidation1BoxedVoid](#uniqueitemsvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UniqueitemsValidation.UniqueitemsValidation1BoxedBoolean](#uniqueitemsvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UniqueitemsValidation.UniqueitemsValidation1BoxedNumber](#uniqueitemsvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UniqueitemsValidation.UniqueitemsValidation1BoxedString](#uniqueitemsvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [UniqueitemsValidation.UniqueitemsValidation1BoxedList](#uniqueitemsvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [UniqueitemsValidation.UniqueitemsValidation1BoxedMap](#uniqueitemsvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UniqueitemsValidation.UniqueitemsValidation1](#uniqueitemsvalidation1)<br> schema class |

## UniqueitemsValidation1Boxed
public sealed interface UniqueitemsValidation1Boxed<br>
permits<br>
[UniqueitemsValidation1BoxedVoid](#uniqueitemsvalidation1boxedvoid),
[UniqueitemsValidation1BoxedBoolean](#uniqueitemsvalidation1boxedboolean),
[UniqueitemsValidation1BoxedNumber](#uniqueitemsvalidation1boxednumber),
[UniqueitemsValidation1BoxedString](#uniqueitemsvalidation1boxedstring),
[UniqueitemsValidation1BoxedList](#uniqueitemsvalidation1boxedlist),
[UniqueitemsValidation1BoxedMap](#uniqueitemsvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UniqueitemsValidation1BoxedVoid
public record UniqueitemsValidation1BoxedVoid<br>
implements [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsValidation1BoxedBoolean
public record UniqueitemsValidation1BoxedBoolean<br>
implements [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsValidation1BoxedNumber
public record UniqueitemsValidation1BoxedNumber<br>
implements [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsValidation1BoxedString
public record UniqueitemsValidation1BoxedString<br>
implements [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsValidation1BoxedList
public record UniqueitemsValidation1BoxedList<br>
implements [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsValidation1BoxedMap
public record UniqueitemsValidation1BoxedMap<br>
implements [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsValidation1
public static class UniqueitemsValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Boolean | uniqueItems = true |

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
| [UniqueitemsValidation1BoxedString](#uniqueitemsvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UniqueitemsValidation1BoxedVoid](#uniqueitemsvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UniqueitemsValidation1BoxedNumber](#uniqueitemsvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UniqueitemsValidation1BoxedBoolean](#uniqueitemsvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UniqueitemsValidation1BoxedMap](#uniqueitemsvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UniqueitemsValidation1BoxedList](#uniqueitemsvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
