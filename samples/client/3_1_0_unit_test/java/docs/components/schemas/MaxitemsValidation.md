# MaxitemsValidation
unit_test_api.components.schemas.MaxitemsValidation.java
public class MaxitemsValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MaxitemsValidation.MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)<br> sealed interface for validated payloads |
| record | [MaxitemsValidation.MaxitemsValidation1BoxedVoid](#maxitemsvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MaxitemsValidation.MaxitemsValidation1BoxedBoolean](#maxitemsvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MaxitemsValidation.MaxitemsValidation1BoxedNumber](#maxitemsvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MaxitemsValidation.MaxitemsValidation1BoxedString](#maxitemsvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [MaxitemsValidation.MaxitemsValidation1BoxedList](#maxitemsvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [MaxitemsValidation.MaxitemsValidation1BoxedMap](#maxitemsvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaxitemsValidation.MaxitemsValidation1](#maxitemsvalidation1)<br> schema class |

## MaxitemsValidation1Boxed
public sealed interface MaxitemsValidation1Boxed<br>
permits<br>
[MaxitemsValidation1BoxedVoid](#maxitemsvalidation1boxedvoid),
[MaxitemsValidation1BoxedBoolean](#maxitemsvalidation1boxedboolean),
[MaxitemsValidation1BoxedNumber](#maxitemsvalidation1boxednumber),
[MaxitemsValidation1BoxedString](#maxitemsvalidation1boxedstring),
[MaxitemsValidation1BoxedList](#maxitemsvalidation1boxedlist),
[MaxitemsValidation1BoxedMap](#maxitemsvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MaxitemsValidation1BoxedVoid
public record MaxitemsValidation1BoxedVoid<br>
implements [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxitemsValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxitemsValidation1BoxedBoolean
public record MaxitemsValidation1BoxedBoolean<br>
implements [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxitemsValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxitemsValidation1BoxedNumber
public record MaxitemsValidation1BoxedNumber<br>
implements [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxitemsValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxitemsValidation1BoxedString
public record MaxitemsValidation1BoxedString<br>
implements [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxitemsValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxitemsValidation1BoxedList
public record MaxitemsValidation1BoxedList<br>
implements [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxitemsValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxitemsValidation1BoxedMap
public record MaxitemsValidation1BoxedMap<br>
implements [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxitemsValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxitemsValidation1
public static class MaxitemsValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | maxItems = 2 |

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
| [MaxitemsValidation1BoxedString](#maxitemsvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MaxitemsValidation1BoxedVoid](#maxitemsvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MaxitemsValidation1BoxedNumber](#maxitemsvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MaxitemsValidation1BoxedBoolean](#maxitemsvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MaxitemsValidation1BoxedMap](#maxitemsvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MaxitemsValidation1BoxedList](#maxitemsvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
