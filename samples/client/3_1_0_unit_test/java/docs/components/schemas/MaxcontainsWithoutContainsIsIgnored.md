# MaxcontainsWithoutContainsIsIgnored
unit_test_api.components.schemas.MaxcontainsWithoutContainsIsIgnored.java
public class MaxcontainsWithoutContainsIsIgnored<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)<br> sealed interface for validated payloads |
| record | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1BoxedVoid](#maxcontainswithoutcontainsisignored1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1BoxedBoolean](#maxcontainswithoutcontainsisignored1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1BoxedNumber](#maxcontainswithoutcontainsisignored1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1BoxedString](#maxcontainswithoutcontainsisignored1boxedstring)<br> boxed class to store validated String payloads |
| record | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1BoxedList](#maxcontainswithoutcontainsisignored1boxedlist)<br> boxed class to store validated List payloads |
| record | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1BoxedMap](#maxcontainswithoutcontainsisignored1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1](#maxcontainswithoutcontainsisignored1)<br> schema class |

## MaxcontainsWithoutContainsIsIgnored1Boxed
public sealed interface MaxcontainsWithoutContainsIsIgnored1Boxed<br>
permits<br>
[MaxcontainsWithoutContainsIsIgnored1BoxedVoid](#maxcontainswithoutcontainsisignored1boxedvoid),
[MaxcontainsWithoutContainsIsIgnored1BoxedBoolean](#maxcontainswithoutcontainsisignored1boxedboolean),
[MaxcontainsWithoutContainsIsIgnored1BoxedNumber](#maxcontainswithoutcontainsisignored1boxednumber),
[MaxcontainsWithoutContainsIsIgnored1BoxedString](#maxcontainswithoutcontainsisignored1boxedstring),
[MaxcontainsWithoutContainsIsIgnored1BoxedList](#maxcontainswithoutcontainsisignored1boxedlist),
[MaxcontainsWithoutContainsIsIgnored1BoxedMap](#maxcontainswithoutcontainsisignored1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MaxcontainsWithoutContainsIsIgnored1BoxedVoid
public record MaxcontainsWithoutContainsIsIgnored1BoxedVoid<br>
implements [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxcontainsWithoutContainsIsIgnored1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxcontainsWithoutContainsIsIgnored1BoxedBoolean
public record MaxcontainsWithoutContainsIsIgnored1BoxedBoolean<br>
implements [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxcontainsWithoutContainsIsIgnored1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxcontainsWithoutContainsIsIgnored1BoxedNumber
public record MaxcontainsWithoutContainsIsIgnored1BoxedNumber<br>
implements [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxcontainsWithoutContainsIsIgnored1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxcontainsWithoutContainsIsIgnored1BoxedString
public record MaxcontainsWithoutContainsIsIgnored1BoxedString<br>
implements [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxcontainsWithoutContainsIsIgnored1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxcontainsWithoutContainsIsIgnored1BoxedList
public record MaxcontainsWithoutContainsIsIgnored1BoxedList<br>
implements [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxcontainsWithoutContainsIsIgnored1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxcontainsWithoutContainsIsIgnored1BoxedMap
public record MaxcontainsWithoutContainsIsIgnored1BoxedMap<br>
implements [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxcontainsWithoutContainsIsIgnored1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MaxcontainsWithoutContainsIsIgnored1
public static class MaxcontainsWithoutContainsIsIgnored1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | maxContains = 1 |

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
| [MaxcontainsWithoutContainsIsIgnored1BoxedString](#maxcontainswithoutcontainsisignored1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MaxcontainsWithoutContainsIsIgnored1BoxedVoid](#maxcontainswithoutcontainsisignored1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MaxcontainsWithoutContainsIsIgnored1BoxedNumber](#maxcontainswithoutcontainsisignored1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MaxcontainsWithoutContainsIsIgnored1BoxedBoolean](#maxcontainswithoutcontainsisignored1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MaxcontainsWithoutContainsIsIgnored1BoxedMap](#maxcontainswithoutcontainsisignored1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MaxcontainsWithoutContainsIsIgnored1BoxedList](#maxcontainswithoutcontainsisignored1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
