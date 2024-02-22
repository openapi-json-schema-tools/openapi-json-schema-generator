# ExclusivemaximumValidation
org.openapijsonschematools.client.components.schemas.ExclusivemaximumValidation.java
public class ExclusivemaximumValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ExclusivemaximumValidation.ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)<br> sealed interface for validated payloads |
| record | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedVoid](#exclusivemaximumvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedBoolean](#exclusivemaximumvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedNumber](#exclusivemaximumvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedString](#exclusivemaximumvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedList](#exclusivemaximumvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedMap](#exclusivemaximumvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ExclusivemaximumValidation.ExclusivemaximumValidation1](#exclusivemaximumvalidation1)<br> schema class |

## ExclusivemaximumValidation1Boxed
public sealed interface ExclusivemaximumValidation1Boxed<br>
permits<br>
[ExclusivemaximumValidation1BoxedVoid](#exclusivemaximumvalidation1boxedvoid),
[ExclusivemaximumValidation1BoxedBoolean](#exclusivemaximumvalidation1boxedboolean),
[ExclusivemaximumValidation1BoxedNumber](#exclusivemaximumvalidation1boxednumber),
[ExclusivemaximumValidation1BoxedString](#exclusivemaximumvalidation1boxedstring),
[ExclusivemaximumValidation1BoxedList](#exclusivemaximumvalidation1boxedlist),
[ExclusivemaximumValidation1BoxedMap](#exclusivemaximumvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ExclusivemaximumValidation1BoxedVoid
public record ExclusivemaximumValidation1BoxedVoid<br>
implements [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ExclusivemaximumValidation1BoxedBoolean
public record ExclusivemaximumValidation1BoxedBoolean<br>
implements [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ExclusivemaximumValidation1BoxedNumber
public record ExclusivemaximumValidation1BoxedNumber<br>
implements [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ExclusivemaximumValidation1BoxedString
public record ExclusivemaximumValidation1BoxedString<br>
implements [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ExclusivemaximumValidation1BoxedList
public record ExclusivemaximumValidation1BoxedList<br>
implements [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ExclusivemaximumValidation1BoxedMap
public record ExclusivemaximumValidation1BoxedMap<br>
implements [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ExclusivemaximumValidation1
public static class ExclusivemaximumValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | exclusiveMaximum = 3.0 |

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
| [ExclusivemaximumValidation1BoxedString](#exclusivemaximumvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ExclusivemaximumValidation1BoxedVoid](#exclusivemaximumvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ExclusivemaximumValidation1BoxedNumber](#exclusivemaximumvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ExclusivemaximumValidation1BoxedBoolean](#exclusivemaximumvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ExclusivemaximumValidation1BoxedMap](#exclusivemaximumvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ExclusivemaximumValidation1BoxedList](#exclusivemaximumvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
