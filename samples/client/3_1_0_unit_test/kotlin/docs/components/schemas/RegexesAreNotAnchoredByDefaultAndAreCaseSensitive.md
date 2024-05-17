# RegexesAreNotAnchoredByDefaultAndAreCaseSensitive
org.openapijsonschematools.client.components.schemas.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.java
class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
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
sealed interface RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed<br>
permits<br>
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid](#regexesarenotanchoredbydefaultandarecasesensitive1boxedvoid),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean](#regexesarenotanchoredbydefaultandarecasesensitive1boxedboolean),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber](#regexesarenotanchoredbydefaultandarecasesensitive1boxednumber),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString](#regexesarenotanchoredbydefaultandarecasesensitive1boxedstring),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList](#regexesarenotanchoredbydefaultandarecasesensitive1boxedlist),
[RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap](#regexesarenotanchoredbydefaultandarecasesensitive1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid
data class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid<br>
implements [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean
data class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean<br>
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
| Any? | getData()<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber
data class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber<br>
implements [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString
data class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString<br>
implements [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList
data class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList<br>
implements [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap
data class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap<br>
implements [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1
class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<Pattern, Class<? extends JsonSchema>> | patternProperties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(Pattern.compile("[0-9]{2,}"), [Schema092::class.java](#schema092))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(Pattern.compile("X_"), [X::class.java](#x)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| int | validate(arg: int, configuration: SchemaConfiguration) |
| long | validate(arg: long, configuration: SchemaConfiguration) |
| float | validate(arg: float, configuration: SchemaConfiguration) |
| double | validate(arg: double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| boolean | validate(arg: boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString](#regexesarenotanchoredbydefaultandarecasesensitive1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid](#regexesarenotanchoredbydefaultandarecasesensitive1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber](#regexesarenotanchoredbydefaultandarecasesensitive1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean](#regexesarenotanchoredbydefaultandarecasesensitive1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap](#regexesarenotanchoredbydefaultandarecasesensitive1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList](#regexesarenotanchoredbydefaultandarecasesensitive1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed](#regexesarenotanchoredbydefaultandarecasesensitive1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## XBoxed
sealed interface XBoxed<br>
permits<br>
[XBoxedString](#xboxedstring)

sealed interface that stores validated payloads using boxed classes

## XBoxedString
data class XBoxedString<br>
implements [XBoxed](#xboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| XBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## X
class X<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema092Boxed
sealed interface Schema092Boxed<br>
permits<br>
[Schema092BoxedBoolean](#schema092boxedboolean)

sealed interface that stores validated payloads using boxed classes

## Schema092BoxedBoolean
data class Schema092BoxedBoolean<br>
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
| Any? | getData()<br>validated payload |

## Schema092
class Schema092<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
