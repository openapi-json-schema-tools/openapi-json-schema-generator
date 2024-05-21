# MaxpropertiesValidation
unit_test_api.components.schemas.MaxpropertiesValidation.java
public class MaxpropertiesValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MaxpropertiesValidation.MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)<br> sealed interface for validated payloads |
| record | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedVoid](#maxpropertiesvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedBoolean](#maxpropertiesvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedNumber](#maxpropertiesvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedString](#maxpropertiesvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedList](#maxpropertiesvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedMap](#maxpropertiesvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaxpropertiesValidation.MaxpropertiesValidation1](#maxpropertiesvalidation1)<br> schema class |

## MaxpropertiesValidation1Boxed
public sealed interface MaxpropertiesValidation1Boxed<br>
permits<br>
[MaxpropertiesValidation1BoxedVoid](#maxpropertiesvalidation1boxedvoid),
[MaxpropertiesValidation1BoxedBoolean](#maxpropertiesvalidation1boxedboolean),
[MaxpropertiesValidation1BoxedNumber](#maxpropertiesvalidation1boxednumber),
[MaxpropertiesValidation1BoxedString](#maxpropertiesvalidation1boxedstring),
[MaxpropertiesValidation1BoxedList](#maxpropertiesvalidation1boxedlist),
[MaxpropertiesValidation1BoxedMap](#maxpropertiesvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MaxpropertiesValidation1BoxedVoid
public record MaxpropertiesValidation1BoxedVoid<br>
implements [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxpropertiesValidation1BoxedBoolean
public record MaxpropertiesValidation1BoxedBoolean<br>
implements [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxpropertiesValidation1BoxedNumber
public record MaxpropertiesValidation1BoxedNumber<br>
implements [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxpropertiesValidation1BoxedString
public record MaxpropertiesValidation1BoxedString<br>
implements [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxpropertiesValidation1BoxedList
public record MaxpropertiesValidation1BoxedList<br>
implements [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxpropertiesValidation1BoxedMap
public record MaxpropertiesValidation1BoxedMap<br>
implements [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxpropertiesValidation1
public static class MaxpropertiesValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | maxProperties = 2 |

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
| [MaxpropertiesValidation1BoxedString](#maxpropertiesvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MaxpropertiesValidation1BoxedVoid](#maxpropertiesvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MaxpropertiesValidation1BoxedNumber](#maxpropertiesvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MaxpropertiesValidation1BoxedBoolean](#maxpropertiesvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MaxpropertiesValidation1BoxedMap](#maxpropertiesvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MaxpropertiesValidation1BoxedList](#maxpropertiesvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
