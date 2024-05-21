# MaxlengthValidation
unit_test_api.components.schemas.MaxlengthValidation.java
public class MaxlengthValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MaxlengthValidation.MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)<br> sealed interface for validated payloads |
| record | [MaxlengthValidation.MaxlengthValidation1BoxedVoid](#maxlengthvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MaxlengthValidation.MaxlengthValidation1BoxedBoolean](#maxlengthvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MaxlengthValidation.MaxlengthValidation1BoxedNumber](#maxlengthvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MaxlengthValidation.MaxlengthValidation1BoxedString](#maxlengthvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [MaxlengthValidation.MaxlengthValidation1BoxedList](#maxlengthvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [MaxlengthValidation.MaxlengthValidation1BoxedMap](#maxlengthvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaxlengthValidation.MaxlengthValidation1](#maxlengthvalidation1)<br> schema class |

## MaxlengthValidation1Boxed
public sealed interface MaxlengthValidation1Boxed<br>
permits<br>
[MaxlengthValidation1BoxedVoid](#maxlengthvalidation1boxedvoid),
[MaxlengthValidation1BoxedBoolean](#maxlengthvalidation1boxedboolean),
[MaxlengthValidation1BoxedNumber](#maxlengthvalidation1boxednumber),
[MaxlengthValidation1BoxedString](#maxlengthvalidation1boxedstring),
[MaxlengthValidation1BoxedList](#maxlengthvalidation1boxedlist),
[MaxlengthValidation1BoxedMap](#maxlengthvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MaxlengthValidation1BoxedVoid
public record MaxlengthValidation1BoxedVoid<br>
implements [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxlengthValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxlengthValidation1BoxedBoolean
public record MaxlengthValidation1BoxedBoolean<br>
implements [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxlengthValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxlengthValidation1BoxedNumber
public record MaxlengthValidation1BoxedNumber<br>
implements [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxlengthValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxlengthValidation1BoxedString
public record MaxlengthValidation1BoxedString<br>
implements [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxlengthValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxlengthValidation1BoxedList
public record MaxlengthValidation1BoxedList<br>
implements [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxlengthValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxlengthValidation1BoxedMap
public record MaxlengthValidation1BoxedMap<br>
implements [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxlengthValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxlengthValidation1
public static class MaxlengthValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | maxLength = 2 |

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
| [MaxlengthValidation1BoxedString](#maxlengthvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MaxlengthValidation1BoxedVoid](#maxlengthvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MaxlengthValidation1BoxedNumber](#maxlengthvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MaxlengthValidation1BoxedBoolean](#maxlengthvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MaxlengthValidation1BoxedMap](#maxlengthvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MaxlengthValidation1BoxedList](#maxlengthvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
