# MultipleSimultaneousPatternpropertiesAreValidated
org.openapijsonschematools.client.components.schemas.MultipleSimultaneousPatternpropertiesAreValidated.java
public class MultipleSimultaneousPatternpropertiesAreValidated<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)<br> sealed interface for validated payloads |
| record | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1BoxedVoid](#multiplesimultaneouspatternpropertiesarevalidated1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1BoxedBoolean](#multiplesimultaneouspatternpropertiesarevalidated1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1BoxedNumber](#multiplesimultaneouspatternpropertiesarevalidated1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1BoxedString](#multiplesimultaneouspatternpropertiesarevalidated1boxedstring)<br> boxed class to store validated String payloads |
| record | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1BoxedList](#multiplesimultaneouspatternpropertiesarevalidated1boxedlist)<br> boxed class to store validated List payloads |
| record | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1BoxedMap](#multiplesimultaneouspatternpropertiesarevalidated1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1](#multiplesimultaneouspatternpropertiesarevalidated1)<br> schema class |
| sealed interface | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxed](#aaaboxed)<br> sealed interface for validated payloads |
| record | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxedVoid](#aaaboxedvoid)<br> boxed class to store validated null payloads |
| record | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxedBoolean](#aaaboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxedNumber](#aaaboxednumber)<br> boxed class to store validated Number payloads |
| record | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxedString](#aaaboxedstring)<br> boxed class to store validated String payloads |
| record | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxedList](#aaaboxedlist)<br> boxed class to store validated List payloads |
| record | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxedMap](#aaaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [MultipleSimultaneousPatternpropertiesAreValidated.Aaa](#aaa)<br> schema class |
| sealed interface | [MultipleSimultaneousPatternpropertiesAreValidated.ABoxed](#aboxed)<br> sealed interface for validated payloads |
| record | [MultipleSimultaneousPatternpropertiesAreValidated.ABoxedNumber](#aboxednumber)<br> boxed class to store validated Number payloads |
| static class | [MultipleSimultaneousPatternpropertiesAreValidated.A](#a)<br> schema class |

## MultipleSimultaneousPatternpropertiesAreValidated1Boxed
public sealed interface MultipleSimultaneousPatternpropertiesAreValidated1Boxed<br>
permits<br>
[MultipleSimultaneousPatternpropertiesAreValidated1BoxedVoid](#multiplesimultaneouspatternpropertiesarevalidated1boxedvoid),
[MultipleSimultaneousPatternpropertiesAreValidated1BoxedBoolean](#multiplesimultaneouspatternpropertiesarevalidated1boxedboolean),
[MultipleSimultaneousPatternpropertiesAreValidated1BoxedNumber](#multiplesimultaneouspatternpropertiesarevalidated1boxednumber),
[MultipleSimultaneousPatternpropertiesAreValidated1BoxedString](#multiplesimultaneouspatternpropertiesarevalidated1boxedstring),
[MultipleSimultaneousPatternpropertiesAreValidated1BoxedList](#multiplesimultaneouspatternpropertiesarevalidated1boxedlist),
[MultipleSimultaneousPatternpropertiesAreValidated1BoxedMap](#multiplesimultaneouspatternpropertiesarevalidated1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MultipleSimultaneousPatternpropertiesAreValidated1BoxedVoid
public record MultipleSimultaneousPatternpropertiesAreValidated1BoxedVoid<br>
implements [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleSimultaneousPatternpropertiesAreValidated1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleSimultaneousPatternpropertiesAreValidated1BoxedBoolean
public record MultipleSimultaneousPatternpropertiesAreValidated1BoxedBoolean<br>
implements [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleSimultaneousPatternpropertiesAreValidated1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleSimultaneousPatternpropertiesAreValidated1BoxedNumber
public record MultipleSimultaneousPatternpropertiesAreValidated1BoxedNumber<br>
implements [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleSimultaneousPatternpropertiesAreValidated1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleSimultaneousPatternpropertiesAreValidated1BoxedString
public record MultipleSimultaneousPatternpropertiesAreValidated1BoxedString<br>
implements [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleSimultaneousPatternpropertiesAreValidated1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleSimultaneousPatternpropertiesAreValidated1BoxedList
public record MultipleSimultaneousPatternpropertiesAreValidated1BoxedList<br>
implements [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleSimultaneousPatternpropertiesAreValidated1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleSimultaneousPatternpropertiesAreValidated1BoxedMap
public record MultipleSimultaneousPatternpropertiesAreValidated1BoxedMap<br>
implements [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleSimultaneousPatternpropertiesAreValidated1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleSimultaneousPatternpropertiesAreValidated1
public static class MultipleSimultaneousPatternpropertiesAreValidated1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<Pattern, Class<? extends JsonSchema>> | patternProperties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(Pattern.compile("a*"), [A.class](#a))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(Pattern.compile("aaa*"), [Aaa.class](#aaa)))<br>)<br> |

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
| [MultipleSimultaneousPatternpropertiesAreValidated1BoxedString](#multiplesimultaneouspatternpropertiesarevalidated1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MultipleSimultaneousPatternpropertiesAreValidated1BoxedVoid](#multiplesimultaneouspatternpropertiesarevalidated1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MultipleSimultaneousPatternpropertiesAreValidated1BoxedNumber](#multiplesimultaneouspatternpropertiesarevalidated1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MultipleSimultaneousPatternpropertiesAreValidated1BoxedBoolean](#multiplesimultaneouspatternpropertiesarevalidated1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MultipleSimultaneousPatternpropertiesAreValidated1BoxedMap](#multiplesimultaneouspatternpropertiesarevalidated1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MultipleSimultaneousPatternpropertiesAreValidated1BoxedList](#multiplesimultaneouspatternpropertiesarevalidated1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## AaaBoxed
public sealed interface AaaBoxed<br>
permits<br>
[AaaBoxedVoid](#aaaboxedvoid),
[AaaBoxedBoolean](#aaaboxedboolean),
[AaaBoxedNumber](#aaaboxednumber),
[AaaBoxedString](#aaaboxedstring),
[AaaBoxedList](#aaaboxedlist),
[AaaBoxedMap](#aaaboxedmap)

sealed interface that stores validated payloads using boxed classes

## AaaBoxedVoid
public record AaaBoxedVoid<br>
implements [AaaBoxed](#aaaboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AaaBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AaaBoxedBoolean
public record AaaBoxedBoolean<br>
implements [AaaBoxed](#aaaboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AaaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AaaBoxedNumber
public record AaaBoxedNumber<br>
implements [AaaBoxed](#aaaboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AaaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AaaBoxedString
public record AaaBoxedString<br>
implements [AaaBoxed](#aaaboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AaaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AaaBoxedList
public record AaaBoxedList<br>
implements [AaaBoxed](#aaaboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AaaBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AaaBoxedMap
public record AaaBoxedMap<br>
implements [AaaBoxed](#aaaboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AaaBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Aaa
public static class Aaa<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | maximum = 20 |

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
| [AaaBoxedString](#aaaboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AaaBoxedVoid](#aaaboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [AaaBoxedNumber](#aaaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AaaBoxedBoolean](#aaaboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AaaBoxedMap](#aaaboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AaaBoxedList](#aaaboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [AaaBoxed](#aaaboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ABoxed
public sealed interface ABoxed<br>
permits<br>
[ABoxedNumber](#aboxednumber)

sealed interface that stores validated payloads using boxed classes

## ABoxedNumber
public record ABoxedNumber<br>
implements [ABoxed](#aboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ABoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## A
public static class A<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
