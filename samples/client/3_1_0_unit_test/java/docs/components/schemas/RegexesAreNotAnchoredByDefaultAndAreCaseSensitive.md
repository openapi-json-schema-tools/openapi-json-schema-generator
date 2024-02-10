# RegexesAreNotAnchoredByDefaultAndAreCaseSensitive
org.openapijsonschematools.client.components.schemas.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.java
public class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)<br> abstract sealed validated payload class |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid](#regexesarenotanchoredbydefaultandarecasesensitive1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean](#regexesarenotanchoredbydefaultandarecasesensitive1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber](#regexesarenotanchoredbydefaultandarecasesensitive1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString](#regexesarenotanchoredbydefaultandarecasesensitive1boxedstring)<br> boxed class to store validated String payloads |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList](#regexesarenotanchoredbydefaultandarecasesensitive1boxedlist)<br> boxed class to store validated List payloads |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap](#regexesarenotanchoredbydefaultandarecasesensitive1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1](#regexesarenotanchoredbydefaultandarecasesensitive1)<br> schema class |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.XBoxed](#xboxed)<br> abstract sealed validated payload class |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.XBoxedString](#xboxedstring)<br> boxed class to store validated String payloads |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.X](#x)<br> schema class |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.Schema092Boxed](#schema092boxed)<br> abstract sealed validated payload class |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.Schema092BoxedBoolean](#schema092boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.Schema092](#schema092)<br> schema class |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed
public static abstract sealed class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed<br>
permits<br>
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid](#regexesarenotanchoredbydefaultandarecasesensitive1boxedvoid),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean](#regexesarenotanchoredbydefaultandarecasesensitive1boxedboolean),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber](#regexesarenotanchoredbydefaultandarecasesensitive1boxednumber),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString](#regexesarenotanchoredbydefaultandarecasesensitive1boxedstring),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList](#regexesarenotanchoredbydefaultandarecasesensitive1boxedlist),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap](#regexesarenotanchoredbydefaultandarecasesensitive1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid
public static final class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid<br>
extends [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean
public static final class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean<br>
extends [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber
public static final class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber<br>
extends [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString
public static final class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString<br>
extends [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList
public static final class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList<br>
extends [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap
public static final class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap<br>
extends [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## XBoxed
public static abstract sealed class XBoxed<br>
permits<br>
[XBoxedString](#xboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## XBoxedString
public static final class XBoxedString<br>
extends [XBoxed](#xboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| XBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## X
public static class X<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema092Boxed
public static abstract sealed class Schema092Boxed<br>
permits<br>
[Schema092BoxedBoolean](#schema092boxedboolean)

abstract sealed class that stores validated payloads using boxed classes

## Schema092BoxedBoolean
public static final class Schema092BoxedBoolean<br>
extends [Schema092Boxed](#schema092boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema092BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema092
public static class Schema092<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
