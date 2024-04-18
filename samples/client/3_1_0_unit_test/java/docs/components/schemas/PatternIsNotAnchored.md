# PatternIsNotAnchored
unit_test_api.components.schemas.PatternIsNotAnchored.java
public class PatternIsNotAnchored<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PatternIsNotAnchored.PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)<br> sealed interface for validated payloads |
| record | [PatternIsNotAnchored.PatternIsNotAnchored1BoxedVoid](#patternisnotanchored1boxedvoid)<br> boxed class to store validated null payloads |
| record | [PatternIsNotAnchored.PatternIsNotAnchored1BoxedBoolean](#patternisnotanchored1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PatternIsNotAnchored.PatternIsNotAnchored1BoxedNumber](#patternisnotanchored1boxednumber)<br> boxed class to store validated Number payloads |
| record | [PatternIsNotAnchored.PatternIsNotAnchored1BoxedString](#patternisnotanchored1boxedstring)<br> boxed class to store validated String payloads |
| record | [PatternIsNotAnchored.PatternIsNotAnchored1BoxedList](#patternisnotanchored1boxedlist)<br> boxed class to store validated List payloads |
| record | [PatternIsNotAnchored.PatternIsNotAnchored1BoxedMap](#patternisnotanchored1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PatternIsNotAnchored.PatternIsNotAnchored1](#patternisnotanchored1)<br> schema class |

## PatternIsNotAnchored1Boxed
public sealed interface PatternIsNotAnchored1Boxed<br>
permits<br>
[PatternIsNotAnchored1BoxedVoid](#patternisnotanchored1boxedvoid),
[PatternIsNotAnchored1BoxedBoolean](#patternisnotanchored1boxedboolean),
[PatternIsNotAnchored1BoxedNumber](#patternisnotanchored1boxednumber),
[PatternIsNotAnchored1BoxedString](#patternisnotanchored1boxedstring),
[PatternIsNotAnchored1BoxedList](#patternisnotanchored1boxedlist),
[PatternIsNotAnchored1BoxedMap](#patternisnotanchored1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PatternIsNotAnchored1BoxedVoid
public record PatternIsNotAnchored1BoxedVoid<br>
implements [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternIsNotAnchored1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternIsNotAnchored1BoxedBoolean
public record PatternIsNotAnchored1BoxedBoolean<br>
implements [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternIsNotAnchored1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternIsNotAnchored1BoxedNumber
public record PatternIsNotAnchored1BoxedNumber<br>
implements [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternIsNotAnchored1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternIsNotAnchored1BoxedString
public record PatternIsNotAnchored1BoxedString<br>
implements [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternIsNotAnchored1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternIsNotAnchored1BoxedList
public record PatternIsNotAnchored1BoxedList<br>
implements [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternIsNotAnchored1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternIsNotAnchored1BoxedMap
public record PatternIsNotAnchored1BoxedMap<br>
implements [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternIsNotAnchored1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternIsNotAnchored1
public static class PatternIsNotAnchored1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Pattern | pattern = Pattern.compile(<br>&nbsp;&nbsp;&nbsp;&nbsp;"a+"<br>)<br> |

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
| [PatternIsNotAnchored1BoxedString](#patternisnotanchored1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PatternIsNotAnchored1BoxedVoid](#patternisnotanchored1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [PatternIsNotAnchored1BoxedNumber](#patternisnotanchored1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [PatternIsNotAnchored1BoxedBoolean](#patternisnotanchored1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [PatternIsNotAnchored1BoxedMap](#patternisnotanchored1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [PatternIsNotAnchored1BoxedList](#patternisnotanchored1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
