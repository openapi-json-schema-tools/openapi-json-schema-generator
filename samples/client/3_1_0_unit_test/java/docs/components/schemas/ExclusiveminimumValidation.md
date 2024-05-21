# ExclusiveminimumValidation
unit_test_api.components.schemas.ExclusiveminimumValidation.java
public class ExclusiveminimumValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ExclusiveminimumValidation.ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)<br> sealed interface for validated payloads |
| record | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedVoid](#exclusiveminimumvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedBoolean](#exclusiveminimumvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedNumber](#exclusiveminimumvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedString](#exclusiveminimumvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedList](#exclusiveminimumvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedMap](#exclusiveminimumvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ExclusiveminimumValidation.ExclusiveminimumValidation1](#exclusiveminimumvalidation1)<br> schema class |

## ExclusiveminimumValidation1Boxed
public sealed interface ExclusiveminimumValidation1Boxed<br>
permits<br>
[ExclusiveminimumValidation1BoxedVoid](#exclusiveminimumvalidation1boxedvoid),
[ExclusiveminimumValidation1BoxedBoolean](#exclusiveminimumvalidation1boxedboolean),
[ExclusiveminimumValidation1BoxedNumber](#exclusiveminimumvalidation1boxednumber),
[ExclusiveminimumValidation1BoxedString](#exclusiveminimumvalidation1boxedstring),
[ExclusiveminimumValidation1BoxedList](#exclusiveminimumvalidation1boxedlist),
[ExclusiveminimumValidation1BoxedMap](#exclusiveminimumvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ExclusiveminimumValidation1BoxedVoid
public record ExclusiveminimumValidation1BoxedVoid<br>
implements [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ExclusiveminimumValidation1BoxedBoolean
public record ExclusiveminimumValidation1BoxedBoolean<br>
implements [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ExclusiveminimumValidation1BoxedNumber
public record ExclusiveminimumValidation1BoxedNumber<br>
implements [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ExclusiveminimumValidation1BoxedString
public record ExclusiveminimumValidation1BoxedString<br>
implements [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ExclusiveminimumValidation1BoxedList
public record ExclusiveminimumValidation1BoxedList<br>
implements [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ExclusiveminimumValidation1BoxedMap
public record ExclusiveminimumValidation1BoxedMap<br>
implements [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ExclusiveminimumValidation1
public static class ExclusiveminimumValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | exclusiveMinimum = 1.1 |

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
| [ExclusiveminimumValidation1BoxedString](#exclusiveminimumvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ExclusiveminimumValidation1BoxedVoid](#exclusiveminimumvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ExclusiveminimumValidation1BoxedNumber](#exclusiveminimumvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ExclusiveminimumValidation1BoxedBoolean](#exclusiveminimumvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ExclusiveminimumValidation1BoxedMap](#exclusiveminimumvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ExclusiveminimumValidation1BoxedList](#exclusiveminimumvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
