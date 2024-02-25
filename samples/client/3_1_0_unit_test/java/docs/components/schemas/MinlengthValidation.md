# MinlengthValidation
org.openapijsonschematools.client.components.schemas.MinlengthValidation.java
public class MinlengthValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MinlengthValidation.MinlengthValidation1Boxed](#minlengthvalidation1boxed)<br> sealed interface for validated payloads |
| record | [MinlengthValidation.MinlengthValidation1BoxedVoid](#minlengthvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MinlengthValidation.MinlengthValidation1BoxedBoolean](#minlengthvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MinlengthValidation.MinlengthValidation1BoxedNumber](#minlengthvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MinlengthValidation.MinlengthValidation1BoxedString](#minlengthvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [MinlengthValidation.MinlengthValidation1BoxedList](#minlengthvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [MinlengthValidation.MinlengthValidation1BoxedMap](#minlengthvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MinlengthValidation.MinlengthValidation1](#minlengthvalidation1)<br> schema class |

## MinlengthValidation1Boxed
public sealed interface MinlengthValidation1Boxed<br>
permits<br>
[MinlengthValidation1BoxedVoid](#minlengthvalidation1boxedvoid),
[MinlengthValidation1BoxedBoolean](#minlengthvalidation1boxedboolean),
[MinlengthValidation1BoxedNumber](#minlengthvalidation1boxednumber),
[MinlengthValidation1BoxedString](#minlengthvalidation1boxedstring),
[MinlengthValidation1BoxedList](#minlengthvalidation1boxedlist),
[MinlengthValidation1BoxedMap](#minlengthvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MinlengthValidation1BoxedVoid
public record MinlengthValidation1BoxedVoid<br>
implements [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinlengthValidation1BoxedBoolean
public record MinlengthValidation1BoxedBoolean<br>
implements [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinlengthValidation1BoxedNumber
public record MinlengthValidation1BoxedNumber<br>
implements [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinlengthValidation1BoxedString
public record MinlengthValidation1BoxedString<br>
implements [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinlengthValidation1BoxedList
public record MinlengthValidation1BoxedList<br>
implements [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinlengthValidation1BoxedMap
public record MinlengthValidation1BoxedMap<br>
implements [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinlengthValidation1
public static class MinlengthValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minLength = 2 |

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
| [MinlengthValidation1BoxedString](#minlengthvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MinlengthValidation1BoxedVoid](#minlengthvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MinlengthValidation1BoxedNumber](#minlengthvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MinlengthValidation1BoxedBoolean](#minlengthvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MinlengthValidation1BoxedMap](#minlengthvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MinlengthValidation1BoxedList](#minlengthvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MinlengthValidation1Boxed](#minlengthvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
