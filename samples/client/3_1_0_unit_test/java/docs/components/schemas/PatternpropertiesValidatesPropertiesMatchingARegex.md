# PatternpropertiesValidatesPropertiesMatchingARegex
org.openapijsonschematools.client.components.schemas.PatternpropertiesValidatesPropertiesMatchingARegex.java
public class PatternpropertiesValidatesPropertiesMatchingARegex<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)<br> abstract sealed validated payload class |
| static class | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1BoxedVoid](#patternpropertiesvalidatespropertiesmatchingaregex1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1BoxedBoolean](#patternpropertiesvalidatespropertiesmatchingaregex1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1BoxedNumber](#patternpropertiesvalidatespropertiesmatchingaregex1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1BoxedString](#patternpropertiesvalidatespropertiesmatchingaregex1boxedstring)<br> boxed class to store validated String payloads |
| static class | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1BoxedList](#patternpropertiesvalidatespropertiesmatchingaregex1boxedlist)<br> boxed class to store validated List payloads |
| static class | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1BoxedMap](#patternpropertiesvalidatespropertiesmatchingaregex1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1](#patternpropertiesvalidatespropertiesmatchingaregex1)<br> schema class |
| static class | [PatternpropertiesValidatesPropertiesMatchingARegex.FoBoxed](#foboxed)<br> abstract sealed validated payload class |
| static class | [PatternpropertiesValidatesPropertiesMatchingARegex.FoBoxedNumber](#foboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PatternpropertiesValidatesPropertiesMatchingARegex.Fo](#fo)<br> schema class |

## PatternpropertiesValidatesPropertiesMatchingARegex1Boxed
public static abstract sealed class PatternpropertiesValidatesPropertiesMatchingARegex1Boxed<br>
permits<br>
[PatternpropertiesValidatesPropertiesMatchingARegex1BoxedVoid](#patternpropertiesvalidatespropertiesmatchingaregex1boxedvoid),
[PatternpropertiesValidatesPropertiesMatchingARegex1BoxedBoolean](#patternpropertiesvalidatespropertiesmatchingaregex1boxedboolean),
[PatternpropertiesValidatesPropertiesMatchingARegex1BoxedNumber](#patternpropertiesvalidatespropertiesmatchingaregex1boxednumber),
[PatternpropertiesValidatesPropertiesMatchingARegex1BoxedString](#patternpropertiesvalidatespropertiesmatchingaregex1boxedstring),
[PatternpropertiesValidatesPropertiesMatchingARegex1BoxedList](#patternpropertiesvalidatespropertiesmatchingaregex1boxedlist),
[PatternpropertiesValidatesPropertiesMatchingARegex1BoxedMap](#patternpropertiesvalidatespropertiesmatchingaregex1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## PatternpropertiesValidatesPropertiesMatchingARegex1BoxedVoid
public static final class PatternpropertiesValidatesPropertiesMatchingARegex1BoxedVoid<br>
extends [PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesValidatesPropertiesMatchingARegex1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## PatternpropertiesValidatesPropertiesMatchingARegex1BoxedBoolean
public static final class PatternpropertiesValidatesPropertiesMatchingARegex1BoxedBoolean<br>
extends [PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesValidatesPropertiesMatchingARegex1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## PatternpropertiesValidatesPropertiesMatchingARegex1BoxedNumber
public static final class PatternpropertiesValidatesPropertiesMatchingARegex1BoxedNumber<br>
extends [PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesValidatesPropertiesMatchingARegex1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## PatternpropertiesValidatesPropertiesMatchingARegex1BoxedString
public static final class PatternpropertiesValidatesPropertiesMatchingARegex1BoxedString<br>
extends [PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesValidatesPropertiesMatchingARegex1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## PatternpropertiesValidatesPropertiesMatchingARegex1BoxedList
public static final class PatternpropertiesValidatesPropertiesMatchingARegex1BoxedList<br>
extends [PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesValidatesPropertiesMatchingARegex1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## PatternpropertiesValidatesPropertiesMatchingARegex1BoxedMap
public static final class PatternpropertiesValidatesPropertiesMatchingARegex1BoxedMap<br>
extends [PatternpropertiesValidatesPropertiesMatchingARegex1Boxed](#patternpropertiesvalidatespropertiesmatchingaregex1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesValidatesPropertiesMatchingARegex1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FoBoxed
public static abstract sealed class FoBoxed<br>
permits<br>
[FoBoxedNumber](#foboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## FoBoxedNumber
public static final class FoBoxedNumber<br>
extends [FoBoxed](#foboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Fo
public static class Fo<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
