# RegexesAreNotAnchoredByDefaultAndAreCaseSensitive
org.openapijsonschematools.client.components.schemas.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.java
public class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)<br> sealed interface for validated payloads |
| record | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid](#regexesarenotanchoredbydefaultandarecasesensitive1boxedvoid)<br> boxed class to store validated null payloads |
| record | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean](#regexesarenotanchoredbydefaultandarecasesensitive1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber](#regexesarenotanchoredbydefaultandarecasesensitive1boxednumber)<br> boxed class to store validated Number payloads |
| record | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString](#regexesarenotanchoredbydefaultandarecasesensitive1boxedstring)<br> boxed class to store validated String payloads |
| record | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList](#regexesarenotanchoredbydefaultandarecasesensitive1boxedlist)<br> boxed class to store validated List payloads |
| record | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap](#regexesarenotanchoredbydefaultandarecasesensitive1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1](#regexesarenotanchoredbydefaultandarecasesensitive1)<br> schema class |
| sealed interface | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.XBoxed](#xboxed)<br> sealed interface for validated payloads |
| record | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.XBoxedString](#xboxedstring)<br> boxed class to store validated String payloads |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.X](#x)<br> schema class |
| sealed interface | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.Schema092Boxed](#schema092boxed)<br> sealed interface for validated payloads |
| record | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.Schema092BoxedBoolean](#schema092boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.Schema092](#schema092)<br> schema class |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed
public sealed interface RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed<br>
permits<br>
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid](#regexesarenotanchoredbydefaultandarecasesensitive1boxedvoid),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean](#regexesarenotanchoredbydefaultandarecasesensitive1boxedboolean),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber](#regexesarenotanchoredbydefaultandarecasesensitive1boxednumber),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString](#regexesarenotanchoredbydefaultandarecasesensitive1boxedstring),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList](#regexesarenotanchoredbydefaultandarecasesensitive1boxedlist),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap](#regexesarenotanchoredbydefaultandarecasesensitive1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid
public record RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid<br>
implements [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean
public record RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean<br>
implements [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber
public record RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber<br>
implements [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString
public record RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString<br>
implements [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList
public record RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList<br>
implements [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap
public record RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap<br>
implements [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1
public static class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<Pattern, Class<? extends JsonSchema>> | patternProperties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(Pattern.compile("[0-9]{2,}"), [Schema092.class](#schema092))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(Pattern.compile("X_"), [X.class](#x)))<br>)<br> |

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
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString](#regexesarenotanchoredbydefaultandarecasesensitive1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid](#regexesarenotanchoredbydefaultandarecasesensitive1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber](#regexesarenotanchoredbydefaultandarecasesensitive1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean](#regexesarenotanchoredbydefaultandarecasesensitive1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap](#regexesarenotanchoredbydefaultandarecasesensitive1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList](#regexesarenotanchoredbydefaultandarecasesensitive1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## XBoxed
public sealed interface XBoxed<br>
permits<br>
[XBoxedString](#xboxedstring)

sealed interface that stores validated payloads using boxed classes

## XBoxedString
public record XBoxedString<br>
implements [XBoxed](#xboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| XBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## X
public static class X<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema092Boxed
public sealed interface Schema092Boxed<br>
permits<br>
[Schema092BoxedBoolean](#schema092boxedboolean)

sealed interface that stores validated payloads using boxed classes

## Schema092BoxedBoolean
public record Schema092BoxedBoolean<br>
implements [Schema092Boxed](#schema092boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema092BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema092
public static class Schema092<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
