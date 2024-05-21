# PatternpropertiesValidatesPropertiesMatchingARegex
org.openapijsonschematools.client.components.schemas.PatternpropertiesValidatesPropertiesMatchingARegex.java
public class PatternpropertiesValidatesPropertiesMatchingARegex<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)<br> sealed interface for validated payloads |
| record | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1BoxedVoid](#patternpropertiesvalidatespropertiesmatchingaregex1boxedvoid)<br> boxed class to store validated null payloads |
| record | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1BoxedBoolean](#patternpropertiesvalidatespropertiesmatchingaregex1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1BoxedNumber](#patternpropertiesvalidatespropertiesmatchingaregex1boxednumber)<br> boxed class to store validated Number payloads |
| record | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1BoxedString](#patternpropertiesvalidatespropertiesmatchingaregex1boxedstring)<br> boxed class to store validated String payloads |
| record | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1BoxedList](#patternpropertiesvalidatespropertiesmatchingaregex1boxedlist)<br> boxed class to store validated List payloads |
| record | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1BoxedMap](#patternpropertiesvalidatespropertiesmatchingaregex1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1](#patternpropertiesvalidatespropertiesmatchingaregex1)<br> schema class |
| sealed interface | [PatternpropertiesValidatesPropertiesMatchingARegex.FoBoxed](#foboxed)<br> sealed interface for validated payloads |
| record | [PatternpropertiesValidatesPropertiesMatchingARegex.FoBoxedNumber](#foboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PatternpropertiesValidatesPropertiesMatchingARegex.Fo](#fo)<br> schema class |

## PatternpropertiesValidatesPropertiesMatchingARegex1Boxed
public sealed interface PatternpropertiesValidatesPropertiesMatchingARegex1Boxed<br>
permits<br>
[PatternpropertiesValidatesPropertiesMatchingARegex1BoxedVoid](#patternpropertiesvalidatespropertiesmatchingaregex1boxedvoid),
[PatternpropertiesValidatesPropertiesMatchingARegex1BoxedBoolean](#patternpropertiesvalidatespropertiesmatchingaregex1boxedboolean),
[PatternpropertiesValidatesPropertiesMatchingARegex1BoxedNumber](#patternpropertiesvalidatespropertiesmatchingaregex1boxednumber),
[PatternpropertiesValidatesPropertiesMatchingARegex1BoxedString](#patternpropertiesvalidatespropertiesmatchingaregex1boxedstring),
[PatternpropertiesValidatesPropertiesMatchingARegex1BoxedList](#patternpropertiesvalidatespropertiesmatchingaregex1boxedlist),
[PatternpropertiesValidatesPropertiesMatchingARegex1BoxedMap](#patternpropertiesvalidatespropertiesmatchingaregex1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PatternpropertiesValidatesPropertiesMatchingARegex1BoxedVoid
public record PatternpropertiesValidatesPropertiesMatchingARegex1BoxedVoid<br>
implements [PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesValidatesPropertiesMatchingARegex1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternpropertiesValidatesPropertiesMatchingARegex1BoxedBoolean
public record PatternpropertiesValidatesPropertiesMatchingARegex1BoxedBoolean<br>
implements [PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesValidatesPropertiesMatchingARegex1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternpropertiesValidatesPropertiesMatchingARegex1BoxedNumber
public record PatternpropertiesValidatesPropertiesMatchingARegex1BoxedNumber<br>
implements [PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesValidatesPropertiesMatchingARegex1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternpropertiesValidatesPropertiesMatchingARegex1BoxedString
public record PatternpropertiesValidatesPropertiesMatchingARegex1BoxedString<br>
implements [PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesValidatesPropertiesMatchingARegex1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternpropertiesValidatesPropertiesMatchingARegex1BoxedList
public record PatternpropertiesValidatesPropertiesMatchingARegex1BoxedList<br>
implements [PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesValidatesPropertiesMatchingARegex1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternpropertiesValidatesPropertiesMatchingARegex1BoxedMap
public record PatternpropertiesValidatesPropertiesMatchingARegex1BoxedMap<br>
implements [PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesValidatesPropertiesMatchingARegex1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PatternpropertiesValidatesPropertiesMatchingARegex1
public static class PatternpropertiesValidatesPropertiesMatchingARegex1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<Pattern, Class<? extends JsonSchema>> | patternProperties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(Pattern.compile("f.*o"), [Fo.class](#fo)))<br>)<br> |

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
| [PatternpropertiesValidatesPropertiesMatchingARegex1BoxedString](#patternpropertiesvalidatespropertiesmatchingaregex1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PatternpropertiesValidatesPropertiesMatchingARegex1BoxedVoid](#patternpropertiesvalidatespropertiesmatchingaregex1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [PatternpropertiesValidatesPropertiesMatchingARegex1BoxedNumber](#patternpropertiesvalidatespropertiesmatchingaregex1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [PatternpropertiesValidatesPropertiesMatchingARegex1BoxedBoolean](#patternpropertiesvalidatespropertiesmatchingaregex1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [PatternpropertiesValidatesPropertiesMatchingARegex1BoxedMap](#patternpropertiesvalidatespropertiesmatchingaregex1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [PatternpropertiesValidatesPropertiesMatchingARegex1BoxedList](#patternpropertiesvalidatespropertiesmatchingaregex1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FoBoxed
public sealed interface FoBoxed<br>
permits<br>
[FoBoxedNumber](#foboxednumber)

sealed interface that stores validated payloads using boxed classes

## FoBoxedNumber
public record FoBoxedNumber<br>
implements [FoBoxed](#foboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fo
public static class Fo<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
